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
			int s=in.nextInt();
			int d=in.nextInt();
			int first,second;
			
			second=Math.abs(s-d)/2;
			first=(s-second);
			
			
			if(first+second==s && Math.abs(first-second)==d)
				System.out.println(first+" "+second);
			else
				System.out.println("impossible");
			
		}
	}
}