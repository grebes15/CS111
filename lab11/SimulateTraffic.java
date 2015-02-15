//*************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 11 Problem 2
//
//Sets up an application class that runs a traffic simulation
//*************************************************************
import java.util.*;
public class SimulateTraffic
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner (System.in);
	System.out.println ("Enter the number of periods");
	int periods = scan.nextInt();
	System.out.println("Enter the number of slices");
	int slices = scan.nextInt();
	
	Traffic traf = new Traffic(periods, slices);
	System.out.println(traf.simulate());
    }
}