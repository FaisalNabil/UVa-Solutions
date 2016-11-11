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
		for(int j=0;j<testCase;j++){
			int a=in.nextInt();
			int b=in.nextInt();
			int sum=0;
			for(int i=a;i<=b;i++){
				if(i%2==1)
					sum+=i;
			}
			System.out.println("Case "+(j+1)+": "+sum);
		}
	}
}