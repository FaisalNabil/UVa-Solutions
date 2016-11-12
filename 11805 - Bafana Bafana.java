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
		for(int j=1;j<=testCase;j++){
			int n=in.nextInt();
			int k=in.nextInt();
			int p=in.nextInt();
			int count=k;
			for(int i=0;i<p;i++){
				count++;
				if(count==n+1)
					count=1;
			}
			System.out.println("Case "+j+": "+count);
			
		}
	}
}