//*****************************************************************************************************************************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 11 Problem 1
//
//design a worker class that will write and debug a program to simulate the traffic flow, determining the number of vechicles passing through the intersection in consecutive ten-minute periods for two hours.
//*****************************************************************************************************************************************************************************************************************

import java.util.*;

public class Traffic
{
    final long SEED = 5;
    Random randomNumber = new Random(SEED);
    
    public int [] east;
    public int [] west;
    private int periods;
    private int slices;
    public Traffic(int p, int s)
    {
	periods = p;
	slices = s;
	east = new int[periods];
	west = new int[periods];
    }
    
    public String simulate()
    {
	double e = 1;
	double w = 1;
	for (int p = 0; p<periods; p++)
	    for (int s = 0; s<slices; s++)
		{
		    if (e > 0.2)
			{
			    e = randomNumber.nextDouble();
			}
		    if (w > 0.2)
			{
			    w = randomNumber.nextDouble();
			}
		     if (e > 0.2)
			{
			    east[p] ++;
			    e = 1;
			}
		     if (w > 0.2)
			{
			    west[p] ++;
			    w = 1;
			}
		    if (e <= 0.2 && w <= 0.2)
			{
			    east[p] ++;
			    e = 1;
			    west[p] ++;
			    w = 1;
			}
		}
	String str = new String();
	str = "Interval\t\tEastbound\t\tWestbound\n";
	for (int i = 0; i < periods; i++)
	    {
		str = str + (i + 1) + "\t\t\t" + east[i] + "\t\t\t" + west[i] + "\n";
	    }
	return str;
    }

public String toString()
{
    return "Periods = " + periods + "Slices = " + slices;
}
}	
					       