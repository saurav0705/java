import java.util.*;
class minandmax{
    public static void main(String args[])
    {
        //int[] array =new int[5];
        int[] array={1,5,9,6,0};
        int max=array[0];
        int min=array[0];
        int i;
        for(i=1;i<5;i++)
            {
                    if(array[i]>max)
                        {
                            max=array[i];
                        }
                    
            }
        System.out.println("max element is "+max);
        for(i=1;i<5;i++)
            {
                    if(array[i]<min)
                        {
                            min=array[i];
                        }
                    
            }
        System.out.println("min element is "+min);
    }
}