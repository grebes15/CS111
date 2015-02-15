//*********************************************************************************************************************
//Andreas Landgrebe fall semester 2012
//
//Lab 6 Problem 1
//
//design and implement a class that contains instance data that represents the height, width, and depth of the box.
//**********************************************************************************************************************

public class Box
{
    private double height, width, depth;
    private boolean full;
    

    public Box(double h, double w, double d)
    {
	height = h;
	width = w;
	depth = d;
	full = false;
    }
    
    public double getHeight()
    {
	return height;
    }
    
    public double getWidth()
    {
	return width;
    }
    
    public double getDepth()
    {
	return depth;
    }
    
    public void setHeight (double h)
    {
	height = h;
    }

    public void setWidth (double w)
    {
	width = w;
    }

    public void setDepth (double d)
    {
	depth = d;
    }   
    public static boolean fitsInside (Box a, Box b)
    {
	if ((a.getHeight() < b.getHeight())&&(a.getWidth() < b.getWidth())&&(a.getDepth() < b.getDepth()))
	    return true;
	return false;
    }
    public String toString()
    {
	return height + "\t" + width + "\t" + depth;
    }
}
