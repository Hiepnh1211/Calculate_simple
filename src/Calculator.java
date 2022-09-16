import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {
	
	double firstnum;
	double secondnum;
	double result;
	String answer;
	String operation;
	

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 259, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 23, 228, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn7.getText();
				textField.setText(Enternumber);
			}
		});
		btn7.setBounds(10, 131, 49, 44);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn8.getText();
				textField.setText(Enternumber);
			}
		});
		btn8.setBounds(69, 131, 49, 44);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn9.getText();
				textField.setText(Enternumber);
			}
		});
		btn9.setBounds(128, 131, 49, 44);
		contentPane.add(btn9);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btn_plus.setBounds(187, 77, 49, 44);
		contentPane.add(btn_plus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn4.getText();
				textField.setText(Enternumber);
			}
		});
		btn4.setBounds(10, 185, 49, 44);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn5.getText();
				textField.setText(Enternumber);
			}
		});
		btn5.setBounds(69, 185, 49, 44);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn6.getText();
				textField.setText(Enternumber);
			}
		});
		btn6.setBounds(128, 185, 49, 44);
		contentPane.add(btn6);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btn_minus.setBounds(187, 131, 49, 44);
		contentPane.add(btn_minus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn1.getText();
				textField.setText(Enternumber);
			}
		});
		btn1.setBounds(10, 239, 49, 44);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn2.getText();
				textField.setText(Enternumber);
			}
		});
		btn2.setBounds(69, 239, 49, 44);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn3.getText();
				textField.setText(Enternumber);
			}
		});
		btn3.setBounds(128, 239, 49, 44);
		contentPane.add(btn3);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btn_multiply.setBounds(187, 185, 49, 44);
		contentPane.add(btn_multiply);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + btn0.getText();
				textField.setText(Enternumber);
			}
		});
		btn0.setBounds(10, 293, 49, 44);
		contentPane.add(btn0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + btn_dot.getText());
		          }
			}
		});
		btn_dot.setBounds(69, 293, 49, 44);
		contentPane.add(btn_dot);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operation == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operation == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btn_equal.setBounds(187, 293, 49, 44);
		contentPane.add(btn_equal);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btn_divide.setBounds(187, 239, 49, 44);
		contentPane.add(btn_divide);
		
		JButton btn_del = new JButton("<-");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder StrB = new StringBuilder(textField.getText());
					StrB.deleteCharAt(textField.getText().length() -1);
					backspace = StrB.toString();
					textField.setText(backspace);
				}
			}
		});
		btn_del.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_del.setBounds(10, 77, 49, 44);
		contentPane.add(btn_del);
		
		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_C.setBounds(69, 77, 49, 44);
		contentPane.add(btn_C);
		
		JButton btn_remain = new JButton("%");
		btn_remain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btn_remain.setBounds(128, 77, 49, 44);
		contentPane.add(btn_remain);
		
		JButton btn_opposite = new JButton("+/-");
		btn_opposite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btn_opposite.setBounds(128, 293, 49, 44);
		contentPane.add(btn_opposite);
	}
}
