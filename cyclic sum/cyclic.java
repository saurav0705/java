class cyclicsum{
    public static int  sumofdigit(int n)
    {
        int sum=0;
        int temp,k=0;
        while(n!=0)
            {
                temp=n%10;
                sum=sum+temp;
                k=k+sum;
                n=n/10;
            }
            return k;
        
    }
    public static void main(String[] args) {
        int n=582109;
        int sum=0;
                sum=sumofdigit(n);
            
            System.out.println("CYCLIC SUM:: "+sum);
    }
}