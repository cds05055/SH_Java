package com.kh.day15.swing.exercise;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog{
	private JTextField field;
	private JButton btn;
	public MyModalDialog() {}
	public MyModalDialog(JFrame frame, String title, JButton jBtn) {
		super(frame, title);
		setLayout(new FlowLayout());
		field = new JTextField(10);
		add(field);
		btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {	// OK 버튼 눌렀을 때
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);				// OK 버튼 누르면 다이얼로그 사라짐
				jBtn.setText(field.getText()); 	// field에 입력된 값으로 jBtn에 set
				field.setText("");		// 다이얼로그 호출될 때 필드를 비워줌
			}
		});
		add(btn);
		setSize(200, 100);
		
	}
	
	public String getInput() {
		if(field.getText().length() == 0) {
			// 길이가 0이라면 아무것도 입력 되지 않은 상태라
			// null값 return
			return null;
		}else {
			// 아니라면 field에 텍스트를 리턴
			return field.getText();
		}
	}
}

public class Exercise_DialogSetText extends JFrame {
	private MyModalDialog dialog;
	
	public Exercise_DialogSetText() {
		super("다이얼로그 텍스트 세팅 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Nomal Dialog");
		btn.setSize(200, 50);
		btn.setLocation(20, 50);
		dialog = new MyModalDialog(this, "Show Modal Dialog", btn);	
		btn.addActionListener(new ActionListener() {		// 버튼 클릭 시 다이얼 로그 생김
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
//				String text = dialog.getInput();
//				if(text == null) return;
//				JButton btn = (JButton)e.getSource();
//				btn.setText(text);
			}
		});
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(btn);
		
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise_DialogSetText();
	}

}
