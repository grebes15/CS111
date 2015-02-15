//*******************************************************************************************************************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//lab 8 problem 1
//
//Design a program that will instantiate a frame and create a panel containing a work of art made up of six colored geometric shapes of random sixes places randomly within the panel inside the frame.
//********************************************************************************************************************************************************************************************************

import java.awt.*;
import javax.swing.*;

public class lab8
{
    public static void main (String[] args)
    {
	JFrame frame = new JFrame ("Splat");
	frame.setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE);
	
	frame.getContentPane().add(new SplatPanel());
	
	frame.pack();
	frame.setVisible(true);
    }
}

    