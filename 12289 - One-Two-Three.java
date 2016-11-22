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
			String number=in.next();
			
			if(number.length()==3 && (number.charAt(0)=='o' && number.charAt(1)=='n') || (number.charAt(0)=='o' && number.charAt(2)=='e') || (number.charAt(1)=='n' && number.charAt(2)=='e')){
				System.out.println(1);
			}
			else if(number.length()==3 && (number.charAt(0)=='t' && number.charAt(1)=='w') || (number.charAt(0)=='t' && number.charAt(2)=='o') || (number.charAt(1)=='w' && number.charAt(2)=='o')){
				System.out.println(2);
			}
			else if(number.length()==5){
				System.out.println(3);
			}
		}
	}
}