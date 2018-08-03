import java.io.*;


class Author{
private String email;
private String name;
private char gender;


	Author(String nam,String mail,char g)
	{
		name=nam;
		email=mail;
		gender=g;
	}

 	String getName()
	{
	return name;
	}
 
	String getEmail()
	{
	return email;
	}

	void setEmail(String mail)
	{
	email=mail;
	}


	char getGender()
	{
	return gender;
	}

	public String toString()
	{ 
	String s="x";
	 return s;
	}

}



class Book
{
	private String name;
	private Author author;
	private double price;
	private int qty=0;

	Book(String nam,Author authr,double pr,int q)
	{
	name=nam;
	author=authr;
	price=pr;
	qty=q;
	}

	Book(String nam,Author authr,double pr)
	{
	name=nam;
	author=authr;
	price=pr;
	}

	String getName()
	{
	return name;
	}

	Author getAuthor()
	{
	return author;
	}

	double getPrice()
	{
	return price;
	}

	void setPrice(double pr)
	{ 
	price=pr;
	}

	int getQty()
	{ 
	return qty;
	}

	void setQty(int qt)
	{ 
	qty=qt;
	}

	public String toString()
	{  
	String s="";
	return s;
	}

public static void main(String args[])
{
	Author thor= new Author("Name","Acs",'F');
	Book b= new Book("gfcfc",thor,54.5,5);
}
}