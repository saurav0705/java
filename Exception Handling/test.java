class except extends Exception{
	private String e="";
    except(String s)
    {
        e=s;
    }
  public String geterror()
  {
      return e;
  }
}
class test
{
	private String s="";
    private int bal=0;
    test(String st,int balance)
    {
        s=st;
        try{
            if (balance<500) {
                except e =new except("insufficient balance");
                throw e;
            }
            else
                {
                    bal=balance;
                }
        }
        catch(except e)
        {
          System.out.println(e.geterror());
           e.printStackTrace();
        }
    }
public static void main(String[] args) {
    test t = new test("saurav",450);
    
}
}	