package lab6;

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

public class guessGui extends JFrame implements ActionListener
{
	//attributes
	JButton genButton, checkButton;
	JLabel label;
	JTextField input;
	JPanel panel1, panel2, panel3;
	public int guessCount;
	public int randNum = randomNum();
	
	//constructor sets up the screen
	guessGui(String title)
	{
		super(title);
		setSize(300,300);
		setLayout(new FlowLayout());
		
		//Button to generate random number
		genButton = new JButton("Generate random number");
		genButton.setToolTipText("Click this button to generate a random number");
		genButton.addActionListener(this);
		
		//panel to put genButton on top of GUI
		panel1 = new JPanel();
		panel1.add(genButton);
		add(panel1);
		
		//label and textfield for user input
		label = new JLabel("Make a guess:");

		input = new JTextField("Enter a number");
		input.addActionListener(this);
		
		//panel to put label and textfield in center of GUI
		panel2 = new JPanel();
		panel2.add(label);
		panel2.add(input);
		add(panel2);
		
		//button which checks the users input against guess
		checkButton = new JButton("Check your guess");
		checkButton.addActionListener(this);
		
		panel3 = new JPanel();
		panel3.add(checkButton);
		add(panel3);
		
		setVisible(true);
	}
	
	//method to generate random number
	public int randomNum()
	{
		Random n = new Random();
		int randNum = n.nextInt(101);
		int num = randNum;
		return num;
	}
	
	//method listening for performed actions
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//button to generate number
		if(e.getSource() == genButton)
		{
			System.out.println("number is "+randNum);
		}
		
		//check user input
		if(e.getSource() == checkButton)
		{
			//convert text field input into integer
			String s = this.input.getText(); //get the text
			int guess = Integer.parseInt(s); //change to int
			guessCount++;
			
			//compare user guess to the random number
			if(guess > randNum)
			{
				JOptionPane.showMessageDialog(this,"Your guess is too high!");
			}
			if(guess < randNum)
			{
				JOptionPane.showMessageDialog(this,"Your guess is too low!");
			}
			if(guess == randNum)
			{
				JOptionPane.showMessageDialog(this,"Your guess is correct!");
				JOptionPane.showMessageDialog(this,"It took you "+guessCount+" guesses.");
			}
			
			//if nothing entered
			String a = this.input.getText(); //get the text
			if(a == null)
			{
				JOptionPane.showMessageDialog(this,"Please enter a number.");
			}
		}
		
		
	}
	
}
