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
			String time=in.next();
			String[] t=time.split(":");
			
			int h=Integer.parseInt(t[0]);
			int m=Integer.parseInt(t[1]);
			
			if(m==0){
				h=12-h;
				if(h==0)
					h=12;
			}
			else{
				h=11-h;
				if(h<=0)
					h=12+h;
				m=60-m;
			}
			 System.out.printf("%02d:%02d\n", h, m);
		}
	}
}