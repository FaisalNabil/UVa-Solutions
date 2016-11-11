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
			int number=in.nextInt(),count=0;
			int[] values=new int[number];
			for(int i=0;i<number;i++){
				values[i]=in.nextInt();
			}
			for(int i=0;i<number-1;i++){
				for(int j=i+1;j<number;j++){
				if(values[i]>values[j])
					count++;
				}
			}
			System.out.println("Minimum exchange operations : "+count);
		}
	}
}