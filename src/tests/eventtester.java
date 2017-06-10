package tests;

import javax.swing.JFrame;

public class eventtester {

	public static void main(String[] args) {
		
		event oliver = new event();
		//so x button to exit works
		oliver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oliver.setSize(350, 100);
		oliver.setVisible(true);

	}

}
