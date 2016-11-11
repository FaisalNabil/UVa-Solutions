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
			int age=0;
			String currentDate[]=in.next().split("/");
			String birthDate[]=in.next().split("/");
			
			int cDay=Integer.parseInt(currentDate[0]);
			int cMonth=Integer.parseInt(currentDate[1]);
			int cYear=Integer.parseInt(currentDate[2]);
			
			int bDay=Integer.parseInt(birthDate[0]);
			int bMonth=Integer.parseInt(birthDate[1]);
			int bYear=Integer.parseInt(birthDate[2]);
			
			if(cDay<bDay)
				bMonth+=1;
			if(cMonth<bMonth)
				bYear+=1;
			
			age=cYear-bYear;
			if(age<0)
				System.out.println("Case #"+(i+1)+": Invalid birth date");
			else if(age>130)
				System.out.println("Case #"+(i+1)+": Check birth date");
			else
				System.out.println("Case #"+(i+1)+": "+age);
		}
	}
}