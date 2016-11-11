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
			int[] sides=new int[3];
			int max=-1,maxIndex=-1;
			for(int i=0;i<3;i++){
				sides[i]=in.nextInt();
				if(sides[i]>max){
					max=sides[i];
					maxIndex=i;
				}
			}
			if(sides[0]==0 && sides[1]==0 && sides[2]==0)
				break;
			else{
				int sum=0;
				for(int i=0;i<3;i++){
					if(i!=maxIndex)
						sum+=Math.pow(sides[i],2);
				}
				if(sum==Math.pow(sides[maxIndex],2))
					System.out.println("right");
				else
					System.out.println("wrong");
			}
		}
	}
}