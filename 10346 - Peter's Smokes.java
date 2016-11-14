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
		while(in.hasNext()){
			int n=in.nextInt();
			int k=in.nextInt();
			int count=0;
			while(n>=k){
				n-=k;
				n+=1;
				count+=k;
			}
			System.out.println(count+n);
		}
	}
}