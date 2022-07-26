package com.abc.display;

import java.util.ArrayList;
import java.util.HashMap;

public class Displayresults 
{
	public void display(HashMap<Integer, Integer> FloorOnGivenDay, ArrayList<Integer> FloorSize, int TotalFloors)
	{
	System.out.println("The order of construction is as follows");
	for(int i=1;i<=TotalFloors;i++)
		{  
		    System.out.println();
		   System.out.println("day "+i);
		    for(int j=1;j<=i;j++)
		     {
		       if(FloorOnGivenDay.get(j)==FloorSize.get(0))
		         { 
			       System.out.print(FloorSize.get(0)+" ");
			       FloorSize.remove(0);
			       FloorOnGivenDay.put(j,0);
			       j=0;
			       if(FloorSize.isEmpty())
			       break;
		         }
	         }
		}
		
     }
	
}
