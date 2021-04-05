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
import java.util.Date;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.*;

public class Game1 extends JFrame{
	public static ArrayList<String> r1 = new ArrayList<String>();
	public static ArrayList<String> r2 = new ArrayList<String>();
	public static ArrayList<String> r3 = new ArrayList<String>();
	public static ArrayList<String> r4 = new ArrayList<String>();
	public static ArrayList<String> r5 = new ArrayList<String>();
	static JFrame f = new JFrame("Table de rappel");
	static boolean flag [] = new boolean [13];
	static int count=0;
	static double score =0;
	static double point;
	
	JLabel l;
	static JLabel m;
	JLabel n;
	Font font1 = new Font("Arial", Font.PLAIN,15);

	Timer timer;
	int seconde;
	int minute;
	String SSeconde;
	String SMinute;

	DecimalFormat Format = new DecimalFormat("00");
	
	
	
	

		
	
	public  Game1(ArrayList arrayList) {
		//Initialisation de la fenêtre
        f.getContentPane().add(new Rectangle(arrayList));
        f.pack();
        f.setSize(1300, 950);  
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        f.setVisible(true);
    
        l = new JLabel();
        l.setBounds(30,0,300,100);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setFont(font1);
        l.setText("Temps restant : 05:00");
        seconde=0;
        minute=5;
        Count(arrayList);	//Timer
        timer.start();
        f.add(l);
        
        
        
        m=new JLabel();
        m.setBounds(1100,0,750,100);
        m.setHorizontalAlignment(JLabel.LEFT);
        m.setFont(font1);
        m.setText("Score : " + score);
        f.add(m);
        
        n=new JLabel();
        n.setBounds(350,0,600,100);
        n.setHorizontalAlignment(JLabel.CENTER);
        n.setFont(font1);
        n.setText("Tic Tac vous avez 5 minutes !");
        f.add(n);  
    }
	
	//fonction pour afficher les rectangles
	public  class Rectangle extends JPanel implements MouseListener
	{
		String q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12, q1s,q2s,q3s,q4s,q5s,q6s,q7s,q8s,q9s,q10s,q11s,q12s;
		int nb;
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
	
	//On récupère les questions
	public  Rectangle(ArrayList arrayList) {
		q1 = q1s  = (String) arrayList.get(0);
		q2 = q2s = (String) arrayList.get(1);
		q3 = q3s= (String) arrayList.get(2);
		q4 = q4s = (String) arrayList.get(3);
		q5 = q5s = (String) arrayList.get(4);
		q6 = q6s = (String) arrayList.get(5);
		q7 = q7s = (String) arrayList.get(6);
		q8 = q8s = (String) arrayList.get(7);
		q9 = q9s = (String) arrayList.get(8);
		q10 = q10s = (String) arrayList.get(9);
		q11 = q11s = (String) arrayList.get(10);
		q12 = q12s = (String) arrayList.get(11);	
		}
	
	
	
	
	Rectangle2D move(Rectangle2D rect, double dx, double dy) {
		  return new Rectangle2D.Double(rect.getX() + dx, rect.getY() + dy, rect.getWidth(), rect.getHeight());
		}
	
	//Dessin des 12 rectangles
	public void paint(Graphics g){
		
	    Graphics2D g2 = (Graphics2D) g;
	    Font fonte = new Font("TimesRoman ",Font.BOLD,12);	//Police d'écriture
	    Font font = getFont();	
	    FontMetrics fm = getFontMetrics(font);
	    //Coordonnée du texte
        int x1 = (int) ((rect1.getX() + 10));
        int y1 = (int) ((rect1.getY() +  (rect1.getY()+rect1.getHeight())) / 2);
        int size1 = fm.stringWidth(q1);
        if(size1>=rect1.getWidth()) {
        	String newQ1="";
        	int sizen1=fm.stringWidth(newQ1);
        	int i=0;
        	while(sizen1<rect1.getWidth()-30) {
        		newQ1 = q1.substring(0,i);
        		sizen1=fm.stringWidth(newQ1);
        		i=i+1;
        	}
        	q1=newQ1 + " ...";
        }
	    g2.drawString(q1, x1, y1);	//Affichage du texte
	    int x2 = (int) ((rect2.getX() + 10));
        int y2 = (int) ((rect2.getY() +  (rect2.getY()+rect2.getHeight())) / 2);
        int size2 = fm.stringWidth(q2);
        if(size2>=rect2.getWidth()) {
        	String newQ2="";
        	int sizen2=fm.stringWidth(newQ2);
        	int i=0;
        	while(sizen2<rect2.getWidth()-30) {
        		newQ2 = q2.substring(0,i);
        		sizen2=fm.stringWidth(newQ2);
        		i=i+1;
        	}
        	q2=newQ2 + " ...";
        }
	    g2.drawString(q2, x2, y2);
	    int x3 = (int) ((rect3.getX() + 10));
        int y3 = (int) ((rect3.getY() +  (rect3.getY()+rect3.getHeight())) / 2);
        int size3 = fm.stringWidth(q3);
        if(size3>=rect3.getWidth()) {
        	String newQ3="";
        	int sizen3=fm.stringWidth(newQ3);
        	int i=0;
        	while(sizen3<rect3.getWidth()-30) {
        		newQ3 = q3.substring(0,i);
        		sizen3=fm.stringWidth(newQ3);
        		i=i+1;
        	}
        	q3=newQ3 + " ...";
        }
	    g2.drawString(q3, x3, y3);
	    int x4 = (int) ((rect4.getX() + 10));
        int y4 = (int) ((rect4.getY() +  (rect4.getY()+rect4.getHeight())) / 2);
        int size4 = fm.stringWidth(q4);
        if(size4>=rect4.getWidth()) {
        	String newQ4="";
        	int sizen4=fm.stringWidth(newQ4);
        	int i=0;
        	while(sizen4<rect4.getWidth()-30) {
        		newQ4 = q4.substring(0,i);
        		sizen4=fm.stringWidth(newQ4);
        		i=i+1;
        	}
        	q4=newQ4 + " ...";
        }
	    g2.drawString(q4, x4, y4);
	    int x5 = (int) ((rect5.getX() + 10));
        int y5 = (int) ((rect5.getY() +  (rect5.getY()+rect5.getHeight())) / 2);
        int size5 = fm.stringWidth(q5);
        if(size5>=rect5.getWidth()) {
        	String newQ5="";
        	int sizen5=fm.stringWidth(newQ5);
        	int i=0;
        	while(sizen5<rect5.getWidth()-30) {
        		newQ5 = q5.substring(0,i);
        		sizen5=fm.stringWidth(newQ5);
        		i=i+1;
        	}
        	q5=newQ5 + " ...";
        }
	    g2.drawString(q5, x5, y5);
	    int x6 = (int) ((rect6.getX() + 10));
        int y6 = (int) ((rect6.getY() +  (rect6.getY()+rect6.getHeight())) / 2);
        int size6 = fm.stringWidth(q6);
        if(size6>=rect6.getWidth()) {
        	String newQ6="";
        	int sizen6=fm.stringWidth(newQ6);
        	int i=0;
        	while(sizen6<rect6.getWidth()-30) {
        		newQ6 = q6.substring(0,i);
        		sizen6=fm.stringWidth(newQ6);
        		i=i+1;
        	}
        	q6=newQ6 + " ...";
        }
	    g2.drawString(q6, x6, y6);
	    int x7 = (int) ((rect7.getX() + 10));
        int y7 = (int) ((rect7.getY() +  (rect7.getY()+rect7.getHeight())) / 2);
        int size7 = fm.stringWidth(q7);
        if(size7>=rect7.getWidth()) {
        	String newQ7="";
        	int sizen7=fm.stringWidth(newQ7);
        	int i=0;
        	while(sizen7<rect7.getWidth()-30) {
        		newQ7 = q7.substring(0,i);
        		sizen7=fm.stringWidth(newQ7);
        		i=i+1;
        	}
        	q7=newQ7 + " ...";
        }
	    g2.drawString(q7, x7, y7);
	    int x8 = (int) ((rect8.getX() + 10));
        int y8 = (int) ((rect8.getY() +  (rect8.getY()+rect8.getHeight())) / 2);
        int size8 = fm.stringWidth(q8);
        if(size8>=rect8.getWidth()) {
        	String newQ8="";
        	int sizen8=fm.stringWidth(newQ8);
        	int i=0;
        	while(sizen8<rect8.getWidth()-30) {
        		newQ8 = q8.substring(0,i);
        		sizen8=fm.stringWidth(newQ8);
        		i=i+1;
        	}
        	q8=newQ8 + " ...";
        }
	    g2.drawString(q8, x8, y8);
	    int x9 = (int) ((rect9.getX() + 10));
        int y9 = (int) ((rect9.getY() +  (rect9.getY()+rect9.getHeight())) / 2);
        int size9 = fm.stringWidth(q9);
        if(size9>=rect9.getWidth()) {
        	String newQ9="";
        	int sizen9=fm.stringWidth(newQ9);
        	int i=0;
        	while(sizen9<rect9.getWidth()-30) {
        		newQ9 = q9.substring(0,i);
        		sizen9=fm.stringWidth(newQ9);
        		i=i+1;
        	}
        	q9=newQ9 + " ...";
        }
	    g2.drawString(q9, x9, y9);
	    int x10 = (int) ((rect10.getX() + 10));
        int y10 = (int) ((rect10.getY() +  (rect10.getY()+rect10.getHeight())) / 2);
        int size10 = fm.stringWidth(q10);
        if(size10>=rect10.getWidth()) {
        	String newQ10="";
        	int sizen10=fm.stringWidth(newQ10);
        	int i=0;
        	while(sizen10<rect10.getWidth()-30) {
        		newQ10 = q10.substring(0,i);
        		sizen10=fm.stringWidth(newQ10);
        		i=i+1;
        	}
        	q10=newQ10 + " ...";
        }
	    g2.drawString(q10, x10, y10);
	    int x11 = (int) ((rect11.getX() + 10));
        int y11 = (int) ((rect11.getY() +  (rect11.getY()+rect11.getHeight())) / 2);
        int size11 = fm.stringWidth(q11);
        if(size11>=rect11.getWidth()) {
        	String newQ11="";
        	int sizen11=fm.stringWidth(newQ11);
        	int i=0;
        	while(sizen11<rect11.getWidth()-30) {
        		newQ11 = q11.substring(0,i);
        		sizen11=fm.stringWidth(newQ11);
        		i=i+1;
        	}
        	q11=newQ11 + " ...";
        }
	    g2.drawString(q11, x11, y11);
	    int x12 = (int) ((rect12.getX() + 10));
        int y12 = (int) ((rect12.getY() +  (rect12.getY()+rect12.getHeight())) / 2);
        int size12 = fm.stringWidth(q12);
        if(size12>=rect12.getWidth()) {
        	String newQ12="";
        	int sizen12=fm.stringWidth(newQ12);
        	int i=0;
        	while(sizen12<rect12.getWidth()-30) {
        		newQ12 = q12.substring(0,i);
        		sizen12=fm.stringWidth(newQ12);
        		i=i+1;
        	}
        	q12=newQ12 + " ...";
        }
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
	
	//Fonction clic souris
	@Override
	public void mouseClicked(MouseEvent e) {
		//Il faut répondre aux 12 questions
		if(count<12) {
		if (rect1.contains(e.getX(), e.getY()) && flag[0]==false){
			nb=0;
			new Proposition(q1s,nb,count,point,score);	 //Ouvre la fenetre des questions
			flag[0]=true;	//Cela permet de ne pas recliquer sur une question déjà répondue
		}
		else if(rect2.contains(e.getX(), e.getY()) && flag[1]==false) {
			 nb=1;
			 new Proposition(q2s,nb,count,point,score);
			 flag[1]=true;
			
		}
		else if(rect3.contains(e.getX(), e.getY()) && flag[2]==false) {
			 nb=2;
			 new Proposition(q3s,nb,count,point,score);
			 flag[2]=true;
		}
		else if(rect4.contains(e.getX(), e.getY()) && flag[3]==false) {
			 nb=3;
			 new Proposition(q4s,nb,count,point,score);
			 flag[3]=true;
		}
		else if(rect5.contains(e.getX(), e.getY()) && flag[4]==false) {
			 nb=4;
			 new Proposition(q5s,nb,count,point,score);
			 flag[4]=true;
		}
		else if(rect6.contains(e.getX(), e.getY()) && flag[5]==false) {
			 nb=5;
			 new Proposition(q6s,nb,count,point,score);
			 flag[5]=true;
		}
		else if(rect7.contains(e.getX(), e.getY()) && flag[6]==false) {
			 nb=6;
			 new Proposition(q7s,nb,count,point,score);
			 flag[6]=true;
		}
		else if(rect8.contains(e.getX(), e.getY()) && flag[7]==false) {
			 nb=7;
			 new Proposition(q8s,nb,count,point,score);
			 flag[7]=true;
		}
		else if(rect9.contains(e.getX(), e.getY()) && flag[8]==false) {
			 nb=8;
			 new Proposition(q9s,nb,count,point,score);
			 flag[8]=true;
			
		}
		else if(rect10.contains(e.getX(), e.getY()) && flag[9]==false) {
			 nb=9;
			 new Proposition(q10s,nb,count,point,score);
			 flag[9]=true;
		}
		else if(rect11.contains(e.getX(), e.getY()) && flag[10]==false) {
			 nb=10;
			 new Proposition(q11s,nb,count,point,score);
			 flag[10]=true;
		}
		else if(rect12.contains(e.getX(), e.getY()) && flag[11]==false) {
			 nb=11;
			 new Proposition(q12s,nb,count,point,score);	
			 flag[11]=true;
		}
		}
		if(count==12 && flag[12]==false ) {
			 f.dispose();
			 GameOver g =new GameOver(score,r1,r2,r3,r4,r5);	//On passe au game over
			 flag[12]=true;
			
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

public void Count(ArrayList arrayList) {

		timer = new Timer(1000, new ActionListener() {	//1000 permet l'écoulement du timer normal (cad 1 minute en 60s)
			
			
			@Override
			public void actionPerformed (ActionEvent e) {
				
				timer.setRepeats(true);
				seconde--;
				//On initialise les minutes
				SSeconde = Format.format(seconde);
				SMinute = Format.format(minute);	//5
				l.setText("Temps restant : " + SMinute + ":" + SSeconde);
				f.repaint();
				
				//écoulement du temps : passage de 00 à 59
				if (seconde==-1) {
					seconde= 59;
					minute--;
					SSeconde = Format.format(seconde);
					SMinute = Format.format(minute);
					l.setText("Temps restant : " + SMinute + ":" + SSeconde);	
				}
				//Timer à 00:00
				if (minute==0 && seconde == 0) {
					timer.stop();
					for(int fl = 0; fl<12; fl++)
					{
						//on enregistre les questions auquel on a pas répondu
						if(flag[fl]==false)
						{
							String q=(String) arrayList.get(fl);
							r5.add(q);	
						}
						
					}
					System.out.println("Temps écoulé");
					f.dispose();
					GameOver g = new GameOver(score,r1,r2,r3,r4,r5);		//On passe au Game Over	
				}
			}
		});
}

		public static void DateDoc(String datedoc)
		{
			
			Date actuelle = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
 	        Date date = new Date();
			try {
				date = formatter.parse(datedoc);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 	    
			 
 	       
			Long diff = (actuelle.getTime()-date.getTime())/(1000*60*60*24);
			if (diff<=7) {
				point=1;
			}
			if(diff>7 && diff <=14) {
				point=2;
			}
			if(diff>14 && diff <=30) {
				point=3;
			}
			if (diff>30) {
				point=4;
			}
		}
		
		public static void Score(double score) {
			  m.setText("Score : " + score);
			f.repaint();
		}
}
		





