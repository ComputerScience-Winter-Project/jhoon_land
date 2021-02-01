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

	ImageIcon _l1 = new ImageIcon("images/SWORD.png");	//SWORD �̹��� �ҷ�����
	ImageIcon _bg = new ImageIcon("images/BACK.jpg");	//BACK ��� �ҷ�����
	ImageIcon _menu = new ImageIcon("images/menuBar.png");
	ImageIcon _hbb = new ImageIcon("images/hobbang.gif");
	JLabel l1 = new JLabel(_l1);	//l1 ������ SWORD �Ҵ�
	JLabel bg = new JLabel(_bg);	//bg ������ BACK �Ҵ�
	JLabel menu = new JLabel(_menu);
	JLabel hbb = new JLabel(_hbb);
	
	public MoveImage() {
		setTitle("Title");	//Ÿ��Ʋ
		setSize(1600, 900);	//â ũ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//���α׷� ����
		setLocationRelativeTo(null);	//â ��ġ �� ����� ����
		setUndecorated(true);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.addMouseListener(new MouseAdapter() {	
			@Override
			public void mousePressed(MouseEvent e) {	//���콺�� Ŭ�� �Ǿ��� ��,
				int x = e.getX();	//x��ǥ ���� x ������ �Ҵ�
				int y = e.getY();	//y��ǥ ���� y ������ �Ҵ�
				
				l1.setLocation(x, y);	//�Ҵ�� x, y ��ǥ�� SWORD�� ��ġ���� �Ҵ�
			}		
		});
		
		hbb.setBounds(0, 0, 128, 128);
		
		add(l1);	//l1 �߰�
		//pane.add(menu);
		add(hbb);
		add(bg);	//��� �߰�		

		setVisible(true);	//���̰Բ� ���ڰ� true�� ����		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveImage();
	}
}