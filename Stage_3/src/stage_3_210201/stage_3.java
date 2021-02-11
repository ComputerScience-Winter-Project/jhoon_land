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

	private Image background = new ImageIcon(Main.class.getClassLoader().getResource("images/background.jpg")).getImage();	// 이미지를 담는 객체
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/menuBar.png")));
	private JLabel boss = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/boss.gif")));
	private JLabel hbb_merong = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_merong.gif")));
	private JLabel hbb_sad = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_sad.gif")));
	private JLabel ssung = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/ssung.png")));
	
	private ImageIcon exitButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/exitButton.png"));	
	private ImageIcon exitButton_hover = new ImageIcon(Main.class.getClassLoader().getResource("buttons/exitButton_hover.png"));
	private ImageIcon moneyButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/moneyButton.png"));
	private ImageIcon moneyButton_hover = new ImageIcon(Main.class.getClassLoader().getResource("buttons/moneyButton_hover.png"));
	private ImageIcon swordButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/swordButton.png"));
	private ImageIcon swordButton_hover = new ImageIcon(Main.class.getClassLoader().getResource("buttons/swordButton_hover.png"));	
	private ImageIcon rightButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private ImageIcon leftButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/left.png"));
	private ImageIcon endingButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/exit.png"));
	
	private JButton exitButton = new JButton(exitButton_Basic);
	private JButton moneyButton = new JButton(moneyButton_Basic);
	private JButton swordButton = new JButton(swordButton_Basic);
	private JButton rightButton = new JButton(rightButton_Basic);
	private JButton leftButton = new JButton(leftButton_Basic);
	private JButton endingButton = new JButton(endingButton_Basic);
	
	private int mouseX, mouseY;

	public stage_3() {		
		setTitle("Title"); 		//타이틀
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); 	//창 크기 설정
		setResizable(false); 		//창 크기 임의로 변경 불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//프로그램 종료시 디폴트값으로
		setLocationRelativeTo(null);	//초기 창 위기 정 가운데로 설정
		setUndecorated(true);			//기본 메뉴바 출력 안함
		setVisible(true); 				//창 정상적으로 출력
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
				System.exit(0);		//exitButton 클릭했을때 프로그램 종료
			}
		});
		add(exitButton);		//메뉴바 우측에 위치한 종료 버튼. hover 시에 파란색으로 바뀜
		
		endingButton.setBounds(1200, 650, 60, 60);
		endingButton.setBorderPainted(false);
		endingButton.setContentAreaFilled(false);
		endingButton.setFocusPainted(false);
		endingButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				endingButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);		//클릭했을때 프로그램 종료
			}
		});

		
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
				//칼 버튼 이벤트 처리
				hbb_merong.setBounds(300, 300, 128, 128);
				add(hbb_merong);		//칼 버튼 클릭했을때, 호빵이 등장
				ssung.setBounds(840, 378, 128, 128);
				add(ssung);
				add(endingButton);	//엔딩 버튼 삽입
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/happyending.jpg")).getImage(); //칼 버튼 선택하면 해피엔딩
				rightButton.setVisible(false);
				leftButton.setVisible(false);
				swordButton.setVisible(false);
				moneyButton.setVisible(false);	//버튼 삭제
			}
		});
		add(swordButton);		//칼 선택 버튼. hover된 상태도 구현 완료
		
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
				//머니 선택 버튼 이벤트 처리
				boss.setBounds(320, 185, 128, 128);
				add(boss);		//머니 버튼 선택했을때, 보오스 등장
				hbb_sad.setBounds(840, 378, 128, 128);
				add(hbb_sad);
				add(endingButton);	//엔딩 버튼 삽입
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/gameover.png")).getImage(); //머니 버튼 선택하면 게임오버
				rightButton.setVisible(false);
				leftButton.setVisible(false);				
				swordButton.setVisible(false);
				moneyButton.setVisible(false);	//버튼 삭제				
			}
		});
		add(moneyButton);		//머니 선택 버튼. hover된 상태도 구현 완료
		
		rightButton.setBounds(1150, 300, 100, 100);
		rightButton.setBorderPainted(false);
		rightButton.setContentAreaFilled(false);
		rightButton.setFocusPainted(false);
		rightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//right 버튼 이벤트 처리
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG 1.jpg")).getImage();		//배경 교체
				swordButton.setVisible(false);
				moneyButton.setVisible(false);
				hbb_merong.setVisible(false);
				boss.setVisible(false);		//기존의 버튼과 캐릭터들 삭제
				add(endingButton);	//엔딩 버튼 삽입
			}
		});
		add(rightButton);
		
		leftButton.setBounds(30, 300, 100, 100);
		leftButton.setBorderPainted(false);
		leftButton.setContentAreaFilled(false);
		leftButton.setFocusPainted(false);
		leftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//left 버튼 이벤트 처리
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG 2.jpg")).getImage();		//배경 교체
				swordButton.setVisible(false);
				moneyButton.setVisible(false);
				hbb_merong.setVisible(false);
				boss.setVisible(false);		//기존의 버튼과 캐릭터들 삭제
				add(endingButton);	//엔딩 버튼 삽입
			}
		});
		add(leftButton);	
		

		menuBar.setBounds(0, 0, 1280, 30);		//메뉴 바 위치 설정
		
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { 	//마우스가 클릭됐을때의 위치 값 불러와서 변수에 넣어줌
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);	//마우스가 드래그되면 실시간으로 현재 위치값에서 빼줌
			}
		});		
		add(menuBar);		//메뉴바를 드래그 했을때에 전체 창이 이동되도록 구현	
		
	}	

	   public void paint(Graphics g) {       //화면을 그려주는 함수. 정적인 것으로 특정 조건에서 바뀌지 않음
		      screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);    //화면 크기만큼 이미지 생성
		      screenGraphic = screenImage.getGraphics();
		      screenDraw(screenGraphic);          //이미지에 원하는 내용 그려줌
		      g.drawImage(screenImage, 0, 0, null);    //screenImage를 (0,0) 위치에 그려줌
		   }

		   public void screenDraw(Graphics g) {
		      g.drawImage(background, 0, 0, null);
		      paintComponents(g);
		      this.repaint();
		   }         //배경 이미지 구현

		}