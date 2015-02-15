//*********************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 3 Problem 3
//
//read the application that states the fewest number of each bill and coin needed to represent that amount
//*********************************************************************************************************
import java.util.Scanner;
public class Problem3
{
    public static void main(String[]args)
    {
	double  money;// this declares the amount of money as a double
	int ten;//this is declaring the variable for a 10 dollar bill as a double
	int five;//this is declaring the variable for a 5 dollar bill as a double
	int one;//this is declaring the variable for a 1 dollar bill as a double
	int quarter;//this is declaring the variable for a quarter as a double
	int dime;//this is declaring the variable for a a dime as a double
	int nickel;//this is declaring the variable for a nickle as a double
	int penny;// this is declaring the variable for a penny as a double
	int cents;//

	System.out.println ("Enter the money amount");
	Scanner input = new Scanner (System.in);
	money = input.nextDouble();
	System.out.println ("this amount of money is equvialent to");
	cents = (int)(money * 100);
	ten = (cents/1000);
	cents = cents%1000;
	five = (cents/500);
	cents = cents%500;
	one = (cents/100);
	cents = cents%100;
	quarter = (cents/25);
	cents = cents%25;
	dime = (cents/10);
	cents = cents%10;
	nickel = (cents/5);
	cents = cents%5;
	penny = (cents/1);
	cents = cents%1;

	System.out.println ("" + ten+ " ten dollar bills");
	System.out.println ("" + five+ " five dollar bills");
	System.out.println ("" + one+ " one dollar bills");
	System.out.println ("" + quarter+ " quarters");
	System.out.println ("" + dime+ " dimes");
	System.out.println ("" + nickel+ " nickels");
	System.out.println ("" + penny+ " pennies");
    }
}
	

	
