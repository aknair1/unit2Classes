import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    
    {
        Graphics2D g2 = (Graphics2D) g;
        Target target = new Target(100,100,300);
        Target target2 = new Target(456,665,150);
        target.draw(g2);
        target2.draw(g2);

  
}
}
