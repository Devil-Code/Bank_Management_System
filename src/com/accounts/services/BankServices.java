package com.accounts.services;
import com.accounts.dao.BankDAO;
import com.accounts.beans.BankBeans;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/* utf_8 for accepting passwords 
 */

public class BankServices
{
	BankBeans bb = new BankBeans();
	BankDAO bankDAO = new BankDAO();
	
	public int loginPage(String id,String password)
	{
		int userid = Integer.parseInt(id);
		int updateResult = 0;
		try {
			if( id.equals("Admin") && password.equals("admin@123") )
				return 1;
			else if(Integer.parseInt(id)>0 && Integer.parseInt(id)<10000)
			{
				if ( password.equals(bankDAO.loginPage(userid,0)) )
					return 2;
			}
			else if(Integer.parseInt(id)>10000)
			{
				if ( password.equals(bankDAO.loginPage(userid,1)) )
					return 3;
			}
			else
				return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int setPass(int id, String pass, int choice)
	{
		bb.setId(id);
		bb.setPassword(pass);
		int updateResult = 0;
	    try
	    {
	    	updateResult = bankDAO.setPass(bb,choice);
	    	return updateResult;
		}
	    catch(Exception ex)
	    {
	    	System.out.println(ex.toString());
	    	return 0;
	    }
	}
	
	public int generateId(int type)
	{
		int range=0;
		if(type == 0)
			range=10000;
		else if(type == 1)
			range=20000;
		else
			range=0;
		ArrayList ID = bankDAO.getId(range);
		if( ID.size()==1 )
			return Integer.parseInt( ID.get(0).toString() );
		else
			return range;
	}
	
	public int registerAcc(int id,String name,String fname,int date,int month,int year,int gender,int marital,int phone,String address,String email,String pan,int addhar,String employement,String nationality,String education)
	{
		bb.setId(id);
		bb.setName(name);
		bb.setFname(fname);
		bb.setPhone(phone);
		bb.setAddress(address);
		bb.setEmail(email);
		bb.setPan(pan);
		bb.setAddhar(addhar);
		bb.setEmployement(employement);
		bb.setNationality(nationality);
		bb.setEducation(education);
		String g = null;
		if( gender == 1 )
			g = "Male";
		else if( gender == 2 )
			g = "Female";
		else if( gender == 3 )
			g = "Other";
		bb.setGender(g);
		Date dob = new Date(year, month, date);
		bb.setDob(dob);
		String marital1 = null;
	    if( marital == 1)
	    	marital1 = "Single";
	    else if( marital == 2 )
	    	marital1 = "Married";
	    else if( marital == 3)
	    	marital1 = "Widowed";
	    else if( marital == 4)
	    	marital1 = "Divorced";
	    else if( marital == 5)
	    	marital1 = "Separated";
	    bb.setMarital(marital1);
		int updateResult = 0;
	    try
	    {
	    	updateResult = bankDAO.newAcc(bb);
	    	return updateResult;
		}
	    catch(Exception ex)
	    {
	    	System.out.println(ex.toString());
	    	return 0;
	    }
	}
	
	public int depositMoney(int id,String ref_no,float amount)
	{
		float balance = bankDAO.getBalance(id);
		balance=balance+amount;
		int updateResult = 0;
		int choice=0;
	    try
	    {
	    	updateResult = bankDAO.transactions(id,ref_no,amount,balance,choice);
	    	return updateResult;
		}
	    catch(Exception ex)
	    {
	    	System.out.println(ex.toString());
	    	return 0;
	    }
	}
	
	public int withdrawMoney(int id,String ref_no,float amount)
	{
		float balance = bankDAO.getBalance(id);
		if(balance < amount)
			return 0;
		else
		{
			balance = balance-amount;
			int updateResult = 0;
			int choice=1;
		    try
		    {
		    	updateResult = bankDAO.transactions(id,ref_no,amount,balance,choice);
		    	return updateResult;
			}
		    catch(Exception ex)
		    {
		    	System.out.println(ex.toString());
		    	return 0;
		    }
		}
	}
	
	public int transferMoney(int idfrom,int idto,String ref_no,float amount)
	{
		float balance = bankDAO.getBalance(idfrom);
		if(balance < amount)
			return 0;
		else
		{
			balance = balance-amount;
			int updateResult = 0;
			int choice=4;
		    try
		    {
		    	updateResult = bankDAO.transactions(idfrom,ref_no,amount,balance,choice);
			}
		    catch(Exception ex)
		    {
		    	System.out.println(ex.toString());
		    	return 0;
		    }
		}
		float balance1 = bankDAO.getBalance(idto);
		balance=balance+amount;
		int updateResult = 0;
		int choice=3;
	    try
	    {
	    	updateResult = bankDAO.transactions(idto,ref_no,amount,balance,choice);
	    	return updateResult;
		}
	    catch(Exception ex)
	    {
	    	System.out.println(ex.toString());
	    	return 0;
	    }
	}
	
	public ArrayList showId(int id,int emp_id)
	{
		ResultSet rs = bankDAO.ShowSp(id,emp_id);
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
	
	public int editDetails()
	{
		return 0;
	}
	
	public ResultSet printTransactions(int id)
	{
		ResultSet rs = bankDAO.loadTransactions(id);
	    return rs;
	}
}