package tests;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class event extends JFrame {
	
	//three text fields
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	
	private JPasswordField passwordField;
	
	public event() {
		super("The title");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter text here");
		add(item2);
		
		item3 = new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item2.addActionListener(handler);
		passwordField.addActionListener(handler);
	
	}
	
	//implements means is the class that handles the events
	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event1){
			
			String string = "";
			
			if (event1.getSource()==item1) {
				string = String.format("field 1 : %s", event1.getActionCommand());
			}
				else if (event1.getSource()==item2) {
					string = String.format("field 2 : %s", event1.getActionCommand());
				}
				else if (event1.getSource()==item3) {
					string = String.format("field 3 : %s", event1.getActionCommand());
				}
				else if(event1.getSource()==passwordField){
					string = String.format("password field is :%s", event1.getActionCommand());
				}	
				JOptionPane.showMessageDialog(null,string);
		
		}
		
	}
	

}