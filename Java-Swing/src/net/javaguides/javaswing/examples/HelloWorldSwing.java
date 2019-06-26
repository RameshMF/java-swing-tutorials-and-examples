package net.javaguides.javaswing.examples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;        

/**
 * 
 * This class demonstrates the simple hello world swing program.
 *
 */
public class HelloWorldSwing {

	private static void createAndShowGUI() {
		JFrame f = new JFrame("Hello World Swing Example");
	    f.setLayout(new FlowLayout());
	    f.setSize(500, 360);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    
	    JLabel label= new JLabel("Hello World Swing");
	    Border border = BorderFactory.createLineBorder(Color.BLACK);
	    label.setBorder(border);
	    label.setPreferredSize(new Dimension(150, 100));
	    
	    label.setText("Hello World Swing");
	    label.setHorizontalAlignment(JLabel.CENTER);
	    label.setVerticalAlignment(JLabel.CENTER);

	    f.add(label);
	    f.setVisible(true);
    }
 
    public static void main(String[] args) {
    	createAndShowGUI();
    }
}
