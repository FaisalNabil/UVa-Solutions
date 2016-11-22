/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			BigInteger n1=in.nextBigInteger();
			char c=in.next().charAt(0);
			BigInteger n2=in.nextBigInteger();
			if(c=='/')
				System.out.println(n1.divide(n2));
			else if(c=='%')
				System.out.println(n1.mod(n2));
		}
	}
}