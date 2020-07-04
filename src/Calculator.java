import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	String oldvalue;	//for store previous value 
	JFrame jf;	
	JLabel displayLabel;	//declare its as global since it is also need to use in other classes
	JButton seven;
	JButton eight;
	JButton nine;
	JButton div;
	JButton four;
	JButton five;
	JButton six;
	JButton mul;
	JButton one;
	JButton two;
	JButton three;
	JButton minus;
	JButton equal;
	JButton zero;
	JButton dot;
	JButton plus;
	JButton clr;
	
public Calculator() {
	jf=new JFrame("calculator");			// display calculator on top of the frame
	jf.setLayout(null);
	jf.setSize(555,655);
	jf.setLocation(675,225); 		//Where to display the frame (initial visible location)
	
	displayLabel=new JLabel(); 			//for Text area
	displayLabel.setBounds(30, 55, 485, 45);
	displayLabel.setBackground(Color.GRAY);  	//add color to the text area
	displayLabel.setOpaque(true);
	displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); 		// Text section starting point move to right position
	displayLabel.setForeground(Color.BLACK);
	jf.add(displayLabel);
	
	
	
	seven=new JButton("7");		//For add number buttons in the form of default calculator
	seven.setBounds(30, 130, 80, 80);
	seven.addActionListener(this);
	seven.setFont(new Font ("Arial", Font.PLAIN, 32));	//for change size of the button
	jf.add(seven);
	
	eight=new JButton("8");		
	eight.setBounds(135, 130, 80, 80);	
	eight.addActionListener(this);
	eight.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(eight);
	
	nine=new JButton("9");		
	nine.setBounds(235, 130, 80, 80);
	nine.addActionListener(this);
	nine.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(nine);
	
	div=new JButton("/");		
	div.setBounds(335, 130, 80, 80);
	div.addActionListener(this);
	div.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(div);
	
	
	four=new JButton("4");		
	four.setBounds(30, 230, 80, 80);
	four.addActionListener(this);
	four.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(four);
	
	five=new JButton("5");		
	five.setBounds(135, 230, 80, 80);	
	five.addActionListener(this);
	five.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(five);
	
	six=new JButton("6");		
	six.setBounds(235, 230, 80, 80);
	six.addActionListener(this);
	six.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(six);
	
	mul=new JButton("*");		
	mul.setBounds(335, 230, 80, 80);
	mul.addActionListener(this);
	mul.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(mul);
	
	one=new JButton("1");		
	one.setBounds(30, 330, 80, 80);	
	one.addActionListener(this);
	one.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(one);
	
	two=new JButton("2");		
	two.setBounds(135, 330, 80, 80);
	two.addActionListener(this);
	two.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(two);
	
	three=new JButton("3");		
	three.setBounds(235, 330, 80, 80);
	three.addActionListener(this);
	three.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(three);
	
	minus=new JButton("-");		
	minus.setBounds(335, 330, 80, 80);
	minus.addActionListener(this);
	minus.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(minus);
	
	dot=new JButton(".");		
	dot.setBounds(30, 430, 80, 80);	
	dot.addActionListener(this);
	dot.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(dot);
	
	zero=new JButton("0");		
	zero.setBounds(135, 430, 80, 80);
	zero.addActionListener(this);
	zero.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(zero);
	
	plus=new JButton("+");		
	plus.setBounds(235, 430, 80, 80);
	plus.addActionListener(this);
	plus.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(plus);
	
	equal=new JButton("=");		
	equal.setBounds(335, 430, 80, 80);
	equal.addActionListener(this);
	equal.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(equal);
	
	clr=new JButton("clr");		
	clr.setBounds(435, 430, 90, 80);
	clr.addActionListener(this);
	clr.setFont(new Font ("Arial", Font.PLAIN, 32));
	jf.add(clr);
	
	
	
	
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		//for close the program execution after close button pressed
	
}
public static void main(String ar[]){
	new Calculator(); 			//creating object for calculator new need to assign a variable (optional)
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==seven) {
		if (isOperatorClicked) {
			displayLabel.setText("7");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"7");
		}
	}
	else if (e.getSource()==eight) {
		if (isOperatorClicked) {
			displayLabel.setText("8");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"8");
		}
	}
	else if (e.getSource()==nine) {
		if (isOperatorClicked) {
			displayLabel.setText("9");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"9");
		}
	}

	else if (e.getSource()==four) {
		if (isOperatorClicked) {
			displayLabel.setText("4");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"4");
		}
	}
	else if (e.getSource()==five) {
		if (isOperatorClicked) {
			displayLabel.setText("5");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"5");
		}
	}
	else if (e.getSource()==six) {
		if (isOperatorClicked) {
			displayLabel.setText("6");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"6");
		}
	}
	
	else if (e.getSource()==one) {
		if (isOperatorClicked) {
			displayLabel.setText("1");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"1");
		}
	}
	else if (e.getSource()==two) {
		if (isOperatorClicked) {
			displayLabel.setText("2");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"2");
		}
	}
	else if (e.getSource()==three) {
		if (isOperatorClicked) {
			displayLabel.setText("3");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"3");
		}
	}
	else if (e.getSource()==dot) {
		if (isOperatorClicked) {
			displayLabel.setText(".");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+".");
		}
	}
	else if (e.getSource()==zero) {
		if (isOperatorClicked) {
			displayLabel.setText("0");
			isOperatorClicked=false;
		}
		else {
			displayLabel.setText(displayLabel.getText()+"0");
		}
	}
	
	
	else if (e.getSource()==equal) {
		String newValue=displayLabel.getText();
		float oldValueF=Float.parseFloat(oldvalue);
		float newValueF=Float.parseFloat(newValue);
		float result=oldValueF+newValueF;
		displayLabel.setText(result+"");   //+" convert to string type

	}
	else if (e.getSource()==div) {
		
		isOperatorClicked=true;
		oldvalue=displayLabel.getText();
	}
	else if (e.getSource()==mul) {
		isOperatorClicked=true;
		oldvalue=displayLabel.getText();
	}
	else if (e.getSource()==minus) {
		isOperatorClicked=true;
		oldvalue=displayLabel.getText();
	}
	else if(e.getSource()==plus) {
		isOperatorClicked=true;
		oldvalue=displayLabel.getText();
	}
	else if (e.getSource()==clr) {
		displayLabel.setText("");
	}
	
	
	
}
}
