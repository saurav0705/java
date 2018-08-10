import java.io.*;
class Address{
private String street;
private String city;
private int pincode;
private String country;
Address(String s,String c,int pin,String count)
{	street=s;
	city=c;
	pincode=pin;
	country=count;
	}
void displayAddress()
{	System.out.println("Street: "+street);
	System.out.println("City: "+city);
	System.out.println("Country: "+country);
	System.out.println("Pincode: "+pincode);
}
}
class Customer{
private String customerName;
private String customerEmail;
private String customerType;
private Address address;
	Customer(String cn,String ce,String ty,Address a)
	{	customerName=cn;
		customerEmail=ce;
		customerType=ty;
		address=a;
	}

	void displayDetails()
	{	System.out.println("Customer Name: "+customerName);
		System.out.println("Customer Email: "+customerEmail);
		System.out.println("Customer Type: "+customerType);
		address.displayAddress();
		}

public static void main(String[] args)throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Street: ");
	String st=br.readLine();
	System.out.println("Enter City: ");
	String ct=br.readLine();
	System.out.println("Enter Pincode: ");
	int pin=Integer.parseInt(br.readLine());
	System.out.println("Enter Country: ");
	String count=br.readLine();
	System.out.println("Enter Customer Name: ");
	String cn=br.readLine();
	System.out.println("Enter Customer Email: ");
	String mail=br.readLine();
	System.out.println("Enter Customer Type: ");
	String cty=br.readLine();	
	Address a = new Address(st,ct,pin,count);
	Customer c =new Customer(cn,mail,cty,a);
	System.out.println();
	c.displayDetails();

}

		}