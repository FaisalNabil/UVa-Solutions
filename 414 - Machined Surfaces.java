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
		String line;
		while((line = in.next()) != null){
			int n=Integer.parseInt(line);;
			int min_blanks = 23,total = 0,k,j;
			if(n==0)
				break;
			for(int i=0;i<n;i++){
				line=in.next();
					
				for (j=0; j<25 ; j++){
					if (line.charAt(j) != 'X')
							break;
				}
				for (k=24; k>=j ; k--){
					if (line.charAt(k) != 'X')
						break;
				}
				total += (k-j+1);
				if (k+1-j < min_blanks)
					min_blanks = k-j+1;
			}
			total -= min_blanks*n;
			System.out.println(total);
		}
	}
}