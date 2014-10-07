import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * This class is a road that has a draw method to fill itself in as well as a large number of markers
 * 
 * @author aknair 
 * @version 6 October 2014
 */
public class Road
{
   /**
    *This is the current x position of the road
    */
    private int x;
    /**
    *This is the current y position of the road
    */
    private int y;
    /**
    *This is the current width of the the road
    */
    private int width;
    /**
    *This is the current hieght of the the road
    */
    private int height;
    /**
    *This is the current x position of the matker
    */
    private int markerx;
    /**
    *This is the current y position of the marker
    */
    private int markery;
    
    /**
    *This is the current width of the the marker
    */
    private int markerw;
    /**
    *This is the current hieght of the the marker
    */
    private int markerh;

    /**
     * Default constructor for objects of class Road that initializes the position and size for both the marker and the road
     */
    public Road(int x, int y, int width, int height,int markerx, int markery, int markerw, int markerh)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.markerx = markerx;
        this.markery = markery;
        this.markerw = markerw;
        this.markerh = markerh;
        
       
    }

     /**
     * This method draws the road and its large number of markers
     *
     * @pre        It draws based on the x,y,width, height, markerx, markery, markerw, and markerh variables
     * @post       It gaurentees that the road and marker shapes are filled in
     * @param    g2 = The Graphics2D object that the marker is in
     */
    public void draw(Graphics2D g2)
    {
       g2.setColor(Color.BLACK);
       Rectangle2D.Double road = new Rectangle2D.Double(x,y,width,height);
       g2.fill(road);       
       Marker markers = new Marker(markery,markerw,markerh);
       while (markerx < 800){
            markers.draw(g2,markerx);
            markerx = markerx + 33;            
       }        
       
    }

}
