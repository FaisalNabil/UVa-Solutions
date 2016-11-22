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
		Calculation calc=new Calculation();
		while(in.hasNext()){
			long i=in.nextLong();
			long j=in.nextLong();
			long max=0,found,maxNumber=0;
			if(i==0 && j==0)
				break;
			if(Math.min(i,j)==1){
                max=3;
                maxNumber=1;
            }
				for(long x=Math.min(i,j);x<=Math.max(i,j);x++){
					found=calc.count(x);
					if(max<found){
						max=found;
						maxNumber=x;
					}
				}
				System.out.println("Between "+Math.min(i,j)+" and "+Math.max(i,j)+", "+maxNumber+" generates the longest sequence of "+max+" values.");
			
		}
	}
}

class Calculation{
	
	long count(long x){
		long c=0;
		if(x==1)
			return c;
		if(x%2==1)
			return 1+count(3*x+1);
		else
			return 1+count(x/2);
		}		
}