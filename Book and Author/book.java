import java.io.*;
class Author{
private String name;
private String email;
private char gender;
Author(String n,String mail,char g)
{
	name=n;
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
char getGender()
{
	return gender;}

	}


class Book{
private String name;
private Author[] authors = new Author[3];
private double price;
private int qty=0;
Book(String n,Author auth[],double p)
	{  name=n;
	   authors=auth;
	   p=price;
		}
Book(String n,Author auth[],double p,int q)
	{  name=n;
	   authors=auth;
	   p=price;
	   qty=q;	}
String getName()
	{
	return name;	}
/*Author[] getAuthors()
{	return authors[];
	}*/
double getPrice()
{	return price;}
void setPrice(double p)
{	price=p;}
int getQty()
{	return qty;}
void setQty(int q)
{	qty=q;}
String getAuthorsname()
{
	String s="";
	int i;
	for(i=0;i<3;i++)
		{
			s=s+authors[i].getName()+",";
		}	
		return s;
}
String search(String s)
{
	int flag=0;
	for(int i=0;i<3;i++)
		{
			if(s==authors[i].getName())
				{
					flag=1;
					break;
				}
		}
		if(flag==0)
			{
				return "not found";
			}
		else
			{
				return "found";
			}
}
public static void main(String[] args)throws IOException
{
	Author a[] = new Author[3];
        a[0] = new Author("david","david@mail.com",'m');
	a[1] = new Author("davidas","davidas@mail.com",'f');
	a[2] = new Author("njan","dnsdjknk@gmail.com",'m');
	Book b = new Book("new book",a,4500,5);
	System.out.println(b.search("david"));
	System.out.println(b.getAuthorsname());
	
}
	}