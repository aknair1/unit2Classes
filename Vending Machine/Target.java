
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
public class Target
{
    private int x;
    private int y;
    private int size;
    private int diff;
    private int change;
    public Target(int x, int y,int size)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        this.diff = size / 6;
        this.change = diff / 2;
    }
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLACK);
        Ellipse2D.Double outer = new Ellipse2D.Double(this.x,this.y,size,size);
        g2.draw(outer);
        g2.fill(outer);
        x = x + change;
        y = y + change;
        size = size - diff;
        g2.setColor(Color.WHITE);
        Ellipse2D.Double outerw = new Ellipse2D.Double(x,y,size,size);
        g2.draw(outerw);
        g2.fill(outerw);
        x = x + change;
        y = y + change;
        size = size - diff;
        g2.setColor(Color.BLACK);
        Ellipse2D.Double middle = new Ellipse2D.Double(x,y,size,size);
        g2.draw(middle);
        g2.fill(middle);
        x = x + change;
        y = y + change;
        size = size - diff;
        g2.setColor(Color.WHITE);
        Ellipse2D.Double middlew = new Ellipse2D.Double(x,y,size,size);
        g2.draw(middlew);
        g2.fill(middlew);
        x = x + change;
        y = y + change;
        size = size - diff;
        g2.setColor(Color.BLACK);
        Ellipse2D.Double center = new Ellipse2D.Double(x,y,size,size);
        g2.draw(center);
        g2.fill(center);     
        
        
    }
}
