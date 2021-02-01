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

	private Image introBackground = new ImageIcon(Main.class.getClassLoader().getResource("images/background.jpg")).getImage();	// 이미지를 담는 객체
	
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
		setTitle("Title"); // 프로그램 이름
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 게임 창 크기
		setResizable(false); // 창 크기 임의적 변경 불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//프로그램 종료
		setLocationRelativeTo(null);	//창 위치 정 가운데에 설정
		setUndecorated(true);	//기본 메뉴바 출력 안함
		setVisible(true); // 창 정상적으로 출력
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
		add(exitButton);
		
		moneyButton.setBounds(100, 500, 500, 100);
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
				//칼 선택 버튼 이벤트 처리
			}
		});
		add(moneyButton);
		
		swordButton.setBounds(700, 500, 500, 100);
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
				//머니 버튼 이벤트 처리
			}
		});
		add(swordButton);
		

		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { // 마우스를 눌렀을 때
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});		
		add(menuBar);

	}

	public void paint(Graphics g) { // 화면을 그려주는 함수, 약속된 것으로 바뀌지 않음
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 화면 크기만큼 이미지 생성
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // 이미지에 원하는 내용을 그려줌
		g.drawImage(screenImage, 0, 0, null); // screenImage를 (0,0) 위치에 그려줌
	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}

}