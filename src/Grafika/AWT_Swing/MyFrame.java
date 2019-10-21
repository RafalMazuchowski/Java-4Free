package Grafika.AWT_Swing;
//Pierwszy program okienkowy 4.1.0_0

import javax.swing.JFrame;

public class MyFrame extends JFrame{
    
    public MyFrame(){
        super("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400, 400);
        setSize(300, 300);
        //setBounds(400, 400, 300, 300);
        setVisible(true);
    }
}