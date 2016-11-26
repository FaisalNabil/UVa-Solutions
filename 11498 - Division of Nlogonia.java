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
			int testCase=in.nextInt();
			if(testCase==0)
				break;
			int x=in.nextInt(),y=in.nextInt();
			for(int i=0;i<testCase;i++){
				int dx=in.nextInt(),dy=in.nextInt();
				if(dx==x || dy==y)
					System.out.println("divisa");
				else if(dx>x && dy>y)
					System.out.println("NE");
				else if(dx>x && dy<y)
					System.out.println("SE");
				else if(dx<x && dy>y)
					System.out.println("NO");
				else if(dx<x && dy<y)
					System.out.println("SO");
			}
		}
	}
}