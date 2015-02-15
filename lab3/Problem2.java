//*************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 3 Problem 2
//
//read an application that converts Fahrenheit to Celsius
//*************************************************************

import java.util.Scanner;
public class Problem2{

    public static void main(String[]args)
    {
	Scanner input = new Scanner (System.in);
	double fahrenheit;//this is the degrees that is being converted
	double celsius;//this is the degrees that will be converted

	System.out.println("enter how many Fahrenheit degrees");
	fahrenheit = input.nextDouble();

	celsius =(5)*(fahrenheit - 32)/9 ;
	System.out.println("Fahrenheit in celsius is " + celsius);
    }
}