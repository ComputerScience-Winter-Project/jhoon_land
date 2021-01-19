import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventTest  extends JFrame {
	JLabel lbl;
	int x = 150;
	int y = 150;
	
	public KeyEventTest() {
		setTitle("방향키로 움직이기");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lbl = new JLabel("주인공");
		Container c = getContentPane();
		c.setLayout(null);
		
		lbl.setBounds(x, y, 50, 20);
		c.add(lbl);
		
		setVisible(true);
		
		c.addKeyListener(new MyKeyListener());
		c.setFocusable(true);
		c.requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventTest();
	}
	
	class MyKeyListener implements KeyListener {
		
		@Override
		public void keyPressed(KeyEvent e) {
			Container c = (Container) e.getSource();
			
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				if (y - 10 < 0)
					y = 0;
				else
					y -= 10;
				lbl.setLocation(x, y);
				break;
			case KeyEvent.VK_DOWN:
				if (y + 10 > c.getHeight() - 20)
					y = c.getHeight() - 20;
				else
					y += 10;
				lbl.setLocation(x, y);
				break;
			case KeyEvent.VK_LEFT:
				if (x - 10 < 0)
					x = 0;
				else
					x -= 10;
				lbl.setLocation(x, y);
				break;
			case KeyEvent.VK_RIGHT:
				if (x + 10 > c.getWidth() - 30)
					x = c.getWidth() - 30;
				else
					x += 10;
				lbl.setLocation(x, y);
				break;
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			//키를 떼는 순간
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			//누른 키를 떼는 순간. Unicode키가 입력된 경우에만
		}
		
	}

}
