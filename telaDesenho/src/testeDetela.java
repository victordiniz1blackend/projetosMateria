import javax.swing.JFrame;
public class testeDetela {
    public static void main(String[] args) {

        NewDesenho pain = new NewDesenho();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(pain);
        application.setSize(250,250);
        application.setVisible(true);


    }
}
