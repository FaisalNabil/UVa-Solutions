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
			long number=in.nextInt();
			if(number<0)
				break;
			//int full=number/4;
			//double fraction=number%4;
			if(number==1)
				System.out.println("0%");
			else
				System.out.println((number*25)+"%");
		}
	}
}