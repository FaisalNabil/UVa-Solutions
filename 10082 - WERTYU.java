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
			String input=in.nextLine();
			String newString="";
			for(int i=0;i<input.length();i++){
				char c=input.charAt(i);
				switch(c){
					case '1':
						newString+="`";
						break;
					case '2':
						newString+="1";
						break;
					case '3':
						newString+="2";
						break;
					case '4':
						newString+="3";
						break;
					case '5':
						newString+="4";
						break;
					case '6':
						newString+="5";
						break;
					case '7':
						newString+="6";
						break;
					case '8':
						newString+="7";
						break;
					case '9':
						newString+="8";
						break;
					case '0':
						newString+="9";
						break;
					case '-':
						newString+="0";
						break;
					case '=':
						newString+="-";
						break;
					case 'W':
						newString+="Q";
						break;
					case 'E':
						newString+="W";
						break;
					case 'R':
						newString+="E";
						break;
					case 'T':
						newString+="R";
						break;
					case 'Y':
						newString+="T";
						break;
					case 'U':
						newString+="Y";
						break;
					case 'I':
						newString+="U";
						break;
					case 'O':
						newString+="I";
						break;
					case 'P':
						newString+="O";
						break;
					case '[':
						newString+="P";
						break;
					case ']':
						newString+="[";
						break;
					case (char)92:
						newString+="]";
						break;
					case 'S':
						newString+="A";
						break;
					case 'D':
						newString+="S";
						break;
					case 'F':
						newString+="D";
						break;
					case 'G':
						newString+="F";
						break;
					case 'H':
						newString+="G";
						break;
					case 'J':
						newString+="H";
						break;
					case 'K':
						newString+="J";
						break;
					case 'L':
						newString+="K";
						break;
					case ';':
						newString+="L";
						break;
					case 'X':
						newString+="Z";
						break;
					case 'C':
						newString+="X";
						break;
					case 'V':
						newString+="C";
						break;
					case 'B':
						newString+="V";
						break;
					case 'N':
						newString+="B";
						break;
					case 'M':
						newString+="N";
						break;
					case ',':
						newString+="M";
						break;
					case '.':
						newString+=",";
						break;
					case '/':
						newString+=".";
						break;
					case ' ':
						newString+=" ";
						break;
					case (char)39:
						newString+=";";
						break;
					
				}
			}
			System.out.println(newString);
		}
	}
}