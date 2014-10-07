import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @aknair
 * @version 6 October 2014
 */
public class CityscapeComponent extends JComponent 
{
    /**
    *This is the current x position of the cloud
    */
    private int cloudx;
    /**
     * This method changes the instance variable cloudx
     *
     * @pre        It needs a defined instance variable cloudx
     * @post    It changes the cloudx variable based on the parameters
     * @param    y    description of parameter y
     */
    public void set(int cloudx){
        this.cloudx = cloudx;       
    }
    public void paintComponent(Graphics g) 
    {
        Graphics2D g2 = (Graphics2D) g;
        Grass grass = new Grass(0,400,800,200);
        Sky sky = new Sky(0,0,800,600);
        Building building1 = new Building(100,100,200,20,30);
        Building building2 = new Building(300,74,165,25,26);
        Building building3 = new Building(500,110,234,15,22);
        Road road = new Road(0,450,800,40,10,465,17,10);
        Cloud cloud = new Cloud(cloudx, 60, 123, 76, .7,60);
        sky.draw(g2);        
        grass.draw(g2);                   
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        cloud.draw(g2);
        road.draw(g2);
    }
}
