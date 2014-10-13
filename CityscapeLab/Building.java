import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
/**
* Creates a building(rectangle). Every building has 10 windows and are the same color.
* 
* @author NRafacz 
* @version 12 October 2014
*/
public class Building
{

    private int width;
    private int floors;
    private int x;
    private int y;

/**
* Default constructor for objects of class Building
* @param x the x position inside of the cityscape.
* @param y the y position inside of the cityscape.
* @param width the width of the building.
* @param floors the amount of floors which is equivalent to the height of the building.
*/
    public Building(int x, int y, int width, int floors ) 
    {
    // initialise instance variables
        this.width = width;
        this.floors = floors;
        this.x = x;
        this.y = y;
}

/**
* Draws the building using g2. Example: g2.draw(building)
*
* @pre x cannot be greater than 800, y cannot be greater than 600, width cannot be greater than 800, floors cannot be greater than 600
* This method assumes a value for x, y, width, and floors.
* @param g2 object of class Graphics2D
*/
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double outline = new Rectangle2D.Double(this.x,this.y, this.width, this.floors);
        g2.setColor(Color.GRAY);
        g2.draw(outline);
        g2.fill(outline);
        Rectangle2D.Double building = new Rectangle2D.Double(this.x+5, this.y+10, this.width-10, this.floors-10);
        g2.setColor(Color.LIGHT_GRAY);
        g2.draw(building);
        g2.fill(building);
        Rectangle2D.Double door = new Rectangle2D.Double(this.x+18, this. y+240, this.width -40, this.floors - 240);
        
        
        Rectangle2D.Double window1 = new Rectangle2D.Double(this.x+8, this.y+12, this.width-60, this.floors-270);
        Rectangle2D.Double window2 = new Rectangle2D.Double(this.x+47
        , this.y+12, this.width-60, this.floors-270);
        Rectangle2D.Double window3 = new Rectangle2D.Double(this.x+8, this.y+50, this.width-60, this.floors-270);
        Rectangle2D.Double window4 = new Rectangle2D.Double(this.x+47 , this.y+50, this.width-60, this.floors-270);
        Rectangle2D.Double window5 = new Rectangle2D.Double(this.x+8 , this.y+88, this.width-60, this.floors-270);
        Rectangle2D.Double window6 = new Rectangle2D.Double(this.x+47, this.y+88, this.width-60, this.floors-270);
        Rectangle2D.Double window7 = new Rectangle2D.Double(this.x+8 , this.y+126, this.width-60, this.floors-270);
        Rectangle2D.Double window8 = new Rectangle2D.Double(this.x+47, this.y+126, this.width-60, this.floors-270);
        Rectangle2D.Double window9 = new Rectangle2D.Double(this.x+8 , this.y+164, this.width-60, this.floors-270);
        Rectangle2D.Double window10 = new Rectangle2D.Double(this.x+47, this.y+164, this.width-60, this.floors-270);
        Rectangle2D.Double window11 = new Rectangle2D.Double(this.x+8, this.y+202, this.width-60, this.floors-270);
        Rectangle2D.Double window12 = new Rectangle2D.Double(this.x+47, this.y+202, this.width-60, this.floors-270);
        g2.setColor(Color.CYAN);
        g2.draw(window1);
        g2.fill(window1);
        g2.draw(window2);
        g2.fill(window2);
        g2.draw(window3);
        g2.fill(window3);
        g2.draw(window4);
        g2.fill(window4);
        g2.draw(window5);
        g2.fill(window5);
        g2.draw(window6);
        g2.fill(window6);
        g2.draw(window7);
        g2.fill(window7);
        g2.draw(window8);
        g2.fill(window8);
        g2.draw(window9);
        g2.fill(window9);
        g2.draw(window10);
        g2.fill(window10);
        g2.draw(window11);
        g2.fill(window11);
        g2.draw(window12);
        g2.fill(window12);
        Color doorColor = new Color(160,82,45);
        g2.setColor(doorColor);
        g2.draw(door);
        g2.fill(door);
}
}

