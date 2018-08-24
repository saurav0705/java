import java.io.*;
class fibbo{
    public static int fibbonaci(int n)
    {
        if(n>1)
            return fibbonaci(n-1)+fibbonaci(n-2);

        else
            return n;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
            {
                System.out.print(fibbonaci(i)+" ");
            }
        
    }
}