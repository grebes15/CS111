//************************************************************
//Andreas Landgrebe cs111 fall semester 2012
//
//lab 8 problem 4
//
//creating the color and shape or the circles and rectangles
//************************************************************

import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class SplatPanel extends JPanel
{
    private Circle circle1, circle2, circle3, circle4, circle5, circle6;
    private Rectangle rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6;
    
    public SplatPanel()
    {
	Random rg = new Random();
	int randomSize = rg.nextInt(198)+1;
       
	int x = rg.nextInt(390)+1;
	int y = rg.nextInt(390)+1;
	
	rectangle1 = new Rectangle (randomSize, randomSize*2, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);
	circle1 = new Circle (randomSize, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);
	randomSize = rg.nextInt(198)+1;
	x = rg.nextInt(390)+1;
	y = rg.nextInt(390)+1;
       	rectangle2 = new Rectangle (randomSize, randomSize*2, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);
	circle2 = new Circle (randomSize, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);	
	randomSize = rg.nextInt(198)+1;
	x = rg.nextInt(390)+1;
	y = rg.nextInt(390)+1;
	rectangle3 = new Rectangle (randomSize, randomSize*2, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);
	circle3 = new Circle (randomSize, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x, y+randomSize);
	randomSize = rg.nextInt(198)+1;
	x = rg.nextInt(390)+1;
	y = rg.nextInt(390)+1;
	rectangle4 = new Rectangle (randomSize*2, randomSize, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);
	circle4 = new Circle (randomSize, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x+randomSize,y);	
	randomSize = rg.nextInt(198)+1;
	 x = rg.nextInt(390)+1;
	 y = rg.nextInt(390)+1;
	 rectangle5 = new Rectangle (randomSize*2, randomSize, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);
	circle5 = new Circle (randomSize, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);	
	randomSize = rg.nextInt(198)+1;
	x = rg.nextInt(390)+1;
	y = rg.nextInt(390)+1;
	rectangle6 = new Rectangle (randomSize*2, randomSize, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);
	circle6 = new Circle (randomSize, new Color(rg.nextInt(255), rg.nextInt(255), rg.nextInt(255)), x,y);	
	randomSize = rg.nextInt(198)+1;
	x = rg.nextInt(390)+1;
	y = rg.nextInt(390)+1;

	setPreferredSize (new Dimension(800, 800));
	setBackground (Color.black);
    }

    public void paintComponent (Graphics page)
    {
	super.paintComponent(page);
	
	rectangle1.draw(page);
	circle1.draw(page);
	rectangle2.draw(page);
	circle2.draw(page);
	rectangle3.draw(page);
	circle3.draw(page);
	rectangle4.draw(page);
	circle4.draw(page);
	rectangle5.draw(page);
	circle5.draw(page);
	rectangle6.draw(page);
	circle6.draw(page);
    }
}