//*********************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 10 Problem 2
//
//desgin and implemenet an application class
//*********************************************

import java.util.*;
public class TestArray
{

    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
    
	System.out.println("Enter the size of the array:");
	int size = scan.nextInt();
    
	int [] array = readIntArray(size);
	LinearArray a = new LinearArray(array);
    
	System.out.println("The original array:");
	System.out.println(a);
    
	//Test the sum method.
	System.out.println ("The sum of the element in the array is " + a.sum());
    
	//Test the product method.
	System.out.println ("The product of the element in the array is: " + a.product());

	//Test the maximum
	System.out.println ("The maximum of the element in the array is: " + a.maximum());
    
	//Test the inOrder
	System.out.println ("The array is in order " + a.inOrder());

	a.reverse();
	//Test the reverse
	System.out.println ("The reverse of the array is:" + a);
	a.reverse();
	//Test the reverse
	System.out.println ("The reverse of the array is:" + a);
    
	//Test the largerThanEach(47)
	System.out.println ("The array is larger than 47: " + a.LargerThanEach(47));

	//Test the largerThanEach(4)
	System.out.println ("The array is larger than 4: " + a.LargerThanEach(4));
    
	System.out.println("Enter the size of the array:");
	size = scan.nextInt();
	int [] array2 = readIntArray(size);
	LinearArray b = new LinearArray(array2);
    

	System.out.println ("The array is:" +  b);
	System.out.println ("The sum of the arrays are:" + b.sum(array));
    
	//Test the linearSearch
	System.out.println ("Is 4 in the array(will return the index of the array or -1 if not found)?:" + b.linearSearch(4));

	//Test the linearSearch
	System.out.println ("Is 27 in the array(will retrun the index of the array or -1 if not found)?:" + b.linearSearch(27));
    
	//Test the rotateLeft
	array2 =  b.rotateLeft();
	System.out.print ("The array rotated left is:");
	for (int i = 0; i < array2.length - 1; i++)
	    System.out.print (array2[i] + ",");
	System.out.println(array2[array2.length - 1]);
	    //Test the ascending sort
	    b.sort(1);
	System.out.println ("The ascending sorted array is:" + b);
    
	//Test the descending sort
	b.reverse();
	System.out.println ("The descending sorted array is:" + b);    
    }

    public static int[] readIntArray(int size)
    {
	Scanner scan = new Scanner(System.in);
	int[] x = new int [size];
	for (int i = 0; i < size; i++)
	    {
		System.out.println("Enter the next element:");
		x[i] = scan.nextInt();
	    }
	return x;
    }
}
