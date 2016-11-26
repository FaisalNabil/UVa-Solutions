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
			long[] arr=new long[3];
			for(int j=0;j<3;j++)
				arr[j]=in.nextLong();
			Arrays.sort(arr);
			if(arr[0]+arr[1]<=arr[2] || arr[0]<=0 ||arr[1]<=0||arr[2]<=0)
				System.out.println("Case "+(i+1)+": Invalid");
			else if(arr[0]==arr[1] && arr[1]==arr[2])
				System.out.println("Case "+(i+1)+": Equilateral");
			else if(arr[0]==arr[1] || arr[1]==arr[2] || arr[0]==arr[2])
				System.out.println("Case "+(i+1)+": Isosceles");
			else
				System.out.println("Case "+(i+1)+": Scalene");
		}
	}
}