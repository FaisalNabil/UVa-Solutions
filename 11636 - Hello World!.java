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
		int myCase=1;
		while(in.hasNext()){
			int number=in.nextInt();
			int count=1,n=0;
			if(number<0)
				break;
			else{
				while(count<number){
					count=count+count;
					n++;
				}
				System.out.println("Case "+myCase+": "+n);
			}
			myCase++;
		}
	}
}