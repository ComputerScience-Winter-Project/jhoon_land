package stage_3_210201;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class stage_3 extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;

	private Image introBackground = new ImageIcon(Main.class.getClassLoader().getResource("images/background.jpg")).getImage();	// �̹����� ��� ��ü
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/menuBar.png")));
	
	private ImageIcon exitButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("images/exitButton.png"));	
	private ImageIcon exitButton_hover = new ImageIcon(Main.class.getClassLoader().getResource("images/exitButton_hover.png"));
	private ImageIcon moneyButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("images/moneyButton.png"));
	private ImageIcon moneyButton_hover = new ImageIcon(Main.class.getClassLoader().getResource("images/moneyButton_hover.png"));
	private ImageIcon swordButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("images/swordButton.png"));
	private ImageIcon swordButton_hover = new ImageIcon(Main.class.getClassLoader().getResource("images/swordButton_hover.png"));
	
	private JButton exitButton = new JButton(exitButton_Basic);
	private JButton moneyButton = new JButton(moneyButton_Basic);
	private JButton swordButton = new JButton(swordButton_Basic);
	
	private int mouseX, mouseY;

	public stage_3() {		
		setTitle("Title"); // ���α׷� �̸�
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // ���� â ũ��
		setResizable(false); // â ũ�� ������ ���� �Ұ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//���α׷� ����
		setLocationRelativeTo(null);	//â ��ġ �� ����� ����
		setUndecorated(true);	//�⺻ �޴��� ��� ����
		setVisible(true); // â ���������� ���
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		
		exitButton.setBounds(1250, 5, 20, 20);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButton_hover);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButton_Basic);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		add(exitButton);		//�޴��� ������ ��ġ�� ���� ��ư. hover �ÿ� �Ķ������� �ٲ�
		
		moneyButton.setBounds(700, 500, 500, 100);
		moneyButton.setBorderPainted(false);
		moneyButton.setContentAreaFilled(false);
		moneyButton.setFocusPainted(false);
		moneyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				moneyButton.setIcon(moneyButton_hover);
				moneyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				moneyButton.setIcon(moneyButton_Basic);
				moneyButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//Į ���� ��ư �̺�Ʈ ó��
			}
		});
		add(moneyButton);		//Į ���� ��ư. hover�� ���µ� ���� �Ϸ�
		
		swordButton.setBounds(100, 500, 500, 100);
		swordButton.setBorderPainted(false);
		swordButton.setContentAreaFilled(false);
		swordButton.setFocusPainted(false);
		swordButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				swordButton.setIcon(swordButton_hover);
				swordButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				swordButton.setIcon(swordButton_Basic);
				swordButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//�Ӵ� ��ư �̺�Ʈ ó��
			}
		});
		add(swordButton);		//�Ӵ� ���� ��ư. hover�� ���µ� ���� �Ϸ�
		

		menuBar.setBounds(0, 0, 1280, 30);		//�޴� �� ��ġ ����
		
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { //���콺�� Ŭ���������� ��ġ �� �ҷ��ͼ� ������ �־���
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);	//���콺�� �巡�׵Ǹ� �ǽð����� ���� ��ġ������ ����
			}
		});		
		add(menuBar);		//�޴��ٸ� �巡�� �������� ��ü â�� �̵��ǵ��� ����

	}

	public void paint(Graphics g) { // ȭ���� �׷��ִ� �Լ�, ��ӵ� ������ �ٲ��� ����
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // ȭ�� ũ�⸸ŭ �̹��� ����
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // �̹����� ���ϴ� ������ �׷���
		g.drawImage(screenImage, 0, 0, null); // screenImage�� (0,0) ��ġ�� �׷���
	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}

}