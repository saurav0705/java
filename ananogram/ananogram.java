import java.io.*;

import javax.lang.model.util.ElementScanner6;
class ananogram{
    public static void main(String args[])
    {
       String s1="yyram";
       String s2="maryy";
       int count=0;
       char[] ch=s2.toCharArray();
       if(s1.length()!=s2.length())
        {
            System.out.println("false");
        }
        else{
            //System.out.println("entered else");
            for(int i=0;i<s1.length();i++)
                {
                    char x=s1.charAt(i);
                    for(int j=0;j<s1.length();j++)
                        {
                            if(x==ch[j])
                                {
                                    ch[j]='\0';
                                    count++;
                                    break;
                                }
                        }
                }
        }
        
        if(count==s1.length())
            {
                System.out.println("true");
            }
        else
            {
                System.out.println("false"); 
            }
    }
}