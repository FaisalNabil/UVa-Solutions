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
			int min=10000,max=1000;
			int salary1=in.nextInt();
			if(salary1<min)
				min=salary1;
			if(salary1>max)
				max=salary1;
			
			int salary2=in.nextInt();
			if(salary2<min)
				min=salary2;
			if(salary2>max)
				max=salary2;
			
			int salary3=in.nextInt();
			if(salary3<min)
				min=salary3;
			if(salary3>max)
				max=salary3;
			int surviver=salary1+salary2+salary3-max-min;
			System.out.println("Case "+(i+1)+": "+surviver);
		}
	}
}