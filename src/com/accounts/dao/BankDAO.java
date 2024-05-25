package com.accounts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.accounts.beans.BankBeans;
import com.accounts.dao.BankDB;

public class BankDAO
{
	public ArrayList getId(int range)
	{
		Connection con=null;
			try {
				con=BankDB.getConnection();
				String sql="Select id from bankEmployee where ID between ? and ? order by ID desc limit 1;";
				PreparedStatement p=con.prepareStatement(sql);
				p.setInt(1,range);
				p.setInt(2,(range+10000));
				ResultSet rs = p.executeQuery();
				ArrayList result = new ArrayList();
				if(rs.next())
					result.add(rs.getInt(1));
				return result;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			return null;
	}
	
	public String loginPage(int id,int choice)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String sql="Select Password from ? where ID = ?;";
			PreparedStatement p=con.prepareStatement(sql);
			p.setString(1,"bankEmployee");
			p.setInt(2,id);
			ResultSet rs = p.executeQuery();
			if(rs.next())
				return rs.getString(1);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int setPass(BankBeans bb,int choice)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "update ? set Password=? where ID=?;";
			PreparedStatement p = con.prepareStatement(ins_str);
			if(choice==0)
				p.setString(1,"bankEmployee");
			else
				p.setString(1,"bankAccounts");
			p.setString(2,bb.getPassword());
			p.setInt(3,bb.getId());
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public int newAcc(BankBeans bb)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "insert into bankAccounts values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(1,bb.getId());
			p.setString(2,bb.getName());
			p.setString(3,bb.getFname());
			p.setInt(4,bb.getPhone());
			p.setDate(5,bb.getDob());
			p.setString(6,bb.getGender());
			p.setString(7,bb.getMarital());
			p.setString(8,bb.getAddress());
			p.setString(9,bb.getEmail());
			p.setString(10,bb.getPan());
			p.setInt(11,bb.getAddhar());
			p.setString(12,bb.getEmployement());
			p.setString(13,bb.getNationality());
			p.setString(14,bb.getEducation());
			p.setString(15,Integer.toString(bb.getId()));
			p.setString(16,Integer.toString(bb.getPhone()));
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public int getBalance(int id)
	{
		Connection con = null;
		try
		{
			con=BankDB.getConnection();
			String ins_str = "select Balance from bankTransactions where Transactions_ID=(select MAX(Transactions_ID) from bankTransactions where ID=?);";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(1,id);
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public int transactions(int id,String ref_no,float amount,float balance,int choice)
	{
		Connection con = null;
		try
		{
			java.sql.Date date = (java.sql.Date) Calendar.getInstance().getTime();
			String amount1 = Float.toString(amount);
			String balance1 = Float.toString(balance);
			con=BankDB.getConnection();
			String ins_str = "insert into bankTransactions(ID,Date,Particulars,Ref_No,Withdrawal,Deposit,Balance) values( ?, '?', '?', '?', '?', '?', '?');";
			PreparedStatement p = con.prepareStatement(ins_str);
			p.setInt(1,id);
			p.setDate(2,date);
			if(choice==0)
			{
				p.setString(3,"Cash");
				p.setString(4,ref_no);
				p.setString(5,"");
				p.setString(6,amount1);
				p.setString(7,balance1);
			}
			else if(choice==1)
			{
				p.setString(3,"Cash");
				p.setString(4,ref_no);
				p.setString(5,amount1);
				p.setString(6,"");
				p.setString(7,balance1);
			}
			else if(choice==3)
			{
				p.setString(3,"Transfer");
				p.setString(4,ref_no);
				p.setString(5,"");
				p.setString(6,amount1);
				p.setString(7,balance1);
			}
			else if(choice==4)
			{
				p.setString(3,"Transer");
				p.setString(4,ref_no);
				p.setString(5,amount1);
				p.setString(6,"");
				p.setString(7,balance1);
			}
			int updateCount = p.executeUpdate();
			return updateCount; 
		} catch(Exception ex){
			System.out.println(ex.toString());
			return 0;
		}
	}
	
	public ResultSet ShowSp(int id,int emp_id)
	{
		try {
			Connection con=BankDB.getConnection();
			String sql="Select Employee_Name,Father_Name,Gender,Dob,Address,Phone_Number,Email_ID,Marital_Status from bankEmployee where ID=?;";
			PreparedStatement p=con.prepareStatement(sql);
			p.setInt(1,id);
			ResultSet rs = p.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet loadTransactions(int id) {
		return null;
	}
}