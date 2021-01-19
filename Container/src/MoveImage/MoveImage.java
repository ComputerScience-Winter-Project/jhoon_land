package MoveImage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MoveImage extends JFrame {

	JLabel l1;
	JLabel l2;
	ImageIcon img1;
	ImageIcon background;
	
	public MoveImage() {
		setTitle("Move Images through Mouse Pressing");
		setSize(1080, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		img1 = new ImageIcon("images/SWORD.png");
		background = new ImageIcon("images/BACK.jpg");
		l1 = new JLabel(img1);
		l2 = new JLabel(background);
		
		pane.addMouseListener(new MouseAdapter() {	
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				l1.setLocation(x, y);
			}		
		});
				
		pane.add(l1);
		pane.add(l2);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveImage();
	}

}