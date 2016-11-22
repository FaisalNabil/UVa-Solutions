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
			int term1=in.nextInt();
			int term2=in.nextInt();
			int finalTerm=in.nextInt();
			int attendence=in.nextInt();
			int[] classTest=new int[3];
			int min=Integer.MAX_VALUE;
			int minIndex=4;
			for(int j=0;j<3;j++){
				classTest[j]=in.nextInt();
				if(classTest[j]<min){
					min=classTest[j];
					minIndex=j;
				}
			}
			int avg=0;
			
			for(int j=0;j<3;j++){
				if(j!=minIndex){
					avg+=classTest[j];
				}
			}
			avg/=2;
			int totalMark=term1+term2+finalTerm+attendence+avg;
			if(totalMark>=90)
				System.out.println("Case "+(i+1)+": A");
			else if(totalMark>=80 && totalMark<90)
				System.out.println("Case "+(i+1)+": B");
			else if(totalMark>=70 && totalMark<80)
				System.out.println("Case "+(i+1)+": C");
			else if(totalMark>=60 && totalMark<70)
				System.out.println("Case "+(i+1)+": D");
			else if(totalMark<60)
				System.out.println("Case "+(i+1)+": F");
		}
	}
}