import java.io.*;
class buffer{
public static void main(String[] args)throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter input:");
int i = Integer.parseInt(br.readLine());
System.out.println(i);
}
}