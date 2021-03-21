package fr.koor.swing.samples;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.*;

public class Game1 extends JFrame{
	
	JFrame f = new JFrame("Table de rappel");
	boolean flag [] = new boolean [12];
	int count=0;
	
	JLabel l,m;
	Font font1 = new Font("Arial", Font.PLAIN,15);

	Timer timer;

	int seconde;
	int minute;
	String SSeconde;
	String SMinute;

	DecimalFormat Format = new DecimalFormat("00");

		
	
	public  Game1(ArrayList arrayList) {
		
		    f.getContentPane().add(new Rectangle(arrayList));
		    f.pack();
		    f.setSize(1300, 950);  
		    f.setVisible(true);
		    f.setResizable(false);
		    f.setLayout(null);
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			f.setVisible(true);
		
			l = new JLabel();
			l.setBounds(800,0,750,100);
			l.setHorizontalAlignment(JLabel.CENTER);
			l.setFont(font1);
			l.setText("Temps restant : 05:00");
			seconde=0;
			minute=5;
			Count();
			timer.start();
			f.add(l);
			
			m=new JLabel();
			m.setBounds(0,0,100,100);
			m.setHorizontalAlignment(JLabel.CENTER);
			m.setFont(font1);
			m.setText("Score :");
			f.add(m);


			
		
		}
	
	public  class Rectangle extends JPanel implements MouseListener
	{
		String q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12;
		Rectangle2D rect1= new Rectangle2D.Double(25,75,250,225);
		Rectangle2D rect2= new Rectangle2D.Double(350,75,250,225);
		Rectangle2D rect3= new Rectangle2D.Double(675,75,250,225);
		Rectangle2D rect4= new Rectangle2D.Double(1000,75,250,225);
		Rectangle2D rect5= new Rectangle2D.Double(25,350,250,225);
		Rectangle2D rect6= new Rectangle2D.Double(350,350,250,225);
		Rectangle2D rect7= new Rectangle2D.Double(675,350,250,225);
		Rectangle2D rect8= new Rectangle2D.Double(1000,350,250,225);
		Rectangle2D rect9= new Rectangle2D.Double(25,625,250,225);
		Rectangle2D rect10= new Rectangle2D.Double(350,625,250,225);
		Rectangle2D rect11= new Rectangle2D.Double(675,625,250,225);
		Rectangle2D rect12= new Rectangle2D.Double(1000,625,250,225);
	
	public  Rectangle(ArrayList arrayList) {
		q1 = (String) arrayList.get(0);
		q2 = (String) arrayList.get(1);
		q3 = (String) arrayList.get(2);
		q4 = (String) arrayList.get(3);
		q5 = (String) arrayList.get(4);
		q6 = (String) arrayList.get(5);
		q7 = (String) arrayList.get(6);
		q8 = (String) arrayList.get(7);
		q9 = (String) arrayList.get(8);
		q10 = (String) arrayList.get(9);
		q11 = (String) arrayList.get(10);
		q12 = (String) arrayList.get(11);
		
		}
	
	
	
	
	Rectangle2D move(Rectangle2D rect, double dx, double dy) {
		  return new Rectangle2D.Double(rect.getX() + dx, rect.getY() + dy, rect.getWidth(), rect.getHeight());
		}
	

	public void paint(Graphics g){
		
	    Graphics2D g2 = (Graphics2D) g;
	    Font fonte = new Font("TimesRoman ",Font.BOLD,12);
	   
	  
        int x1 = (int) ((rect1.getX() + 10));
        int y1 = (int) ((rect1.getY() +  (rect1.getY()+rect1.getHeight())) / 2);
	    g2.drawString(q1, x1, y1);
	    int x2 = (int) ((rect2.getX() + 10));
        int y2 = (int) ((rect2.getY() +  (rect2.getY()+rect2.getHeight())) / 2);
	    g2.drawString(q2, x2, y2);
	    int x3 = (int) ((rect3.getX() + 10));
        int y3 = (int) ((rect3.getY() +  (rect3.getY()+rect3.getHeight())) / 2);
	    g2.drawString(q3, x3, y3);
	    int x4 = (int) ((rect4.getX() + 10));
        int y4 = (int) ((rect4.getY() +  (rect4.getY()+rect4.getHeight())) / 2);
	    g2.drawString(q4, x4, y4);
	    int x5 = (int) ((rect5.getX() + 10));
        int y5 = (int) ((rect5.getY() +  (rect5.getY()+rect5.getHeight())) / 2);
	    g2.drawString(q5, x5, y5);
	    int x6 = (int) ((rect6.getX() + 10));
        int y6 = (int) ((rect6.getY() +  (rect6.getY()+rect6.getHeight())) / 2);
	    g2.drawString(q6, x6, y6);
	    int x7 = (int) ((rect7.getX() + 10));
        int y7 = (int) ((rect7.getY() +  (rect7.getY()+rect7.getHeight())) / 2);
	    g2.drawString(q7, x7, y7);
	    int x8 = (int) ((rect8.getX() + 10));
        int y8 = (int) ((rect8.getY() +  (rect8.getY()+rect8.getHeight())) / 2);
	    g2.drawString(q8, x8, y8);
	    int x9 = (int) ((rect9.getX() + 10));
        int y9 = (int) ((rect9.getY() +  (rect9.getY()+rect9.getHeight())) / 2);
	    g2.drawString(q9, x9, y9);
	    int x10 = (int) ((rect10.getX() + 10));
        int y10 = (int) ((rect10.getY() +  (rect10.getY()+rect10.getHeight())) / 2);
	    g2.drawString(q10, x10, y10);
	    int x11 = (int) ((rect11.getX() + 10));
        int y11 = (int) ((rect11.getY() +  (rect11.getY()+rect11.getHeight())) / 2);
	    g2.drawString(q11, x11, y11);
	    int x12 = (int) ((rect12.getX() + 10));
        int y12 = (int) ((rect12.getY() +  (rect12.getY()+rect12.getHeight())) / 2);
	    g2.drawString(q12, x12, y12);
	    g2.setColor(Color.red);
	    g2.draw(rect1);
	    g2.draw(rect2);
	    g2.draw(rect3);
	    g2.draw(rect4);
	    g2.draw(rect5);
	    g2.draw(rect6);
	    g2.draw(rect7);
	    g2.draw(rect8);
	    g2.draw(rect9);
	    g2.draw(rect10);
	    g2.draw(rect11);
	    g2.draw(rect12);
	    this.addMouseListener(this);
	  }
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(count<12) {
		if (rect1.contains(e.getX(), e.getY()) && flag[0]==false){
			  new Proposition();
			  count=count+1;
			  System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[0]=true;
		}
		else if(rect2.contains(e.getX(), e.getY()) && flag[1]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[1]=true;
		}
		else if(rect3.contains(e.getX(), e.getY()) && flag[2]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[2]=true;
		}
		else if(rect4.contains(e.getX(), e.getY()) && flag[3]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[3]=true;
		}
		else if(rect5.contains(e.getX(), e.getY()) && flag[4]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[4]=true;
		}
		else if(rect6.contains(e.getX(), e.getY()) && flag[5]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[5]=true;
		}
		else if(rect7.contains(e.getX(), e.getY()) && flag[6]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[6]=true;
		}
		else if(rect8.contains(e.getX(), e.getY()) && flag[7]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[7]=true;
		}
		else if(rect9.contains(e.getX(), e.getY()) && flag[8]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[8]=true;
		}
		else if(rect10.contains(e.getX(), e.getY()) && flag[9]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[9]=true;
		}
		else if(rect11.contains(e.getX(), e.getY()) && flag[10]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[10]=true;
		}
		else if(rect12.contains(e.getX(), e.getY()) && flag[11]==false) {
			 new Proposition();
			 count=count+1;
			 System.out.println("Vous avez répondu à " + count + " question(s)");
			  flag[11]=true;
		}
		}
		if(count==12) {
			 System.out.println("Fin du test");
			System.exit(1);	
		}
		}
			
	



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
public void Count() {

		timer = new Timer(1000, new ActionListener() {
			
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
				timer.setRepeats(true);
				seconde--;
				SSeconde = Format.format(seconde);
				SMinute = Format.format(minute);
				l.setText("Temps restant : " + SMinute + ":" + SSeconde);
				f.repaint();
				
				
				if (seconde==-1) {
					seconde= 59;
					minute--;
					SSeconde = Format.format(seconde);
					SMinute = Format.format(minute);
					l.setText("Temps restant : " + SMinute + ":" + SSeconde);	
				}
				if (minute==0 && seconde == 0) {
					timer.stop();
					 System.out.println("Temps écoulé");
					System.exit(1);				
				}
			}
		});
}






}






