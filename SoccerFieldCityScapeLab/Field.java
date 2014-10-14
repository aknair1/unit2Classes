import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * This Class will create a soccer field within the frame by drawing a variety of shapes.
 * 
 * @Riley Wiest
 * @ 10/7/14
 */
public class Field
{
    /** The xLeft instance variable is used to establish the x-coordinate of where the field will begin */
    private int xLeft;
    /** The yTop instance variable is used to establish the y-coordinate of where the field will begin */
    private int yTop;
    /** The touchline variable defines the width of the field*/
    private int touchline;
    /** The endline variable defines the length of the field*/
    private int endline;
    

    /**
     * There is the xLeft and yTop variable set for the object in the constructor
     */
    public Field(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
        touchline = 500;
        endline = 300;
    }

    /**
     * This draw method is used to draw the field through the use of points, lines, and rectangles
     *
     * @param   g2: graphics object that is used to draw different shapes for the instance
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle screen = new Rectangle(0,0,800,600);
        g2.setColor(Color.black);
        g2.fill(screen);
        Rectangle sidelines = new Rectangle(xLeft,yTop,touchline,endline);
        g2.setColor(new Color(0, 150, 0));
        g2.fill(sidelines);
        g2.setColor(Color.white);
        Rectangle firstBox = new Rectangle(xLeft, yTop + 40, 90 , 220);
        Rectangle secondBox = new Rectangle(xLeft, yTop+ 100, 30 , 100);
        
        
        Rectangle firstBox2 = new Rectangle(xLeft + 410, yTop + 40, 90 , 220);
        Rectangle secondBox2 = new Rectangle(xLeft + 470, yTop+ 100, 30 , 100);
        
        Point2D.Double h1 = new Point2D.Double(xLeft +250, yTop);
        Point2D.Double h2 = new Point2D.Double(xLeft +250, yTop + 300);
        
        Line2D.Double halfField = new Line2D.Double(h1,h2);
        
        Ellipse2D.Double halfFieldCircle = new Ellipse2D.Double(xLeft + 200, yTop + 100,100,100);
        
        Ellipse2D.Double centerSpot = new Ellipse2D.Double(278, 200,4,4);
        
        Ellipse2D.Double pKSpot = new Ellipse2D.Double(xLeft + 60, yTop + 150,2,2);
        Ellipse2D.Double pKSpot2 = new Ellipse2D.Double(xLeft + 440, yTop + 150,2,2);
        
        g2.fill(pKSpot);
        g2.fill(pKSpot2);
        g2.fill(centerSpot);
        
        g2.draw(centerSpot);
        g2.draw(pKSpot);
        g2.draw(pKSpot2);
        g2.draw(sidelines);
        g2.draw(firstBox);
        g2.draw(secondBox);
        g2.draw(firstBox2);
        g2.draw(secondBox2);
        g2.draw(halfField);
        g2.draw(halfFieldCircle);
    }

}
