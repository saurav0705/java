import java.util.*;
class test1{
	public static void main(String args[])
{
	Random r =new Random();
	int x=r.nextInt(26);
	System.out.println("Number Generated: "+(x+1));
	int x=65+x;
	System.out.println("Converted Letter: "+Character.toString((char)x));
	if(x>=65 && x<=67){ System.out.println("Keypad Number: 2");}
	else if(x>=68 && x<=70){ System.out.println("Keypad Number: 3");}
	else if(x>=71 && x<=73){ System.out.println("Keypad Number: 4");}
	else if(x>=74 && x<=76){ System.out.println("Keypad Number: 5");}
        else if(x>=77 && x<=80){ System.out.println("Keypad Number: 6");}
	else	if(x>=81 && x<=84){ System.out.println("Keypad Number: 7");}
	else	if(x>=85 && x<=87){ System.out.println("Keypad Number: 8");}
	else	if(x>=88 && x<=91){ System.out.println("Keypad Number: 9");}
}
}