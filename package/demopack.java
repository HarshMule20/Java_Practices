import mypackage.*;
import java.util.Scanner;
public class demopack
{
	public static void main(String args[])
	{
		System.out.println(" **** MULTIPLICATION PROGRAM USING PACKAGE *****\n\n");
		Scanner ob=new Scanner(System.in);
		int d,c;
		System.out.print("Enter first number=_");
		c=ob.nextInt();
		System.out.print("Enter second number=_");
		d=ob.nextInt();
		multi1 m=new multi1(c,d);
		System.out.print("Multiplication is=_"+m.calmult());
	}
}
