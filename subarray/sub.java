import java.util.*;
class sub{
    public static void main(String args[])
    {
        int[] array={4,2,-3,1,6};
        int sum=0,i,flag=0,j; 
        for (i=0;i<5;i++)
            {
               for(j=i;j<5;j++)
                {
                    sum=sum+array[j];
                    if(sum==0)
                        {
                            flag=1;
                            break;
                        }
                }
                
              if(flag==1)
                {break;
                }
            else
                { sum=0;}
            }
            if(flag==0)
                {
                    System.out.println("NO");
                }
            else{
                System.out.println("YES");
            }
    }
}