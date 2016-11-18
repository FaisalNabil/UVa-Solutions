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
		Scanner in =new Scanner(System.in);
		int newline=0;
		while(in.hasNext()){
			BigInteger year=in.nextBigInteger();
			boolean isSpecial=false;
			int l=0;
			if(newline==1)
            	System.out.println();
        	newline=1;
			if(year.mod(BigInteger.valueOf(4)).compareTo(BigInteger.ZERO)==0 && year.mod(BigInteger.valueOf(100)).compareTo(BigInteger.ZERO)!=0 || year.mod(BigInteger.valueOf(400)).compareTo(BigInteger.ZERO)==0){
				System.out.println("This is leap year.");
				isSpecial=true;
				l=1;
			}
			if(year.mod(BigInteger.valueOf(15)).compareTo(BigInteger.ZERO)==0){
				System.out.println("This is huluculu festival year.");
				isSpecial=true;
			}
			if(year.mod(BigInteger.valueOf(55)).compareTo(BigInteger.ZERO)==0 && l==1){
				System.out.println("This is bulukulu festival year.");
				isSpecial=true;
			}
			if(isSpecial==false)
				System.out.println("This is an ordinary year.");
			System.out.println();
			
		}
	}
}