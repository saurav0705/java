import java.io.*;
class array{
public static void main(String[] args)throws IOException
{
 BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
 int n =Integer.parseInt(br.readLine());
 int[] a=new int[n];
 for(int i=0;i<n;i++)
 {
	a[i]=Integer.parseInt(br.readLine());	
}
 int max=a[0],min=a[0],index=0;
 for(int j=1;j<n;j++)
{
	if(a[j]>max)
{max=a[j];
index=j;
}

if(a[j]<min && j<index)
{min=a[j];
}
		}
System.out.println("difference:::"+(max-min)); 
}
}