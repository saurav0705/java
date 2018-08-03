import java.io.*;
class pallindrome{
    public static void main(String args[])
    {
        String s="this is a java class";
        String s1="";
        for(int i=0;i<s.length();i++)
            {
                    s1=s.charAt(i)+s1;
            }
            if(s1.equals(s))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
    }
}