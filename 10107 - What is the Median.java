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
		ArrayList<Long> list=new ArrayList<Long>();
		while(in.hasNext()){
			list.add(in.nextLong());
			Collections.sort(list);
			if(list.size()%2==0){
				long sum=0;
				sum=list.get(list.size()/2)+list.get((list.size()/2)-1);
				System.out.println(sum/2);
			}
			else
				System.out.println(list.get(list.size()/2));
			
		}
	}
}