import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
* Creates a giant blue rectangle which serves as the sky in the cityscape.
* 
* @author NRafacz 
* @version 12 October 2014
*/
public class Sky
{ 
    private int width;
    private int height;
    private int xPos;
    private int yPos;
/**
* constructor for objects of class Sky that specifies width, height, xPos, and yPos
* @param xPos the starting position of the sky.
* @param yPos the starting y position of the sky.
* @param width designates the width of the sky.
* @param height designates how tall the sky is.
*/
    public Sky(int xPos, int yPos, int width, int height)
    {
    // initialise instance variables
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
}

/**
* Draws the sky using g2. Example: g2.draw(sky)
* Draws the sky into the cityscape
* @param g2 object of class Graphics2D
*/

    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double sky = new Rectangle2D.Double(this.xPos, this.yPos, this.width, this.height);
        Color skyColor = new Color(25,150,250);
        g2.draw(sky);
        g2.setColor(skyColor);
        g2.fill(sky);
}
}
