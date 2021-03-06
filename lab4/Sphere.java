//************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 3 Problem 3
//
//design and implement a class that contains instance data that represents the sphere's diameter
//************************************************************************************************
import java.util.*;
public class Sphere
{
    private double diameter;
    public Sphere (double n)
    {
	diameter = n;
    }
    public String toString()
    {
	return "Sphere diamerer is " + diameter;
    }
    public double volume ()
    {
	double r = diameter/2;
	return (4.0/3.0) * Math.PI * r * r * r;
    }
    public double getDiameter() 
    {	
	return diameter;
    }
    public void setDiameter (double n)
    {
	diameter = n;
    }
    public double surfaceArea()
    {
	double r = diameter/2;
	return 4 * Math.PI * r * r;
    }
}