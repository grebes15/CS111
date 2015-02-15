//**************************************************************************************************************************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 7 Problem 2
//
//implement a class that is composed of two die objects to include methods to set and get the individual die values, a method to roll the dice, and a method that returns the current sum of the two die values
//***************************************************************************************************************************************************************************************************************

public class PairOfDice
{
    private final int Max = 6;
    private faceValue1;
    private faceValue2;
    private int sum;
    
    private Die die1 = new Die();
    private Die die2 = new Die();
    
    public PairOfDice (Die d1, Die d2);
    {
	die1 = new Die();
	die2 = new Die();
	die1 = d1;
	die2 = d2;
    }
    public String roll()
    {
	setfaceValue1(die1.roll());
	setfaceValue2(die2.roll());
	
	return "Die 1 rolled" + getfaceValue1() "\n" "Die 2 rolled";
	
	public void setfaceValue (int value)
	{
	    if (value < 1 || value > 6)
		System.out.println ("Error: Value entered is incorrect");
	    else
		faceValue = value;
	}
	public int getFaceValue()
	{
	    return faceValue;
	}
	
	public String toString()
	{
	    return faceValue1 + "" + faceValue2;