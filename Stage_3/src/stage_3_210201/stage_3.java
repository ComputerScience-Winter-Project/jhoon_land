package stage_3_210201;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Sword_1.Main;
import Sword_1.Music;

public class stage_3 extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;

	private Image background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG forest.jpg"))
			.getImage(); // �̹����� ��� ��ü

	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/menuBar.png")));
	private JLabel hbb_merong = new JLabel(
			new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_merong.gif")));
	private JLabel hbb_sad = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_sad.gif")));
	private JLabel hbb_dead = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/hbb_dead.gif")));
	private JLabel guard = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/guard.png")));
	private JLabel buy_off = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/buy off.gif")));
	private JLabel boss = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/boss.gif")));
	private JLabel boss_atack = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/boss_atack.gif")));
	private JLabel ssung = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/ssung.png")));
	private JLabel coin = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("images/coin.png"))); // ĳ����
																													// ����
	private ImageIcon exitButton_Basic = new ImageIcon(
			Main.class.getClassLoader().getResource("buttons/exitButton.png"));
	private ImageIcon exitButton_hover = new ImageIcon(
			Main.class.getClassLoader().getResource("buttons/exitButton_hover.png"));
	private JButton exitButton = new JButton(exitButton_Basic);
	private ImageIcon moneyButton_Basic = new ImageIcon(
			Main.class.getClassLoader().getResource("buttons/moneyButton.png"));
	private ImageIcon moneyButton_hover = new ImageIcon(
			Main.class.getClassLoader().getResource("buttons/moneyButton_hover.png"));
	private JButton moneyButton = new JButton(moneyButton_Basic);
	private ImageIcon swordButton_Basic = new ImageIcon(
			Main.class.getClassLoader().getResource("buttons/swordButton.png"));
	private ImageIcon swordButton_hover = new ImageIcon(
			Main.class.getClassLoader().getResource("buttons/swordButton_hover.png"));
	private JButton swordButton = new JButton(swordButton_Basic);
	private ImageIcon endingButton_Basic = new ImageIcon(Main.class.getClassLoader().getResource("buttons/exit.png"));
	private JButton endingButton = new JButton(endingButton_Basic); // �⺻ ���� ��ư ����

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
	private JButton next10 = new JButton(next_10); // ���� ��ư ����

	private int mouseX, mouseY, x = 100, y = 300;

	// sword
	private ImageIcon endingButtonImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/exit.png"));
	private ImageIcon undoButtonBasicImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/undobuttonbasic.png"));
	private ImageIcon undoButtonEnteredImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/undobuttonentered.png"));
	private ImageIcon fightButtonBasicImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/fightbuttonbasic.png"));
	private ImageIcon fightButtonEnteredImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/fightbuttonentered.png"));
	private ImageIcon runButtonBasicImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/runbuttonbasic.png"));
	private ImageIcon runButtonEnteredImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/runbuttonentered.png"));
	private ImageIcon attackButtonBasicImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/attackbuttonbasic.png"));
	private ImageIcon attackButtonEnteredImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/attackbuttonentered.png"));
	private ImageIcon healButtonBasicImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/healbuttonbasic.png"));
	private ImageIcon healButtonEnteredImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/healbuttonentered.png"));
	private ImageIcon turnButtonBasicImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/turnbuttonbasic.png"));
	private ImageIcon turnButtonEnteredImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/turnbuttonentered.png"));
	private ImageIcon nextButtonBasicImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/nextbuttonbasic.png"));
	private ImageIcon nextButtonEnteredImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/nextbuttonentered.png"));
	private ImageIcon talkButtonBasicImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/talkbuttonbasic.png"));
	private ImageIcon talkButtonEnteredImage = new ImageIcon(Main.class.getClassLoader().getResource("buttons/talkbuttonentered.png"));

	private ImageIcon hbb_basic = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_�⺻.gif"));
	private ImageIcon hbb_turn = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_������ȯ.gif"));
	private ImageIcon hbb_attackReady = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_�����غ�.gif"));
	private ImageIcon hbb_attackAction = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_���� loop.gif"));
	private ImageIcon hbb_heal = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_ġ��.gif"));
	private ImageIcon hbb_die = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_����.gif"));
	private ImageIcon hbb_hurt = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_����.gif"));
	private ImageIcon hbb_happy = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_�޷�.gif"));
	private ImageIcon hbb_dirty = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_��������.gif"));
	private ImageIcon hbb_turndirty = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_������ȯ����.gif"));
	private ImageIcon hbb_angry = new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_ȭ��.gif"));
	private ImageIcon guard_basic = new ImageIcon(Main.class.getClassLoader().getResource("images/�ܾ���.png"));
	private ImageIcon guard_attackAction = new ImageIcon(Main.class.getClassLoader().getResource("images/�ܾ���_���� loop.gif"));
	private ImageIcon guard_hurt = new ImageIcon(Main.class.getClassLoader().getResource("images/�ܾ���_����.png"));
	private ImageIcon lucky_basic = new ImageIcon(Main.class.getClassLoader().getResource("images/��Ű.png"));
	private ImageIcon boss_basic = new ImageIcon(Main.class.getClassLoader().getResource("images/������.png"));
	private ImageIcon boss_attackAction = new ImageIcon(Main.class.getClassLoader().getResource("images/������_���� loop.gif"));
	private ImageIcon boss_hurt = new ImageIcon(Main.class.getClassLoader().getResource("images/������_����.png"));
	private ImageIcon boss_die = new ImageIcon(Main.class.getClassLoader().getResource("images/������_����.gif"));
	private ImageIcon boss_heal = new ImageIcon(Main.class.getClassLoader().getResource("images/������_ġ��.gif"));

	private JLabel gameOver = new JLabel(
			new ImageIcon(Main.class.getClassLoader().getResource("buttons/gameover.png"))); // ���ӿ����۾�
	private JLabel win = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/win.png"))); // �¸��۾�
	private JLabel talk = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/talk1.png"))); // ��Ű����
																													// ��ȭ
	private JLabel hobbang = new JLabel(hbb_basic); // ȣ����
	// private JLabel guard = new JLabel(guard_basic); // �ܾ���
	private JLabel lucky = new JLabel(lucky_basic); // ��Ű
	// private JLabel boss = new JLabel(boss_basic); // �ܾ���

	private ImageIcon HPbar_die = new ImageIcon(Main.class.getClassLoader().getResource("buttons/HPbar_die.png"));
	private JLabel HP = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/HP.png"))); // ȣ���� HP
	private JLabel HPbar = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/HPbar.png")));
	private JLabel HP_O = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/HP.png"))); // ��� HP
	private JLabel HPbar_O = new JLabel(new ImageIcon(Main.class.getClassLoader().getResource("buttons/HPbar.png")));
	private int hp, hp_o;

	private JButton undoButton = new JButton(undoButtonBasicImage); // �ϴ� ���� �ǵ����� ��ư
	private JButton nextButton = new JButton(nextButtonBasicImage); // �ϴ� ���� NEXT ��ư
	private JButton fightButton = new JButton(fightButtonBasicImage); // guardEvent ������ �� Fight!
	private JButton runButton = new JButton(runButtonBasicImage); // guardEvent ������ �� Run away!
	private JButton attackButton = new JButton(attackButtonBasicImage); // battleEvent ������ �� Attack
	private JButton healButton = new JButton(healButtonBasicImage); // battleEvent ������ �� Heal
	private JButton turnButton = new JButton(turnButtonBasicImage); // ��� ���� ����
	private JButton talkButton = new JButton(talkButtonBasicImage); // ��Ű���� ��ȭ

	private boolean move = false, guardEvent = false, luckyEvent = false;
	private int talknum = 1, hptmp;

	private Random random = new Random();

	public stage_3() {
		setTitle("Title"); // Ÿ��Ʋ
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // â ũ�� ����
		setResizable(false); // â ũ�� ���Ƿ� ���� �Ұ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷� ����� ����Ʈ������
		setLocationRelativeTo(null); // �ʱ� â ���� �� ����� ����
		setUndecorated(true); // �⺻ �޴��� ��� ����
		setVisible(true); // â ���������� ���
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
		next10.setVisible(false); // ��ư �Ͻ������� ������ �ʰ�

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
				System.exit(0); // exitButton Ŭ�������� ���α׷� ����
			}
		});
		add(exitButton); // �޴��� ������ ��ġ�� ���� ��ư. hover �ÿ� �Ķ������� �ٲ�

		endingButton.setBounds(1200, 650, 60, 60);
		endingButton.setBorderPainted(false);
		endingButton.setContentAreaFilled(false);
		endingButton.setFocusPainted(false);
		endingButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				endingButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				endingButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0); // Ŭ�������� ���α׷� ����
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
				// Į ��ư �̺�Ʈ ó��
				hbb_merong.setVisible(false);
				Music buttonMusic = new Music("mouse.mp3", false);
				buttonMusic.start();
				swordEvent();
			}
		});
		add(swordButton); // Į ���� ��ư. hover�� ���µ� ���� �Ϸ�

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
				// �Ӵ� ���� ��ư �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG forest 1.png"))
						.getImage();
				swordButton.setVisible((false));
				moneyButton.setVisible(false); // ��� ó��
				coin.setBounds(210, 310, 32, 32);
				add(coin); // ȣ���̿��� ���� �ο�
				next1.setVisible(true);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false); // ��ư ó��
			}
		});
		add(moneyButton); // �Ӵ� ���� ��ư. hover�� ���µ� ���� �Ϸ�

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
				// �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate 1.png")).getImage(); // ���
																														// ó��
				guard.setBounds(900, 300, 128, 128);
				add(guard); // ��� ����
				next2.setVisible(true);
				next1.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false); // ��ư ó��
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
				// �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate 2.png")).getImage(); // ���
																														// ó��
				next3.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false); // ��ư ó��
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
				// �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate.jpg")).getImage(); // ���
																														// ó��
				hbb_merong.setVisible((false));
				coin.setVisible((false));
				guard.setVisible((false)); // ��ü �Ͻ��� ����
				buy_off.setBounds(500, 450, 256, 128);
				add(buy_off); // �ż��ϴ� ��� ����
				next4.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false); // ��ư ó��
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
				// �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate 3.png")).getImage(); // ���
																														// ó��
				buy_off.setVisible(false);
				hbb_merong.setVisible(true);
				guard.setVisible((true));
				coin.setVisible(true); // ĳ���� �����
				next5.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false); // ��ư ó��
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
				// �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate 4.png")).getImage(); // ���
																														// ó��
				next6.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false); // ��ư ó��
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
				// �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG final 1.png")).getImage(); // ���
																															// ó��
				guard.setVisible(false); // ��� ����
				boss.setBounds(900, 300, 128, 128);
				add(boss); // ������ ����
				next7.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false); // ��ư ó��
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
				// �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG final 2.png")).getImage(); // ���
																															// ó��
				boss.setVisible(false);
				boss_atack.setBounds(900, 300, 256, 128);
				add(boss_atack); // ������ ���� ���
				next8.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next9.setVisible(false);
				next10.setVisible(false); // ��ư ó��
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
				// �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG final 3.png")).getImage(); // ���
																															// ó��
				hbb_merong.setVisible(false);
				hbb_sad.setBounds(200, 300, 128, 128);
				add(hbb_sad); // ȣ���� ǥ�� ��ȭ
				next9.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next10.setVisible(false); // ��ư ó��
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
				// �̺�Ʈ ó��
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG final 4.png")).getImage(); // ���
																															// ó��
				hbb_sad.setVisible(false);
				coin.setVisible(false); // �� ��ü ����
				hbb_dead.setBounds(200, 300, 128, 128);
				add(hbb_dead); // ȣ���� ���
				next10.setVisible(true);
				next1.setVisible(false);
				next2.setVisible(false);
				next3.setVisible(false);
				next4.setVisible(false);
				next5.setVisible(false);
				next6.setVisible(false);
				next7.setVisible(false);
				next8.setVisible(false);
				next9.setVisible(false); // ��ư ó��
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
				background = new ImageIcon(Main.class.getClassLoader().getResource("images/gameover.png")).getImage(); // ���ӿ���
																														// ���
																														// ó��
				boss_atack.setVisible(false);
				hbb_dead.setVisible(false); // ĳ���� ���� ����
				next10.setVisible(false); // ���� ��ư ����
				add(endingButton); // ���� ��ư ����
			}
		});
		add(next10);

		menuBar.setBounds(0, 0, 1280, 30); // �޴� �� ��ġ ����

		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { // ���콺�� Ŭ���������� ��ġ �� �ҷ��ͼ� ������ �־���
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY); // ���콺�� �巡�׵Ǹ� �ǽð����� ���� ��ġ������ ����
			}
		});
		add(menuBar); // �޴��ٸ� �巡�� �������� ��ü â�� �̵��ǵ��� ����

	}

	public void swordEvent() { // nextButton
		background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG gate.jpg")).getImage();
		moneyButton.setVisible(false);
		swordButton.setVisible(false);
		move = true;
		guardEvent = true;

		Container c = getContentPane();
		c.setLayout(null);
		hobbang.setBounds(x, y, 128, 128);
		c.add(hobbang);
		c.addKeyListener(new MyKeyListener());
		c.setFocusable(true);
		c.requestFocus();

		guard.setBounds(640, 300, 128, 128);
		add(guard);
		guardEvent = true;

		nextButton.setVisible(false);
		nextButton.setBounds(1010, 530, 180, 100);
		nextButton.setBorderPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setFocusPainted(false);
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextButton.setIcon(nextButtonEnteredImage);
				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				nextButton.setIcon(nextButtonBasicImage);
				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music ButtonMusic = new Music("mouse.mp3", false);
				ButtonMusic.start();
				if (guardEvent) {
					HP.setVisible(false);
					HPbar.setVisible(false);
					HP_O.setVisible(false);
					HPbar_O.setVisible(false);
					win.setVisible(false);
					guard.setVisible(false);
					nextButton.setVisible(false);
					guardEvent = false;

					background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG luckey.jpg"))
							.getImage();
					hobbang.setIcon(hbb_dirty);
					x = 100;
					y = 300;
					hobbang.setBounds(x, y, 128, 128);
					lucky.setBounds(640, 290, 128, 128);
					add(lucky);
					move = true;
					luckyEvent = true;
				} else if (luckyEvent) {
					lucky.setVisible(false);
					talk.setVisible(false);
					talkButton.setVisible(false);
					nextButton.setVisible(false);
					luckyEvent = false;

					bossEvent();
				} else {
					win.setVisible(false);
					boss.setVisible(false);
					nextButton.setVisible(false);

					endingEvent();
				}
			}
		});
		add(nextButton);
	}

	public void guardEvent() { // undoButton, fightButton, runButton
		move = false;
		hobbang.setIcon(hbb_basic);
		hobbang.setBounds(512, 300, 128, 128);
		guard.setIcon(guard_basic);
		guard.setBounds(640, 300, 128, 128);
		gameOver.setVisible(false);
		gameOver.setBounds(405, 150, 470, 100);
		add(gameOver);
		fightButton.setVisible(true);
		runButton.setVisible(true);

		undoButton.setVisible(false);
		undoButton.setBounds(1180, 630, 60, 60);
		undoButton.setBorderPainted(false);
		undoButton.setContentAreaFilled(false);
		undoButton.setFocusPainted(false);
		undoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				undoButton.setIcon(undoButtonEnteredImage);
				undoButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				undoButton.setIcon(undoButtonBasicImage);
				undoButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonMusic = new Music("mouse.mp3", false);
				buttonMusic.start();
				if (guardEvent) {
					HP.setVisible(false);
					HPbar.setVisible(false);
					HP_O.setVisible(false);
					HPbar_O.setVisible(false);
					guardEvent();
				} else {
					undoButton.setVisible(false);
					gameOver.setVisible(false);
					bossEvent();
				}
			}
		});
		add(undoButton);

		fightButton.setBounds(411, 470, 458, 88);
		fightButton.setBorderPainted(false);
		fightButton.setContentAreaFilled(false);
		fightButton.setFocusPainted(false);
		fightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				fightButton.setIcon(fightButtonEnteredImage);
				fightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				fightButton.setIcon(fightButtonBasicImage);
				fightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonMusic = new Music("mouse.mp3", false);
				buttonMusic.start();
				fightButton.setVisible(false);
				runButton.setVisible(false);
				battleMode(guard);
			}
		});
		add(fightButton);

		runButton.setBounds(411, 570, 458, 88);
		runButton.setBorderPainted(false);
		runButton.setContentAreaFilled(false);
		runButton.setFocusPainted(false);
		runButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				runButton.setIcon(runButtonEnteredImage);
				runButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				runButton.setIcon(runButtonBasicImage);
				runButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonMusic = new Music("mouse.mp3", false);
				buttonMusic.start();
				fightButton.setVisible(false);
				runButton.setVisible(false);
				undoButton.setVisible(true);
				gameOver.setVisible(true);
				hobbang.setIcon(hbb_hurt);
				guard.setIcon(guard_attackAction);
				guard.setBounds(512, 300, 256, 128);
			}
		});
		add(runButton);

	}

	public void battleMode(JLabel opponent) {
		hobbang.setIcon(hbb_attackReady);
		hobbang.setBounds(490, 300, 256, 128);
		if (guardEvent) {
			hp = 106;
			hp_o = 106;
			guard.setIcon(guard_basic);
			guard.setBounds(662, 300, 128, 128);
			battleEvent(guard);
		} else {
			hp = 106;
			hp_o = 106;
			boss.setIcon(boss_basic);
			boss.setBounds(662, 300, 128, 128);
			battleEvent(boss);
		}

		hp = 106;
		hp_o = 106;

		HPbar.setVisible(true);
		HPbar.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("buttons/HPbar.png")));
		HPbar.setBounds(hobbang.getLocation().x + 6, hobbang.getLocation().y - 25, 116, 23);
		add(HPbar);
		HP.setVisible(true);
		HP.setBounds(hobbang.getLocation().x + 16, hobbang.getLocation().y - 25, hp, 23);
		add(HP);
		HPbar_O.setVisible(true);
		HPbar_O.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("buttons/HPbar.png")));
		HPbar_O.setBounds(opponent.getLocation().x + 6, opponent.getLocation().y - 25, 116, 23);
		add(HPbar_O);
		HP_O.setVisible(true);
		HP_O.setBounds(opponent.getLocation().x + 16, opponent.getLocation().y - 25, hp_o, 23);
		add(HP_O);

	}

	public void battleEvent(JLabel opponent) { // attackButton, healButton, turnButton
		attackButton.setVisible(true);
		attackButton.setBounds(411, 470, 458, 88);
		attackButton.setBorderPainted(false);
		attackButton.setContentAreaFilled(false);
		attackButton.setFocusPainted(false);
		attackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				attackButton.setIcon(attackButtonEnteredImage);
				attackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				attackButton.setIcon(attackButtonBasicImage);
				attackButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonMusic = new Music("mouse.mp3", false);
				buttonMusic.start();
				attackButton.setVisible(false);
				healButton.setVisible(false);
				turnButton.setVisible(true);
				hobbang.setIcon(hbb_attackAction);
				hobbang.setBounds(490, 300, 256, 128);
				hptmp = hp;
				if (guardEvent) {
					guard.setIcon(guard_hurt);
					guard.setBounds(662, 300, 128, 128);
					hp_o -= (random.nextInt(5) + 1) * 10;
					HP_O.setBounds(guard.getLocation().x + 16, guard.getLocation().y - 25, hp_o, 23);
					if (hp_o <= 0) {
						win.setBounds(405, 150, 470, 100);
						add(win);
						HP_O.setVisible(false);
						HPbar_O.setIcon(HPbar_die);
						attackButton.setVisible(false);
						healButton.setVisible(false);
						turnButton.setVisible(false);
						hobbang.setIcon(hbb_happy);
						hobbang.setBounds(490, 300, 128, 128);
						nextButton.setVisible(true);
					}
				} else {
					boss.setIcon(boss_hurt);
					boss.setBounds(662, 300, 128, 128);
					hp_o -= (random.nextInt(3) + 1) * 10;
					HP_O.setBounds(boss.getLocation().x + 16, boss.getLocation().y - 25, hp_o, 23);
					if (hp_o <= 0) {
						win.setVisible(true);
						HP.setVisible(false);
						HPbar.setVisible(false);
						HP_O.setVisible(false);
						HPbar_O.setVisible(false);
						attackButton.setVisible(false);
						healButton.setVisible(false);
						turnButton.setVisible(false);
						hobbang.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("images/ȣ����_����.gif")));
						hobbang.setBounds(490, 300, 256, 128);
						boss.setIcon(boss_die);
						boss.setBounds(662, 268, 128, 160);
						nextButton.setVisible(true);
					}
				}

			}
		});
		add(attackButton);

		healButton.setVisible(true);
		healButton.setBounds(411, 570, 458, 88);
		healButton.setBorderPainted(false);
		healButton.setContentAreaFilled(false);
		healButton.setFocusPainted(false);
		healButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				healButton.setIcon(healButtonEnteredImage);
				healButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				healButton.setIcon(healButtonBasicImage);
				healButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonMusic = new Music("mouse.mp3", false);
				buttonMusic.start();
				hobbang.setIcon(hbb_heal);
				hobbang.setBounds(490, 300, 128, 128);
				hp += (random.nextInt(4) + 1) * 10;
				if (hp > 106) {
					hp = 106;
				}
				hptmp = hp;
				HP.setBounds(hobbang.getLocation().x + 16, hobbang.getLocation().y - 25, hp, 23);
				attackButton.setVisible(false);
				healButton.setVisible(false);
				turnButton.setVisible(true);
				if (guardEvent) {
					guard.setIcon(guard_basic);
					guard.setBounds(662, 300, 128, 128);
				} else {
					boss.setIcon(boss_basic);
					boss.setBounds(662, 300, 128, 128);
				}
			}
		});
		add(healButton);

		turnButton.setVisible(false);
		turnButton.setBounds(opponent.getLocation().x, opponent.getLocation().y + 130, 128, 32);
		turnButton.setBorderPainted(false);
		turnButton.setContentAreaFilled(false);
		turnButton.setFocusPainted(false);
		turnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				turnButton.setIcon(turnButtonEnteredImage);
				turnButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				turnButton.setIcon(turnButtonBasicImage);
				turnButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonMusic = new Music("mouse.mp3", false);
				buttonMusic.start();
				turnButton.setVisible(false);
				attackButton.setVisible(true);
				healButton.setVisible(true);
				if (guardEvent) {
					guard.setVisible(true);
					hobbang.setIcon(hbb_hurt);
					hobbang.setBounds(490, 300, 128, 128);
					guard.setIcon(guard_attackAction);
					guard.setBounds(534, 300, 256, 128);
					hp -= (random.nextInt(3) + 1) * 10;
					HP.setBounds(hobbang.getLocation().x + 16, hobbang.getLocation().y - 25, hp, 23);
					if (hp <= 0) {
						HPbar.setIcon(HPbar_die);
						attackButton.setVisible(false);
						healButton.setVisible(false);
						turnButton.setVisible(false);
						hobbang.setIcon(hbb_die);
						undoButton.setVisible(true);
						gameOver.setVisible(true);
					}
				} else {
					int n = random.nextInt(2);
					switch (n) {
					case 0:
						hobbang.setIcon(hbb_attackReady);
						hobbang.setBounds(490, 300, 256, 128);
						boss.setIcon(boss_heal);
						boss.setBounds(662, 300, 128, 128);
						hp_o += (random.nextInt(4) + 1) * 10;
						if (hp_o > 106) {
							hp_o = 106;
						}
						HP_O.setBounds(boss.getLocation().x + 16, boss.getLocation().y - 25, hp_o, 23);
						hp = hptmp;
						HP.setBounds(hobbang.getLocation().x + 16, hobbang.getLocation().y - 25, hp, 23);
						break;
					case 1:
						hobbang.setIcon(hbb_hurt);
						hobbang.setBounds(490, 300, 128, 128);
						boss.setIcon(boss_attackAction);
						boss.setBounds(534, 300, 256, 128);
						hp -= (random.nextInt(5) + 1) * 10;
						HP.setBounds(hobbang.getLocation().x + 16, hobbang.getLocation().y - 25, hp, 23);
						if (hp <= 0) {
							HP.setVisible(false);
							HPbar.setVisible(false);
							HP_O.setVisible(false);
							HPbar_O.setVisible(false);
							attackButton.setVisible(false);
							healButton.setVisible(false);
							turnButton.setVisible(false);
							hobbang.setIcon(hbb_die);
							undoButton.setVisible(true);
							gameOver.setVisible(true);
						}
						break;
					}
				}
			}
		});
		add(turnButton);
	}

	public void luckyEvent() { // talkButton
		move = false;
		hobbang.setBounds(512, 300, 128, 128);

		talkButton.setBounds(720 + 132, 120 + 182, 33, 22);
		talkButton.setBorderPainted(false);
		talkButton.setContentAreaFilled(false);
		talkButton.setFocusPainted(false);
		talkButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				talkButton.setIcon(talkButtonEnteredImage);
				talkButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				talkButton.setIcon(talkButtonBasicImage);
				talkButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music ButtonMusic = new Music("mouse.mp3", false);
				ButtonMusic.start();
				if (luckyEvent) {
					talknum += 1;
					switch (talknum) {
					case 2:
						talk.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("buttons/talk2.png")));
						break;
					case 3:
						talk.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("buttons/talk3.png")));
						hobbang.setIcon(hbb_heal);
						break;
					case 4:
						talk.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("buttons/talk4.png")));
						hobbang.setIcon(hbb_basic);
						break;
					case 5:
						talk.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("buttons/talk5.png")));
						talkButton.setVisible(false);
						nextButton.setVisible(true);
					}
				} else {
					talknum += 1;
					switch (talknum) {
					case 7:
						talk.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("buttons/talk7.png")));
						break;
					case 8:
						talk.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("buttons/talk8.png")));
						break;
					case 9:
						talk.setVisible(false);
						talkButton.setVisible(false);
						battleMode(boss);
					}
				}
			}
		});
		add(talkButton);

		talk.setBounds(720, 120, 256, 256); // lucky.setBounds(640, 300, 128, 128)
		add(talk);
	}

	public void bossEvent() {
		background = new ImageIcon(Main.class.getClassLoader().getResource("images/BG final.jpg")).getImage();
		hobbang.setIcon(hbb_angry);
		x = 100;
		y = 300;
		hobbang.setBounds(x, y, 128, 128);
		boss.setIcon(boss_basic);
		boss.setBounds(1052, 300, 128, 128);
		add(boss);
		talk.setIcon(new ImageIcon(Main.class.getClassLoader().getResource("buttons/talk6.gif")));
		talk.setBounds(140, 100, 1000, 200);
		talk.setVisible(true);
		talkButton.setBounds(1120, 220, 33, 22);
		talkButton.setVisible(true);
		talknum = 6;
	}

	public void endingEvent() {
		background = new ImageIcon(Main.class.getClassLoader().getResource("images/happyending.jpg")).getImage();
		hobbang.setIcon(hbb_basic);
		x = 300;
		y = 300;
		hobbang.setBounds(x, y, 128, 128);
		move = true;
        ssung.setBounds(840, 378, 128, 128);
        add(ssung);
        add(endingButton);
	}

	class MyKeyListener implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {
			if (move) {
				Container c = (Container) e.getSource();

				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					if (y - 10 < 0)
						y = 0;
					else
						y -= 10;
					hobbang.setLocation(x, y);
					break;
				case KeyEvent.VK_DOWN:
					if (y + 10 > c.getHeight() - 20)
						y = c.getHeight() - 20;
					else
						y += 10;
					hobbang.setLocation(x, y);
					break;
				case KeyEvent.VK_LEFT:
					if (luckyEvent) {
						hobbang.setIcon(hbb_turndirty);
					} else {
						hobbang.setIcon(hbb_turn);
					}
					if (x - 10 < 0)
						x = 0;
					else
						x -= 10;
					hobbang.setLocation(x, y);
					break;
				case KeyEvent.VK_RIGHT:
					if (luckyEvent) {
						hobbang.setIcon(hbb_dirty);
					} else {
						hobbang.setIcon(hbb_basic);
					}
					if (x + 10 > c.getWidth() - 30)
						x = c.getWidth() - 30;
					else
						x += 10;
					hobbang.setLocation(x, y);
					break;
				}

				if (guardEvent) {
					if (((x - 704) * (x - 704) + (y - 364) * (y - 364)) <= 203 * 203) {
						guardEvent();
					}
				}
				if (luckyEvent) {
					if (((x - 704) * (x - 704) + (y - 364) * (y - 364)) <= 203 * 203) {
						luckyEvent();
					}
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}
	}

	public void paint(Graphics g) { // ȭ���� �׷��ִ� �Լ�. ������ ������ Ư�� ���ǿ��� �ٲ��� ����
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // ȭ�� ũ�⸸ŭ �̹��� ����
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // �̹����� ���ϴ� ���� �׷���
		g.drawImage(screenImage, 0, 0, null); // screenImage�� (0,0) ��ġ�� �׷���
	}

	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		paintComponents(g);
		this.repaint();
	} // ��� �̹��� ����
}