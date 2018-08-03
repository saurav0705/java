import java.io.*;
class permutations{
    
    static int fact(int i)
    {
        int sum=1;
        for(int j=1;j<=i;j++)
            {
                sum=sum*j;
            }
            return sum;
    }
    public static void main(String args[])
    {
        String s1="xxx0131";
        int count=1;
        int x=fact(s1.length());
        char[] ch = s1.toCharArray();
        char c=' '; 
        //System.out.println(x);
        for(int i=0;i<s1.length();i++)
            {
                c=s1.charAt(i);
                for(int j=i+1;j<s1.length();j++)
                    {
                        if(c==ch[j])
                            {
                                count++;
                                ch[j]='\0';
                              //System.out.println(count);
                            }
                           
                    }
                    x=x/fact(count);
                    count=1;
            }
            System.out.println(x);

    }
}