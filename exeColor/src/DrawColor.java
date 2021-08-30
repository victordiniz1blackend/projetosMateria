import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DrawColor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponents(g);

        g.setColor(Color.BLUE);
        g.fillOval(100,100,100,100);
        g.setColor(Color.BLACK);
        g.fillOval(90,90,90,90);
        g.setColor(Color.BLUE);
        g.fillOval(80,80,80,80);
        g.setColor(Color.BLACK);
        g.fillOval(70,70,70,70);

    }
}
