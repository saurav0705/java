import java.io.*;
class kth{
    public static void main(String args[])throws IOException
    {
        int[] array={4,2,-3,1,6};
        int sum=0,i,flag=0,j; 
        int temp;
        for (i=0;i<5;i++)
            {
               for(j=0;j<4;j++)
                {
                    if(array[j]>array[j+1])
                        {
                            temp=array[j];
                            array[j]=array[j+1];
                            array[j+1]=temp;
                        }
                }
                
            }
            
               int x;
               BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
               String s=br.readLine();
               x=Integer.parseInt(s);
               if(x<5)
                { 
                    System.out.println("kth largest element :"+array[5-x]);
                
            
                System.out.println("kth smallest element :"+array[x-1]);
                }
                else
                    {
                        System.out.println("position out of bound");
                    }

    }
}