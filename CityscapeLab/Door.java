import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * This class is a door that has a draw method to fill itself in
 * 
 * @author aknair 
 * @version 6 October 2014
 */
public class Door
{
   /**
    *This is the current x position of the door
    */
    private int x;
    /**
    *This is the current y position of the door
    */
    private int y;
    
    /**
    *This is the current width of the the door
    */
    private int width;
    /**
    *This is the current hieght of the the door
    */
    private int height;
    /**
     * Default constructor for objects of class Door that initializes the position and size
     */
    public Door(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;        
        this.height = height;
    }

    /**
     * This method draws the door
     *
     * @pre        It draws based on the x,y,width, and height variables
     * @post       It gaurentees that the door shape is filled in
     * @param    g2 = The Graphics2D object that the marker is in
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.RED);
        Rectangle2D.Double door = new Rectangle2D.Double(x,y,width,height);
        g2.fill(door);
    }

}
