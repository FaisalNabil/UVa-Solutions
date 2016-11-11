import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int testCase=in.nextInt();
		for(int i=0;i<testCase;i++){
			int farmer=in.nextInt();
			int sum=0;
			for(int j=0;j<farmer;j++){
				int size=in.nextInt();
				int animal=in.nextInt();
				int e_f=in.nextInt();
				sum+=size*e_f;
			}
			System.out.println((int)sum);
		}
	}
}