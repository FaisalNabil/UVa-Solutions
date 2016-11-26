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
			if(number==1)
				System.out.println(1);
			else if(number==2)
				System.out.println(1);
			else{
				BigInteger first=BigInteger.valueOf(1),second=BigInteger.valueOf(1),fib=BigInteger.valueOf(0);
				for(int i=3;i<=number;i++){
					fib=first.add(second);
					first=second;
					second=fib;
				}
				System.out.println(fib);
			}
		}
	}
}