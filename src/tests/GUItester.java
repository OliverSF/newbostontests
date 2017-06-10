package tests;

//gives basic windows feature
import javax.swing.JFrame;

public class GUItester {

	public static void main(String[] args) {
		
		GUIcomplex oliver = new GUIcomplex();
		
		//VERY IMPORTANT TO CLOSE OPERATION
		oliver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setting window size
		oliver.setSize(275, 180);
		oliver.setVisible(true);
	}

}
