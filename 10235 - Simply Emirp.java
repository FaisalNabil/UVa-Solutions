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
			int number=in.nextInt();
			Calculation calc=new Calculation();
			if(calc.prime(number)==false){
				System.out.println(number+" is not prime.");
			}
			else{
				if(calc.prime(calc.reverse(number))==true && number!=calc.reverse(number))
					System.out.println(number+" is emirp.");
				else
					System.out.println(number+" is prime.");
			}
			
		}
	}
	
}
class Calculation{
	boolean prime(int number){
		for(int i=2;i<=number/2;i++){
			if(number%i==0)
				return false;
		}
		return true;
	}
	int reverse(int number){
		int temp=0,reversed=0;
		while(number!=0){
			temp=number%10;
			reversed=reversed*10+temp;
			number/=10;
		}
		return reversed;
	}
}