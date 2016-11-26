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
			String input=in.nextLine();
			int value=0;
			
			for(int i=0;i<input.length();i++){
				char c=input.charAt(i);
				if(Character.isDigit(c) )
					value+=((int)c)-48;
				else if(c=='b'){
					for(int j=0;j<value;j++)
						System.out.print(" ");
					value=0;
				}
				else if(c=='!'){
					System.out.println();
				}
				else{
					for(int j=0;j<value;j++)
						System.out.print(c);
					value=0;
				}
				
			}
			System.out.println();
		}
	}
}