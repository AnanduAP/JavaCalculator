import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
public Calculator() {
	JFrame jf=new JFrame("calculator");			// display calculator on top of the frame
	jf.setLayout(null);
	jf.setSize(500,650);
	jf.setLocation(675,225); 		//Where to display the frame (initial visible location)
	
	JLabel displayLabel=new JLabel("Hello Enter values"); 			//for Text area
	displayLabel.setBounds(30, 55, 420, 45);
	displayLabel.setBackground(Color.GRAY);  	//add color to the text area
	displayLabel.setOpaque(true);
	displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); 		// Text section starting point move to right position
	displayLabel.setForeground(Color.BLACK);
	jf.add(displayLabel);
	
	
	
	JButton seven=new JButton("7");		//For add number buttons in the form of default calculator
	seven.setBounds(30, 130, 80, 80);		
	jf.add(seven);
	
	JButton eight=new JButton("8");		
	eight.setBounds(135, 130, 80, 80);		
	jf.add(eight);
	
	JButton nine=new JButton("9");		
	nine.setBounds(235, 130, 80, 80);		
	jf.add(nine);
	
	JButton div=new JButton("/");		
	div.setBounds(335, 130, 80, 80);		
	jf.add(div);
	
	
	JButton four=new JButton("4");		
	four.setBounds(30, 230, 80, 80);		
	jf.add(four);
	
	JButton five=new JButton("5");		
	five.setBounds(135, 230, 80, 80);		
	jf.add(five);
	
	JButton six=new JButton("6");		
	six.setBounds(235, 230, 80, 80);		
	jf.add(six);
	
	JButton mul=new JButton("*");		
	mul.setBounds(335, 230, 80, 80);		
	jf.add(mul);
	
	JButton one=new JButton("1");		
	one.setBounds(30, 330, 80, 80);		
	jf.add(one);
	
	JButton two=new JButton("2");		
	two.setBounds(135, 330, 80, 80);		
	jf.add(two);
	
	JButton three=new JButton("3");		
	three.setBounds(235, 330, 80, 80);		
	jf.add(three);
	
	JButton minus=new JButton("-");		
	minus.setBounds(335, 330, 80, 80);		
	jf.add(minus);
	
	JButton dot=new JButton(".");		
	dot.setBounds(30, 430, 80, 80);		
	jf.add(dot);
	
	JButton zero=new JButton("0");		
	zero.setBounds(135, 430, 80, 80);		
	jf.add(zero);
	
	JButton equal=new JButton("=");		
	equal.setBounds(235, 430, 80, 80);		
	jf.add(equal);
	
	JButton plus=new JButton("+");		
	plus.setBounds(335, 430, 80, 80);		
	jf.add(plus);
	
	
	
	
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		//for close the program execution after close button pressed
	
}
public static void main(String ar[]){
	new Calculator(); 							//creating object for calculator new need to assign a variable (optional)
}
}
