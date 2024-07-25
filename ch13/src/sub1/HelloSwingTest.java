package sub1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 날짜 : 2024/07/25
 * 이름 : 황수빈
 * 내용 : GUI 프로그래밍
 */

public class HelloSwingTest {
	
	public static void main(String[] args) {
		
		// 윈도우 생성
		JFrame frame = new JFrame("HelloSwing!");
		frame.setPreferredSize(new Dimension(300,200)); //px 단위임
		frame.setLayout(null);
		frame.pack();
		frame.setVisible(true);
		
		
		// 컨테이너 생성
		Container container = frame.getContentPane();
		
		// 컴포넌트 배치
		
		JLabel label = new JLabel("Hello Swing!");
		label.setBounds(10,10,100,100);
		container.add(label);
		
		JButton button = new JButton("확인");
		button.setBounds(100,100,100,100);
		container.add(button);
		
		
	}
}
