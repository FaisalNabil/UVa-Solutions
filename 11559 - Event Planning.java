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
			int participants=in.nextInt();
			int budget=in.nextInt();
			int numberHotels=in.nextInt();
			int numberWeekends=in.nextInt();
			int cost=0,minCost=Integer.MAX_VALUE;
			for(int i=0;i<numberHotels;i++){
				int perRoom=in.nextInt();
				for(int j=0;j<numberWeekends;j++){
					int available=in.nextInt();
					if(available>=participants){
						cost=perRoom*participants;
						if(cost<minCost)
							minCost=cost;
					}
				}
				
			}
			if(minCost<=budget)
				System.out.println(minCost);
			else
				System.out.println("stay home");
		}
	}
}