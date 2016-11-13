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
		calculation calc=new calculation();
		while(in.hasNext()){
			int number=in.nextInt();
			int sum=0;
			if(number==0)
				break;
			else{
				for(int i=1;i<number;i++){
					for(int j=i+1;j<=number;j++){
						sum+=calc.GCD(i,j);
					}
				}
			}
			System.out.println(sum);
		}
	}
}
class calculation{
	int GCD(int i,int j){
		int divisor=1;
		for(int x=1;x<=i;x++){
			if(i%x==0 && j%x==0)
				divisor=x;
		}
		return divisor;
	}
}