package calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Infixtoprifix extends JPanel{
	
	//Calculation Part
	
	public static void main(String[] args) {
		
		//try GUI
		
		   // create a JFrame and add a JTextField to it
			/*
			 * JFrame frame = new JFrame("Calculator"); JTextField textField = new
			 * JTextField(); frame.add(textField);
			 * 
			 * // show the JFrame frame.pack(); frame.setVisible(true);
			 * 
			 * // wait for the user to enter text in the JTextField while
			 * (textField.getText().isEmpty()) { try { Thread.sleep(100); } catch
			 * (InterruptedException e) { e.printStackTrace(); } }
			 * 
			 * // get the text entered in the JTextField String infixExpression =
			 * textField.getText(); System.out.println("Infix Expression: " +
			 * infixExpression);
			 * 
			 * // calculate the postfix expression and evaluate it String postfix =
			 * infixToPostfix(infixExpression); System.out.println("Postfix Expression: " +
			 * postfix); System.out.println("Result: " + calculatePostfix(postfix));
			 */
		//
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Enter your Expression: "); //String infixExpression =
		 * textField.getText(); String infixExpression = scanner.nextLine();
		 * System.out.println("Infix Expression" + infixExpression ); scanner.close();
		 * String postfix = infixToPostfix(infixExpression);
		 * System.out.println("Postfix Expression: " + postfix);
		 * System.out.println("Postfix:- " + calculatePostfix(postfix));
		 */
	    
		/*
		 * String infixExpression = textField.getText(); String postfix =
		 * infixtoprifix.infixToPostfix(infixExpression);
		 */
		
		//try 2
		//Jframe creation
		/*
		 * JFrame frame = new JFrame("Calculator"); JTextField textField = new
		 * JTextField(); JButton submitButton = new JButton("Submit"); JPanel
		 * buttonPanel = new JPanel(new GridLayout(4, 4));
		 * 
		 * //numeric value
		 * 
		 * 
		 * //end numeric
		 * 
		 * //Add operator button JButton addButton = new JButton("+");
		 * addButton.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * textField.setText(textField.getText() + "+"); } });
		 * buttonPanel.add(addButton);
		 * 
		 * JButton subtractButton = new JButton("-");
		 * subtractButton.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * textField.setText(textField.getText() + "-"); } });
		 * buttonPanel.add(subtractButton);
		 * 
		 * JButton multiplyButton = new JButton("*");
		 * multiplyButton.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * textField.setText(textField.getText() + "*"); } });
		 * buttonPanel.add(multiplyButton);
		 * 
		 * JButton divideButton = new JButton("/"); divideButton.addActionListener(new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * textField.setText(textField.getText() + "/"); } });
		 * buttonPanel.add(divideButton); //end operator
		 * 
		 * 
		 * frame.setLayout(new GridLayout(2,1)); JPanel panel1 = new JPanel(new
		 * BorderLayout()); panel1.add(new JLabel("Enter your expression: "),
		 * BorderLayout.WEST); panel1.add(textField, BorderLayout.CENTER); JPanel panel2
		 * = new JPanel(new FlowLayout()); panel2.add(submitButton); frame.add(panel1);
		 * frame.add(panel2);
		 * 
		 * 
		 * // add actionlistner submitButton.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // get the text
		 * entered in the JTextField String infixExpression = textField.getText();
		 * System.out.println("Infix Expression: " + infixExpression);
		 * 
		 * // calculate the postfix expression and evaluate it String postfix =
		 * infixToPostfix(infixExpression); System.out.println("Postfix Expression: " +
		 * postfix); System.out.println("Result: " + calculatePostfix(postfix)); } });
		 * 
		 * // show the JFrame frame.pack(); frame.setVisible(true);
		 */
		
		//v3
		JFrame frame = new JFrame("Calculator");
		//frame Layout
		frame.setBounds(100, 100, 731, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//textField Layout
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setBounds(10, 10, 58, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(15);
        
        JButton submitButton = new JButton("Calculate");
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        
        // add buttons for the numbers 0 to 9
        for (int i = 0; i <= 9; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + button.getText());
                }
            });
            buttonPanel.add(button);
        }
        //-----------------------------------------------------------------
        
        // add buttons for the operators +, -, *, and /
        

        //-----------------------------------------------------------------
        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + " + ");
            }
        });
        buttonPanel.add(addButton);
        
        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + " - ");
            }
        });
        buttonPanel.add(subtractButton);
        
        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + " * ");
            }
        });
        buttonPanel.add(multiplyButton);
        
        JButton divideButton = new JButton("/");
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + " / ");
            }
        });
        buttonPanel.add(divideButton);

        //-----------------------------------------------------------------
        // add the components to the JFrame

        //-----------------------------------------------------------------
        frame.setLayout(new GridLayout(3, 1));
        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.add(new JLabel("Enter your expression: "), BorderLayout.WEST);
        panel1.add(textField, BorderLayout.CENTER);
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(submitButton);
        frame.add(panel1);
        frame.add(buttonPanel);
        frame.add(panel2);

        // add an ActionListener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // get the text entered in the JTextField
                String infixExpression = textField.getText();
                System.out.println("Infix Expression: " + infixExpression);

                // calculate the postfix expression and evaluate it
                String postfix = infixToPostfix(infixExpression);
                System.out.println("Postfix Expression: " + postfix);
                System.out.println("Result: " + calculatePostfix(postfix));
                
                //gui out put
                JOptionPane.showMessageDialog(frame,
                        "Infix Expression: " + infixExpression +
                                "\nPostfix Expression: " + postfix +
                                "\nResult: " + calculatePostfix(postfix));
            }
        });

        // show the JFrame
        frame.pack();
        frame.setVisible(true);

	}

	
	//convert to postfix
	public static String infixToPostfix(String infix) {
		
		//stack 
	    Stack<String> operators = new Stack<>();
	    List<String> postfix = new ArrayList<>();
	    
	    for (String current : infix.split(" ")) {
	        if (isOperator(current)) {
	            while (!operators.empty() && hasLowerPrecedence(current, operators.peek())) {
	                postfix.add(operators.pop());
	            }
	            operators.push(current);
	        } else {
	            postfix.add(current);
	        }
	    }
	    while (!operators.empty()) {
	        postfix.add(operators.pop());
	    }
	    return String.join(" ", postfix);
	}
	
	
	//----------------------- helper method to find the lower precedence
	private static boolean hasLowerPrecedence(String op1, String op2) {
		// TODO Auto-generated method stub
		return precedence(op1)< precedence(op2);
	}
	
	
	//checking the precedence
	private static int precedence(String operator) {
	    switch(operator) {
	        case "+":
	        case "-":
	            return 1;
	        case "/":
	        case "*":
	            return 2;
	        default:
	            return 3;
	    }
	}
	
	
	//list of operator
	public static boolean isOperator (String operator) {
		return List.of("+","-","*","/").contains(operator);
	}
	
	//method to evaluate the postfix
	
//	public static float calculatePostfix(String postfix) {
//	    Stack<Integer> stack = new Stack<>();
//	    for (String component : postfix.split(" ")) {
//	        if (isNumericComponent(component)) {
//	            stack.push(Integer.parseInt(component));
//	        } else {
//	            int num1 = stack.pop();
//	            int num2 = stack.pop();
//	            switch (component) {
//	                case "+":
//	                    stack.push(num2 + num1);
//	                    break;
//	                case "-":
//	                    stack.push(num2 - num1);
//	                    break;
//	                case "*":
//	                    stack.push(num2 * num1);
//	                    break;
//	                case "/":
//	                	
//	                    stack.push((flote) num2 / num1);
//	                    break;
//	            }
//	        }
//	    }
//	    return stack.pop();
//	}

	//calculation
	public static float calculatePostfix(String postfix) {
	    Stack<Float> stack = new Stack<>();
	    for (String component : postfix.split(" ")) {
	        if (isNumericComponent(component)) {
	            stack.push(Float.parseFloat(component));
	        } else {
	            float num1 = stack.pop();
	            float num2 = stack.pop();
	            switch (component) {
	                case "+":
	                    stack.push(num2 + num1);
	                    break;
	                case "-":
	                    stack.push(num2 - num1);
	                    break;
	                case "*":
	                    stack.push(num2 * num1);
	                    break;
	                case "/":
	                    float result = num2 / num1;
	                    stack.push(result);
	                    break;
	            }
	        }
	    }
	    return stack.pop();
	}



	
	//helper method to check if the value is numeric or not
	private static boolean isNumericComponent(String str) {
		// try catch block
		try {
			Integer.parseInt(str);
			return true;
		}
		catch(NumberFormatException nfe) {
		return false;
		}
	}
	
	
	
	
	
	
	

}
