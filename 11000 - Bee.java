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
			long male=0,total=1,temp=0;
			if(number<0)
				break;
			for(int i=0;i<number;i++){
				temp=male;
				male=total;
				total=temp+total+1;
				
			}
			System.out.println(male+" "+total);
		}
	}
}