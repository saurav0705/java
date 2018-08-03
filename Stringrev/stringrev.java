import java.io.*;
class stringrev{
    public static void main(String args[])
    {
        String s="this is a java class";
        String s1="";
        String s2="";
        char s3=' ';
        char x;
        int flag=0;
        for(int i=0;i<s.length();i++)
            {
                x=s.charAt(i);
                if(s3==x){
                    if(flag==1)
                        {    
                s2=s2+" "+s1;
            }
                else
                    {
                        flag=1;
                  s2=s1;
                    }
            s1="";}
                else{
                    s1=s.charAt(i)+s1;  
                }
            }
            s2=s2+" "+s1;
            System.out.println(s2);
    }
}