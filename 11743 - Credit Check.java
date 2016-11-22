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
			int sum=0;
			for(int j=0;j<4;j++){
				int num=in.nextInt();
				for (int k = 0; k < 2; ++k)
				{
					sum += num % 10;
					num /= 10;
					sum += num * 2 % 10;
					sum += (num % 10 * 2 / 10);
					num /= 10;
				}
				
			}
			
			//int div=sumEven+sumOdd;
			if(sum%10==0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}
}