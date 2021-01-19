package MoveImage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MoveImage extends JFrame {

	JLabel l1;
	JLabel bg;
	ImageIcon img1;
	ImageIcon background;
	
	public MoveImage() {
		setTitle("Move Images through Mouse Pressing");	//타이틀
		setSize(1080, 720);	//창 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//프로그램 종료
		setLocationRelativeTo(null);	//창 위치 정 가운데에 설정
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		img1 = new ImageIcon("images/SWORD.png");	//SWORD 이미지 불러오기
		background = new ImageIcon("images/BACK.jpg");	//BACK 배경 불러오기
		l1 = new JLabel(img1);	//l1 변수에 SWORD 할당
		bg = new JLabel(background);	//bg 변수에 BACK 할당
		
		pane.addMouseListener(new MouseAdapter() {	
			@Override
			public void mousePressed(MouseEvent e) {	//마우스가 클릭 되었을 때,
				int x = e.getX();	//x좌표 값을 x 변수에 할당
				int y = e.getY();	//y좌표 값을 y 변수에 할당
				
				l1.setLocation(x, y);	//할당된 x, y 좌표를 SWORD의 위치값에 할당
			}		
		});
		
		pane.add(l1);	//l1 추가
		pane.add(bg);	//배경 추가
		setVisible(true);	//보이게끔 인자값 true로 설정		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveImage();
	}
	
}