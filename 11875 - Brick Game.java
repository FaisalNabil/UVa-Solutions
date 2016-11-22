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
			int[] arr=new int[size];
			for(int j=0;j<size;j++){
				arr[j]=in.nextInt();
			}
			Arrays.sort(arr);
			int f=0,l=arr.length-1;
			while(f!=l){
				f++;
				l--;
			}
			System.out.println("Case "+(i+1)+": "+arr[f]);
		}
	}
}