//**************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 7 Problem 1
//
//prints an error if the parameter is outside the valid range of the die face values. 
//**************************************************************************************

public class Die 
{
    private final int Max = 6;

    private int faceValue;

    public Die ()
    {
	faceValue =1;
    }
    
    public int roll()
    {
	faceValue = (int)(Math.random() * Max) + 1;
	return faceValue;
    }
    
    public void setFaceValue (int value)
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
	String result = Integer.toString(faceValue);
	
	return result;
    }
}