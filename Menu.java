import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;


public class Menu  {
	private JFrame frame;
	private New_Session session;
	private FileChooser1 fc;
	private Game1 g1;
	private Color c;




	public void init() {
		String str = "\u00A9";
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		Font font2 = new Font("Calibri", Font.ITALIC, 45);
		frame = new JFrame("Grille de rappel");
		frame.setPreferredSize(new Dimension(1300,800));
		frame.getContentPane().add(new Line());
		frame.pack();
		frame.setTitle("Grille de rappel");
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel jl=new JLabel();
		jl.setBounds(380,0,500,40);
		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setFont(font1);
		jl.setText("Accueil de la grille de rappel !");
		frame.add(jl);
		
		JLabel jl2=new JLabel();
		jl2.setBounds(0,0,250,20);
		jl2.setHorizontalAlignment(JLabel.CENTER);
		jl2.setText(str + "Borgne Florian/Guiraud Benjamin");
		frame.add(jl2);
		
		JButton bouton1 = new JButton("Nouvelle session");
		bouton1.setBounds(100,150,450,575);
		bouton1.setFont(font2);
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
		        session = new New_Session();
		        session.init();
				
			}
		});
		frame.add(bouton1);
		JButton bouton2 = new JButton("Ancienne session");
		bouton2.setBounds(750,150,450,575);
		bouton2.setFont(font2);
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                fc = new FileChooser1();
                fc.init();
                Question q = new Question();
             
                try {
                
				g1 = new Game1(q.read(fc.getSf()));
				Game1.DateDoc(q.date);
				
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
		
		public  class Line extends JPanel
		{
			Line2D line1=new Line2D.Double(0,100,1300,100);
			Line2D line2=new Line2D.Double(640,100,640,800);
			
			
			public void paint(Graphics g){
				
			    Graphics2D g2 = (Graphics2D) g;
			    g2.setColor(Color.BLUE);
		        g2.draw(line1);
		        g2.draw(line2);
		     
			}
			
		}
		
		
	
	
}