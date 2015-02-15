//************************************************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//Lab 12 Problem 3
//
//this is the content panel that displays doors and listens for and handles mouse events 
//************************************************************************************************

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoorPanel extends JPanel
{
    Door x[] = new Door[3];
    Point[] pointList; 
    int count;
    //-----------------------------------------------------------------
    //  Sets up this panel to listen for mouse events.
    //-----------------------------------------------------------------
    public DoorPanel()
    {
	pointList = new Point[3];
	count = 0;
	x[0] = new Door(80,1);
	x[1] = new Door(160,1);
	x[2] = new Door(240,1);
	addMouseListener (new MyListener());
	addMouseMotionListener (new MyListener());
	setBackground (Color.black);
	setPreferredSize (new Dimension(300, 300));
	
    }
    
    //-----------------------------------------------------------------
    //  Draws all of the dots stored in the list.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
	super.paintComponent(page);
	
	page.setColor (Color.green);
	for (int i = 0; i < x.length; i++)
	    x[i].draw(page);
    }

    //*****************************************************************
    //  Represents the listener for mouse events.
    //*****************************************************************
    private class MyListener implements MouseListener, MouseMotionListener
    {
	//--------------------------------------------------------------
	//  Adds the current point to the list of points and redraws
	//  whenever the mouse button is pressed.
	//--------------------------------------------------------------
	public void mouseExited (MouseEvent event)
	{
	    for (int i = 0; i < x.length; i++)
		x[i].setVisible(false);
	    repaint();
	}
	public void mouseMoved (MouseEvent event)
	{
	    for (int i = 0; i < x.length; i++)
		if (x[i].contains (event.getPoint()))
		    {
			x[i].setVisible(true);
			repaint();
		    }
	}
	    public void mousePressed (MouseEvent event)
	    {
		for (int i = 0 ; i < x.length; i++)
		    if (x[i].contains (event.getPoint()))
			{
			    x[i].open();
			    repaint();
			}
	    }
		public void mouseReleased (MouseEvent event)
		{
		    for (int i = 0; i < x.length; i++)
			    {
				x[i].close();
				repaint();
			    }
		}

	//---------------------------------------------------------------
	//  Provide empty definitions for unused event methods.
	//---------------------------------------------------------------
	public void mouseClicked (MouseEvent event) {}
	public void mouseEntered (MouseEvent event) {}
	public void mouseDragged (MouseEvent event) {}
    }
}
