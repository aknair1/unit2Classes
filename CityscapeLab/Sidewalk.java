import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * This class is a sidewalk that has a draw method to fill itself in
 * 
 * @author aknair 
 * @version 6 October 2014
 */
public class Sidewalk
{
    /**
    *This is the current x position of the sidewalk
    */
    private int x;
    /**
    *This is the current y position of the sidewalk
    */
    private int y;
    /**
    *This is the current width of the the sidewalk
    */
    private int width;
    /**
    *This is the current height of the the sidewalk
    */
    private int height;
    public  Sidewalk(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;        
        this.height = height;
    }

     /**
     * This method draws the sidewalk
     *
     * @pre        It draws based on the x,y,width, and height variables
     * @post       It gaurentees that the sidewalk shape is filled in
     * @param    g2 = The Graphics2D object that the marker is in
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.WHITE);
        Rectangle2D.Double sidewalk = new Rectangle2D.Double(x,y,width,height);
        g2.fill(sidewalk);
    }

}
