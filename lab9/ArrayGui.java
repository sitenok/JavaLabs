package lab8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.util.ArrayList;

public class ArrayGui extends JFrame implements ActionListener
{
	//attributes for GUI
	JButton saveButton, showButton, deleteButton;
	JLabel label;
	JTextField input1, input2, input3;
	JPanel panel1, panel2, panel3, panel4;
	JTextArea data;
	
	//Array attributes
	ArrayList<Person> people2 = new ArrayList<Person>();
	int count=0;
	
	//constructors
	ArrayGui(String title)
	{
		super(title);
		setSize(500,400);
		setLayout(new FlowLayout());
		
		//label and text field for user input
		label = new JLabel("Enter your details:");

		input1 = new JTextField("Name");
		input1.addActionListener(this);
		
		input2 = new JTextField("Surname");
		input2.addActionListener(this);
		
		input3 = new JTextField("City");
		input3.addActionListener(this);
		
		//panel to put label and text field in centre of GUI
		panel2 = new JPanel();
		panel2.add(label);
		panel2.add(input1);
		panel2.add(input2);
		panel2.add(input3);
		add(panel2);
		
		//Button to generate random number
		saveButton = new JButton("Save");
		saveButton.setToolTipText("Click this button to save your data");
		saveButton.addActionListener(this);
		
		//panel to put genButton on top of GUI
		panel1 = new JPanel();
		panel1.add(saveButton);
		add(panel1);
		
		//button which checks the users input against guess
		showButton = new JButton("Show all");
		showButton.addActionListener(this);
		
		panel3 = new JPanel();
		panel3.add(showButton);
		add(panel3);
		
		//Text area to display data of ArrayList
		data = new JTextArea(5, 20);
		
		panel4 = new JPanel();
		panel4.add(data);
		
		setVisible(true);
	}
	
	
	
	//methods
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == saveButton)
		{
			String name = this.input1.getText(); //get the text inputed (input1) and store into var name
			String surname = this.input2.getText();
			String city = this.input3.getText();
//			people2.add(setName(name));
//			people2.add(surname);
//			people2.add(city);
			
			//create and add objects to a new array list "people2", an array list of inputed values
			Person pep = new Person(); //temporary "object" pep
			pep.setFirstName(name);
			pep.setSurName(surname);
			pep.setCity(city);
			people2.add(pep);
		
			JOptionPane.showMessageDialog(this,"Successfully added person "+name+" "+surname+" from "+city);
		}
		
		if(e.getSource() == showButton)
		{
			add(panel4); //adds the text area to the GUI when Show pressed
			for (Person pep: people2)
			{
				data.append(pep + "\n"); //add object to text area
				System.out.println(pep);
			}
			
		}
	}
	
}
