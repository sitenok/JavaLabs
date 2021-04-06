package lab5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BasicGUI extends JFrame implements ActionListener, MouseListener
{
	//attributes
	JButton button1, button2;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JTextField text;
	JLabel label;
	public String output;

	//constructor sets up the screen
	BasicGUI(String title)
	{
		super(title);
		setSize(500,300);
		setLayout(new FlowLayout()); //puts side by side
		
		button1 = new JButton("Click me");
		button1.setToolTipText("This button does nothing");
		button1.addActionListener(this); //"listens" for action on this button
		add(button1); //adds to gui
		
		button2 = new JButton("Click me too");
		button2.setToolTipText("This button also does nothing");
		button2.addActionListener(this); //"listens" for action on this button
		add(button2); //adds to gui
		
		label= new JLabel("Sample text in a label");
		
		//panel for buttons
		panel = new JPanel(new FlowLayout());
		panel.setBackground(Color.gray);
		panel.addMouseListener(this);
		panel.add(button1);
		panel.add(button2);
		add(panel);
		
		//panel for label
		panel2 = new JPanel(new FlowLayout());
		panel2.setBackground(Color.cyan);
		panel2.addMouseListener(this);
		panel2.add(label);
		add(panel2); //add to gui
		
		//text box for entering name
		text = new JTextField("Name");
		text.setBackground(Color.pink);
		text.addActionListener(this);
		text.setToolTipText("You entered a name");
		add(text);
		
		//panel for name text box 
		panel3 = new JPanel(new BorderLayout());
		panel3.setBackground(Color.lightGray);
		panel3.add(text);
		add(panel3); //add to gui
		
		setVisible(true);
	}

	//event handler methods (what to do when an action is done?)
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == panel2)
		{
			JOptionPane.showMessageDialog(this, "Panel clicked");
			System.out.println("You clicked the panel");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == panel2)
		{
			JOptionPane.showMessageDialog(this, "Label entered");
			System.out.println("Label entered");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == panel2)
		{
			JOptionPane.showMessageDialog(this, "Label exited");
			System.out.println("Label exited");
		}
	}

	//event handler methods (what to do when an action is done?)
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == button1)
		{
			//behaviour that happens when button1 has an action performed on it
			JOptionPane.showMessageDialog(this, "Button clicked");
			System.out.println("You clicked button 1");
		}
		if (event.getSource() == text)
		{
			//behaviour that happens when button1 has an action performed on it
			output = text.getText();
			JOptionPane.showMessageDialog(this, "You entered "+output);
			System.out.println("Name entered: "+output);
		}
		if(event.getSource() == button2)
		{
			//behaviour that happens when button2 has an action performed on it
			JOptionPane.showMessageDialog(this, "Button 2 clicked");
			System.out.println("You clicked button 2");
		}
	}
	

}
