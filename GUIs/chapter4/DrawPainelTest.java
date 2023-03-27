import javax.swing.JFrame;

public class DrawPainelTest {
    
    public static void main(String[] args) {
        Test2 panel = new Test2();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250,250);
        app.setVisible(true);
    }
}
