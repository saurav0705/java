import java.io.*;
import java.util.Arrays;
class knapsack{
    ////byweight
    static void Bywieght(int[] weight,int[] profit,double[] price,int max)
    {
        int index1;
        //System.out.println("in function");
        for(int i=0;i<4;i++)
            {
                for(int j=0;j<3;j++)
                    {
                        int temp;
                        if(weight[j]>weight[j+1])
                            {
                                temp=weight[j];
                                weight[j]=weight[j+1];
                                weight[j+1]=temp;
                                
                                temp=profit[j];
                                profit[j]=profit[j+1];
                                profit[j+1]=temp;

                                double temp2;
                                temp2=price[j];
                                price[j]=price[j+1];
                                price[j+1]=temp;
                            }
                    }
            }
            int sum=0;
            double pro=0;
            double add; 
            int m=0;       
            for(int i=0;i<4;i++)
                {
                    sum=sum+weight[i];
                    if(sum<max)
                        {
                            
                            pro=pro+profit[i];

                        }
                    else
                        {
                            sum=sum-weight[i];
                            m=i;
                            break;
                        }
                        
                }

                
                if(sum<max)
                    {
                        int qr=max-sum;
                        //System.out.println(price[m]);
                        add=qr*(profit[m]/weight[m]);
                        pro=pro+add;
                    }
                System.out.println(pro);

    }






    ///BY proportion
    static void Byproportion(int[] weight,int[] profit,double[] price,int max)
    {
        int index1;
        //System.out.println("in function");
        for(int i=0;i<4;i++)
            {
                for(int j=0;j<3;j++)
                    {
                        int temp;
                        if(price[j]<price[j+1])
                            {
                                temp=weight[j];
                                weight[j]=weight[j+1];
                                weight[j+1]=temp;
                                
                                temp=profit[j];
                                profit[j]=profit[j+1];
                                profit[j+1]=temp;

                                double temp2;
                                temp2=price[j];
                                price[j]=price[j+1];
                                price[j+1]=temp;
                            }
                    }
            }
            int sum=0;
            double pro=0;
            double add; 
            int m=0;       
            for(int i=0;i<4;i++)
                {
                    sum=sum+weight[i];
                    if(sum<max)
                        {
                            
                            pro=pro+profit[i];

                        }
                    else
                        {
                            sum=sum-weight[i];
                            m=i;
                            break;
                        }
                        
                }

                
                if(sum<max)
                    {
                        int qr=max-sum;
                        //System.out.println(price[m]);
                        add=qr*(profit[m]/weight[m]);
                        pro=pro+add;
                    }
                System.out.println(pro);

    }




    /////by price
    static void Byprice(int[] weight,int[] profit,int max)
    {
        //System.out.println("in function");
        for(int i=0;i<4;i++)
            {
                for(int j=0;j<3;j++)
                    {
                        int temp;
                        if(profit[j]<profit[j+1])
                            {
                                temp=weight[j];
                                weight[j]=weight[j+1];
                                weight[j+1]=temp;
                                
                                temp=profit[j];
                                profit[j]=profit[j+1];
                                profit[j+1]=temp;
                            }
                    }
            }
            
                int m = 0;
            int sum=0;
            double pro=0;
            double add;           
            for(int i=0;i<4;i++)
                {
                    sum=sum+weight[i];
                    if(sum<max)
                        {
                            
                            pro=pro+profit[i];
                            

                        }
                    else
                        {
                            sum=sum-weight[i];
                            m=i;
                            break;
                        }
                        
                }

                if(sum<max)
                    {
                        int qr=max-sum;
                        //System.out.println(price[m]);
                        add=qr*(profit[m]/weight[m]);
                        pro=pro+add;
                    }
                System.out.println(pro);

    }
    public static void main(String[] args)throws IOException
    {
        int[] profit=new int[4];
        double[] price = new double[4];
        int[] weight = new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<4;i++)
            {
                profit[i]=Integer.parseInt(br.readLine());
                weight[i]=Integer.parseInt(br.readLine());
                price[i]=profit[i]/weight[i];
                //System.out.println(price[i]);
            }
            int max;
            System.out.println("Enter max value:");
            max=Integer.parseInt(br.readLine());
            System.out.println("By weight :");
            Bywieght(weight,profit,price,max);
            System.out.println("By price :");
            Byprice(weight,profit,max);
            System.out.println("By proportion :");
            Byproportion(weight,profit,price,max);

    }
}