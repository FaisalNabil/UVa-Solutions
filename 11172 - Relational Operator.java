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
		if(testCase<15){
			for(int i=0;i<testCase;i++){
				long a=in.nextLong();
				long b=in.nextLong();
				if(a<1000000001 && b<1000000001 && a < b)
					System.out.println("<");
					
				else if(a<1000000001 && b<1000000001 && a > b)
					System.out.println(">");
					
				else if(a<1000000001 && b<1000000001 && a == b)
					System.out.println("=");
			}
		}
	}
}