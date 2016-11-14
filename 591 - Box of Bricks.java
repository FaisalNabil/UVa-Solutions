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
			int testCase=0;
			int n=in.nextInt();
			if(n==0)
				break;
			else{
				int[] arr=new int[n];
				int sum=0;
				for(int i=0;i<n;i++){
					arr[i]=in.nextInt();
					sum+=arr[i];
				}
				int avg=sum/n;
				int moves=0;
				for(int i=0;i<n;i++){
					if(arr[i]>avg){
						moves+=(arr[i]-avg);
					}
				}
				 System.out.println("Set #"+(testCase+1));
				System.out.println("The minimum number of moves is "+moves+".");
				System.out.println();
				testCase++;
			}
		}
	}
}