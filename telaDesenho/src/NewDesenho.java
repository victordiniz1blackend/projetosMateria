import java.awt.Graphics;
import javax.swing.JPanel;

public class NewDesenho extends JPanel {
    public void grandeDesenho(Graphics g){

        super.paintComponent(g);
        int altura = getWidth();
        int largura = getHeight();

        g.drawLine(0,0, altura,largura);
        g.drawLine(0,largura,altura,0);



    }

}
