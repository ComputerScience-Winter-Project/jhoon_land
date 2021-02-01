package MoveImage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveImage extends JFrame {

	ImageIcon _l1 = new ImageIcon("images/SWORD.png");	//SWORD 이미지 불러오기
	ImageIcon _bg = new ImageIcon("images/BACK.jpg");	//BACK 배경 불러오기
	ImageIcon _menu = new ImageIcon("images/menuBar.png");
	ImageIcon _hbb = new ImageIcon("images/hobbang.gif");
	JLabel l1 = new JLabel(_l1);	//l1 변수에 SWORD 할당
	JLabel bg = new JLabel(_bg);	//bg 변수에 BACK 할당
	JLabel menu = new JLabel(_menu);
	JLabel hbb = new JLabel(_hbb);
	
	public MoveImage() {
		setTitle("Title");	//타이틀
		setSize(1600, 900);	//창 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//프로그램 종료
		setLocationRelativeTo(null);	//창 위치 정 가운데에 설정
		setUndecorated(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.addMouseListener(new MouseAdapter() {	
			@Override
			public void mousePressed(MouseEvent e) {	//마우스가 클릭 되었을 때,
				int x = e.getX();	//x좌표 값을 x 변수에 할당
				int y = e.getY();	//y좌표 값을 y 변수에 할당
				
				l1.setLocation(x, y);	//할당된 x, y 좌표를 SWORD의 위치값에 할당
			}		
		});
		
		hbb.setBounds(0, 0, 128, 128);
		
		add(l1);	//l1 추가
		//pane.add(menu);
		add(hbb);
		add(bg);	//배경 추가		

		setVisible(true);	//보이게끔 인자값 true로 설정		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveImage();
	}
}