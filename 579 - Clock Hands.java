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
		while(in.hasNext()){
			String input=in.next();
			String[] time=new String[2];
			int i=0;
			for(String h:input.split(":")){
				time[i]=h;
				i++;
			}
			int hours=Integer.parseInt(time[0]);
			int minutes=Integer.parseInt(time[1]);
			
			if(hours==0 && minutes==0)
				break;
			else{
				//int hourHand=(int)0.5*(60*hours+minutes);
				//int minuteHand=(int)6*minutes;
				double angle = Math.abs(0.5 * ( 60 * hours -11 * minutes));
				if(angle>180)
					System.out.printf("%.3f\n",(360-angle));
				else
					System.out.printf("%.3f\n",angle);
			}
		}
	}
}