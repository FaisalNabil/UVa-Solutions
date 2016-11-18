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
		for(int i=0;i<testCase;i++){
			int size=in.nextInt();
			int[] walls=new int[size];
			for(int j=0;j<size;j++){
				walls[j]=in.nextInt();
			}
			int up=0,down=0;
			for(int j=0;j<size-1;j++){
				if(walls[j]>walls[j+1])
					down++;
				else if(walls[j]<walls[j+1])
					up++;
			}
			System.out.println("Case "+(i+1)+": "+up+" "+down);
		}
	}
}