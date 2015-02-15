//**********************************************************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 10 Problem 1
//
//design and a worker class with members including an instance variable representing a linear array anbd a number of typical array operations.
//***********************************************************************************************************************************************

public class LinearArray
{
    public int [] x;
    public LinearArray(int [] b)
    {
	x=b;
    }

    //this is the method to calculate the sum of the arrays
    public int sum ()
    {
	int sum = 0;
	for (int i = 0; i<x.length; i++)
	    {
		sum = sum + x[i];
	    }
	return sum;
    }
    //this is the method to calculate the product of the arrays
    public int product ()
    {
	int product = 1;
	for (int i = 0; i<x.length; i++)
	    {
		product = product * x[i];
	    }
	return product;
    }
    //this is the method to calculate the maximum
    public int maximum ()
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
    //this is the method to reverse the arrays
    public void reverse ()
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
    //this is the method to have the arrays be in order
    public boolean inOrder ()
    {
	int i = 0;
	for (;i < x.length - 1; i++)
	    {
		if (x[i] > x[i + 1])
		    return false;
	    }
	return true;
    }
    //this is the method to calculate to see whether the arrays are large than rach
    public boolean LargerThanEach (int a)
    {
	for (int i = 0; i<x.length; i++)
	    if (x[i] > a)
		return false;
	return true;
    }		
    
    //this is the method to calculate the sum of the arrays
    public int sum (int [] b)
    {
	int s = Math.min(x.length, b.length);
	int sum = 0;
	for (int i = 0; i < Math.min(b.length, x.length); i++)
	    sum =  x[i] + b[i];
	return sum;
    }
    //this is the method to find the index of the arrays
    public int linearSearch (int k)
    {
	for (int i = 0; i < x.length; i++)
	    if (x[i] == k)
		{
		    return i;
		}
	return -1;
    }
    //this is the method that will have the arrays rotate left
    public int[] rotateLeft()
    {
	int [] k = new int [x.length];
	for (int i = 0; i < x.length - 1; i++)
	    {
		k[i] = x[i+1];
	    }
	k[x.length - 1] = x[0];
	return k;
    }
    //this is the method that will sort the arrays
    public void sort (int direction)
    {
	int temp = 0;
	if (direction == 1)
	    {
		for(int i = 0; i < x.length; i++)
		    {
			for (int j = 0; j < x.length - 1; j++)
			    {
				if ( x[j] > x[j + 1])
				    {
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = x[j];
				    }
			    }
		    }
	    }
	else
	    {
		for(int i = 0; i < x.length; i++)
		    {
			for (int j = 0; j < x.length - 1; j++)
			    {
				if ( x[j] < x[j + 1])
				    {
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = x[j];
				    }
			    }
		    }
	    }
    }
    public String toString()
    {
	String str = ("The elements are: ");
	for (int i = 0; i < x.length - 1; i++)
	    str += x[i] + ", " ;
	str += x[x.length - 1];
	return str;
    }
}