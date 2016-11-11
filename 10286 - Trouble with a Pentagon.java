/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			double pentagonSide=in.nextDouble();
			
			double squareSide=pentagonSide*(Math.sin(Math.toRadians(108))) / (Math.sin(Math.toRadians(63)));
			DecimalFormat df=new DecimalFormat("#.0000000000");
			System.out.println(df.format(squareSide));
		}
	}
}