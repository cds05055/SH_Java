package com.kh.day14.swing.component.exercise;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Exercise_SliderChangeEvent extends JFrame{
	private JLabel colorLabel;
	private JSlider [] sliders;
	
	public Exercise_SliderChangeEvent() {
		super("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		colorLabel = new JLabel("SLIDER EXAMPLE");	// 슬라이더를 변화시켜서 바뀐 색상을 나타냄
		sliders = new JSlider[3];					// 슬라이더 갯수가 3개라 객체배열로 선언
		for(int i = 0; i < sliders.length; i++) {
			sliders[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128); // 수평모양, 최소 0, 최대 255, 시작값 128인 슬라이더 생성
			sliders[i].setPaintLabels(true);	// 숫자
			sliders[i].setPaintTicks(true);		// 눈금
			sliders[i].setMajorTickSpacing(50);	// 중간 단위 눈금
			sliders[i].setMinorTickSpacing(10);	// 최소 눈금
			sliders[i].addChangeListener(new ChangeListener() {
				// 슬라이더가 Change될 때 발생하는 이벤트 감지
				@Override
				public void stateChanged(ChangeEvent e) {
					int r = sliders[0].getValue();	// 슬라이더의 해당하는 값(숫자)
					int g = sliders[1].getValue();
					int b = sliders[2].getValue();
					colorLabel.setOpaque(true);		// 불투명도 설정
					// 라벨의 배경색을 변경된 슬라이더의 RGB값으로 변경하여 컬러픽커처럼 보이게 함
					colorLabel.setBackground(new Color(r, g, b));
				}
			});
			c.add(sliders[i]);
		}
		
		// 글씨색 설정
		sliders[0].setForeground(Color.RED);
		sliders[1].setForeground(Color.GREEN);
		sliders[2].setForeground(Color.BLUE);
		c.add(colorLabel);
		
		setSize(300, 230);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exercise_SliderChangeEvent();
	}
}
