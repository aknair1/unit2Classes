import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * This class is supposed to draw a soccer field through the use of many shapes
 * 
 * @author Riley Wiest
 * @version 10/7/14
 */
public class BluePlayer
{
    /** The xLeft instance variable is used to establish the x-coordinate of where the field will begin */
    private int xLeft;
    /** The yTop instance variable is used to establish the y-coordinate of where the field will begin */
    private int yTop;

    /**
     * There is the xLeft and yTop variable set for the object in the constructor
     */
    public BluePlayer(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
    }

    /**
     * This draw method is used to draw the blue player through the use of shapes
     *
     * @param   g2: graphics object that is used to draw different shapes for the instance
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Ellipse2D.Double body = new Ellipse2D.Double(xLeft, yTop,10,10);
        g2.setColor(Color.blue);
        g2.fill(body);
        Ellipse2D.Double head = new Ellipse2D.Double(xLeft + 2, yTop + 2,5,5);
        g2.setColor(new Color(255,178,102));
        g2.fill(head);
        g2.draw(body);
        g2.draw(head);
    }
}
