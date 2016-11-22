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
			String input=in.next();
			int sum=0;
			for(int i=0;i<input.length();i++){
				char c=input.charAt(i);
				if(c>='a' && c<='z')
					sum+=(c- 'a' + 1);
				else if(c>='A' && c<='Z')
					sum+=(c- 'A' + 27);
			}
			if(isItPrime(sum))
				System.out.println("It is a prime word.");
			else
				System.out.println("It is not a prime word.");
			
		}
	}
	static boolean isItPrime(int number){
		for(int j=2;j<=number/2;j++){
				if(number%j==0){
					return false;
				}
			}
			return true;
	}
}