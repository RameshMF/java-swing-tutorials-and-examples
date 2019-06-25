package net.javaguides.javaswing.examples;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Text extends JFrame{
	
	JLabel l1,l2;
	JButton b1;
	JTextArea Area;
	
	void textArea(){

		l1=new JLabel();
		l2=new JLabel();
		
		b1=new JButton("Count Words");
		
		Area=new JTextArea();
		Area.setFont(new Font("Tahoma", Font.PLAIN, 32));
		Area.setRows(4);
		Area.setColumns(4);
		
		
		add(l1);
		add(l2);
		add(b1);
		add(Area);
		
		l1.setBounds(10,25,100,30);
		l2.setBounds(70,25,100,30);
		Area.setBounds(20,75,250,200);
		b1.setBounds(100,300,120,30);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String str=Area.getText();
				String words[]=str.split("\\s+");
				l1.setTitle("Words:- "+words.length);
				l2.setTitle("Character:- "+str.length());
			}
		});
	}
	
}
public class TextArea extends Text {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[])
	{
		
		Text jf=new Text();
		jf.textArea();
		jf.setLayout(null);
		jf.setSize(450, 450);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
