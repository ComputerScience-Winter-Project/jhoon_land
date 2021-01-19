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
		setTitle("Move Images through Mouse Pressing");	//Ÿ��Ʋ
		setSize(1080, 720);	//â ũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//���α׷� ����
		setLocationRelativeTo(null);	//â ��ġ �� ����� ����
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		img1 = new ImageIcon("images/SWORD.png");	//SWORD �̹��� �ҷ�����
		background = new ImageIcon("images/BACK.jpg");	//BACK ��� �ҷ�����
		l1 = new JLabel(img1);	//l1 ������ SWORD �Ҵ�
		bg = new JLabel(background);	//bg ������ BACK �Ҵ�
		
		pane.addMouseListener(new MouseAdapter() {	
			@Override
			public void mousePressed(MouseEvent e) {	//���콺�� Ŭ�� �Ǿ��� ��,
				int x = e.getX();	//x��ǥ ���� x ������ �Ҵ�
				int y = e.getY();	//y��ǥ ���� y ������ �Ҵ�
				
				l1.setLocation(x, y);	//�Ҵ�� x, y ��ǥ�� SWORD�� ��ġ���� �Ҵ�
			}		
		});
		
		pane.add(l1);	//l1 �߰�
		pane.add(bg);	//��� �߰�
		setVisible(true);	//���̰Բ� ���ڰ� true�� ����		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveImage();
	}
	
}