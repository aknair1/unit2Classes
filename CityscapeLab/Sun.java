import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * This class is a sun that has a draw method to fill itself in
 * 
 * @author aknair 
 * @version 6 October 2014
 */
public class Sun
{
    /**
    *This is the current x position of the sun
    */
    private int x;
    /**
    *This is the current y position of the sun
    */
    private int y;
    /**
    *This is the current radius of the sun
    */
    private int radius;

    /**
     * Default constructor for objects of class Sun that initializes the position and radius
     */
    public Sun(int x, int y, int radius)
    {
        this.x= x;
        this.y = y;
        this.radius = radius;
        
    }

    /**
     * This method draws the sun
     *
     * @pre        It draws based on the x,y,and radius variables
     * @post       It gaurentees that the sun shape is filled in
     * @param    g2 = The Graphics2D object that the marker is in
     */
    public void draw(Graphics2D g2)
    {
       Ellipse2D.Double sun = new Ellipse2D.Double(x,y,radius,radius);
       g2.setColor(Color.YELLOW);
       g2.fill(sun);
    }

}
