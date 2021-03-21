

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.awt.Graphics;
import java.util.Map;


public class Menu  {
	private JFrame frame;
	private New_Session session;
	private FileChooser1 fc;
	private Game1 g1;
	private Color c;




	public void init() {
		frame = new JFrame("Grille de rappel");
		frame.setPreferredSize(new Dimension(1300,800));
		frame.getContentPane().setBackground(c = new Color(224,224,240));
		frame.setTitle("Grille de rappel");
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton bouton1 = new JButton("Nouvelle session");
		bouton1.setBounds(100,100,413,238);
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
		        session = new New_Session();
		        session.init();
				
			}
		});
		frame.add(bouton1);
		JButton bouton2 = new JButton("Ancienne session");
		bouton2.setBounds(700,100,413,238);
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                fc = new FileChooser1();
                fc.init();
                Question q = new Question();
                try {
				g1 = new Game1( q.read(fc.getSf()));
				}catch(Exception e){
					System.out.println("Impossible d'ouvrir le fichier");
				}
			}
		});
		frame.add(bouton2);
		frame.pack();
	}


	public static void main(String[] args) throws IOException, ParseException {
		Menu menu = new Menu();
		menu.init();
		
		
	
	
}


	
}
