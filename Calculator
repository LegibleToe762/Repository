import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class Calculator extends JFrame{
	
	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	int buttonClicked;
	
	public static void main(String[] args){
		
		new Calculator();
	}
	
	public Calculator(){
		
		this.setSize(250,600);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
		
		this.setResizable(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("Calculator");

		JPanel thePanel = new JPanel();
		
		JTextArea calcOutput = new JTextArea(15,20);
		
		thePanel.add(calcOutput);
		
		
		
		//Start of buttons
		
		ListenForButton lForButton = new ListenForButton();
		
		//Start of first row
		
		JButton button7 = new JButton();
		
		button7.setText("7");
	
		button7.addActionListener(lForButton);
		
		thePanel.add(button7);
		
		JButton button8 = new JButton();
		
		button8.setText("8");
	
		button8.addActionListener(lForButton);
		
		thePanel.add(button8);

		JButton button9 = new JButton();
		
		button9.setText("9");
	
		button9.addActionListener(lForButton);
		
		thePanel.add(button9);
		
		//End of first row
		
		JButton multiply = new JButton();
				
		multiply.setText("*");
				
		multiply.addActionListener(lForButton);
				
		thePanel.add(multiply);
				
		JButton divide = new JButton();
				
		divide.setText("/");
				
		divide.addActionListener(lForButton);
				
		thePanel.add(divide);
		
		//Start of second row
		
		JButton button4 = new JButton();
		
		button4.setText("4");
		
		button4.addActionListener(lForButton);
		
		thePanel.add(button4);
		
		JButton button5 = new JButton();
		
		button5.setText("5");
	
		button5.addActionListener(lForButton);
		
		thePanel.add(button5);
		
		JButton button6= new JButton();
		
		button6.setText("6");
	
		button6.addActionListener(lForButton);
		
		thePanel.add(button6);
		
		//End of second row
		
		JButton add = new JButton();
		
		add.setText("+");
		
		add.addActionListener(lForButton);
		
		thePanel.add(add);
		
		JButton subtract = new JButton();
		
		subtract.setText("-");
		
		subtract.addActionListener(lForButton);
		
		thePanel.add(subtract);
		
		//Start of third row
		
		JButton Button1 = new JButton();
		
		Button1.setText("1");
	
		Button1.addActionListener(lForButton);
		
		thePanel.add(Button1);
		
		JButton button2 = new JButton();
		
		button2.setText("2");
	
		button2.addActionListener(lForButton);
		
		thePanel.add(button2);
		
		JButton button3 = new JButton();
		
		button3.setText("3");
		
		button3.addActionListener(lForButton);
		
		thePanel.add(button3);
		
		//End of third row
		
		JButton clear = new JButton();
		
		clear.setText("C");
		
		clear.addActionListener(lForButton);
		
		thePanel.add(clear);
		
		JButton equal = new JButton();
		
		equal.setText("=");
		
		equal.addActionListener(lForButton);
		
		thePanel.add(equal);
		
		JButton button0 = new JButton();
		
		button0.setText("0");
		
		button0.addActionListener(lForButton);
		
		thePanel.add(button0);
		
		//End of buttons
	
		this.add(thePanel);
		
		this.setVisible(true);
	}
	
	private class ListenForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			textArea1.append(e.getActionCommand());//NOT FINISHED HERE
			
		}
	}
}
