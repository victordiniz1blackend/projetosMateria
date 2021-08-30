import javax.swing.JFrame;
public class DrawImagem {
    public static void main(String[] args) {
        DrawColor painel = new DrawColor();
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(painel);
        app.setSize(255,255);
        app.setVisible(true);

    }
}
