//**************************************************
//Andreas Landgrebe cs 111 fall semester 2012
//
//Lab 2 Problem 2
//**************************************************
import java.util.Scanner;
public class Problem2
{
    public static void main (String[] args)
    {
	Scanner input = new Scanner (System.in);
	int hours;//(this is the hours)
	int minutes;//(this is the minutes)
	int seconds;//(this is the seconds)
	System.out.println("enter how many hours");
	hours = input.nextInt();
	System.out.println("enter how many minutes");
	minutes = input.nextInt();
	System.out.println("enter how many seconds");
	seconds = input.nextInt();

	System.out.println("the time inputed is"+hours + " "+ minutes +" "+ seconds);

	final int SECONDSPERHOUR=3600;
	final int SECONDSPERMINUTE=60;
	int sum = (hours*SECONDSPERHOUR) + (minutes*SECONDSPERMINUTE) + seconds;
	System.out.println("the seconds is" +sum);  
  }
}