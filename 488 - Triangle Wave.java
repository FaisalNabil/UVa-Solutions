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
			//System.out.println();
			int amplitude=in.nextInt();
			int frequency=in.nextInt();
			
			String[] set={"1","22","333","4444","55555","666666","7777777","88888888","999999999"};
			if (amplitude == 0){
				for (int j=1;j<frequency;j++){
					System.out.println();
				}
				continue;
			}
			if(frequency==0)
				System.out.println();
			else{
				for(int j=0;j<frequency;j++){
					for(int ii=0;ii<amplitude;ii++)
						System.out.println(set[ii]);
					//System.out.println();
					for(int ii=amplitude-2;ii>=0;ii--)
						System.out.println(set[ii]);
					if(j<frequency-1)
						System.out.println();
					
				}
			}
			if(i<testCase-1)
						System.out.println();
		}
	}
}