package sub2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUID;
	private JTextField txtName;
	private JTextField txtHP;
	private JTextField txtPlusVal1;
	private JTextField txtPlusVal2;
	private JTextField txtPlusResult;
	private JTextField txtMinusResult;
	private JTextField txtMinusVal2;
	private JTextField txtMinusVal1;
	private JTextField txtMultiResult;
	private JTextField txtMultiVal2;
	private JTextField txtMultiVal1;
	private JTextField txtResultDiv;
	private JTextField txtDivVal2;
	private JTextField txtDivVal1;
	private JLabel lbMinus;
	private JTable table;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//생성자에서 ㅁ
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 858);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(20, 13, 76, 15); 
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(20, 34, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("button1 버튼 클릭...");	
			}
		});
		
		btn1.setBounds(30, 62, 97, 23);
		contentPane.add(btn1);
		JButton btn2 = new JButton("확인2");
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"나 건들지 마라");
			}
		});
		
		btn2.setBounds(139, 62, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null,"버튼3 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				if(answer == 0) {
					System.out.println("Yes 클릭!");
				}else {
					System.out.println("No 클릭!");
				}				
			}
		});
		btn3.setBounds(244, 62, 97, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트필드 실습");
		lblNewLabel_2.setBounds(20, 104, 97, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel labelUID = new JLabel("ID");
		labelUID.setBounds(20, 129, 22, 15);
		contentPane.add(labelUID);
		
		txtUID = new JTextField();
		txtUID.setBounds(59, 125, 116, 21);
		contentPane.add(txtUID);
		txtUID.setColumns(10);
		
		JLabel lbResultUID = new JLabel("결과 : ");
		lbResultUID.setBounds(261, 129, 97, 15);
		contentPane.add(lbResultUID);
		
		JButton btnUID = new JButton("확인");
		btnUID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid =txtUID.getText();
				lbResultUID.setText("결과: " +uid);
				
			}
		});
		btnUID.setBounds(184, 123, 64, 23);
		contentPane.add(btnUID);
		
		JLabel labelName = new JLabel("이름");
		labelName.setBounds(20, 157, 30, 15);
		contentPane.add(labelName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(59, 154, 116, 21);
		contentPane.add(txtName);
		
		JLabel lbResultName = new JLabel("결과 : ");
		lbResultName.setBounds(261, 158, 97, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbResultName.setText("결과: "+name);
			}
		});
		btnName.setBounds(184, 152, 64, 23);
		contentPane.add(btnName);
		

		

		
		JLabel labelHP = new JLabel("휴대폰");
		labelHP.setBounds(20, 186, 45, 15);
		contentPane.add(labelHP);
		
		txtHP = new JTextField();
		txtHP.setColumns(10);
		txtHP.setBounds(59, 183, 116, 21);
		contentPane.add(txtHP);
		
		
		JLabel lbResultHP = new JLabel("결과 : ");
		lbResultHP.setBounds(261, 187, 97, 15);
		contentPane.add(lbResultHP);
		
		JButton btnHP = new JButton("확인");
		btnHP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHP.getText();
				lbResultHP.setText("결과: "+hp);
			}
		});
		btnHP.setBounds(184, 181, 64, 23);
		contentPane.add(btnHP);
		
		
		// 사칙연산 만들어보기 ****************
		
		
		JLabel lbPlus = new JLabel("덧셈");
		lbPlus.setBounds(20, 238, 57, 15);
		contentPane.add(lbPlus);
		
		txtPlusVal1 = new JTextField();
		txtPlusVal1.setBounds(59, 235, 68, 21);
		contentPane.add(txtPlusVal1);
		txtPlusVal1.setColumns(10);
		
		txtPlusVal2 = new JTextField();
		txtPlusVal2.setColumns(10);
		txtPlusVal2.setBounds(153, 235, 68, 21);
		contentPane.add(txtPlusVal2);
		
		JLabel lblNewLabel_3_1 = new JLabel("+");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(117, 238, 45, 15);
		contentPane.add(lblNewLabel_3_1);
		
		txtPlusResult = new JTextField();
		txtPlusResult.setColumns(10);
		txtPlusResult.setBounds(251, 235, 68, 21);
		contentPane.add(txtPlusResult);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("=");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(212, 238, 45, 15);
		contentPane.add(lblNewLabel_3_1_1);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val1 = txtPlusVal1.getText();
				String val2 = txtPlusVal2.getText();
				
				int a = Integer.parseInt(val1);
				int b = Integer.parseInt(val2);
				
				int result = a+b;
				String c = ""+result; // int를 String으로 바꾸기
				
				txtPlusResult.setText(c);
				

			}
		});
		btnPlus.setBounds(331, 234, 97, 23);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("확인");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val1 = txtMinusVal1.getText();
				String val2 = txtMinusVal2.getText();
				
				int a = Integer.parseInt(val1);
				int b = Integer.parseInt(val2);
				
				int result = a-b;
				String c = ""+result; // int를 String으로 바꾸기
				
				txtMinusResult.setText(c);
			}
		});
		
		btnMinus.setBounds(331, 270, 97, 23);
		contentPane.add(btnMinus);
		
		txtMinusResult = new JTextField();
		txtMinusResult.setColumns(10);
		txtMinusResult.setBounds(251, 271, 68, 21);
		contentPane.add(txtMinusResult);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("=");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setBounds(212, 274, 45, 15);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		txtMinusVal2 = new JTextField();
		txtMinusVal2.setColumns(10);
		txtMinusVal2.setBounds(153, 271, 68, 21);
		contentPane.add(txtMinusVal2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("-");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setBounds(117, 274, 45, 15);
		contentPane.add(lblNewLabel_3_1_2);
		
		txtMinusVal1 = new JTextField();
		txtMinusVal1.setColumns(10);
		txtMinusVal1.setBounds(59, 271, 68, 21);
		contentPane.add(txtMinusVal1);
		
		lbMinus = new JLabel("뺄셈");
		lbMinus.setBounds(20, 274, 57, 15);
		contentPane.add(lbMinus);
		

		
		txtMultiResult = new JTextField();
		txtMultiResult.setColumns(10);
		txtMultiResult.setBounds(251, 308, 68, 21);
		contentPane.add(txtMultiResult);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("=");
		lblNewLabel_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_1.setBounds(212, 311, 45, 15);
		contentPane.add(lblNewLabel_3_1_1_1_1);
		
		txtMultiVal2 = new JTextField();
		txtMultiVal2.setColumns(10);
		txtMultiVal2.setBounds(153, 308, 68, 21);
		contentPane.add(txtMultiVal2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("x");
		lblNewLabel_3_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2_1.setBounds(117, 311, 45, 15);
		contentPane.add(lblNewLabel_3_1_2_1);
		
		txtMultiVal1 = new JTextField();
		txtMultiVal1.setColumns(10);
		txtMultiVal1.setBounds(59, 308, 68, 21);
		contentPane.add(txtMultiVal1);
		
		JButton btnMulti = new JButton("확인");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val1 = txtMultiVal1.getText();
				String val2 = txtMultiVal2.getText();
				
				int a = Integer.parseInt(val1);
				int b = Integer.parseInt(val2);
				
				int result = a*b;
				String c = ""+result; // int를 String으로 바꾸기
				
				txtMultiResult.setText(c);
				
			}
		});
		btnMulti.setBounds(331, 307, 97, 23);
		contentPane.add(btnMulti);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("곱셈");
		lblNewLabel_3_2_1.setBounds(20, 311, 57, 15);
		contentPane.add(lblNewLabel_3_2_1);
		
		JButton btnDiv = new JButton("확인");
		// 나누기는 세 상자에 값을 넣고 맞는지 확인하는 dialog 를 띄우는 걸로 응용
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val1 = txtDivVal1.getText();
				String val2 = txtDivVal2.getText();
				String val3 = txtResultDiv.getText();
				
				int a = Integer.parseInt(val1);
				int b = Integer.parseInt(val2);
				int re = Integer.parseInt(val3);
				
				if(re == a/b) {
					JOptionPane.showMessageDialog(null,"맞았습니다! ");
				}else {
					JOptionPane.showMessageDialog(null,"틀렸습니다! ");
				}
			}
		});
		btnDiv.setBounds(331, 345, 97, 23);
		contentPane.add(btnDiv);
		
		txtResultDiv = new JTextField();
		txtResultDiv.setColumns(10);
		txtResultDiv.setBounds(251, 346, 68, 21);
		contentPane.add(txtResultDiv);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("=");
		lblNewLabel_3_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1_2.setBounds(212, 349, 45, 15);
		contentPane.add(lblNewLabel_3_1_1_1_2);
		
		txtDivVal2 = new JTextField();
		txtDivVal2.setColumns(10);
		txtDivVal2.setBounds(153, 346, 68, 21);
		contentPane.add(txtDivVal2);
	
		
		
		JLabel lblNewLabel_3_1_2_2 = new JLabel("/");
		lblNewLabel_3_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2_2.setBounds(117, 349, 45, 15);
		contentPane.add(lblNewLabel_3_1_2_2);
		
		txtDivVal1 = new JTextField();
		txtDivVal1.setColumns(10);
		txtDivVal1.setBounds(59, 346, 68, 21);
		contentPane.add(txtDivVal1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("나눗셈");
		lblNewLabel_3_2_2.setBounds(20, 349, 57, 15);
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("체크박스 실습");
		lblNewLabel_4.setBounds(20, 394, 107, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(20, 415, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(80, 415, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(139, 415, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(200, 415, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(260, 415, 57, 23);
		contentPane.add(chk5);
		
		JLabel lbResultCheck = new JLabel("결과 : ");
		lbResultCheck.setBounds(20, 444, 250, 15);
		contentPane.add(lbResultCheck);
		
		//체크박스 옆 확인 버튼의 기능 : 체크한 도시를 리스트에 넣어서 결과에 내보내기
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				lbResultCheck.setText("결과 : "+cities);
			
			}
		});
		btnCheck.setBounds(326, 415, 87, 23);
		contentPane.add(btnCheck);
		
		JLabel lbTableTest = new JLabel("테이블 실습");
		lbTableTest.setBounds(20, 480, 97, 15);
		contentPane.add(lbTableTest);
		
		table = new JTable();
		table.setBounds(20, 505, 345, 202);
		contentPane.add(table);
		
		String[] columnNames = {"아이디","이름","나이","휴대폰"};
		
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		model.setRowCount(0);
		table.setModel(model);
		
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101","김유신",23,"010-1234-1001"));
				persons.add(new Person("a102","김춘추",21,"010-1234-1002"));
				persons.add(new Person("a103","장보고",33,"010-1234-1003"));
				persons.add(new Person("a104,","강감찬",43,"010-1234-1004"));
				persons.add(new Person("a105","이순신",53,"010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(),person.getName(),person.getAge(),person.getHp()};
					model.addRow(rowData);
				}
			}
		});
		btnTable.setBounds(20, 717, 97, 23);
		contentPane.add(btnTable);
		

		}
}
