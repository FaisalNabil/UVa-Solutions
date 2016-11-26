/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			double m1=in.nextDouble();
			double m2=in.nextDouble();
			double m3=in.nextDouble();
			if(m1+m2<=m3 || m1+m3<=m2 || m3+m2<=m1 ){
				System.out.println("-1.000");
				continue;
			}
			double s=(m1+m2+m3)/2;
			double area=Math.sqrt(s*(s-m1)*(s-m2)*(s-m3))*(4.0/3.0);
			System.out.printf("%.3f",area);
			System.out.println();
		}
	}
}