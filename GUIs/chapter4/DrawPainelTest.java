import javax.swing.JFrame;

public class DrawPainelTest {
    
    public static void main(String[] args) {
        Test3 panel = new Test3();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250,250);
        app.setVisible(true);
    }
}
