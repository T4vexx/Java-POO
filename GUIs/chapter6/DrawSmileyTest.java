package GUIs.chapter6;

import javax.swing.JFrame;

public class DrawSmileyTest {

    public static void main(String[] args) {
        DrawTarget panel = new DrawTarget(); 
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250); 
        application.setVisible(true);
    }
}