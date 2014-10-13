import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
* Class that creates instances of the classes that comprise the cityscape and delegates drawing the
* cityscape to these object.
* 
* @author @NRafacz
* @version 3 October 2014
*/
public class CityscapeComponent extends JComponent
{
    /**
    * An example of a method - replace this comment with your own
    * that describes the operation of the method
    *
    * @pre preconditions for the method
    * (what the method assumes about the method's parameters and class's state)
    * @post postconditions for the method
    * (what the method guarantees upon completion)
    * @param y description of parameter y
    * @return description of the return value
    */
   public void paintComponent(Graphics g)
   {
        Graphics2D g2 = (Graphics2D) g;
        // create instances of classes and invoke the draw method on each
        // ...
        Sky sky = new Sky(0,0,15000,15000);
        sky.draw(g2);
        Ground ground = new Ground(0,375,1500,1500);
        ground.draw(g2);
        Moon moon = new Moon(675,25,100,100);
        moon.draw(g2);
        Building build1 = new Building(75,190,90,300);
        build1.draw(g2);
        Building build2 = new Building(175,190,90,300);
        build2.draw(g2);
        Building build3 = new Building(275,190,90,300);
        build3.draw(g2);
        Building build4 = new Building(375,190,90,300);
        build4.draw(g2);
        Building build5 = new Building(475,190,90,300);
        build5.draw(g2);
        Building build6 = new Building(575,190,90,300);
        build6.draw(g2);
        Road road = new Road(0,490,1000,75);
        road.draw(g2);
        }

}


