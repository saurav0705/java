class test
{
	private String s="";
	private int bal=0;
	public test(String st, int balance)
		{
			try{
				s=st;
				if(balance<500)
					{ throw(Exception e);}
				else
				{ bal=balance;}
			    }
			catch(Exception e)
		{ System.out.err("insufficient balance");}
		}
public static void main(String[] args)
{
	test t = new test("saurav",450);
}
}