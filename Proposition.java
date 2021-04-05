import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Proposition extends JFrame{

	

	public Proposition(String question, int i, int count, double point, double score) {
		//initialisation  de la fenêtre
		JFrame jf;
		Game1.flag[i]=false;
		jf=new JFrame("Proposition"); 
		jf.setSize(600, 600);  
		jf.setVisible(true);
		jf.setLayout(null);  
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
		jf.setResizable(false);
		
		
		//Carré de la question
		JTextArea ta = new JTextArea(question);
		ta.setLineWrap(true);
		ta.setEditable(false);
		ta.setOpaque(true);
	    ta.setBounds(10, 10, 555, 70);
	    JScrollPane scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(10, 10, 555, 70);
		scroll.getViewport().setBackground(Color.WHITE);
		scroll.getViewport().add(ta);
		jf.add(scroll);
		
		
		JButton bouton1 = new JButton("Je ne sais pas");
		bouton1.setBackground(Color.RED);
		bouton1.setForeground(Color.BLACK);
		bouton1.setBounds(50,150,500,50);
		jf.add(bouton1);
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Game1.r1.add(question);
				Game1.flag[i]=true;
				Game1.count=count+1; 
				jf.dispose();
			}
		});
		JButton bouton2 = new JButton("Je connais une partie de la réponse");
		bouton2.setBackground(Color.ORANGE);
		bouton2.setForeground(Color.BLACK);
		bouton2.setBounds(50,250,500,50);
		jf.add(bouton2);
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Game1.r2.add(question);			//on ajoute la question dans la liste adéquate
				Game1.flag[i]=true;				//pour ne pas recliquer sur la question
				Game1.score=score+(point/2);	//calcul des points
				Game1.Score(Game1.score);
				Game1.count=count+1; 
				jf.dispose();
			}
		});
		JButton bouton3 = new JButton("Je connais toute la réponse, mais je ne suis pas sûr(e)");
		bouton3.setBackground(Color.YELLOW);
		bouton3.setForeground(Color.BLACK);
		bouton3.setBounds(50,350,500,50);
		jf.add(bouton3);
		bouton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Game1.r3.add(question);			//on ajoute la question dans la liste adéquate
				Game1.flag[i]=true;				//pour ne pas recliquer sur la question
				Game1.score=score+(point/2);	//calcul des points
				Game1.Score(Game1.score);
				Game1.count=count+1; 
				jf.dispose();
			}
		});
		JButton bouton4 = new JButton("Je connais toute la réponse et je suis certain de ma réponse à 100%");
		bouton4.setBackground(Color.GREEN);
		bouton4.setForeground(Color.BLACK);
		bouton4.setBounds(50,450,500,50);
		jf.add(bouton4);
		bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Game1.r4.add(question);		//on ajoute la question dans la liste adéquate
				Game1.flag[i]=true;			//pour ne pas recliquer sur la question
				Game1.score=score+point;	//calcul des points
				Game1.Score(Game1.score);	
				Game1.count=count+1; 
				jf.dispose();
			}
		});
}
}