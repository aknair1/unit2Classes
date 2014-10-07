import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * This class is a sky that has a draw method to fill itself in
 * 
 * @author aknair 
 * @version 6 October 2014
 */
public class Sky
{
    /**
    *This is the current x position of the sky
    */
    private int x;
    /**
    *This is the current y position of the sky
    */
    private int y;
    /**
    *This is the current width of the sky
    */
    private int width;
    /**
    *This is the current hieght of the the sky
    */
    private int height;
    public Sky(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y; 
        this.width = width;
        this.height = height;
    }

    /**
     * This method draws the sky
     *
     * @pre        It draws based on the x,y,width, and height variables
     * @post       It gaurentees that the sky shape is filled in
     * @param    g2 = The Graphics2D object that the marker is in
     */
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.CYAN);
        Rectangle2D.Double sky = new Rectangle2D.Double(x,y,width,height);
        g2.fill(sky);
    }

}
