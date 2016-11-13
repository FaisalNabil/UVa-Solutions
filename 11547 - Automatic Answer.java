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
		int testCase=in.nextInt();
		for(int i=0;i<testCase;i++){
			int number=in.nextInt();
			double newNumber=( ( ( ( (number*567) / 9) + 7492) * 235 ) / 47 )-498;
			int intNewNumber=(int)newNumber;
			System.out.println(Math.abs((intNewNumber/10)%10));
		}
	}
}