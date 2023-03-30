package GUIs.chapter6;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class DrawTarget extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
		int height = getHeight();

        for(int i = 1; i<=5; i++) {
            g.setColor(Color.YELLOW);
            g.fillOval((width/2)+48*i, (height/2)+48*i, 240, 240);
        }
    }
}