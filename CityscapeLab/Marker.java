import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Color;


/**
 * This class is a marker that has a draw method to fill itself in
 * 
 * @author aknair 
 * @version 6 October 2014
 */
public class Marker
{
    /**
    *This is the current y position of the the marker
    */
    private int y;
    /**
    *This is the current width of the the marker
    */
    private int width;
    /**
    *This is the current height of the the marker
    */
    private int height;

    /**
     * Default constructor for objects of class Marker
     */
    public Marker(int y, int width, int height)
    {
        this.y = y;            
        this.width = width;
        this.height = height;
    }

    /**
     * This method draws the marker
     *
     * @pre        It draws based on the x,y,width, and height variables
     * @post       It gaurentees that the marker shape is filled in
     * @param    g2 = The Graphics2D object that the marker is in
     * @param    x = The x position of the marker
     */
    public void draw(Graphics2D g2, int x)
    {
        g2.setColor(Color.YELLOW);
        Rectangle2D.Double marker = new Rectangle2D.Double(x,y,width,height);
        g2.fill(marker);
    }

}
