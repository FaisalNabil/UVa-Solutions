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
			long number=in.nextInt(),ancestors=0,temp1=0,temp2=1;
			if(number==0)
				break;
			for(int i=0;i<number;i++){
				
				ancestors=temp1+temp2;
				temp1=temp2;
				temp2=ancestors;
			}
			System.out.println(ancestors);
		}
	}
}