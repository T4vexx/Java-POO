import java.awt.Graphics;
import javax.swing.JPanel;

public class Test3 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
		int height = getHeight();
        int countX = 1;
        int countY = 1;
        int bordaX = width/15;
        int bordaY = height/15;
        int count = 1;

        while(count < 15) {

            //dois inferiores
            g.drawLine(0,bordaY*countY,bordaX*countX,height); 
            g.drawLine(width,bordaY*countY,width-bordaX*countX,height);

            //dois superiores
            g.drawLine(0,height-bordaY*countY,bordaX*countX,0);
            g.drawLine(width-bordaX*countX,0,width,height-bordaY*countY);
            countX++;
            countY++;
            count++;
        }
        
    }
    
}
