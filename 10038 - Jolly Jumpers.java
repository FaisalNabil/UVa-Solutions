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
			int[] arr=new int[number];
			for(int i=0;i<number;i++){
				arr[i]=in.nextInt();
			}
			int[] diff=new int[number-1];
			for(int i=1;i<number;i++){
				diff[i-1]=Math.abs(arr[i]-arr[i-1]);
			}
			Arrays.sort(diff);
			boolean test=true;
			for(int i=0;i<number-1;i++){
				if(diff[i]!=(i+1))
					test=false;
			}
			if(test==true)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
		}
	}
}