class repetition{
    
    public static int norepeat(int a[])
    {
        int sum=0;
        for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                    {
                        if(i!=j)
                            {
                                if(a[i]==a[j])
                                    {
                                        a[j]++;
                                    }
                            }
                    }
            }
        for(int s:a)
            {
                sum=sum+s;
            }
            return sum;
        
    }
    public static void main(String[] args)
    {
        int array[]= new int[5];
        array[0]=5;
        array[1]=6;
        array[2]=5;
        array[3]=8;
        array[4]=1;
        System.out.println("SUM:: "+norepeat(array));
    }
}