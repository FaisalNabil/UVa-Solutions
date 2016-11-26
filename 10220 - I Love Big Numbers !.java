/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int number=in.nextInt();
			BigInteger sum=BigInteger.ONE;
			for(int i=1;i<=number;i++){
				sum=sum.multiply(BigInteger.valueOf(i));
			}
			String output=""+sum;
			int total=0;
			
			for(int i=0;i<output.length();i++){
				char c=output.charAt(i);
				total+=((int)c-48);
			}
			System.out.println(total);
		}
	}
}