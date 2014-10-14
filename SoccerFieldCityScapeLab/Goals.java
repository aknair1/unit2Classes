import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * This class is supposed to draw a soccer field through the use of many shapes
 * 
 * @author Riley Wiest
 * @version 10/7/14
 */
public class Goals
{
    /** The xLeft instance variable is used to establish the x-coordinate of where the field will begin */
    private int xLeft;
    /** The yTop instance variablbe is used to establish the y-coordinate of where the field will begin */
    private int yTop;
    /**
     * There is the xLeft and yTop variable set for the object in the constructor
     */
    public Goals(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * This draw method is used to draw the goals through the use of points, lines, and rectangles
     *
     * @param   g2: graphics object that is used to draw different shapes for the instance
     */
    public void draw(Graphics2D g2)
    {
        
        Rectangle bottomGoal = new Rectangle(xLeft, yTop, 15 , 40);
        Rectangle topGoal = new Rectangle(xLeft- 5, yTop - 10, 15 , 40);
        
        Point2D.Double topLeft1 = new Point2D.Double(xLeft-5, yTop-10);
        Point2D.Double topLeft2 = new Point2D.Double(xLeft-5, yTop + 30);
        
        Point2D.Double bottomLeft1 = new Point2D.Double(xLeft, yTop);
        Point2D.Double bottomLeft2 = new Point2D.Double(xLeft, yTop+40);
        
        Point2D.Double topRight1 = new Point2D.Double(xLeft + 10, yTop-10);
        Point2D.Double topRight2 = new Point2D.Double(xLeft + 10, yTop + 30);
        
        Point2D.Double bottomRight1 = new Point2D.Double(xLeft+15, yTop);
        Point2D.Double bottomRight2 = new Point2D.Double(xLeft+15, yTop+40);
        
        
        
        
        Line2D.Double topLeftBar = new Line2D.Double(topLeft1,bottomLeft1);
        Line2D.Double bottomRightBar = new Line2D.Double(topRight2,bottomRight2);
        Line2D.Double bottomLeftBar = new Line2D.Double(topLeft2,bottomLeft2);
        Line2D.Double topRightBar = new Line2D.Double(topRight1,bottomRight1);
        
        g2.setColor(Color.gray);
        g2.draw(bottomGoal);
        g2.setColor(Color.white);
        g2.draw(topGoal);
        g2.draw(topRightBar);
        g2.draw(topLeftBar);
        g2.draw(bottomRightBar);
        g2.draw(bottomLeftBar);
        
    }

}
