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
		int money=0;
		for(int i=0;i<testCase;i++){
			
			String command=in.next();
			if(command.equals("report"))
				System.out.println(money);
			else if(command.equals("donate"))
				money+=in.nextInt();
		}
	}
}