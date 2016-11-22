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
		System.out.println("Lumberjacks:");
		for(int i=0;i<testCase;i++){
			int[] arr=new int[10];
			for(int j=0;j<10;j++){
				arr[j]=in.nextInt();
			}
			int count=0;
			for(int j=0;j<9;j++){
				if(arr[j]>arr[j+1])
					count++;
			}
			if(count==0)
				System.out.println("Ordered");
			else{
				count=0;
				for(int j=0;j<9;j++){
					if(arr[j]<arr[j+1])
						count++;
				}
				if(count==0)
					System.out.println("Ordered");
				else{
					System.out.println("Unordered");
				}
			}
		}
	}
}