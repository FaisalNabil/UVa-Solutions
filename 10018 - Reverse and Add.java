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
		
		Calculation calc=new Calculation();
		for(int i=0;i<testCase;i++){
			boolean flag=false;
			int count=0;
			long number=in.nextLong();
			while(flag==false){
				if(number!=calc.reverse(number)){
					number+=calc.reverse(number);
					count++;
					continue;
				}
				else{
					flag=true;
					continue;
				}
			}
			System.out.println(count+" "+number);
			
		}
	}
}
class Calculation{
	long reverse(long number){
		long temp=0;
		while(number!=0){
			temp=temp*10+number%10;
			number/=10;
		}
		return temp;
	}
	
}