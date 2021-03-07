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

	private Image background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG forest.jpg")).getImage();	// �̹����� ��� ��ü
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/menuBar.png")));
	private JLabel hbb_merong = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_merong.gif")));
	private JLabel hbb_sad = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_sad.gif")));
	private JLabel hbb_dead = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_dead.gif")));
	private JLabel guard = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/guard.png")));
	private JLabel buy_off = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/buy off.gif")));
	private JLabel boss = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/boss.gif")));
	private JLabel boss_atack = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/boss_atack.gif")));
	private JLabel coin = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/coin.png")));
	
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
		setTitle("Title"); 		//Ÿ��Ʋ
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); 	//â ũ�� ����
		setResizable(false); 		//â ũ�� ���Ƿ� ���� �Ұ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//���α׷� ����� ����Ʈ������
		setLocationRelativeTo(null);	//�ʱ� â ���� �� ����� ����
		setUndecorated(true);			//�⺻ �޴��� ��� ����
		setVisible(true); 				//â ���������� ���
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		hbb_merong.setBounds(200, 300, 128, 128);
		add(hbb_merong);
		
		next1.setVisible(false);
		next2.setVisible(false);
		next3.setVisible(false);
		next4.setVisible(false);
		next5.setVisible(false);
		next6.setVisible(false);
		next7.setVisible(false);
		next8.setVisible(false);
		next9.setVisible(false);
		next10.setVisible(false);
		
		
		
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
				System.exit(0);		//exitButton Ŭ�������� ���α׷� ����
			}
		});
		add(exitButton);		//�޴��� ������ ��ġ�� ���� ��ư. hover �ÿ� �Ķ������� �ٲ�
		
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
				System.exit(0);		//Ŭ�������� ���α׷� ����
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
				//Į ��ư �̺�Ʈ ó��
			}
		});
		add(swordButton);		//Į ���� ��ư. hover�� ���µ� ���� �Ϸ�
		
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
				//�Ӵ� ���� ��ư �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG forest 1.png")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);
				coin.setBounds(210, 310, 32, 32);
				add(coin);
				next1.setVisible(true);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false);
			}
		});
		add(moneyButton);		//�Ӵ� ���� ��ư. hover�� ���µ� ���� �Ϸ�
		
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
				//�̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate 1.png")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);				
				guard.setBounds(900, 300, 128, 128);
				add(guard);
				next2.setVisible(true);
				next1.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false);
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
				//�̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate 2.png")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);				
				guard.setBounds(900, 300, 128, 128);
				add(guard);
				next3.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false);
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
				//�̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate.jpg")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);
				hbb_merong.setVisible((false));
				coin.setVisible((false));
				guard.setVisible((false));
				buy_off.setBounds(500, 450, 256, 128);
				add(buy_off);
				next4.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false);
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
				//�̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate 3.png")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);	
				buy_off.setVisible(false);
				hbb_merong.setVisible(true);
				guard.setVisible((true));
				coin.setVisible(true);
				next5.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false);
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
				//�̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate 4.png")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);
				next6.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false);
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
				//�̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG final 1.png")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);
				guard.setVisible(false);
				boss.setBounds(900, 300, 128, 128);
				add(boss);
				next7.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false);
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
				//�̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG final 2.png")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);
				boss.setVisible(false);
				boss_atack.setBounds(900, 300, 256, 128);
				add(boss_atack);
				next8.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false);
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
				//�̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG final 3.png")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);
				hbb_merong.setVisible(false);
				hbb_sad.setBounds(200, 300, 128, 128);
				add(hbb_sad);
				next9.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next10.setVisible(false);
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
				//�̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG final 4.png")).getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false);
				hbb_sad.setVisible(false);
				coin.setVisible(false);
				hbb_dead.setBounds(200, 300, 128, 128);
				add(hbb_dead);
				next10.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
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
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/gameover.png")).getImage(); //�Ӵ� ��ư �����ϸ� ���ӿ���		
				swordButton.setVisible(false);
				moneyButton.setVisible(false);	//��ư ����
				boss_atack.setVisible(false);
				hbb_dead.setVisible(false);
				add(endingButton);	//���� ��ư ����
			}
		});
		add(next10);	
		

		menuBar.setBounds(0, 0, 1280, 30);		//�޴� �� ��ġ ����
		
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { 	//���콺�� Ŭ���������� ��ġ �� �ҷ��ͼ� ������ �־���
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

	   public void paint(Graphics g) {       //ȭ���� �׷��ִ� �Լ�. ������ ������ Ư�� ���ǿ��� �ٲ��� ����
		      screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);    //ȭ�� ũ�⸸ŭ �̹��� ����
		      screenGraphic = screenImage.getGraphics();
		      screenDraw(screenGraphic);          //�̹����� ���ϴ� ���� �׷���
		      g.drawImage(screenImage, 0, 0, null);    //screenImage�� (0,0) ��ġ�� �׷���
		   }

		   public void screenDraw(Graphics g) {
		      g.drawImage(background, 0, 0, null);
		      paintComponents(g);
		      this.repaint();
		   }         //��� �̹��� ����

		}