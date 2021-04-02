import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;



public class GameOver extends JFrame {
	public  GameOver(double score, ArrayList r1, ArrayList r2, ArrayList r3, ArrayList r4, ArrayList r5) {
		JFrame f = new JFrame("Fin de partie");
		f.getContentPane().add(new Tableau());
	    f.pack();
	    f.setSize(1300, 800); 
	    
	    f.setVisible(true);
	    f.setResizable(false);
	    f.setLayout(null);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	    Font font1 = new Font("SansSerif", Font.BOLD, 20);
	    Font font2 = new Font("SansSerif", Font.ITALIC, 15);
	    
	    JLabel m=new JLabel();
		m.setBounds(0,0,400,40);
		m.setHorizontalAlignment(JLabel.CENTER);
		m.setFont(font1);
		m.setText("Score final: " + score);
		f.add(m);
		
		JLabel m1=new JLabel();
		m1.setBounds(0,0,1250,40);
		m1.setHorizontalAlignment(JLabel.CENTER);
		m1.setFont(font1);
		m1.setText("Fin de la partie !");
		f.add(m1);
		
	    JTextArea ta = new JTextArea("Je ne sais pas");
		ta.setLineWrap(true);
		ta.setEditable(false);
		ta.setOpaque(true);
		ta.setFont(font1);
	    ta.setBounds(15, 62, 233, 65);
		f.add(ta);

		
		JTextArea g1 = new JTextArea();
		g1.setBounds(12, 129, 238, 600);
		g1.setLineWrap(true);
		g1.setEditable(false);
		g1.setOpaque(true);
		g1.setFont(font2);
		JScrollPane scroll1 = new JScrollPane(g1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll1.setBounds(12, 129, 238, 600);
		scroll1.getViewport().setBackground(Color.WHITE);
		scroll1.getViewport().add(g1);
		f.add(scroll1);
		
		repaint();

 
		
		for(int i=1;i<=r1.size();i++)
		{
			String mot;
			mot = (String) r1.get(i-1);
			
			g1.append("*"+mot+"\n");
		}
		
		JTextArea ta2 = new JTextArea("Je connais une partie de la réponse");
		ta2.setLineWrap(true);
		ta2.setEditable(false);
		ta2.setOpaque(true);
		ta2.setFont(font1);
	    ta2.setBounds(265,62,233,65);
		f.add(ta2);
		
		JTextArea g2 = new JTextArea();
		g2.setBounds(262, 129, 238, 600);
		g2.setLineWrap(true);
		g2.setEditable(false);
		g2.setOpaque(true);
		g2.setFont(font2);
		JScrollPane scroll2 = new JScrollPane(g2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll2.setBounds(262, 129, 238, 600);
		scroll2.getViewport().setBackground(Color.WHITE);
		scroll2.getViewport().add(g2);
		f.add(scroll2);
		
		repaint();
		
		for(int i=1;i<=r2.size();i++)
		{
			String mot;
			mot = (String) r2.get(i-1);
			
			g2.append("*"+mot+"\n");
		}
		
		JTextArea ta3 = new JTextArea("Je connais la réponse, mais je ne suis pas sûr");
		ta3.setLineWrap(true);
		ta3.setEditable(false);
		ta3.setOpaque(true);
		ta3.setFont(font1);
	    ta3.setBounds(515, 62, 233, 65);
		f.add(ta3);
		
		JTextArea g3 = new JTextArea();
		g3.setBounds(512, 129, 238, 600);
		g3.setLineWrap(true);
		g3.setEditable(false);
		g3.setOpaque(true);
		g3.setFont(font2);
		JScrollPane scroll3 = new JScrollPane(g3,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll3.setBounds(512, 129, 238, 600);
		scroll3.getViewport().setBackground(Color.WHITE);
		scroll3.getViewport().add(g3);
		f.add(scroll3);
		
		repaint();
		
		for(int i=1;i<=r3.size();i++)
		{
			String mot;
			mot = (String) r3.get(i-1);
			
			g3.append("*"+mot+"\n");
		}
		
		
		JTextArea ta4 = new JTextArea("Je connais la réponse et je suis certain à 100%");
		ta4.setLineWrap(true);
		ta4.setEditable(false);
		ta4.setOpaque(true);
		ta4.setFont(font1);
	    ta4.setBounds(765, 62, 233, 65);
		f.add(ta4);
		
		JTextArea g4 = new JTextArea();
		g4.setBounds(762, 129, 238, 600);
		g4.setLineWrap(true);
		g4.setEditable(false);
		g4.setOpaque(true);
		g4.setFont(font2);
		JScrollPane scroll4 = new JScrollPane(g4,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll4.setBounds(762, 129, 238, 600);
		scroll4.getViewport().setBackground(Color.WHITE);
		scroll4.getViewport().add(g4);
		f.add(scroll4);
		
		repaint();

		for(int i=1;i<=r4.size();i++)
		{
			String mot;
			mot = (String) r4.get(i-1);
			
			g4.append("*"+mot+"\n");
		}
		
		
		JTextArea ta5 = new JTextArea("Question sans réponse");
		ta5.setLineWrap(true);
		ta5.setEditable(false);
		ta5.setOpaque(true);
		ta5.setFont(font1);
	    ta5.setBounds(1015, 62, 233, 65);
		f.add(ta5);
		
		
		JTextArea g5 = new JTextArea();
		g5.setBounds(1012, 129, 238, 600);
		g5.setLineWrap(true);
		g5.setEditable(false);
		g5.setOpaque(true);
		g5.setFont(font2);
		JScrollPane scroll5 = new JScrollPane(g5,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll5.setBounds(1012, 129, 238, 600);
		scroll5.getViewport().setBackground(Color.WHITE);
		scroll5.getViewport().add(g5);
		f.add(scroll5);
		
		repaint();
		
		for(int i=1;i<=r5.size();i++)
		{
			String mot;
			mot = (String) r5.get(i-1);
			
			g5.append("*"+mot+"\n");
		}
		
		
		
		
		JButton bouton = new JButton("Fin du jeu");
		bouton.setBounds(1100,10,100,40);
		bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
                System.exit(0);
			}
		});
		f.add(bouton);
}
	
	public  class Tableau extends JPanel
	{
		
		Rectangle2D rect1= new Rectangle2D.Double(11,60,240,675);
		Rectangle2D rect2= new Rectangle2D.Double(261,60,240,675);
		Rectangle2D rect3= new Rectangle2D.Double(511,60,240,675);
		Rectangle2D rect4= new Rectangle2D.Double(761,60,240,675);
		Rectangle2D rect5= new Rectangle2D.Double(1011,60,240,675);
		Line2D line1=new Line2D.Double(11,128,251,128);
		Line2D line2=new Line2D.Double(261,128,501,128);
		Line2D line3=new Line2D.Double(511,128,751,128);
		Line2D line4=new Line2D.Double(761,128,1001,128);
		Line2D line5=new Line2D.Double(1011,128,1251,128);
		
		
		public void paint(Graphics g){
			
		    Graphics2D g2 = (Graphics2D) g;
		    g2.setColor(Color.black);
		    g2.draw(rect1);
	        g2.draw(rect2);
	        g2.draw(rect3);
	        g2.draw(rect4);
	        g2.draw(rect5);
	        g2.draw(line1);
	        g2.draw(line2);
	        g2.draw(line3);
	        g2.draw(line4);
	        g2.draw(line5);
		}
		
	}
}
