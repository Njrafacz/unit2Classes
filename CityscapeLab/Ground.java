import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;


/**
* Creates a large green rectangle which serves as the ground inside of the cityscape.
* 
* @author @Njrafacz 
* @version 12 October 2014
*/
public class Ground
{
private int xPos;
private int yPos;
private int width;
private int height;

/**
* Default constructor for objects of class Ground
* @param xPos starting position of the ground inside of the cityscape.
* @param yPos starting elevation of the ground inside of the cityscape.
* @param width width of the ground inside of the cityscape.
* @param height height of the ground inside of the cityscape.
*/
    public Ground(int xPos, int yPos, int width, int height)
    {
    // initialise instance variables
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
}

/**
* Draws the ground into the cityscape. Example: g2.draw(ground)
*
* @pre xPos cannot be less than 0. yPos cannot be more than 600.
* @param g2 object of class Graphics2D
*/
    public void draw(Graphics2D g2)
    {
    // put your code here
        Rectangle2D.Double ground = new Rectangle2D.Double(this.xPos, this.yPos, this.width, this.height);
        Color groundColor = new Color(62,196,62);
        g2.draw(ground);
        g2.setColor(groundColor);
        g2.fill(ground);
}

}
