import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Riley Wiest
 * @version 10/7/2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * This method creates instances of each class and draws them on to the frame
     *
     * @param   g: graphics object that is used to draw the instances
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // create instances of classes and invoke the draw method on each
        // ...
        Field soccerField = new Field(30,50);
        Goals goals1 = new Goals(15,180); 
        Goals goals2 = new Goals(530,180);
        SoccerBall soccerBall = new SoccerBall(237,180);
        SoccerBall soccerBall2 = new SoccerBall(360,294);
        
        RedPlayer redPlayer1 = new RedPlayer(95,100);
        RedPlayer redPlayer2 = new RedPlayer(95,150);
        RedPlayer redPlayer3 = new RedPlayer(95,200);
        RedPlayer redPlayer4 = new RedPlayer(95,250);
        RedPlayer redPlayer5 = new RedPlayer(150,95);
        RedPlayer redPlayer6 = new RedPlayer(150,190);
        RedPlayer redPlayer7 = new RedPlayer(150,285);
        RedPlayer redPlayer8 = new RedPlayer(190,250);
        RedPlayer redPlayer9 = new RedPlayer(240,190);
        RedPlayer redPlayer10 = new RedPlayer(190,130);
        RedPlayer redPlayer11 = new RedPlayer(25,190);
        
        BluePlayer bluePlayer1 = new BluePlayer(445,100);
        BluePlayer bluePlayer2 = new BluePlayer(445,150);
        BluePlayer bluePlayer3 = new BluePlayer(445,240);
        BluePlayer bluePlayer4 = new BluePlayer(445,290);
        BluePlayer bluePlayer5 = new BluePlayer(390,95);
        BluePlayer bluePlayer6 = new BluePlayer(390,190);
        BluePlayer bluePlayer7 = new BluePlayer(390,285);
        BluePlayer bluePlayer8 = new BluePlayer(350,250);
        BluePlayer bluePlayer9 = new BluePlayer(300,190);
        BluePlayer bluePlayer10 = new BluePlayer(350,130);
        BluePlayer bluePlayer11 = new BluePlayer(515,190);
        
        soccerField.draw(g2);
        goals1.draw(g2);
        goals2.draw(g2);
        soccerBall.draw(g2);
        soccerBall2.draw(g2);
        redPlayer1.draw(g2);
        redPlayer2.draw(g2);
        redPlayer3.draw(g2);
        redPlayer4.draw(g2);
        redPlayer5.draw(g2);
        redPlayer6.draw(g2);
        redPlayer7.draw(g2);
        redPlayer8.draw(g2);
        redPlayer9.draw(g2);
        redPlayer10.draw(g2);
        redPlayer11.draw(g2);
        bluePlayer1.draw(g2);
        bluePlayer2.draw(g2);
        bluePlayer3.draw(g2);
        bluePlayer4.draw(g2);
        bluePlayer5.draw(g2);
        bluePlayer6.draw(g2);
        bluePlayer7.draw(g2);
        bluePlayer8.draw(g2);
        bluePlayer9.draw(g2);
        bluePlayer10.draw(g2);
        bluePlayer11.draw(g2);
    }
}
