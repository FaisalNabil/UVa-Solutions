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
		int i=1;
		while(in.hasNext()){
			
			String input=in.next();
			String output="";
			if(input.equals("Hajj"))
				System.out.println("Case "+i+": Hajj-e-Akbar");
				
			else if(input.equals("Umrah"))
				System.out.println("Case "+i+": Hajj-e-Asghar");
				
			
			else if(in.equals("*"))
				break;
			i++;
			
		}
	}
}