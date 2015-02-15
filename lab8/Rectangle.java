//************************************************
//Andreas Landgrebeb cs111 fall semester 2012
//
//lab 8 problem 3
//
//creates the class for the rectangle
//************************************************

import java.awt.*;

public class Rectangle
{
    private int width,length,x,y;
    private Color color;

    public Rectangle (int w, int l, Color shade, int upperX, int upperY)
    {
	width = w;
	length = l;
	color = shade;	
	x = upperX;
	y = upperY;
    }
    
    public void draw (Graphics page)
    {
	page.setColor (color);
	page.fillRect (x, y, width,length);
    }
    
    public void setLength (int l)
    {
	length = l;
    }
    
    public void setWidth(int w)
    {
	width = w;
    }

    public void setColor (Color shade)
    {
	color = shade;
    }
    
    public void setX (int upperX)
    {
	x = upperX;
    }
    
    public void setY (int upperY)
    {
	y = upperY;
    }
    
    public int getLength()
    {
	return length;
    }
    
    public int getWidth()
    {
	return width;
    }
    
    public Color getColor ()
    {
	return color;
    }
    
    public int getX ()
    {
	return x;
    }
    
    public int getY ()
    {
	return y;
    }
}
	    
