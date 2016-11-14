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
			int n1=in.nextInt();
			int n2=in.nextInt();
			int count=0;
			int carry=0;
			if(n1==0 && n2==0)
				break;
			else{
				while(n1!=0 || n2!=0){
					int sum=carry + n1%10 + n2%10;
					if((sum)>=10)
						count++;
					
					carry=sum/10;
					n1/=10;
					n2/=10;
						
				}
			if(count==0)
				System.out.println("No carry operation.");
			else if(count==1)
				System.out.println("1 carry operation.");
			else if(count>0)
				System.out.println(count+" carry operations.");
			}
			
		}
	}
}