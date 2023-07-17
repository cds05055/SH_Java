package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Exam_JColorChooser extends JFrame{
	private JLabel label;
	public Exam_JColorChooser() {
		label = new JLabel("Hello");
		setTitle("JColorChoose 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		
		setSize(250, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Text");				// text
		JMenuItem item = new JMenuItem("color");	// text 아래 color
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color chosenColor = 	// Color type으로 리턴
				JColorChooser.showDialog(null, "ColorPicker", Color.YELLOW);
				if(chosenColor != null) {	// 선택한 색이 null값이 아니면
					label.setForeground(chosenColor);	// 선택한 색으로 변경
				}
			}
		});
		menu.add(item);
		menuBar.add(menu);
		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		new Exam_JColorChooser();
	}

}
