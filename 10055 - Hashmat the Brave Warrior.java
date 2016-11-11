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
			long hashmant=in.nextLong();
			long opponent=in.nextLong();
			if(hashmant<opponent)
				System.out.println(opponent-hashmant);
			else
				System.out.println(hashmant-opponent);
		}
	}
}