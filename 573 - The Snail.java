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
			double h=in.nextDouble();
			if(h==0)
				break;
			double u=in.nextDouble();
			double d=in.nextDouble();
			double f=in.nextDouble();
			
			double initialHeight=Double.MAX_VALUE,distanceClimbed=0.0,heightAfterClimb=u,heightAfterSliding=0.0,fatigue=u*(f/100.0),coveredHight=0;
			int days=0;
			boolean state=true;
			while(coveredHight<=h && coveredHight>=0){
				double upDistance=u-fatigue*days;
				if(upDistance>0)
					coveredHight+=upDistance;
				if(coveredHight<=h && coveredHight>=0)
					coveredHight-=d;
				days++;
			}
			if(coveredHight>h)
				System.out.println("success on day "+days);
			else
				System.out.println("failure on day "+days);
			
		}
	}
}