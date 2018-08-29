class pin{
    public static int  sumofdigit(int n)
    {
        int sum=0;
        int temp;
        while(n!=0)
            {
                temp=n%10;
                sum=sum+temp;
                n=n/10;
            }
            return sum;
        
    }
    public static void main(String[] args) {
        String p="cisco technologies";
        String s[]=p.split(" ");
        int sum=0;
        for(int i=0;i<s.length;i++)
            {
                //System.out.println(s[i].length());
                sum=sum+s[i].length();
            }
        while(!(sum>=0 && sum<=9))
            {
                sum=sumofdigit(sum);
            }
            System.out.println("PIN:: "+sum);
    }
}