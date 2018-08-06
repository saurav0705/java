import java.io.*;
class commandlineExample{
public static void main(String[] args)throws IOException
{
int sum=0;
 if(args.length>0)
{
System.out.println("sum of string line arguments are");
for(String j : args)
{
sum=sum+Integer.valueOf(j);
}
System.out.println(sum);
}
else
{
System.out.println("no command line arguments found");}
	}
	}