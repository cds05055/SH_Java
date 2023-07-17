package com.kh.day14.swing.component;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Exam_JList extends JFrame{
	private String [] fruits = {"apple", "banana", "kiwi", "mango"
			, "pear", "peach", "berry", "strawberry", "blackberry"};
	private ImageIcon [] images = {
		new ImageIcon("images/home.png"),
		new ImageIcon("images/search.png"),
		new ImageIcon("images/signal.png"),
		new ImageIcon("images/key.png")
	};
	private JScrollPane scrollPane;
	public Exam_JList() {
		super("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imgList = new JList<ImageIcon>();
		imgList.setListData(images);
		c.add(imgList);
		
		JList<String> scrollList = new JList<String>(fruits);
		scrollPane = new JScrollPane(scrollList);
		c.add(scrollPane);
//		c.add(new JScrollPane(strList)); 
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_JList();
	}
}
