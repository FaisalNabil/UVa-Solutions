/* package whatever; // don't place package name! */

import java.util.*;
import java.math.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int coke=in.nextInt();
			float coca=((float)coke*3-1)/2;
			int nearestValue=(int)Math.ceil(coca);
			
			
			System.out.print(nearestValue);
		}
	}
}