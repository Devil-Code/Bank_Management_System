package Services;
import Beans.BankBeans_C;
import bankDAO.BankDAO;
import bankDAO.BankDB;



public class BankServices_c {
	BankBeans_C bb=new BankBeans_C();
	BankDAO bankDAO=new BankDAO();
//	public String check(String id,String pwd)
//	{
//		if( id.equals("Admin") )
//		{
//				if( pwd.equals("admin@123") )
//					return ("Successful");
//				else
//					return ("Incorrect Password");
//		}
//		else
//			return ("Not Registered");
//	}
	public int loginPage(String id,String password)
	{
		int userid = Integer.parseInt(id);
		int updateResult = 0;
		try {
			if( id.equals("Admin") && password.equals("admin@123") )
				return 1;
			else if(Integer.parseInt(id)>0 && Integer.parseInt(id)<10000)
			{
				if ( password.equals(bankDAO.login(userid,0)) )
					return 2;
			}
			else if(Integer.parseInt(id)>10000)
			{
				if ( password.equals(bankDAO.login(userid,1)) )
					return 3;
			}
			else
				return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int savingAcc(String name,String fname,int date,int month,int year,String add,String adhar,int gen,int mob,String email,int amt,int accno)
	{
		bb.setAdd(add);
		bb.setAmt(amt);
		bb.setDate(date);
		bb.setMonth(month);
	    bb.setYear(year);
	    bb.setEmail(email);
	    bb.setadhar_no(adhar);
	    bb.setgender(gen);
	    bb.setName(name);
	    bb.setFname(fname);
	   // bb.setMname(mname);
	    bb.setMob(mob);
	    bb.setAccno(accno);
	    int updateResult = 0;
		 try
		 {
			 updateResult = bankDAO.addBank(bb); //8.
			 return updateResult; //19.
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
	    
	}

}
