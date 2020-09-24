import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calc {

	private JFrame frame;
	private JTextField Screen;
	
	double FirstNo;
	double SecondNo;
	double Result;
	
	String Operator;
	String Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 468, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		Screen = new JTextField();
		Screen.setHorizontalAlignment(SwingConstants.RIGHT);
		Screen.setBackground(Color.WHITE);
		Screen.setFont(new Font("Tahoma", Font.BOLD, 40));
		Screen.setBounds(12, 13, 424, 101);
		frame.getContentPane().add(Screen);
		Screen.setColumns(10);
	// -----------------------------Row1-----------------------------	
		JButton CLR = new JButton("CLR");
		CLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText("");
			}
		});
		CLR.setFont(new Font("Tahoma", Font.BOLD, 25));
		CLR.setBounds(12, 127, 97, 45);
		frame.getContentPane().add(CLR);
		
		JButton Percentage = new JButton("%");
		Percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNo=Double.parseDouble(Screen.getText());
				Screen.setText("");
				Operator="%";
			}
		});
		Percentage.setFont(new Font("Tahoma", Font.BOLD, 20));
		Percentage.setBounds(121, 127, 97, 45);
		frame.getContentPane().add(Percentage);
		
		JButton Root = new JButton("\u221A");
		Root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstNo=Double.parseDouble(Screen.getText());
				Screen.setText(String.format("%.2f",Math.sqrt(FirstNo)));
			}
		});
		Root.setFont(new Font("Tahoma", Font.BOLD, 25));
		Root.setBounds(230, 127, 97, 45);
		frame.getContentPane().add(Root);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNo=Double.parseDouble(Screen.getText());
				Screen.setText("");
				Operator="/";
			}
		});
		divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		divide.setBounds(339, 127, 97, 45);
		frame.getContentPane().add(divide);
		
	// -----------------------------Row2-----------------------------
		
		
		JButton Number_7 = new JButton("7");
		Number_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_7.getText();
				Screen.setText(Num);
			}
		});
		Number_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_7.setBounds(12, 185, 97, 45);
		frame.getContentPane().add(Number_7);
		
		JButton Number_8 = new JButton("8");
		Number_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_8.getText();
				Screen.setText(Num);
			}
		});
		Number_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_8.setBounds(121, 185, 97, 45);
		frame.getContentPane().add(Number_8);
		
		JButton Number_9 = new JButton("9");
		Number_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_9.getText();
				Screen.setText(Num);
			}
		});
		Number_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_9.setBounds(230, 185, 97, 45);
		frame.getContentPane().add(Number_9);
		
		JButton Multiply = new JButton("X");
		Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNo=Double.parseDouble(Screen.getText());
				Screen.setText("");
				Operator="*";
			}
		});
		Multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		Multiply.setBounds(339, 185, 97, 45);
		frame.getContentPane().add(Multiply);
		
	// -----------------------------Row3-----------------------------
		JButton Number_4 = new JButton("4");
		Number_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_4.getText();
				Screen.setText(Num);
			}
		});
		Number_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_4.setBounds(12, 243, 97, 45);
		frame.getContentPane().add(Number_4);
		
		JButton Number_5 = new JButton("5");
		Number_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_5.getText();
				Screen.setText(Num);
			}
		});
		Number_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_5.setBounds(121, 243, 97, 45);
		frame.getContentPane().add(Number_5);
		
		JButton Number_6 = new JButton("6");
		Number_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_6.getText();
				Screen.setText(Num);
			}
		});
		Number_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_6.setBounds(230, 243, 97, 45);
		frame.getContentPane().add(Number_6);
		
		JButton subtraction = new JButton("-");
		subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNo=Double.parseDouble(Screen.getText());
				Screen.setText("");
				Operator="-";
			}
		});
		subtraction.setFont(new Font("Tahoma", Font.BOLD, 31));
		subtraction.setBounds(339, 243, 97, 45);
		frame.getContentPane().add(subtraction);
	// -----------------------------Row4-----------------------------
		JButton Number_1 = new JButton("1");
		Number_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_1.getText();
				Screen.setText(Num);
			}
		});
		Number_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_1.setBounds(12, 301, 97, 45);
		frame.getContentPane().add(Number_1);
		
		JButton Number_2 = new JButton("2");
		Number_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_2.getText();
				Screen.setText(Num);
			}
		});
		Number_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_2.setBounds(121, 301, 97, 45);
		frame.getContentPane().add(Number_2);
		
		JButton Number_3 = new JButton("3");
		Number_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_3.getText();
				Screen.setText(Num);
			}
		});
		Number_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_3.setBounds(230, 301, 97, 45);
		frame.getContentPane().add(Number_3);
		
		JButton ADD = new JButton("+");
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNo=Double.parseDouble(Screen.getText());
				Screen.setText("");
				Operator="+";
			}
		});
		ADD.setFont(new Font("Tahoma", Font.BOLD, 25));
		ADD.setBounds(339, 301, 97, 45);
		frame.getContentPane().add(ADD);
		
  // -----------------------------Row5-----------------------------
		JButton Number_0 = new JButton("0");
		Number_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num=Screen.getText()+Number_0.getText();
				Screen.setText(Num);
			}
		});
		Number_0.setFont(new Font("Tahoma", Font.BOLD, 25));
		Number_0.setBounds(12, 359, 97, 45);
		frame.getContentPane().add(Number_0);
		
		
		JButton Dot = new JButton(".");
		Dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! Screen.getText().contains("."))
		        {
					Screen.setText(Screen.getText() + Dot.getText());
		        }
			}
		});
		Dot.setFont(new Font("Tahoma", Font.BOLD, 30));
		Dot.setBounds(121, 359, 97, 45);
		frame.getContentPane().add(Dot);
		
		JButton Ans = new JButton("=");
		Ans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SecondNo=Double.parseDouble(Screen.getText());
				
				if(Operator=="+")
				{
					Result=FirstNo+SecondNo;
					Answer=String.format("%.2f",Result);
					Screen.setText(Answer);
				}
				else if (Operator=="-") {
					Result=FirstNo-SecondNo;
					Answer=String.format("%.2f",Result);
					Screen.setText(Answer);
				}
				else if (Operator=="*") {
					Result=FirstNo*SecondNo;
					Answer=String.format("%.2f",Result);
					Screen.setText(Answer);
				}
				else if (Operator=="/") {
					Result=FirstNo/SecondNo;
					Answer=String.format("%.2f",Result);
					Screen.setText(Answer);
				}
				else if (Operator=="%") {
					Result=FirstNo%SecondNo;
					Answer=String.format("%.2f",Result);
					Screen.setText(Answer);
				}
			}
		});
		Ans.setFont(new Font("Tahoma", Font.BOLD, 30));
		Ans.setBounds(339, 359, 97, 45);
		frame.getContentPane().add(Ans);
		
		JButton Sign = new JButton("\u00B1");
		Sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(Screen.getText()));
				ops=ops*(-1);
				Screen.setText(String.valueOf(ops));
			}
		});
		Sign.setFont(new Font("Tahoma", Font.BOLD, 20));
		Sign.setBounds(230, 359, 97, 45);
		frame.getContentPane().add(Sign);
	}
}
