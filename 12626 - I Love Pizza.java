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
			String input=in.next();
			int M=0,A=0,R=0,G=0,I=0,T=0;
			for(int j=0;j<input.length();j++){
				char c=input.charAt(j);
				switch(c){
					case 'M':
						M++;
						break;
					case 'A':
						A++;
						break;
					case 'R':
						R++;
						break;
					case 'G':
						G++;
						break;
					case 'I':
						I++;
						break;
					case 'T':
						T++;
						break;
					
				}
				
			}
				int[] a=new int[6];
				a[0]=M/1;
				a[1]=A/3;
				a[2]=R/2;
				a[3]=G/1;
				a[4]=I/1;
				a[5]=T/1;
				int min=Integer.MAX_VALUE;
				for(int j=0;j<6;j++){
					if(a[j]<min)
						min=a[j];
				}
				System.out.println(min);
		}
	}
}