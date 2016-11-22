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
			int number=in.nextInt();
			long temp,sum=0,initNumber=number;
			Calculation calc=new Calculation();
			while(number!=0){
				temp=number%10;
				sum+=(temp*temp);
				number/=10;
			}
			if(sum==1)
				System.out.println("Case #"+(i+1)+": "+initNumber+" is a Happy number.");
			else if(sum==1||sum== 4||sum== 16||sum== 20||sum== 37||sum== 42||sum== 58||sum== 89||sum== 145)
				System.out.println("Case #"+(i+1)+": "+initNumber+" is an Unhappy number.");
			else{
				if(calc.check(sum,initNumber)==true)
					System.out.println("Case #"+(i+1)+": "+initNumber+" is a Happy number.");
				else
					System.out.println("Case #"+(i+1)+": "+initNumber+" is an Unhappy number.");
			}
			
		}
	}
	
}

class Calculation{
	boolean check(long number,long initNumber){
		long temp,sum=0;
			while(number!=0){
				temp=number%10;
				sum+=(temp*temp);
				number/=10;
			}
			if(sum==1)
				return true;
			else if(sum==1||sum== 4||sum== 16||sum== 20||sum== 37||sum== 42||sum== 58||sum== 89||sum== 145)
				return false;
			else
				return check(sum,initNumber);
	}
}