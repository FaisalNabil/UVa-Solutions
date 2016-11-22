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
			int number=in.nextInt();
			String value="";
			int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
			for(int j=1;j<=number;j++){
				value+=j;
			}
			for(int j=0;j<value.length();j++){
				char c=value.charAt(j);
				switch(c){
					case '0': zero++;
						break;
					case '1': one++;
						break;
					case '2': two++;
						break;
					case '3': three++;
						break;
					case '4': four++;
						break;
					case '5': five++;
						break;
					case '6': six++;
						break;
					case '7': seven++;
						break;
					case '8': eight++;
						break;
					case '9': nine++;
						break;
					
				}
			}
			System.out.println(zero+" "+one+" "+two+" "+three+" "+four+" "+five+" "+six+" "+seven+" "+eight+" "+nine);
		}
	}
}