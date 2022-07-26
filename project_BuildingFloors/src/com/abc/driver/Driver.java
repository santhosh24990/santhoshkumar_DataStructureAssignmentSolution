package com.abc.driver;
import com.abc.display.*;

import java.util.*;
public class Driver 
{
	
	public static void main (String[] args)
	{
		HashMap<Integer,Integer> FloorOnGivenDay = new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int TotalFloors=sc.nextInt();
		ArrayList<Integer> FloorSize = new ArrayList<Integer>();
		for(int i=1;i<=TotalFloors;i++)
		{
			System.out.println("enter the floor size given on day " + i);
			FloorSize.add(sc.nextInt());
		    FloorOnGivenDay.put(i,FloorSize.get(i-1));
		}
		Collections.sort(FloorSize, Collections.reverseOrder()); 
		
		Displayresults displayobject= new Displayresults();
		displayobject.display(FloorOnGivenDay,FloorSize,TotalFloors);
	
	sc.close();
    }

}
