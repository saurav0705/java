import java.io.*;
class fibbo
{
    public static int[] array = new int[1000];
    public static int  fibbonaci(int n)
    {
        if(n>1)
        {
        if(array[n-1]!=0 || array[n-2]!=0)
            {
                if(array[n-1]!=0)
                    {
                        array[n-2]=fibbonaci(n-2);
                        return array[n-1]+array[n-2];
                    }
                else if(array[n-2]!=0)
                    {
                        return array[n-1]+array[n-2];
                    }
            }  
        else{
            array[n-1]=fibbonaci(n-1);
            array[n-2]=fibbonaci(n-2);
            return array[n-1]+array[n-2];
            }
        
        }
        else{
            return n;}
            }
        


    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int j=0;j<1000;j++)
            {
                array[j]=0;
            }
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
            {
                System.out.print(fibbonaci(i)+" ");
            }
        
    }
}