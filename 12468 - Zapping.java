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
			int now=in.nextInt();
			int to=in.nextInt();
			if(now==-1 && to==-1)
				break;
			else{
				int up=0,down=0;
				if(now<to){
					up=(to-now);
					down=now+(100-to);
					if(up<down)
						System.out.println(up);
					else
						System.out.println(down);
				}
				
				else if(now>to){
					up=(100-now)+to;
					down=now-to;
					if(up<down)
						System.out.println(up);
					else
						System.out.println(down);
				}
				else if(now==to)
					System.out.println(0);
			}
		}
	}
}