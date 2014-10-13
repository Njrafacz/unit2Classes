import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
* Creates an adjustable white ellipse which serves as the moon inside of the cityscape.
* 
* @author @NRafacz 
* @version 6 October 2014
*/
public class Moon
{

private int xLeft;
private int yTop;
private int width;
private int height;

/**
* Constructor for objects of class Moon
* @param xLeft most left point of the moon object on the x-axis
* @param yTop point which serves as the top of the moon on the y-axis 
* @param width width of the moon
* @param height height of the moon
*/
public Moon(int xLeft, int yTop, int width, int height)
{
// initialise instance variables
    this.xLeft = xLeft;
    this.yTop = yTop;
    this.width = width;
    this.height = height;
}

/**
* Draws the moon using the g2 object.
* Example : g2.draw(moon) 
* @param g2 object of class Graphics2D
*/
    public void draw(Graphics2D g2)
    {
    // put your code here
        Ellipse2D.Double moon = new Ellipse2D.Double(this.xLeft, this.yTop, this.width, this.height);
        g2.setColor(Color.WHITE);
        g2.draw(moon);
        g2.fill(moon);


}
}


    