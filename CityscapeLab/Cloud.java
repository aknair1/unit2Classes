import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.*;
import java.awt.Color;

/**
 * This class is a two ellipse cloud that has a draw method to fill itself in
 * 
 * @author aknair 
 * @version 6 October 2014
 */
public class Cloud 
{
    /**
    *This is the current x position of the first cloud ellipse
    */
    private int x1;
    /**
    *This is the current y position of the first cloud ellipse
    */
    private int y1;
    /**
    *This is the current x position of the second cloud ellipse
    */
    private int x2;
    /**
    *This is the current y position of the second cloud ellipse
    */
    private int y2;
    /**
    *This is the current width of the the first cloud ellipse
    */
    private int w1;
    /**
    *This is the current height of the the first cloud ellipse
    */
    private int h1;
    /**
    *This is the current width of the the second cloud ellipse
    */
    private int w2;
    /**
    *This is the current height of the the second cloud ellipse
    */
    private int h2;
    /**
    *This is the ratio of the second cloud ellipse's dimensions to the first cloud ellipse's dimensions
    */
    private double ratio;
    /**
    *This is the difference in the x coordinates of the first cloud ellipse and the second cloud ellipse
    */
    private int difference;  
    /**
     * Constructor for objects of class Cloud
     */
    public Cloud(int x, int y, int w, int h,  double ratio, int difference)
    {
        x1 = x;
        y1 = y;
        w1 = w;
        h1 = h;
        this.ratio = ratio;
        this.difference = difference;
        w2 = (int)(w * ratio);
        h2 = (int)(h * ratio);
        x2 = x1+ difference;
        y2 = y + (h-h2);
    }

    /**
     * This method draws the marker
     *
     * @pre        It draws based on the x1,y1,w1,h1,x2,y2,w2, and h2
     * @post       It gaurentees that the cloud shape is filled in
     * @param    g2 = The Graphics2D object that the marker is in
     */
    public void draw(Graphics2D g2) 
    {
        g2.setColor(Color.CYAN);
        Rectangle2D.Double uppersky = new Rectangle2D.Double(0,0,800,200);
        g2.fill(uppersky);
        Ellipse2D.Double cloud1 = new Ellipse2D.Double(x1,y1,w1,h1);
        Ellipse2D.Double cloud2 = new Ellipse2D.Double(x2,y2,w2,h2);
        Sun sun = new Sun(725,-75,150);
        sun.draw(g2);
        g2.setColor(Color.WHITE);
        g2.fill(cloud1);
        g2.fill(cloud2);
    }
}

