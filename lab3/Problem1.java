//****************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 3 Problem 1
//
//read an application that states the name, age, college, and petname and print it out
//****************************************************************************************

import java.util.Scanner;
public class Problem1 {

    public static void main (String[] args)
    {
	int age;
	String name, college, petname;//this sets up the name, age, college and petname	
	Scanner input = new Scanner (System.in);

	System.out.println("enter your name");
	name = input.nextLine();

	System.out.println("enter your age");
	age = input.nextInt();
	input.nextLine();
	System.out.println("enter your college");
	college = input.nextLine();

	System.out.println("enter your petname");
	petname = input.nextLine();

	System.out.println ("Hello, my name is " + name +" and I am " + age + " years");
	System.out.println ("old. I'm enjoying my time at " + college + ", though"); 
	System.out.println ("I miss my pet " + petname + " very much!");
    }
}