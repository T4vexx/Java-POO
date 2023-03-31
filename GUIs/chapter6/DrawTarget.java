package GUIs.chapter6;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class DrawTarget extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
		int height = getHeight();

        for(int i=5; i>=1; i--) {
            if(i%2==0) {
                g.setColor(Color.YELLOW);
            } else {
                g.setColor(Color.BLACK);
            }
            
            g.fillOval((width/2)-25*i, (height/2)-25*i, 250 - (50*(5-i)), 250-(50*(5-i)));
        }

    }
}