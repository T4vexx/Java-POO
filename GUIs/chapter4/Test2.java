import java.awt.Graphics;
import javax.swing.JPanel;

public class Test2 extends JPanel {

    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
		int height = getHeight();
		int passos = 0;
		
		
		while( height - passos >= 0){
			
			//canto superior esquerdo
			g.drawLine(0, 0, passos, height - passos);
			
			//canto inferior direito
			g.drawLine(width, height, passos, height - passos);
			
			//canto superior direito
			g.drawLine(width, 0, passos, passos);
			
		    //canto inferior esquerdo
			g.drawLine(0, height, passos, passos);
			
			passos = passos + 15;
						
		}
    }
}