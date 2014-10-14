import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * This class creates a soccer ball
 * 
 * @author Riley Wiest 
 * @version 10/7/14
 */
public class SoccerBall
{
    /** The xLeft instance variable is used to establish the x-coordinate of where the field will begin */
    private int xLeft;
     /** The yTop instance variable is used to establish the y-coordinate of where the field will begin */
    private int yTop;

    /**
     * There is the xLeft and yTop variable set for the object in the constructor
     */
    public SoccerBall(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
    }

    /**
     * This draw method is used to draw the soccer ball through the use of shapes
     *
     * @param   g2: graphics object that is used to draw different shapes for the instance
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Ellipse2D.Double soccerBall = new Ellipse2D.Double(xLeft,yTop,6,6);
        g2.setColor(Color.white);
        g2.fill(soccerBall);
        g2.setColor(Color.black);
        g2.draw(soccerBall);
    }
}
