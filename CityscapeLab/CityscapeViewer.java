import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer 
{
    /**
     * main method for the program which creates and configures the frame for the program. It also updates the position 
     * of the cloud in the component
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CityscapeComponent component = new CityscapeComponent();
        frame.add(component);        
        frame.setVisible(true);
        int cloudx = 0;
        while(true){
        component.set(cloudx%900);
        cloudx += 2;
        Thread.sleep(75);
        frame.repaint();
        }
    }
}