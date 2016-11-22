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
			int h1=in.nextInt();
			int m1=in.nextInt();
			int h2=in.nextInt();
			int m2=in.nextInt();
			if(h1==0 && m1==0 && h2==0 && m2==0 )
				break;
			 int totalH=h2-h1;
			 int totalM=m2-m1;
			 if(totalM<0)
			  {
			  totalM=totalM+60;
			  totalH=totalH-1;
			  }
			 if(totalH<0)
			  totalH=totalH+24;
			 
			 System.out.println( totalH*60+totalM);
			
		}
	}
}