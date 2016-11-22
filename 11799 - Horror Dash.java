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
			int m=Integer.MIN_VALUE;
			for(int j=0;j<number;j++){
				m=Math.max(m,in.nextInt());
			}
			System.out.println("Case "+(i+1)+": "+m);
		}
	}
}