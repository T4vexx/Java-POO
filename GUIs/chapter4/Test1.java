import java.awt.Graphics;
import javax.swing.JPanel;

public class Test1 extends JPanel {

    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
       
        
        int bordaX,bordaY;
        
        bordaX = width/15;
        bordaY = height/15;

        int contX = bordaX;
        int contY = height - (height/15);
        int loop = 1;    
       
        while(loop<15) {
            
            g.drawLine(0,0,contX,contY); 
            
            
            ++loop;
            contX += bordaX;
            contY -= bordaY;
        }  
    }
}