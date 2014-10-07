import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * This class is a building that has a draw method to fill itself in as well as a sidewalk and a door
 * 
 * @author aknair 
 * @version 6 October 2014
 */
public class Building
{
   /**
    *This is the current x position of the building
    */
    private int x;
    /**
    *This is the current y position of the building
    */
    private int y;    
    /**
    *This is the current width of the the building
    */
    private int width;
    /**
    *This is the current hieght of the the building
    */
    private int height;
    /**
    *This is the current x position of the door and the sidewalk
    */
    private int otherx;
    /**
    *This is the current hieght of the the sidewalk
    */
    private int sidewalkh;
    /**
    *This is the current hieght of the the door
    */
    private int doorh;
    /**
    *This is the current y position of the door
    */
    private int doory;
    /**
    *This is the current y position of the sidewalk
    */
    private int sidewalky;    
    /**
    *This is the current width of the the sidewalk and the building
    */
    private int otherw;
    /**
     * Default constructor for objects of class Building that initializes the position and size of the door, sidewalk, and building
     */
    public  Building(int x, int width, int height, int otherw, int doorh)
    {
        this.x = x;
        this.y = 400 - height;
        this.width = width;        
        this.height = height;
        this.doory = 400-doorh;
        otherx = x + ((width/2)-(otherw / 2));
        this.doorh = doorh;
        sidewalkh = 50;
        this.otherw = otherw;
        sidewalky = 400;
    }

    /**
     * This method draws the building, sidewalk, and door
     *
     * @pre        It draws based on the x,y,width,height, doory,sidewalky, otherx, doorh, sidewalkh, and otherw
     * variables
     * @post       It gaurentees that the building, sidewalk and door shapes are filled in
     * @param    g2 = The Graphics2D object that the marker is in
     */
    public void draw(Graphics2D g2)
    {
        
        Sidewalk sidewalk = new Sidewalk(otherx,sidewalky,otherw,sidewalkh);
        sidewalk.draw(g2);
        Door door = new Door(otherx,doory,otherw,doorh);       
        g2.setColor(Color.GRAY);
        Rectangle2D.Double building = new Rectangle2D.Double(x,y,width,height);
        g2.fill(building);
        door.draw(g2);
    }

}
