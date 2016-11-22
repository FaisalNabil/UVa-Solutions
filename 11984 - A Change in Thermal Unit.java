/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int testCase=in.nextInt();
		for(int i=0;i<testCase;i++){
			int c=in.nextInt();
			int f=in.nextInt();
			double fTOc=(f-32)*(5.0/9.0);
			double result=c+fTOc;
			DecimalFormat df=new DecimalFormat("#0.00");
			System.out.print("Case "+(i+1)+": ");
			System.out.print(df.format(result));
			System.out.println();
		}
	}
}