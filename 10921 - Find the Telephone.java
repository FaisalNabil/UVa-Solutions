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
			for(int i=0;i<input.length();i++){
				char c=input.charAt(i);
				switch(c){
					case '0':
						System.out.print(0);
						break;
					case '1':
						System.out.print(1);
						break;
					case 'A':
					case 'B':
					case 'C':
						System.out.print(2);
						break;
					case 'D':
					case 'E':
					case 'F':
						System.out.print(3);
						break;
					case 'G':
					case 'H':
					case 'I':
						System.out.print(4);
						break;
					case 'J':
					case 'K':
					case 'L':
						System.out.print(5);
						break;
					case 'M':
					case 'N':
					case 'O':
						System.out.print(6);
						break;
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
						System.out.print(7);
						break;
					case 'T':
					case 'U':
					case 'V':
						System.out.print(8);
						break;
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
						System.out.print(9);
						break;
					case '-':
						System.out.print("-");
						break;
					
				}
			}
			System.out.println();
		}
	}
}