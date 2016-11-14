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
			int a=in.nextInt();
			int b=in.nextInt();
			if(a==0 && b==0)
				break;
			else{
				int count=0;
				for(int i=a;i<=b;i++){
					if(Math.sqrt(i)%1==0)
						count++;
				}
				System.out.println(count);
			}
		}
	}
}