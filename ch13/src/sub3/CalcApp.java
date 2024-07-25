package sub3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField display;
	public StringBuilder input = new StringBuilder();
	public String firstvalue = new String();
	public String lastvalue= new String();
	// 결과값을 결과창에 내기 위해 StringBuilder 사용
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
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
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display = new JTextField();
		display.setEditable(false);
		display.setText("0");
		display.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBounds(12, 10, 283, 50);
		contentPane.add(display);
		display.setColumns(10);
		
		
		

		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("1");
				display.setText(""+input);
			}
		});
		btn1.setBounds(12, 220, 62, 61);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("2");
				display.setText(""+input);
			}
		});
		btn2.setBounds(85, 220, 62, 61);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("3");
				display.setText(""+input);
			}
		});
		btn3.setBounds(159, 220, 62, 61);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("4");
				display.setText(""+input);
			}
		});
		btn4.setBounds(12, 149, 62, 61);
		contentPane.add(btn4);
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("5");
				display.setText(""+input);
			}
		});
		btn5.setBounds(85, 149, 62, 61);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("6");
				display.setText(""+input);
			}
		});
		btn6.setBounds(159, 149, 62, 61);
		contentPane.add(btn6);
		

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				input.append("7");
				display.setText(""+input);
			}
		});
		btn7.setBounds(12, 78, 62, 61);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("8");
				display.setText(""+input);
			}
			
		});
		btn8.setBounds(85, 78, 62, 61);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			input.append("9");
			display.setText(""+input);
			}
		});
		btn9.setBounds(159, 78, 62, 61);
		contentPane.add(btn9);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("0");
				display.setText(""+input);
			}
		});
		btn0.setBounds(85, 291, 62, 61);
		contentPane.add(btn0);


		JButton btnReset = new JButton("C");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setLength(0);
				display.setText("0");
			}
		});
		btnReset.setBounds(12, 291, 62, 61);
		contentPane.add(btnReset);
		

		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstvalue = display.getText();
				input.append("+");
				display.setText(" ");
				input.setLength(0);
			
				
			}
		});
		btnPlus.setBounds(233, 291, 62, 61);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("-");
				display.setText(""+input);
			}
		});
		btnMinus.setBounds(233, 220, 62, 61);
		contentPane.add(btnMinus);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("x");
				display.setText(""+input);
			}
		});
		btnMulti.setBounds(233, 149, 62, 61);
		contentPane.add(btnMulti);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.append("/");
				display.setText(""+input);
			}
		});
		btnDiv.setBounds(233, 78, 62, 61);
		contentPane.add(btnDiv);
		
		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lastvalue = display.getText();
				int x = Integer.parseInt(firstvalue);
				int y = Integer.parseInt(lastvalue);
				int z = x+y;
				
				display.setText(""+z);
			
			}
		});
		btnResult.setBounds(159, 291, 62, 61);
		contentPane.add(btnResult);
	}

}
//더하기까지 일단 구현 완료
