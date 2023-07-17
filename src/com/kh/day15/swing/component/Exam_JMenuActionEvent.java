package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuActionEvent extends JFrame{
	private JLabel imgLabel;
	
	public Exam_JMenuActionEvent() {
		
		setTitle("메뉴에 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();	// 컨텐츠팬
		imgLabel = new JLabel();		// 이미지 들어갈 라벨
		c.setLayout(new BorderLayout());// BorderLayout 사용(TOP, BOTTOM, LEFT, RIGHT, CENTER)
		c.add(imgLabel, BorderLayout.CENTER);
		setSize(250, 220);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();	// 메뉴 바 (최상위)
		JMenu screenMenu = new JMenu("screen");	// 메뉴
		String [] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		for(int i = 0; i < 4; i++) {
			JMenuItem menuItem = new JMenuItem(itemTitle[i]); // 메뉴 밑에 들어감
			menuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					switch(cmd) {	// if문보다 빠른 switch case문
						case "Load" : 
							// 이미지를 로드
							if(imgLabel.getIcon() != null) return;	// 이미 로딩되어 있다면 리턴
							imgLabel.setIcon(new ImageIcon("images/img.jpg"));
							break;
							
						case "Hide" : 
							// 이미지 숨기기
//							imgLabel.setIcon(null); // 이미지 자리 자체를 null
							imgLabel.setVisible(false); // 이미지 비활성화
							break;
							
						case "ReShow" : 
							// 이미지 다시 보여주기
							imgLabel.setVisible(true); // 이미지 활성화
							break;
							
						case "Exit" : 
							// 프로그램 종료
							System.exit(0); // 프로그램 종료
							break;
						
					}
				}
			});
			screenMenu.add(menuItem);
		}
//		screenMenu.add(new JMenuItem("Load"));
//		screenMenu.add(new JMenuItem("Hide"));
//		screenMenu.add(new JMenuItem("ReShow"));
//		screenMenu.add(new JMenuItem("Exit"));
		bar.add(screenMenu);
		setJMenuBar(bar);
		
	}
	
	public static void main(String[] args) {
		new Exam_JMenuActionEvent();
	}

}
