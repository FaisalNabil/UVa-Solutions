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
		System.out.println("PERFECTION OUTPUT");
		while(in.hasNext()){
			long number=in.nextLong(),sum=0;
			String result="";
			if(number==0){
				System.out.println("END OF OUTPUT");
				break;
			}
			else{
				System.out.printf("%5d  ",number);
				for(long i=1;i<=number/2;i++){
					if(number%i==0)
						sum+=i;
				}
				if(sum==number)
					result="PERFECT";
				else if(sum<number)
					result="DEFICIENT";
				else if(sum>number)
					result="ABUNDANT";
				System.out.println(result);
			}
		}
	}
}