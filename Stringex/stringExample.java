class stringExample
{
	public static void main(String args[])
	{
	   String s="afwdaajffbcc";
	   char[] x=s.toCharArray();
	   int count=0;
	   String n="";
	   System.out.println(s);
	   for(int i=0;i<s.length();i++)
		{  
			char c=x[i];
if(c!='\0'){
		for(int j=0;j<s.length();j++)
			{
			if(c==x[j])
			{
				count++;
				x[j]='\0';
				}	
		}
}
for(int z=0;z<count;z++)
{
		n=n+c;}
		count=0;
			}
 			System.out.println(n);	
	 
		}	

}