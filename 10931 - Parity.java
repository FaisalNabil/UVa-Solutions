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
			int number=in.nextInt();
			if(number==0)
				break;
			else{
				String binNumber=Integer.toString(number,2);
				int count=0;
				for(int i=0;i<binNumber.length();i++){
					if(binNumber.charAt(i)=='1')
						count++;
				}
				System.out.println("The parity of "+binNumber+" is "+count+" (mod 2).");
			}
		}
	}
}