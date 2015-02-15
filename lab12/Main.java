//***********************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 12 Problem 2
//
//this is the main method that creates the JFrame and adds content to it.
//**********************************************************************

import javax.swing.*;

public class Main 
{
	//---------------------------------------------------------
	// Creates and displays the application frame.
	//---------------------------------------------------------
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Main");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new DoorPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
