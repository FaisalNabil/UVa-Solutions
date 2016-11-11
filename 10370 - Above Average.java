/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int testCase=in.nextInt();
		for(int i=0;i<testCase;i++){
			int number=in.nextInt(),sum=0,count=0;
			int[] studentNumber=new int[number];
			for(int j=0;j<number;j++){
				studentNumber[j]=in.nextInt();
				sum+=studentNumber[j];
			}
			double avarage=sum/number;
			for(int j=0;j<number;j++){
				if(studentNumber[j]>avarage)
					count++;
			}
			double percentage=(count*100.000/number);
			DecimalFormat dff=new DecimalFormat("0.000");
			//double roundPercentage=(percentage*100.000)/100.000;
			System.out.println(dff.format(percentage)+"%");
		}
	}
}