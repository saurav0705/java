import java.io.*;
class buffer2{
public static void main(String[] args)throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter input:");
String i = br.read(char[]);
System.out.println(i);
}
}