class commandlineExample{
public static void main(String[] args)
{
 if(args.length>0)
{
System.out.println("string line arguments are");
for(String j : args)
{
System.out.println(j);
}
}
else
{
System.out.println("no command line arguments found");}
	}
	}