import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  while(sc.hasNext()){
			  int n = sc.nextInt();
			  int[] arr = new int[n];
			  for(int i = 0; i<n; i++){
				  arr[i] = sc.nextInt();
			  }
			  int tk = sc.nextInt();
 
			  Arrays.sort(arr);
 				String s="";
			  	int x=Integer.MAX_VALUE;
			  for(int i = 0; i<n; i++){
			  	
				  for(int j = i+1; j<n; j++){
 
					  int sum = arr[j] + arr[i];		
					  if(sum == tk){
						 int diff = Math.abs(arr[j] - arr[i]);
						   //System.out.println(arr[i]+" "+arr[j]);
 							if(diff<x){
 								x=diff;
 								s=arr[i]+" and "+arr[j];
 							}
 								
 
					  }
 
				  }
			  }
			  System.out.println("Peter should buy books whose prices are "+s+".");
			  System.out.println();
 
		  }
 
 
 
	}
}