package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calci {

	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnDot;
	private JButton btn2;
	private JButton btn5;
	private JButton btn8;
	private JButton btnClear;
	private JButton btnEq;
	private JButton btn3;
	private JButton btn6;
	private JButton btn9;
	private JButton btn00;
	private JButton btnPercent;
	private JButton btnD;
	private JButton btnMulti;
	private JButton btnMinus;
	private JButton btnPlus;

	/**
	 * Launch the application.
	 */
	Infixtoprifix infixtoprifix = new Infixtoprifix();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 731, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setBounds(10, 10, 230, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton backBtn = new JButton("\uF0E7");
		backBtn.setFont(new Font("Wingdings", Font.PLAIN, 14));
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
					
					
				}
			}
		});
		backBtn.setBounds(10, 78, 50, 50);
		frame.getContentPane().add(backBtn);
		
		btn7 = new JButton("7 ");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 135, 50, 50);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4 ");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 195, 50, 50);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1 ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 255, 50, 50);
		frame.getContentPane().add(btn1);
		
		btn0 = new JButton("0 ");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(70, 310, 50, 50);
		frame.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDot.setBounds(10, 310, 50, 50);
		frame.getContentPane().add(btnDot);
		
		btn2 = new JButton("2 ");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(70, 255, 50, 50);
		frame.getContentPane().add(btn2);
		
		btn5 = new JButton("5 ");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(70, 195, 50, 50);
		frame.getContentPane().add(btn5);
		
		btn8 = new JButton("8 ");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(70, 135, 50, 50);
		frame.getContentPane().add(btn8);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(70, 78, 50, 50);
		frame.getContentPane().add(btnClear);
		
		btnEq = new JButton("=");
		btnEq.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEq.setBounds(130, 310, 50, 50);
		frame.getContentPane().add(btnEq);
		
		btn3 = new JButton("3 ");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(130, 255, 50, 50);
		frame.getContentPane().add(btn3);
		
		btn6 = new JButton("6 ");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(130, 195, 50, 50);
		frame.getContentPane().add(btn6);
		
		btn9 = new JButton("9 ");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(130, 135, 50, 50);
		frame.getContentPane().add(btn9);
		
		btn00 = new JButton("00 ");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn00.setBounds(130, 78, 50, 50);
		frame.getContentPane().add(btn00);
		
		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPercent.setBounds(190, 310, 50, 50);
		frame.getContentPane().add(btnPercent);
		
		btnD = new JButton("/ ");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnD.getText();
				textField.setText(number);
			}
		});
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnD.setBounds(190, 255, 50, 50);
		frame.getContentPane().add(btnD);
		
		btnMulti = new JButton("* ");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnMulti.getText();
				textField.setText(number);
			}
		});
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMulti.setBounds(190, 195, 50, 50);
		frame.getContentPane().add(btnMulti);
		
		btnMinus = new JButton("- ");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnMinus.getText();
				textField.setText(number);
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMinus.setBounds(190, 135, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		btnPlus = new JButton("+ ");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnPlus.getText();
				textField.setText(number);
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPlus.setBounds(190, 78, 50, 50);
		frame.getContentPane().add(btnPlus);
	}
}
