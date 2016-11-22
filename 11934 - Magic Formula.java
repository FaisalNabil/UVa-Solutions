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
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			int d=in.nextInt();
			int L=in.nextInt();
			if(a==0 && b==0 && c==0 && d==0 && L==0 )
				break;
			long count=0;
			for(int i=0;i<=L;i++){
				if(function(a,b,c,i)%d==0)
					count++;
			}
			System.out.println(count);
		}
	}
	
	public static long function(int a,int b,int c,int i){
		return a*i*i+b*i+c;
	}
}