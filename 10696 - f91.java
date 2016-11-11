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
			else {
				Calculation c=new Calculation();
				System.out.println("f91("+number+") = "+c.recurtion(number));
			}
		}
	}
}

class Calculation{
	int recurtion(int number){
		if(number>=101)
			return number-10;
		return recurtion(recurtion(number+11));
		
	}
}