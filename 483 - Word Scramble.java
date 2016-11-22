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
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner br=new Scanner(System.in);
		//int testCase=Integer.parseInt(br.readLine());
		while(br.hasNext()){
			String s=br.nextLine();
			String words[]=s.split(" ");
			for(int i=0;i<words.length;i++){
				for(int j=words[i].length()-1;j>=0;j--)
					System.out.print(words[i].charAt(j));
				if(i!=words.length-1)
					System.out.print(" ");
			}
 
			System.out.println();
		}
	}
}