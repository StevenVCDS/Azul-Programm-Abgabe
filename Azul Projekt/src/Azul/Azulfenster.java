package Azul;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Azulfenster extends JFrame implements ActionListener {

	private JPanel contentPane;
	public Flieﬂen[] alleFlieﬂen = null; 
	public Flieﬂen[] gezogen = new Flieﬂen[20];
	public Sack sack = null;
	//meins
	public Flieﬂen[] f¸rSack = new Flieﬂen[80];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Azulfenster frame = new Azulfenster();

					Generator g = new Generator();
					frame.alleFlieﬂen = g.erzeugeFlieﬂen();
					frame.ziehen();
					frame.init();
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public void ziehen() {
		//zahl 0;50;100 kann rdm variable auch sein
		for (int i = 0; i < 20; i++) {
			gezogen[i] = alleFlieﬂen[i];
		}
		
	
		for (int i = 0; i < 80; i++) {
			f¸rSack[i] = alleFlieﬂen[i+20];
		}
		this.sack = new Sack(f¸rSack);
	
	}

	/**
	 * Create the frame.
	 */
	public Azulfenster() {}
	
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(this.gezogen[0].getPathToImage()));
		button.setBounds(34, 27, 40, 40);
		button.addActionListener(this);
		button.setActionCommand("1");
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(this.gezogen[1].getPathToImage()));
		button_1.setBounds(0, 72, 40, 40);
		button_1.addActionListener(this);
		button_1.setActionCommand("1");
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(this.gezogen[2].getPathToImage()));
		button_2.setBounds(80, 53, 40, 40);
		button_2.addActionListener(this);
		button_2.setActionCommand("1");
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(this.gezogen[3].getPathToImage()));
		button_3.setBounds(45, 104, 40, 40);
		button_3.addActionListener(this);
		button_3.setActionCommand("1");
		contentPane.add(button_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		btnNewButton.setBounds(267, 318, 31, 31);
		contentPane.add(btnNewButton);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_4.setBounds(234, 351, 31, 31);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_5.setBounds(267, 351, 31, 31);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_6.setBounds(267, 384, 31, 31);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_7.setBounds(234, 384, 31, 31);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_8.setBounds(202, 384, 31, 31);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_9.setBounds(267, 417, 31, 31);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_10.setBounds(234, 417, 31, 31);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_11.setBounds(202, 417, 31, 31);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_12.setBounds(171, 417, 31, 31);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_13.setBounds(267, 450, 31, 31);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_14.setBounds(234, 450, 31, 31);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_15.setBounds(202, 450, 31, 31);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_16.setBounds(171, 450, 31, 31);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett feld 372x373.PNG"));
		button_17.setBounds(138, 450, 31, 31);
		contentPane.add(button_17);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturebrett 120x120.PNG"));
		lblNewLabel.setBounds(0, 24, 120, 120);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturebrett 120x120.PNG"));
		label.setBounds(122, 24, 120, 120);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturebrett 120x120.PNG"));
		label_1.setBounds(243, 24, 120, 120);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturebrett 120x120.PNG"));
		label_2.setBounds(365, 24, 120, 120);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturebrett 120x120.PNG"));
		label_3.setBounds(489, 24, 120, 120);
		contentPane.add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturespielbrett mit fliessen 372x373.PNG"));
		lblNewLabel_1.setBounds(122, 184, 372, 374);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\Schatten brettspiel.PNG"));
		lblNewLabel_3.setBounds(121, 184, 398, 398);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\holztisch hintergrund.png"));
		lblNewLabel_2.setBounds(0, 0, 619, 607);
		contentPane.add(lblNewLabel_2);
		
		JButton button_33 = new JButton("");
		button_33.setIcon(new ImageIcon(this.gezogen[3].getPathToImage()));
		button_33.setBounds(316, 318, 31, 31);
		button_33.addActionListener(this);
		button_33.setActionCommand("1");
		contentPane.add(button_33);
		
		JButton button_34 = new JButton("");
		button_34.setIcon(new ImageIcon(this.gezogen[3].getPathToImage()));
		button_34.setBounds(412, 318, 31, 31);
		button_34.addActionListener(this);
		button_34.setActionCommand("1");
		contentPane.add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setIcon(new ImageIcon(this.gezogen[3].getPathToImage()));
		button_35.setBounds(349, 318, 31, 31);
		button_35.addActionListener(this);
		button_35.setActionCommand("1");
		contentPane.add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setIcon(new ImageIcon(this.gezogen[3].getPathToImage()));
		button_36.setBounds(382, 318, 31, 31);
		button_36.addActionListener(this);
		button_36.setActionCommand("1");
		contentPane.add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setIcon(new ImageIcon(this.gezogen[3].getPathToImage()));
		button_37.setBounds(442, 318, 31, 31);
		button_37.addActionListener(this);
		button_37.setActionCommand("1");
		contentPane.add(button_37);
		
		//X= 360 ; X= 349 ; X= 382 ; X= 412 ; X= 442
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		Random zufall = new Random();
		int farbesack = zufall.nextInt(80); 
		/*System.out.println(farbesack);
		System.out.println("" + arg0.getActionCommand());
	 	System.out.println("" + arg0.getSource());*/
		JButton button = (JButton)arg0.getSource();
		button.setIcon(new ImageIcon(this.f¸rSack[farbesack].getPathToImage()));
	
		
	}
}
