//************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 9 Problem 1
//
//design and write a Java program that will declare and instantiate a linear array with ten elements.
//*************************************************************************************************

public class Problem1
{
    public static void main (String[] args)
    {
	int [] x = new int [10];
	populate (x);
	System.out.println ("the populated array is: ");
	for (int i = 0; i < x.length; i++)
	    {
	        if (i != x.length - 1)
		    {
			System.out.print (x[i] + "," );
		    }
		else
		    System.out.println (x[i]);
	    }
	int sum = sum (x);
	System.out.println ("the sum of the array is: " + sum);
	int product = product (x);
	System.out.println ("the product of the  array is: " + product);
	int maximum = maximum (x);
	System.out.println ("the max of the array is: " + maximum);
	boolean inOrder1 = inOrder (x);
	System.out.println ("the array is in order: " + inOrder1);
	reverse (x);
	System.out.println ("the reversed array is: ");
	for (int i = 0; i < x.length; i++)
	    {
	        if (i != x.length - 1)
		    {
			System.out.print (x[i] + "," );
		    }
		else
		    System.out.println (x[i]);
	    }
	boolean inOrder = inOrder (x);
	System.out.println ("the reversed array is in order: " + inOrder);
	boolean LargerThanEach = LargerThanEach (x, 47);
	System.out.println ("the reversed array is larger than 47: "+LargerThanEach);
	boolean LargerThanEach1 = LargerThanEach (x, 4);
	System.out.println ("the reversed array is larger than 4: " +LargerThanEach1);
    }


    public static void populate(int [] x)
{
    int i;
    int count = 0;
    for(i = 0; i < x.length; i++)
	{
	    x[i] = x.length - i;
	}
}

    public static int sum (int [] x)
    {
	int sum = 0;
	for (int i = 0; i<x.length; i++)
	    {
		sum = sum + x[i];
	    }
	return sum;
    }

    public static int product (int [] x)
    {
	int product = 1;
	for (int i = 0; i<x.length; i++)
	    {
		product = product * x[i];
	    }
	return product;
    }
    
    public static int maximum (int [] x)
    {
	int max = 0;
	max = 0;
	for (int i = 0; i<x.length; i++)
	    {
		if (x[i] > max)
		    max = x[i];
	    }
	return max;
    }
    public static void reverse (int [] x)
    {
	int i = 0;
	int temp = 0;
	for (i = 0; i < x.length / 2; i++)
	    {
		temp = x[i];
		x[i] = x[x.length - 1 - i];
		x[x.length - 1 - i] = temp;
	    }
    }
    public static boolean inOrder (int [] x)
    {
	int i = 0;
	for (;i < x.length - 1; i++)
	    {
		if (x[i] > x[i + 1])
		    return false;
	    }
	return true;
    }
    public static boolean LargerThanEach (int [] x, int a)
    {
	for (int i = 0; i<x.length; i++)
	    if (x[i] > a)
		return false;
	return true;
    }		
    
}    
		
		
		