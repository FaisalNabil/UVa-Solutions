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
			int number=in.nextInt();
			int[] carriges=new int[number];
			for(int j=0;j<number;j++){
				carriges[j]=in.nextInt();
			}
			int count=0;
			boolean flag=true;
			while(flag){
				flag=false;
				for(int k=1;k<number;k++){
					if(carriges[k]<carriges[k-1]){
						int temp=carriges[k];
						carriges[k]=carriges[k-1];
						carriges[k-1]=temp;
						count++;
						flag=true;
					}
				}
			}
			System.out.println("Optimal train swapping takes "+count+" swaps.");
		}
	}
}