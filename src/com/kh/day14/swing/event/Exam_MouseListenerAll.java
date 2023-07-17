package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListenerAll extends JFrame{
	private JLabel la;
	
	public Exam_MouseListenerAll() {
		setTitle("Exam_MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la = new JLabel("No Mouse Event");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	private class MyMouseListener implements MouseListener, MouseMotionListener{
		// extends는 ,를 사용한 다중 상속 불가능

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.LIGHT_GRAY);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouserDragged(" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouserMoved(" + e.getX() + ", " + e.getY() + ")");
		}
		
	}
	
	public static void main(String[] args) {
		new Exam_MouseListenerAll();
	}
}

