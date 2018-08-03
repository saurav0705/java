import java.io.*;
class repeating{
    public static void main(String args[])throws IOException
    {
        int[] array={1,5,7,9,6,5,10};
        int[] ar = new int[100];
        int i;
        for(i=0;i<7;i++)
            {
                ar[array[i]]++;
            }
        int j;
            for(j=0;j<100;j++)
            {
                if(ar[j]>1)
                    {
                        System.out.println(j);
                    }
            }
    }
}