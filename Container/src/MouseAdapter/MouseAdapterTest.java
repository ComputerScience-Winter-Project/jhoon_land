package MouseAdapter;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterTest extends JFrame {
	JLabel lbl;
	
	public MouseAdapterTest() {
		setTitle("Mouse Adapter Test");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lbl = new JLabel("¡÷¿Œ∞¯");
		Container c = getContentPane();
		c.setLayout(null);
		lbl.setSize(50, 20);
		lbl.setLocation(10, 10);
		c.add(lbl);
		
		c.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				lbl.setLocation(x, y);
			}
		}
		);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterTest();
	}

}
