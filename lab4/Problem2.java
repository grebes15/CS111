//*********************************************************************************************
//Andreas Landgrebe cs 111 fall semester 2012
//
//Lab 4 Problem 2
//
//read an application that reads the raduis of a sphere and print its volume and surface area
//*********************************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class Problem2 {

    public static void main (String[] args)
    {
	double radius, volume, surfaceArea;//this calcualtes the volume and the surface area
	Scanner input = new Scanner(System.in);
	DecimalFormat fmt  = new DecimalFormat("0.####");
	System.out.println("enter the radius");
	radius = input.nextDouble();

	volume = ((4.0/3.0) *  Math.PI * radius * radius * radius);
	surfaceArea = (4 * Math.PI * radius * radius);

	System.out.println("the volume is " + fmt.format(volume));
	System.out.println("the surface area is " + fmt.format(surfaceArea));
    }
}
		  

	