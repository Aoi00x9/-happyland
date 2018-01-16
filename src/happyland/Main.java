package happyland;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Main {

	private JFrame frame;
	private int blank = 6;
	private static Timer timeMain;
	private static Timer timePlay1;
	private static Timer timePlay2;
	private static Timer timePlay3;
	private static Timer timePlay4;
	private int timeS = 60;
	private int timeM = 5;
	private int pocket = 1500;
	private int totalScore = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Queue qPlay = new Queue();
		Information infoKeepBear = new Information("keepbear", 10, 50, 10);
		Information infoAirForce = new Information("airforce", 10, 50, 10);
		Information infoSlider = new Information("slider", 10, 50, 10);
		Information infoRollerCoaster = new Information("rollercoaster", 15, 75, 15);
		Information infoSwing = new Information("swing", 15, 75, 15);
		Information infoSkyHorse = new Information("skyhorse", 15, 75, 15);
		Information infoGiantDrop = new Information("giantdrop", 15, 75, 15);
		Information infoSeaShow = new Information("seashow", 15, 75, 15);
		Information infoViking= new Information("viking", 15, 75, 15);
		Information infoGrandCanyon = new Information("grandcanyon", 20, 100, 20);
		Information infoGhostHouse = new Information("ghosthouse", 20, 100, 20);
		Information infoBumpCar = new Information("bumpcar", 20, 100, 20);
		Information infoBalloon = new Information("balloon", 20, 100, 20);
		Information infoRedSpace = new Information("redspace", 25, 150, 25);
		Information infoFood = new Information("Food", 25, 150, 25);
		Information infoWaterPark = new Information("waterpark", 25, 150, 25);
           
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.setBounds(100, 100, 1200, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblShowScore = new JLabel("0");
		lblShowScore.setHorizontalAlignment(SwingConstants.LEFT);
		lblShowScore.setForeground(Color.YELLOW);
		lblShowScore.setFont(new Font("Agency FB", Font.BOLD, 38));
		lblShowScore.setBorder(null);
		lblShowScore.setBounds(136, 0, 282, 65);
		frame.getContentPane().add(lblShowScore);
		
		JLabel lblYourPocketShow = new JLabel("1,500.00");
		lblYourPocketShow.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblYourPocketShow.setBackground(Color.LIGHT_GRAY);
		lblYourPocketShow.setForeground(Color.BLUE);
		lblYourPocketShow.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblYourPocketShow.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYourPocketShow.setBounds(836, 673, 162, 36);
		frame.getContentPane().add(lblYourPocketShow);
		
		JLabel lblShowQ1 = new JLabel("");
		lblShowQ1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblShowQ1.setBounds(0, 610, 110, 110);
		frame.getContentPane().add(lblShowQ1);
		
		JLabel lblShowQ2 = new JLabel("");
		lblShowQ2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblShowQ2.setBounds(110, 610, 110, 110);
		frame.getContentPane().add(lblShowQ2);
		
		JLabel lblShowQ3 = new JLabel("");
		lblShowQ3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblShowQ3.setBounds(220, 610, 110, 110);
		frame.getContentPane().add(lblShowQ3);
		
		JLabel lblShowQ4 = new JLabel("");
		lblShowQ4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblShowQ4.setBounds(330, 610, 110, 110);
		frame.getContentPane().add(lblShowQ4);
		
		JLabel lblShowQ5 = new JLabel("");
		lblShowQ5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblShowQ5.setBounds(440, 610, 110, 110);
		frame.getContentPane().add(lblShowQ5);
		
		JLabel lblShowQ6 = new JLabel("");
		lblShowQ6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblShowQ6.setBounds(550, 610, 110, 110);
		frame.getContentPane().add(lblShowQ6);
		
		JButton btnRollerCoaster = new JButton("");
		btnRollerCoaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_rollercoaster.jpg"));blank--;
				try {
					qPlay.enqueue("rollercoaster"); //Add Q
					pocket = pocket - infoRollerCoaster.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay2.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_rollercoaster.jpg"));blank--;
				try {
					qPlay.enqueue("rollercoaster"); //Add Q
					pocket = pocket - infoRollerCoaster.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_rollercoaster.jpg"));blank--;
				try {
					qPlay.enqueue("rollercoaster"); //Add Q
					pocket = pocket - infoRollerCoaster.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_rollercoaster.jpg"));blank--;
				try {
					qPlay.enqueue("rollercoaster"); //Add Q
					pocket = pocket - infoRollerCoaster.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_rollercoaster.jpg"));blank--;
				try {
					qPlay.enqueue("rollercoaster"); //Add Q
					pocket = pocket - infoRollerCoaster.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_rollercoaster.jpg"));blank--;
				try {
					qPlay.enqueue("rollercoaster"); //Add Q
					pocket = pocket - infoRollerCoaster.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default:JOptionPane.showMessageDialog(null, "Please wait.."); 
				}	
			}
		});
		btnRollerCoaster.setEnabled(false);
		btnRollerCoaster.setToolTipText("RollerCoaster");
		btnRollerCoaster.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnRollerCoaster.setBackground(null);
		btnRollerCoaster.setBorder(null);
		btnRollerCoaster.setFocusable(false);
		btnRollerCoaster.setContentAreaFilled(false);
		btnRollerCoaster.setRolloverIcon(new ImageIcon("map\\rollercoaster.png"));
		btnRollerCoaster.setBounds(315, 464, 60, 110);
		frame.getContentPane().add(btnRollerCoaster);
		
		JButton btnSwing = new JButton("");
		btnSwing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_swing.jpg"));blank--;
				try {
					qPlay.enqueue("swing"); //Add Q
					pocket = pocket - infoSwing.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay2.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_swing.jpg"));blank--;
				try {
					qPlay.enqueue("swing"); //Add Q
					pocket = pocket - infoSwing.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_swing.jpg"));blank--;
				try {
					qPlay.enqueue("swing"); //Add Q
					pocket = pocket - infoSwing.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_swing.jpg"));blank--;
				try {
					qPlay.enqueue("swing"); //Add Q
					pocket = pocket - infoSwing.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_swing.jpg"));blank--;
				try {
					qPlay.enqueue("swing"); //Add Q
					pocket = pocket - infoSwing.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_swing.jpg"));blank--;
				try {
					qPlay.enqueue("swing"); //Add Q
					pocket = pocket - infoSwing.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnSwing.setEnabled(false);
		btnSwing.setToolTipText("Swing");
		btnSwing.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnSwing.setBackground(null);
		btnSwing.setBorder(null);
		btnSwing.setFocusable(false);
		btnSwing.setContentAreaFilled(false);
		btnSwing.setRolloverIcon(new ImageIcon("map\\swing.png"));
		btnSwing.setBounds(707, 180, 60, 110);
		frame.getContentPane().add(btnSwing);
		
		JButton btnGrandCanyon = new JButton("");
		btnGrandCanyon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_grandcanyon.jpg"));blank--;
				try {
					qPlay.enqueue("grandcanyon"); //Add Q
					pocket = pocket - infoGrandCanyon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay3.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_grandcanyon.jpg"));blank--;
				try {
					qPlay.enqueue("grandcanyon"); //Add Q
					pocket = pocket - infoGrandCanyon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_grandcanyon.jpg"));blank--;
				try {
					qPlay.enqueue("grandcanyon"); //Add Q
					pocket = pocket - infoGrandCanyon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_grandcanyon.jpg"));blank--;
				try {
					qPlay.enqueue("grandcanyon"); //Add Q
					pocket = pocket - infoGrandCanyon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_grandcanyon.jpg"));blank--;
				try {
					qPlay.enqueue("grandcanyon"); //Add Q
					pocket = pocket - infoGrandCanyon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_grandcanyon.jpg"));blank--;
				try {
					qPlay.enqueue("grandcanyon"); //Add Q
					pocket = pocket - infoGrandCanyon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnGrandCanyon.setEnabled(false);
		btnGrandCanyon.setToolTipText("GrandCanyon");
		btnGrandCanyon.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnGrandCanyon.setFocusable(false);
		btnGrandCanyon.setContentAreaFilled(false);
		btnGrandCanyon.setBorder(null);
		btnGrandCanyon.setBackground((Color) null);
		btnGrandCanyon.setRolloverIcon(new ImageIcon("map\\grandcanyon.png"));
		btnGrandCanyon.setBounds(111, 370, 60, 110);
		frame.getContentPane().add(btnGrandCanyon);
		
		JButton btnSkyHorse = new JButton("");
		btnSkyHorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_skyhorse.jpg"));blank--;
				try {
					qPlay.enqueue("skyhorse"); //Add Q
					pocket = pocket - infoSkyHorse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay2.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_skyhorse.jpg"));blank--;
				try {
					qPlay.enqueue("skyhorse"); //Add Q
					pocket = pocket - infoSkyHorse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_skyhorse.jpg"));blank--;
				try {
					qPlay.enqueue("skyhorse"); //Add Q
					pocket = pocket - infoSkyHorse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_skyhorse.jpg"));blank--;
				try {
					qPlay.enqueue("skyhorse"); //Add Q
					pocket = pocket - infoSkyHorse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_skyhorse.jpg"));blank--;
				try {
					qPlay.enqueue("skyhorse"); //Add Q
					pocket = pocket - infoSkyHorse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_skyhorse.jpg"));blank--;
				try {
					qPlay.enqueue("skyhorse"); //Add Q
					pocket = pocket - infoSkyHorse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnSkyHorse.setEnabled(false);
		btnSkyHorse.setToolTipText("SkyHorse");
		btnSkyHorse.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnSkyHorse.setFocusable(false);
		btnSkyHorse.setContentAreaFilled(false);
		btnSkyHorse.setBorder(null);
		btnSkyHorse.setBackground((Color) null);
		btnSkyHorse.setRolloverIcon(new ImageIcon("map\\skyhorse.png"));
		btnSkyHorse.setBounds(197, 197, 60, 110);
		frame.getContentPane().add(btnSkyHorse);
		
		JButton btnViking = new JButton("");
		btnViking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_viking.jpg"));blank--;
				try {
					qPlay.enqueue("viking"); //Add Q
					pocket = pocket - infoViking.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay2.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_viking.jpg"));blank--;
				try {
					qPlay.enqueue("viking"); //Add Q
					pocket = pocket - infoViking.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_viking.jpg"));blank--;
				try {
					qPlay.enqueue("viking"); //Add Q
					pocket = pocket - infoViking.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_viking.jpg"));blank--;
				try {
					qPlay.enqueue("viking"); //Add Q
					pocket = pocket - infoViking.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_viking.jpg"));blank--;
				try {
					qPlay.enqueue("viking"); //Add Q
					pocket = pocket - infoViking.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_viking.jpg"));blank--;
				try {
					qPlay.enqueue("viking"); //Add Q
					pocket = pocket - infoViking.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnViking.setEnabled(false);
		btnViking.setToolTipText("Viking");
		btnViking.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnViking.setBackground(null);
		btnViking.setBorder(null);
		btnViking.setFocusable(false);
		btnViking.setContentAreaFilled(false);
		btnViking.setRolloverIcon(new ImageIcon("map\\viking.png"));
		btnViking.setBounds(267, 137, 60, 110);
		frame.getContentPane().add(btnViking);
		
		JButton btnRedSpace = new JButton("");
		btnRedSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_redspace.jpg"));blank--;
				try {
					qPlay.enqueue("redspace"); //Add Q
					pocket = pocket - infoRedSpace.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay4.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_redspace.jpg"));blank--;
				try {
					qPlay.enqueue("redspace"); //Add Q
					pocket = pocket - infoRedSpace.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_redspace.jpg"));blank--;
				try {
					qPlay.enqueue("redspace"); //Add Q
					pocket = pocket - infoRedSpace.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_redspace.jpg"));blank--;
				try {
					qPlay.enqueue("redspace"); //Add Q
					pocket = pocket - infoRedSpace.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_redspace.jpg"));blank--;
				try {
					qPlay.enqueue("redspace"); //Add Q
					pocket = pocket - infoRedSpace.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_redspace.jpg"));blank--;
				try {
					qPlay.enqueue("redspace"); //Add Q
					pocket = pocket - infoRedSpace.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnRedSpace.setEnabled(false);
		btnRedSpace.setToolTipText("RedSpace");
		btnRedSpace.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnRedSpace.setFocusable(false);
		btnRedSpace.setContentAreaFilled(false);
		btnRedSpace.setBorder(null);
		btnRedSpace.setBackground((Color) null);
		btnRedSpace.setRolloverIcon(new ImageIcon("map\\redspace.png"));
		btnRedSpace.setBounds(450, 269, 60, 110);
		frame.getContentPane().add(btnRedSpace);
		
		JButton btnGhostHouse = new JButton("");
		btnGhostHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_ghosthouse.jpg"));blank--;
				try {
					qPlay.enqueue("ghosthouse"); //Add Q
					pocket = pocket - infoGhostHouse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay3.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_ghosthouse.jpg"));blank--;
				try {
					qPlay.enqueue("ghosthouse"); //Add Q
					pocket = pocket - infoGhostHouse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_ghosthouse.jpg"));blank--;
				try {
					qPlay.enqueue("ghosthouse"); //Add Q
					pocket = pocket - infoGhostHouse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_ghosthouse.jpg"));blank--;
				try {
					qPlay.enqueue("ghosthouse"); //Add Q
					pocket = pocket - infoGhostHouse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_ghosthouse.jpg"));blank--;
				try {
					qPlay.enqueue("ghosthouse"); //Add Q
					pocket = pocket - infoGhostHouse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_ghosthouse.jpg"));blank--;
				try {
					qPlay.enqueue("ghosthouse"); //Add Q
					pocket = pocket - infoGhostHouse.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnGhostHouse.setEnabled(false);
		btnGhostHouse.setToolTipText("GhostHouse");
		btnGhostHouse.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnGhostHouse.setFocusable(false);
		btnGhostHouse.setContentAreaFilled(false);
		btnGhostHouse.setBorder(null);
		btnGhostHouse.setBackground((Color) null);
		btnGhostHouse.setRolloverIcon(new ImageIcon("map\\ghosthouse.png"));
		btnGhostHouse.setBounds(981, 217, 60, 110);
		frame.getContentPane().add(btnGhostHouse);
		
		JButton btnBumpCar = new JButton("");
		btnBumpCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_bumpcar.jpg"));blank--;
				try {
					qPlay.enqueue("bumpcar"); //Add Q
					pocket = pocket - infoBumpCar.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay3.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_bumpcar.jpg"));blank--;
				try {
					qPlay.enqueue("bumpcar"); //Add Q
					pocket = pocket - infoBumpCar.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_bumpcar.jpg"));blank--;
				try {
					qPlay.enqueue("bumpcar"); //Add Q
					pocket = pocket - infoBumpCar.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_bumpcar.jpg"));blank--;
				try {
					qPlay.enqueue("bumpcar"); //Add Q
					pocket = pocket - infoBumpCar.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_bumpcar.jpg"));blank--;
				try {
					qPlay.enqueue("bumpcar"); //Add Q
					pocket = pocket - infoBumpCar.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_bumpcar.jpg"));blank--;
				try {
					qPlay.enqueue("bumpcar"); //Add Q
					pocket = pocket - infoBumpCar.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnBumpCar.setEnabled(false);
		btnBumpCar.setToolTipText("BumpCar");
		btnBumpCar.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnBumpCar.setFocusable(false);
		btnBumpCar.setContentAreaFilled(false);
		btnBumpCar.setBorder(null);
		btnBumpCar.setBackground((Color) null);
		btnBumpCar.setRolloverIcon(new ImageIcon("map\\bumpcar.png"));
		btnBumpCar.setBounds(1082, 329, 60, 110);
		frame.getContentPane().add(btnBumpCar);
		
		JButton btnKeepBear = new JButton("");
		btnKeepBear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_keepbear.jpg"));blank--;
				try {
					qPlay.enqueue("keepbear"); //Add Q
					pocket = pocket - infoKeepBear.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay1.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_keepbear.jpg"));blank--;
				try {
					qPlay.enqueue("keepbear"); //Add Q
					pocket = pocket - infoKeepBear.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_keepbear.jpg"));blank--;
				try {
					qPlay.enqueue("keepbear"); //Add Q
					pocket = pocket - infoKeepBear.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_keepbear.jpg"));blank--;
				try {
					qPlay.enqueue("keepbear"); //Add Q
					pocket = pocket - infoKeepBear.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_keepbear.jpg"));blank--;
				try {
					qPlay.enqueue("keepbear"); //Add Q
					pocket = pocket - infoKeepBear.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_keepbear.jpg"));blank--;
				try {
					qPlay.enqueue("keepbear"); //Add Q
					pocket = pocket - infoKeepBear.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnKeepBear.setEnabled(false);
		btnKeepBear.setToolTipText("KeepBear");
		btnKeepBear.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnKeepBear.setFocusable(false);
		btnKeepBear.setContentAreaFilled(false);
		btnKeepBear.setBorder(null);
		btnKeepBear.setBackground((Color) null);
		btnKeepBear.setRolloverIcon(new ImageIcon("map\\keep-bear.png"));
		btnKeepBear.setBounds(387, 99, 60, 110);
		frame.getContentPane().add(btnKeepBear);
		
		JButton btnFood = new JButton("");
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_food.jpg"));blank--;
				try {
					qPlay.enqueue("food"); //Add Q
					pocket = pocket - infoFood.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay4.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_food.jpg"));blank--;
				try {
					qPlay.enqueue("food"); //Add Q
					pocket = pocket - infoFood.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_food.jpg"));blank--;
				try {
					qPlay.enqueue("food"); //Add Q
					pocket = pocket - infoFood.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_food.jpg"));blank--;
				try {
					qPlay.enqueue("food"); //Add Q
					pocket = pocket - infoFood.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_food.jpg"));blank--;
				try {
					qPlay.enqueue("food"); //Add Q
					pocket = pocket - infoFood.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_food.jpg"));blank--;
				try {
					qPlay.enqueue("food"); //Add Q
					pocket = pocket - infoFood.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnFood.setEnabled(false);
		btnFood.setToolTipText("Food");
		btnFood.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnFood.setFocusable(false);
		btnFood.setContentAreaFilled(false);
		btnFood.setBorder(null);
		btnFood.setBackground((Color) null);
		btnFood.setRolloverIcon(new ImageIcon("map\\food.png"));
		btnFood.setBounds(520, 148, 60, 110);
		frame.getContentPane().add(btnFood);
		
		JButton btnGiantDrop = new JButton("");
		btnGiantDrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_giantdrop.jpg"));blank--;
				try {
					qPlay.enqueue("giantdrop"); //Add Q
					pocket = pocket - infoGiantDrop.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay2.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_giantdrop.jpg"));blank--;
				try {
					qPlay.enqueue("giantdrop"); //Add Q
					pocket = pocket - infoGiantDrop.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_giantdrop.jpg"));blank--;
				try {
					qPlay.enqueue("giantdrop"); //Add Q
					pocket = pocket - infoGiantDrop.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_giantdrop.jpg"));blank--;
				try {
					qPlay.enqueue("giantdrop"); //Add Q
					pocket = pocket - infoGiantDrop.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_giantdrop.jpg"));blank--;
				try {
					qPlay.enqueue("giantdrop"); //Add Q
					pocket = pocket - infoGiantDrop.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_giantdrop.jpg"));blank--;
				try {
					qPlay.enqueue("giantdrop"); //Add Q
					pocket = pocket - infoGiantDrop.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnGiantDrop.setEnabled(false);
		btnGiantDrop.setToolTipText("GiantDrop");
		btnGiantDrop.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnGiantDrop.setFocusable(false);
		btnGiantDrop.setContentAreaFilled(false);
		btnGiantDrop.setBorder(null);
		btnGiantDrop.setBackground((Color) null);
		btnGiantDrop.setRolloverIcon(new ImageIcon("map\\giantdrop.png"));
		btnGiantDrop.setBounds(794, 180, 60, 110);
		frame.getContentPane().add(btnGiantDrop);
		
		JButton btnSealShow = new JButton("");
		btnSealShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_sealshow.jpg"));blank--;
				try {
					qPlay.enqueue("sealshow"); //Add Q
					pocket = pocket - infoSeaShow.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay2.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_sealshow.jpg"));blank--;
				try {
					qPlay.enqueue("sealshow"); //Add Q
					pocket = pocket - infoSeaShow.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_sealshow.jpg"));blank--;
				try {
					qPlay.enqueue("sealshow"); //Add Q
					pocket = pocket - infoSeaShow.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_sealshow.jpg"));blank--;
				try {
					qPlay.enqueue("sealshow"); //Add Q
					pocket = pocket - infoSeaShow.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_sealshow.jpg"));blank--;
				try {
					qPlay.enqueue("sealshow"); //Add Q
					pocket = pocket - infoSeaShow.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_sealshow.jpg"));blank--;
				try {
					qPlay.enqueue("sealshow"); //Add Q
					pocket = pocket - infoSeaShow.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnSealShow.setEnabled(false);
		btnSealShow.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnSealShow.setToolTipText("GiantDrop");
		btnSealShow.setFocusable(false);
		btnSealShow.setContentAreaFilled(false);
		btnSealShow.setBorder(null);
		btnSealShow.setBackground((Color) null);
		btnSealShow.setRolloverIcon(new ImageIcon("map\\sealshow.png"));
		btnSealShow.setBounds(520, 355, 60, 110);
		frame.getContentPane().add(btnSealShow);
		
		JButton btnBalloon = new JButton("");
		btnBalloon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_balloon.jpg"));blank--;
				try {
					qPlay.enqueue("balloon"); //Add Q
					pocket = pocket - infoBalloon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay3.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_balloon.jpg"));blank--;
				try {
					qPlay.enqueue("balloon"); //Add Q
					pocket = pocket - infoBalloon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_balloon.jpg"));blank--;
				try {
					qPlay.enqueue("balloon"); //Add Q
					pocket = pocket - infoBalloon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_balloon.jpg"));blank--;
				try {
					qPlay.enqueue("balloon"); //Add Q
					pocket = pocket - infoBalloon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_balloon.jpg"));blank--;
				try {
					qPlay.enqueue("balloon"); //Add Q
					pocket = pocket - infoBalloon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_balloon.jpg"));blank--;
				try {
					qPlay.enqueue("balloon"); //Add Q
					pocket = pocket - infoBalloon.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnBalloon.setEnabled(false);
		btnBalloon.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnBalloon.setToolTipText("Balloon");
		btnBalloon.setFocusable(false);
		btnBalloon.setContentAreaFilled(false);
		btnBalloon.setBorder(null);
		btnBalloon.setBackground((Color) null);
		btnBalloon.setRolloverIcon(new ImageIcon("map\\balloon.png"));
		btnBalloon.setBounds(53, 99, 60, 110);
		frame.getContentPane().add(btnBalloon);
		
		JButton btnAirForce = new JButton("");
		btnAirForce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_airforce.jpg"));blank--;
				try {
					qPlay.enqueue("airforce"); //Add Q
					pocket = pocket - infoAirForce.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay1.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_airforce.jpg"));blank--;
				try {
					qPlay.enqueue("airforce"); //Add Q
					pocket = pocket - infoAirForce.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_airforce.jpg"));blank--;
				try {
					qPlay.enqueue("airforce"); //Add Q
					pocket = pocket - infoAirForce.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_airforce.jpg"));blank--;
				try {
					qPlay.enqueue("airforce"); //Add Q
					pocket = pocket - infoAirForce.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_airforce.jpg"));blank--;
				try {
					qPlay.enqueue("airforce"); //Add Q
					pocket = pocket - infoAirForce.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_airforce.jpg"));blank--;
				try {
					qPlay.enqueue("airforce"); //Add Q
					pocket = pocket - infoAirForce.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnAirForce.setEnabled(false);
		btnAirForce.setToolTipText("AirForce");
		btnAirForce.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnAirForce.setFocusable(false);
		btnAirForce.setContentAreaFilled(false);
		btnAirForce.setBorder(null);
		btnAirForce.setBackground((Color) null);
		btnAirForce.setRolloverIcon(new ImageIcon("map\\airforce.png"));
		btnAirForce.setBounds(864, 269, 60, 110);
		frame.getContentPane().add(btnAirForce);
		
		JButton btnSlider = new JButton("");
		btnSlider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_slider.jpg"));blank--;
				try {
					qPlay.enqueue("slider"); //Add Q
					pocket = pocket - infoSlider.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay1.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_slider.jpg"));blank--;
				try {
					qPlay.enqueue("slider"); //Add Q
					pocket = pocket - infoSlider.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_slider.jpg"));blank--;
				try {
					qPlay.enqueue("slider"); //Add Q
					pocket = pocket - infoSlider.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_slider.jpg"));blank--;
				try {
					qPlay.enqueue("slider"); //Add Q
					pocket = pocket - infoSlider.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_slider.jpg"));blank--;
				try {
					qPlay.enqueue("slider"); //Add Q
					pocket = pocket - infoSlider.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_slider.jpg"));blank--;
				try {
					qPlay.enqueue("slider"); //Add Q
					pocket = pocket - infoSlider.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}
			}
		});
		btnSlider.setEnabled(false);
		btnSlider.setToolTipText("Slider");
		btnSlider.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnSlider.setFocusable(false);
		btnSlider.setContentAreaFilled(false);
		btnSlider.setBorder(null);
		btnSlider.setBackground((Color) null);
		btnSlider.setRolloverIcon(new ImageIcon("map\\slider.png"));
		btnSlider.setBounds(864, 99, 60, 110);
		frame.getContentPane().add(btnSlider);
		
		JButton btnWaterPark = new JButton("");
		btnWaterPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(blank){
				case 6: lblShowQ1.setIcon(new ImageIcon("showQ\\sh_waterpark.jpg"));blank--;
				try {
					qPlay.enqueue("waterpark"); //Add Q
					pocket = pocket - infoWaterPark.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
					timePlay4.start();
					} catch (Exception e) {
						e.printStackTrace();
					} break;
				case 5: lblShowQ2.setIcon(new ImageIcon("showQ\\sh_waterpark.jpg"));blank--;
				try {
					qPlay.enqueue("waterpark"); //Add Q
					pocket = pocket - infoWaterPark.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 4: lblShowQ3.setIcon(new ImageIcon("showQ\\sh_waterpark.jpg"));blank--;
				try {
					qPlay.enqueue("waterpark"); //Add Q
					pocket = pocket - infoWaterPark.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 3: lblShowQ4.setIcon(new ImageIcon("showQ\\sh_waterpark.jpg"));blank--;
				try {
					qPlay.enqueue("waterpark"); //Add Q
					pocket = pocket - infoWaterPark.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 2: lblShowQ5.setIcon(new ImageIcon("showQ\\sh_waterpark.jpg"));blank--;
				try {blank--;
					qPlay.enqueue("waterpark"); //Add Q
					pocket = pocket - infoWaterPark.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				case 1: lblShowQ6.setIcon(new ImageIcon("showQ\\sh_waterpark.jpg"));blank--;
				try {
					qPlay.enqueue("waterpark"); //Add Q
					pocket = pocket - infoWaterPark.getTicketPrice();
					lblYourPocketShow.setText(String.valueOf(pocket));
				} catch (Exception e) {
					e.printStackTrace();
				} break;
				default: JOptionPane.showMessageDialog(null, "Please wait..");/// เดี๋ยวแก้หน้าต่างใหม่ 
				}	
			}
		});
		btnWaterPark.setEnabled(false);
		btnWaterPark.setIcon(new ImageIcon("D:\\Happy8Land\\map\\blankpng.png"));
		btnWaterPark.setToolTipText("Water Park");
		btnWaterPark.setFocusable(false);
		btnWaterPark.setContentAreaFilled(false);
		btnWaterPark.setBorder(null);
		btnWaterPark.setBackground((Color) null);
		btnWaterPark.setRolloverIcon(new ImageIcon("map\\waterpark.png"));
		btnWaterPark.setBounds(766, 409, 60, 110);
		frame.getContentPane().add(btnWaterPark);
		
		JLabel lblTimeUP = new JLabel("Time's up!");
		lblTimeUP.setVisible(false);
		lblTimeUP.setBackground(SystemColor.window);
		lblTimeUP.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimeUP.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTimeUP.setBounds(563, 329, 180, 50);
		frame.getContentPane().add(lblTimeUP);
		
		JLabel lblTimeM = new JLabel("05");
		lblTimeM.setForeground(Color.RED);
		lblTimeM.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimeM.setFont(new Font("Agency FB", Font.BOLD, 38));
		lblTimeM.setBounds(1037, 0, 60, 65);
		frame.getContentPane().add(lblTimeM);
		
		JLabel lblScore = new JLabel("SCORE");
		lblScore.setHorizontalAlignment(SwingConstants.LEFT);
		lblScore.setForeground(Color.YELLOW);
		lblScore.setFont(new Font("Agency FB", Font.BOLD, 38));
		lblScore.setBorder(null);
		lblScore.setBounds(25, 0, 101, 65);
		frame.getContentPane().add(lblScore);
		
		JLabel lblTime_1 = new JLabel("TIME");
		lblTime_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTime_1.setForeground(Color.RED);
		lblTime_1.setFont(new Font("Agency FB", Font.BOLD, 38));
		lblTime_1.setBorder(null);
		lblTime_1.setBounds(905, 0, 101, 65);
		frame.getContentPane().add(lblTime_1);
		
		JLabel lblTimeS = new JLabel("00");
		lblTimeS.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimeS.setForeground(Color.RED);
		lblTimeS.setFont(new Font("Agency FB", Font.BOLD, 38));
		lblTimeS.setBounds(1103, 0, 60, 65);
		frame.getContentPane().add(lblTimeS);
		
		JLabel lbl_ = new JLabel(":");
		lbl_.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_.setForeground(Color.RED);
		lbl_.setFont(new Font("Agency FB", Font.BOLD, 38));
		lbl_.setBounds(1070, 0, 60, 54);
		frame.getContentPane().add(lbl_);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timeMain.start();
				btnStart.setEnabled(false);
				btnAirForce.setEnabled(true);
				btnBalloon.setEnabled(true);
				btnBumpCar.setEnabled(true);
				btnFood.setEnabled(true);
				btnGhostHouse.setEnabled(true);
				btnGiantDrop.setEnabled(true);
				btnGrandCanyon.setEnabled(true);
				btnKeepBear.setEnabled(true);
				btnRedSpace.setEnabled(true);
				btnRollerCoaster.setEnabled(true);
				btnSealShow.setEnabled(true);
				btnSkyHorse.setEnabled(true);
				btnSlider.setEnabled(true);
				btnSwing.setEnabled(true);
				btnViking.setEnabled(true);
				btnWaterPark.setEnabled(true);
			}
		});
		btnStart.setBackground(Color.YELLOW);
		btnStart.setForeground(Color.RED);
		btnStart.setFont(new Font("Agency FB", Font.BOLD, 38));
		btnStart.setBounds(1037, 624, 140, 85);
		frame.getContentPane().add(btnStart);
		
		JLabel lblYourPocket = new JLabel("YOUR POCKET");
		lblYourPocket.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourPocket.setFont(new Font("Agency FB", Font.BOLD, 34));
		lblYourPocket.setBounds(826, 618, 180, 54);
		frame.getContentPane().add(lblYourPocket);
		
		JLabel lblBaht = new JLabel("฿");
		lblBaht.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblBaht.setHorizontalAlignment(SwingConstants.CENTER);
		lblBaht.setBounds(790, 673, 46, 36);
		frame.getContentPane().add(lblBaht);
		
		JLabel lblMap = new JLabel("");
		lblMap.setIcon(new ImageIcon("D:\\Happy8Land\\map\\map1200x610.jpg"));
		lblMap.setBounds(0, 0, 1200, 610);
		frame.getContentPane().add(lblMap);
		
		timeMain = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	if(timeM == 0 && timeS == 0){
            		
            		timeMain.stop(); 
            		timePlay1.stop();
            		timePlay2.stop();
            		timePlay3.stop();
            		timePlay4.stop();
            		btnAirForce.setEnabled(false);
            		btnBalloon.setEnabled(false);
            	    btnBumpCar.setEnabled(false);
            	    btnFood.setEnabled(false);
            	    btnGhostHouse.setEnabled(false);
            	    btnGiantDrop.setEnabled(false);
            	    btnGrandCanyon.setEnabled(false);
            	    btnKeepBear.setEnabled(false);
            	    btnRedSpace.setEnabled(false);
            	    btnRollerCoaster.setEnabled(false);
            	    btnSealShow.setEnabled(false);
            	    btnSkyHorse.setEnabled(false);
            	    btnSlider.setEnabled(false);
            	    btnSwing.setEnabled(false);
            	    btnViking.setEnabled(false);
            	    btnWaterPark.setEnabled(false);
            		lblTimeUP.setVisible(true);
            	}
            	if(timeS == 60) {
            		timeM--;
            		timeS--;
            	}
            	if(timeS == 0){
            		lblTimeM.setText("0"+timeM);
            		lblTimeS.setText("0"+timeS);
            		timeS = 60;
            	}else{
            		if(timeS < 10) {
            			lblTimeM.setText("0"+timeM); 
            			lblTimeS.setText("0"+timeS);
            		}
            		else{
            			lblTimeM.setText("0"+timeM); 
            			lblTimeS.setText(""+timeS);
            		}
            		timeS--;
            	}
            }
		});
		
		timePlay1 = new Timer(10000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	timePlay1.stop();
            	try {
            		switch(qPlay.front()){
					case "keepbear": lblShowScore.setText(String.valueOf(calculateScore(infoKeepBear.getScore())));break;
					case "airforce": lblShowScore.setText(String.valueOf(calculateScore(infoAirForce.getScore())));break;
					case "slider": lblShowScore.setText(String.valueOf(calculateScore(infoSlider.getScore())));break;
					}
            		qPlay.dequeue();
            		blank++;
            		if(!qPlay.isEmpty()){
            			lblShowQ1.setIcon(lblShowQ2.getIcon());
            			lblShowQ2.setIcon(lblShowQ3.getIcon());
    					lblShowQ3.setIcon(lblShowQ4.getIcon());
    					lblShowQ4.setIcon(lblShowQ5.getIcon());
    					lblShowQ5.setIcon(lblShowQ6.getIcon());
    					lblShowQ6.setIcon(new ImageIcon("showQ\\blankQ.png"));
    					nextQ(qPlay.front());
            		}
            		else{
            			lblShowQ1.setIcon(new ImageIcon("showQ\\blankQ.png"));
            			JOptionPane.showMessageDialog(null, "finish!");
            		}
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
		});
		
		timePlay2 = new Timer(15000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	timePlay2.stop();
            	try {
            		switch(qPlay.front()){
					case "rollercoaster": lblShowScore.setText(String.valueOf(calculateScore(infoRollerCoaster.getScore())));break;
					case "swing": lblShowScore.setText(String.valueOf(calculateScore(infoSwing.getScore())));break;
					case "skyhorse": lblShowScore.setText(String.valueOf(calculateScore(infoSkyHorse.getScore())));break;
					case "viking": lblShowScore.setText(String.valueOf(calculateScore(infoViking.getScore())));break;
					case "giantdrop": lblShowScore.setText(String.valueOf(calculateScore(infoGiantDrop.getScore())));break;
					case "sealshow": lblShowScore.setText(String.valueOf(calculateScore(infoSeaShow.getScore())));break;
					}
            		qPlay.dequeue();
            		blank++;
            		if(!qPlay.isEmpty()){
    					lblShowQ1.setIcon(lblShowQ2.getIcon());
    					lblShowQ2.setIcon(lblShowQ3.getIcon());
    					lblShowQ3.setIcon(lblShowQ4.getIcon());
    					lblShowQ4.setIcon(lblShowQ5.getIcon());
    					lblShowQ5.setIcon(lblShowQ6.getIcon());
    					lblShowQ6.setIcon(new ImageIcon("showQ\\blankQ.png"));
    					nextQ(qPlay.front());
            		}
            		else{
            			lblShowQ1.setIcon(new ImageIcon("showQ\\blankQ.png"));
            			JOptionPane.showMessageDialog(null, "finish!");
            		}
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
		});
		
		timePlay3 = new Timer(20000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	timePlay3.stop();
            	try {
            		switch(qPlay.front()){
					case "grandcanyon": lblShowScore.setText(String.valueOf(calculateScore(infoGrandCanyon.getScore())));break;
					case "ghosthouse": lblShowScore.setText(String.valueOf(calculateScore(infoGhostHouse.getScore())));break;
					case "bumpcar": lblShowScore.setText(String.valueOf(calculateScore(infoBumpCar.getScore())));break;
					case "balloon": lblShowScore.setText(String.valueOf(calculateScore(infoBalloon.getScore())));break;
					}
            		qPlay.dequeue();
            		blank++;
            		if(!qPlay.isEmpty()){
            			lblShowQ1.setIcon(lblShowQ2.getIcon());
            			lblShowQ2.setIcon(lblShowQ3.getIcon());
        				lblShowQ3.setIcon(lblShowQ4.getIcon());
        				lblShowQ4.setIcon(lblShowQ5.getIcon());
        				lblShowQ5.setIcon(lblShowQ6.getIcon());
        				lblShowQ6.setIcon(new ImageIcon("showQ\\blankQ.png"));
    					nextQ(qPlay.front());
            		}
            		else{
                		lblShowQ1.setIcon(new ImageIcon("showQ\\blankQ.png"));
                		JOptionPane.showMessageDialog(null, "finish!");
                	}
            	} catch (Exception e) {
            		e.printStackTrace();
            	}
			}
		});
		
		timePlay4 = new Timer(25000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	timePlay4.stop();
            	try {
            		switch(qPlay.front()){
					case "redspace": lblShowScore.setText(String.valueOf(calculateScore(infoRedSpace.getScore())));break;
					case "food": lblShowScore.setText(String.valueOf(calculateScore(infoFood.getScore())));break;
					case "waterpark": lblShowScore.setText(String.valueOf(calculateScore(infoWaterPark.getScore())));break;
					}
            		qPlay.dequeue();
            		blank++;
            		if(!qPlay.isEmpty()){
    					lblShowQ1.setIcon(lblShowQ2.getIcon());
    					lblShowQ2.setIcon(lblShowQ3.getIcon());
    					lblShowQ3.setIcon(lblShowQ4.getIcon());
    					lblShowQ4.setIcon(lblShowQ5.getIcon());
    					lblShowQ5.setIcon(lblShowQ6.getIcon());
    					lblShowQ6.setIcon(new ImageIcon("showQ\\blankQ.png"));
    					nextQ(qPlay.front());
            		}
            		else{
            			lblShowQ1.setIcon(new ImageIcon("showQ\\blankQ.png"));
            			JOptionPane.showMessageDialog(null, "finish!");
            		}
	
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
		});
	}
	
	public static void nextQ(String nameQ){
		if(nameQ.equals("keepbear")||nameQ.equals("airplane")||nameQ.equals("slider")){
			timePlay1.start();
		}
		if(nameQ.equals("rollercoaster")||nameQ.equals("swing")||nameQ.equals("skyhorse")
				||nameQ.equals("viking")||nameQ.equals("giantdrop")||nameQ.equals("sealshow")){
			timePlay2.start();
		}
		if(nameQ.equals("grandcanyon")||nameQ.equals("ghosthouse")||nameQ.equals("bumpcar")||nameQ.equals("balloon")){
			timePlay3.start();
		}
		if(nameQ.equals("redspace")||nameQ.equals("food")||nameQ.equals("waterpark")){
			timePlay4.start();
		}
	}
	
	public int calculateScore(int score){
		totalScore = totalScore + score;
		return totalScore;
	}
}
