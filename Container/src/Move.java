import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Move extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public static final int BACK_WIDTH = 616;
	public static final int BACK_HEIGHT = 461;
	public static final int PENGUIN_SIZE = 60;
	
	Image background;
	Image[] penguins;
	
	public int penguinNo;
	public int penguinX, penguinY;
	
	public Move(String title) {
		super(title);
		
		background = new ImageIcon(getClass().getResource("../images/BACK.jpg")).getImage();
		
		penguins = new Image[3];
		for (int i = 0; i < penguins.length; i++) 
			penguins[i] = new ImageIcon(getClass().getResource("../images/SWORD 512x"+(i+1)+".png")).getImage();
			
		penguinNo = 0;
		penguinX = BACK_WIDTH / 2-PENGUIN_SIZE/2;
		penguinY = BACK_HEIGHT-PENGUIN_SIZE;
		
		addKeyListener(new penguinHandler());
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(350, 100, 616, 461);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawImage(background, 0, 0, BACK_WIDTH, BACK_HEIGHT, this);
		
		g.drawImage(penguins[penguinNo], penguinX, penguinY, PENGUIN_SIZE, PENGUIN_SIZE, this);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Move("TITLE");
	}
	
	public class penguinHandler implements KeyListener {
		
		@Override
		public void keyTyped(KeyEvent e) {			
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			switch (keycode) {
			case KeyEvent.VK_LEFT:
				penguinX-=10;
				if (penguinX < 0)
					penguinX = 0;
				penguinNo++;
				penguinNo%=3;
				repaint();
				break;
			case KeyEvent.VK_RIGHT:
				penguinX+=10;
				if (penguinX > BACK_WIDTH-PENGUIN_SIZE)
					penguinX = BACK_WIDTH-PENGUIN_SIZE;
				penguinNo++;
				penguinNo%=3;
				repaint();
				break;				
			}
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		
	}

}
