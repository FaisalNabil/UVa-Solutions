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
			String s=in.nextLine();
			int count=0;
			for(int i=0;i<s.length();i++){
				if(Character.isLetter(s.charAt(i))){
					count++;
					while(Character.isLetter(s.charAt(i))){
						i++;
					}
				}
				
			}
			System.out.println(count);
		}
	}
}