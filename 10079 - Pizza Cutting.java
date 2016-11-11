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
		
		long cuts,pieces;
		while(in.hasNext()){
			cuts=in.nextLong();
			if(cuts>=0 && cuts<=210000000){
				
					pieces=((cuts*(cuts+1))/2)+1;
					System.out.println(pieces);
			}
			else if(cuts<0)
					break;
		}
	}
}