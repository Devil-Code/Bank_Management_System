package com.Employee;

public class Validity {
boolean validalpha(String name)
{
	return name.matches("[a-zA-Z]+");	
}
boolean validEmail(String email)
{
	int c;
	c=email.indexOf('.');
	if(c==-1)
		return false;
	c=email.indexOf('@');
    if(c==-1)
    	return false;
return true;
}
boolean validphno(String phno)
{
	int i;
	i=phno.length();
	if(i==10)
		return true;
	return false;
}
boolean validadhar(String adhar)
{
	int i;
	i=adhar.length();
	if(i==12)
		return true;
	return false;
}
}
