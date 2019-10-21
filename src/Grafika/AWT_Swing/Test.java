package Grafika.AWT_Swing;
//Pierwszy program okienkowy 4.1.0_1

import java.awt.EventQueue;

public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new MyFrame();
            }
        });
    }

}