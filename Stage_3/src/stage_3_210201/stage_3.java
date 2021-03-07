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

	private Image background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG forest.jpg")).getImage();	// 이미지를 담는 객체
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/menuBar.png")));
	private JLabel hbb_merong = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_merong.gif")));
	private JLabel hbb_sad = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_sad.gif")));
	private JLabel hbb_dead = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_dead.gif")));
	private JLabel guard = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/guard.png")));
	private JLabel buy_off = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/buy off.gif")));
	private JLabel boss = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/boss.gif")));
	private JLabel boss_atack = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/boss_atack.gif")));
	
	private ImageIcon exitButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/exitButton.png"));	
	private ImageIcon exitButton_hover = new ImageIcon(Main.class.getClassLoader().getResource("buttons/exitButton_hover.png"));
	private JButton exitButton = new JButton(exitButton_Basic);
	private ImageIcon moneyButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/moneyButton.png"));
	private ImageIcon moneyButton_hover = new ImageIcon(Main.class.getClassLoader().getResource("buttons/moneyButton_hover.png"));
	private JButton moneyButton = new JButton(moneyButton_Basic);
	private ImageIcon swordButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/swordButton.png"));
	private ImageIcon swordButton_hover = new ImageIcon(Main.class.getClassLoader().getResource("buttons/swordButton_hover.png"));	
	private JButton swordButton = new JButton(swordButton_Basic);
	private ImageIcon endingButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/exit.png"));
	private JButton endingButton = new JButton(endingButton_Basic);
	
	private ImageIcon next_1 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next1 = new JButton(next_1);
	private ImageIcon next_2 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next2 = new JButton(next_2);
	private ImageIcon next_3 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next3 = new JButton(next_3);
	private ImageIcon next_4 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next4 = new JButton(next_4);
	private ImageIcon next_5 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next5 = new JButton(next_5);
	private ImageIcon next_6 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next6 = new JButton(next_6);
	private ImageIcon next_7 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next7 = new JButton(next_7);
	private ImageIcon next_8 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next8 = new JButton(next_8);
	private ImageIcon next_9 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next9 = new JButton(next_9);
	private ImageIcon next_10 = new ImageIcon(Main.class.getClassLoader().getResource("buttons/right.png"));
	private JButton next10 = new JButton(next_10);
	
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
				
			}
		});
		add(moneyButton);		//머니 선택 버튼. hover된 상태도 구현 완료
		
		next1.setBounds(1150, 300, 100, 100);
		next1.setBorderPainted(false);
		next1.setContentAreaFilled(false);
		next1.setFocusPainted(false);
		next1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//이벤트 처리
			}
		});
		add(next1);
		
		next2.setBounds(1150, 300, 100, 100);
		next2.setBorderPainted(false);
		next2.setContentAreaFilled(false);
		next2.setFocusPainted(false);
		next2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//이벤트 처리
			}
		});
		add(next2);
		
		next3.setBounds(1150, 300, 100, 100);
		next3.setBorderPainted(false);
		next3.setContentAreaFilled(false);
		next3.setFocusPainted(false);
		next3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//이벤트 처리
			}
		});
		add(next3);
		
		next4.setBounds(1150, 300, 100, 100);
		next4.setBorderPainted(false);
		next4.setContentAreaFilled(false);
		next4.setFocusPainted(false);
		next4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next4.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//이벤트 처리
			}
		});
		add(next4);
		
		next5.setBounds(1150, 300, 100, 100);
		next5.setBorderPainted(false);
		next5.setContentAreaFilled(false);
		next5.setFocusPainted(false);
		next5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next5.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//이벤트 처리
			}
		});
		add(next5);
		
		next6.setBounds(1150, 300, 100, 100);
		next6.setBorderPainted(false);
		next6.setContentAreaFilled(false);
		next6.setFocusPainted(false);
		next6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next6.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//이벤트 처리
			}
		});
		add(next6);
		
		next7.setBounds(1150, 300, 100, 100);
		next7.setBorderPainted(false);
		next7.setContentAreaFilled(false);
		next7.setFocusPainted(false);
		next7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next7.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next7.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//이벤트 처리
			}
		});
		add(next7);
		
		next8.setBounds(1150, 300, 100, 100);
		next8.setBorderPainted(false);
		next8.setContentAreaFilled(false);
		next8.setFocusPainted(false);
		next8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next8.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next8.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//이벤트 처리
			}
		});
		add(next8);
		
		next9.setBounds(1150, 300, 100, 100);
		next9.setBorderPainted(false);
		next9.setContentAreaFilled(false);
		next9.setFocusPainted(false);
		next9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next9.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next9.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//이벤트 처리
			}
		});
		add(next9);
		
		
		next10.setBounds(1150, 300, 100, 100);
		next10.setBorderPainted(false);
		next10.setContentAreaFilled(false);
		next10.setFocusPainted(false);
		next10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				next10.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				next10.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				boss.setBounds(320, 185, 128, 128);
				add(boss);		//머니 버튼 선택했을때, 보오스 등장
				hbb_dead.setBounds(840, 378, 128, 128);
				add(hbb_dead);
				add(endingButton);	//엔딩 버튼 삽입
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/gameover.png")).getImage(); //머니 버튼 선택하면 게임오버		
				swordButton.setVisible(false);
				moneyButton.setVisible(false);	//버튼 삭제	
			}
		});
		add(next10);
		
		

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