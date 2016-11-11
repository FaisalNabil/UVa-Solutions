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
			int i=in.nextInt();
			int j=in.nextInt();
			int max=0,found;
			/*if(i==j){
				System.out.println(i+" "+j+" "+max);
				continue;
			}*/
			for(int x=Math.min(i,j);x<=Math.max(i,j);x++){
				found=calc.count(x);
				if(max<found)
					max=found;
			}
			System.out.println(i+" "+j+" "+max);
		}
	}
}

class Calculation{
	
	int count(int x){
		int c=0;
		if(x==1)
			return c+1;
		while(x!=1){
			c++;
			if(x%2==1)
				x=3*x+1;
			
			else
				x/=2;
			
			}
			c++;
			return c;
		}
		
		
}