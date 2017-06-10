package tests;

//This import is to allow us to create buttons, scroll bars etc
import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		
		//show input only allows inputs of strings
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
	
		//therefore we need to convert to ints for this program
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		/*
		 * to output
		 * showMessage takes 4 Parameters!
		 * first is where to position (null = middle of screen)
		 * 2nd is what you want to say
		 * 3rd What you want on the title bar
		 * Message that will pop up
		 */
		JOptionPane.showMessageDialog(null, "The answer is " +sum, "The Title", JOptionPane.PLAIN_MESSAGE);
	}

}
