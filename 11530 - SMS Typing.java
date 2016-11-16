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
		int testCase=in.nextInt();
		in.nextLine();
		for(int i=0;i<testCase;i++){
			int count=0;
			String input=in.nextLine();
			for(int j=0;j<input.length();j++){
				char c=input.charAt(j);
				switch(c){
					case 'a':
					case 'A':
						count+=1;
						break;
					case 'b':
					case 'B':
						count+=2;
						break;
					case 'c':
					case 'C':
						count+=3;
						break;
					case 'd':
					case 'D':
						count+=1;
						break;
					case 'e':
					case 'E':
						count+=2;
						break;
					case 'f':
					case 'F':
						count+=3;
						break;
					case 'g':
					case 'G':
						count+=1;
						break;
					case 'h':
					case 'H':
						count+=2;
						break;
					case 'i':
					case 'I':
						count+=3;
						break;
					case 'j':
					case 'J':
						count+=1;
						break;
					case 'k':
					case 'K':
						count+=2;
						break;
					case 'l':
					case 'L':
						count+=3;
						break;
					case 'm':
					case 'M':
						count+=1;
						break;
					case 'n':
					case 'N':
						count+=2;
						break;
					case 'o':
					case 'O':
						count+=3;
						break;
					case 'p':
					case 'P':
						count+=1;
						break;
					case 'q':
					case 'Q':
						count+=2;
						break;
					case 'r':
					case 'R':
						count+=3;
						break;
					case 's':
					case 'S':
						count+=4;
						break;
					case 't':
					case 'T':
						count+=1;
						break;
					case 'u':
					case 'U':
						count+=2;
						break;
					case 'v':
					case 'V':
						count+=3;
						break;
					case 'w':
					case 'W':
						count+=1;
						break;
					case 'x':
					case 'X':
						count+=2;
						break;
					case 'y':
					case 'Y':
						count+=3;
						break;
					case 'z':
					case 'Z':
						count+=4;
						break;
					case ' ':
						count+=1;
						break;
				}
			}
			System.out.println("Case #"+(i+1)+": "+count);
		}
	}
}