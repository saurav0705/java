import java.util.*;
class duplicates{
    public static void main(String args[])
    {
        int[] array={1,5,7,9,6,5,10,5};
        int[] ar = new int[100];
        int i,counter=0;
        for(i=0;i<8;i++)
            {
                ar[array[i]]++;
            }
        int j;
            for(j=0;j<100;j++)
            {
                if(ar[j]>1)
                    {
                        counter=0;
                        for(i=0;i<8;i++)
                            {
                                if(array[i]==j)
                                    {
                                        counter++;
                                        if(counter>1)
                                            {
                                                array[i]=0;
                                            }
                                    }
                            }
                    }
            }
            for(i=0;i<8;i++)
                {
                    System.out.println(array[i]);
                }
    }
}