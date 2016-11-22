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
			int e=in.nextInt();
			int f=in.nextInt();
			int c=in.nextInt();
			int total=e+f;
			int consumed=0,empty=total,had;
			while(total>=c){
				had=total/c;
				consumed+=had;
				total=had+total%c;
				
				
				//empty+=consumed;
			}
			System.out.println(consumed);
		}
	}
}