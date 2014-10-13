import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Creates a road (rectangle).
 * 
 * 
 * @author @Njrafacz 
 * @version 7 October 2014
 */
public class Road
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xPos;
    private int yPos;
    private int width;
    private int height;

    /**
     * Default constructor for objects of class Road
     * @param xPos starting position of the road
     * @param yPos starting elevation of the road
     * @param width width of the road
     * @param height height of the road
     */
    public Road(int xPos, int yPos, int width, int height)
    {
        // initialise instance variables
        this.xPos = xPos;
        this.yPos= yPos;
        this.width = width;
        this.height = height;
        
    }

  /**
   * @param g2 object of class Graphics2D
   * Draws the road into the cityscape
   */
   
        public void draw(Graphics2D g2)
         {

        Rectangle2D.Double road = new Rectangle2D.Double(this.xPos, this.yPos, this.width, this.height);
        g2.setColor(Color.BLACK);
        g2.draw(road);
        g2.fill(road);
        Rectangle2D.Double roadMarks1 = new Rectangle2D.Double(this.xPos+25, this.yPos+29, this.width-955, this.height-60);
        Rectangle2D.Double roadMarks2 = new Rectangle2D.Double(this.xPos+110, this.yPos+29, this.width-955, this.height-60);
        Rectangle2D.Double roadMarks3 = new Rectangle2D.Double(this.xPos+195, this.yPos+29, this.width-955, this.height-60);
        Rectangle2D.Double roadMarks4 = new Rectangle2D.Double(this.xPos+280, this.yPos+29, this.width-955, this.height-60);
        Rectangle2D.Double roadMarks5 = new Rectangle2D.Double(this.xPos+365, this.yPos+29, this.width-955, this.height-60);
        Rectangle2D.Double roadMarks6 = new Rectangle2D.Double(this.xPos+450, this.yPos+29, this.width-955, this.height-60);
        Rectangle2D.Double roadMarks7 = new Rectangle2D.Double(this.xPos+535, this.yPos+29, this.width-955, this.height-60);
        Rectangle2D.Double roadMarks8 = new Rectangle2D.Double(this.xPos+620, this.yPos+29, this.width-955, this.height-60);
        Rectangle2D.Double roadMarks9 = new Rectangle2D.Double(this.xPos+705, this.yPos+29, this.width-955, this.height-60);
        Rectangle2D.Double roadMarks10 = new Rectangle2D.Double(this.xPos+790, this.yPos+29, this.width-955, this.height-60);
        g2.setColor(Color.YELLOW);
        g2.draw(roadMarks1);
        g2.fill(roadMarks1);
        g2.draw(roadMarks2);
        g2.fill(roadMarks2);
        g2.draw(roadMarks3);
        g2.fill(roadMarks3);
        g2.draw(roadMarks4);
        g2.fill(roadMarks4);
        g2.draw(roadMarks5);
        g2.fill(roadMarks5);
        g2.draw(roadMarks6);
        g2.fill(roadMarks6);
        g2.draw(roadMarks7);
        g2.fill(roadMarks7);
        g2.draw(roadMarks8);
        g2.fill(roadMarks8);
        g2.draw(roadMarks9);
        g2.fill(roadMarks9);
        g2.draw(roadMarks10);
        g2.fill(roadMarks10);
}
}

    
