package com.admin.services;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.admin.beans.BankBean;
import com.admin.dao.BankDAO;
public class BankService 
{
	BankBean bb=new BankBean();
	BankDAO bankDAO=new BankDAO();

	public int generateId( int post )
	{
		int range = 0;
		if( post == 1 )
			range=1000;
		else if( post == 2 )
			range=2000;
		else if( post == 3 )
			range=3000;
		else if( post == 4 )
			range=4000;
		else if( post == 5 )
			range=5000;
		else if( post == 6 )
			range=6000;
		else
			return 0;
		ArrayList ID = bankDAO.getId(range);
		if( ID.size()==1 )
			return Integer.parseInt( ID.get(0).toString() );
		else
			return range;
	}
	
	public static boolean checkDate(int dateofmonth, int month, int year)
	{
		String input = month+"/"+dateofmonth+"/"+year;
		String formatString = "MM/dd/yyyy";

        try {
            SimpleDateFormat format = new SimpleDateFormat(formatString);
            format.setLenient(false);
            format.parse(input);
        } catch (ParseException e) {
            return false;
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
	}

	public int newAcc(int id,String ename,String fname,int g,int date,int month,int year,String blood,String pan,int addhar,String add,String phone,String email,int m)
	{
		bb.setId(id);
		bb.setEname(ename);
		bb.setFname(fname);
		String gender = null;
		if( g == 1 )
			gender = "Male";
		else if( g == 2 )
			gender = "Female";
		else if( g == 3 )
			gender = "Other";
		bb.setGender(gender);
		Date dob = new Date(year, month, date);
		bb.setDob(dob);
		bb.setBlood(blood);
		bb.setPan(pan);
		bb.setAddhar(addhar);
	    bb.setAdd(add);
	    bb.setPhone(phone);
	    bb.setEmail(email);
	    String marital = null;
	    if( m == 1)
	    	marital = "Single";
	    else if( m == 2 )
	    	marital = "Married";
	    else if( m == 3)
	    	marital = "Widowed";
	    else if( m == 4)
	    	marital = "Divorced";
	    else if( m == 5)
	    	marital = "Separated";
	    bb.setMarital(marital);
	    String user = Integer.toString(id);
		bb.setUser(user);
		bb.setPass(user);
		int updateResult = 0;
	    try
	    {
	    	updateResult = bankDAO.addBank(bb);
	    	return updateResult;
		}
	    catch(Exception ex)
	    {
	    	System.out.println(ex.toString());
	    	return 0;
	    }
	}
	
	public ResultSet loadTable() throws Exception
	{
		ResultSet rs = bankDAO.loadTable();
	    return rs;
	}
	
	public ArrayList showSp(int id)
	{
		ResultSet rs = bankDAO.ShowSp(id);
		ArrayList result = new ArrayList();
		try {
			if( rs.next() )
			{
				result.add( rs.getString(1) );
				result.add( rs.getString(2) );
				result.add( rs.getString(3) );
				result.add( rs.getDate(4) );
				result.add( rs.getString(5) );
				result.add( rs.getString(6) );
				result.add( rs.getString(7) );
				result.add( rs.getString(8) );
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int updateAcc(int id,String ename,String fname,int g,int date,int month,int year,String blood,String pan,int addhar,String add,String phone,String email,int m,String user)
	{
		bb.setId(id);
		bb.setEname(ename);
		bb.setFname(fname);
		String gender = null;
		if( g == 1 )
			gender = "Male";
		else if( g == 2 )
			gender = "Female";
		else if( g == 3 )
			gender = "Other";
		bb.setGender(gender);
		Date dob = new Date(year, month, date);
		bb.setDob(dob);
		bb.setBlood(blood);
		bb.setPan(pan);
		bb.setAddhar(addhar);
	    bb.setAdd(add);
	    bb.setPhone(phone);
	    bb.setEmail(email);
	    String marital = null;
	    if( m == 1)
	    	marital = "Single";
	    else if( m == 2 )
	    	marital = "Married";
	    else if( m == 3)
	    	marital = "Widowed";
	    else if( m == 4)
	    	marital = "Divorced";
	    else if( m == 5)
	    	marital = "Separated";
	    bb.setMarital(marital);
		bb.setUser(user);
		bb.setPass(user);
		int updateResult = 0;
	    try
	    {
	    	updateResult = bankDAO.addBank(bb); 
	    	return updateResult;
		}
	    catch(Exception ex)
	    {
	    	System.out.println(ex.toString());
	    	return 0;
	    }
	}
	
	public int Delete(int id)
	{
		int updateResult = 0;
		try {
			updateResult = bankDAO.Delete(id);
			return updateResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}