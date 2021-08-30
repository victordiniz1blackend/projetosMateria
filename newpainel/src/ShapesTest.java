import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShapesTest {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter1 to "+"enter 2");
        int escolha = Integer.parseInt(input);
        NewPainel panel = new NewPainel(escolha);
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
    }
}
