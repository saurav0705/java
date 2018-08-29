class stringrepeat{
    public static void stringrepeat(String p)
    {
        String s[]=p.split(" ");
        int i=0;
        for(i=0;i<s.length-1;i++)
            {
                if(s[i].compareTo(s[i+1])!=0)
                    {
                        System.out.print(s[i]+" ");
                    }
            }
            if(s[i].compareTo(s[i-1])!=0)
                {
                    System.out.print(s[i]);
                }
    }
    public static void main(String[] args) {
        String s="ben went went to the car";
        stringrepeat(s);
    }
}