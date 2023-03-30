package GUIs.chapter5;

import javax.swing.JPanel;
import java.awt.Graphics;

public class DesafioCirc extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
		int height = getHeight();

        for(int i = 1; i<=12; i++) {
            g.drawOval((width/2)-10*i, (height/2)-10*i, 10*2*i, 10*2*i);
        }
    }
}