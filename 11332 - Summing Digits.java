import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class Main
{
	public static void main (String[] args)  
	{
      Scanner in=new Scanner(System.in);     
      while(in.hasNext()){
		  long number = in.nextLong();
		  if(number==0)
			  break;
		  else{
			  Calculation c=new Calculation();
			  System.out.println(c.calc(number));
		  }
	  }
 
	}
	
}
class Calculation{
		long calc(long number){
			long sum = 0;
			
			if(number < 10){
			  return number;
			}
			else{
				while(number != 0){
					long temp = number%10;
					sum += temp;
					number/=10;
				}
				return calc(sum);
				//return number;
			}
		}
	}