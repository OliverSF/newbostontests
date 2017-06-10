package tests;

import java.awt.FlowLayout;
//gives default layout

import javax.swing.JFrame;
//gives basic window ie title, scroll etc

import javax.swing.JLabel;
//allows you to output text and labels on the screen

//need GUIcomplex class to inherit everthing in the built in class JFrame
public class GUIcomplex extends JFrame {
	
	private JLabel item1;
	
	//building constructor
	public GUIcomplex() {
		
		//to add the title of the window
		super("The title bar");
		
		//setting the default layout
		setLayout(new FlowLayout());
		
		//building the item
		//JLabel is just text (how we put text on the screen)
		item1 = new JLabel("this is a sentence");
		
		//adding functionality
		
		//scroll box
		item1.setToolTipText("This is gonna show up on hover");
		
		//need to add item to window we created 
		add(item1);
	}

}
