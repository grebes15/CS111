//************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 6 Problem 2
//
//design a class whose main method instantiates and updates Box objects.
//************************************************************************

public class BoxTest

{
    public static void main (String[]args)
    {
	System.out.println ("Height: Width: Depth:");
	Box a = new Box(5, 4.5, 7);
	Box b = new Box(4.75, 3.5, 6.25);
	Box c = new Box(6, 4.25, 7.5);

	System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(c.toString());
	
	System.out.println("Does Box a fit inside of Box b? " + Box.fitsInside(a, b));
	System.out.println("Does Box c fit inside of Box a? " + Box.fitsInside(c, a));
	
	a.setDepth(8);
	b.setWidth(4.75);
	c.setHeight(4);
	
	System.out.println("Does Box b fit inside of Box a? " + Box.fitsInside(b,a));
	System.out.println("Does Box c fit inside of Box a? " + Box.fitsInside(c,a));
	

	System.out.println(b.getWidth());
	
	c.setDepth(0);
	c.setWidth(0);
	c.setHeight(0);
	
	System.out.println(c.getDepth());
	System.out.println(c.getWidth());
	System.out.println(c.getHeight());
    }
}
	
       
      