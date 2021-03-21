
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Proposition extends JFrame{
	
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proposition f = new Proposition(); 
					f.setVisible(true);
				}catch (Exception e) {
					e.printStackTrace();
					}
				}
		});
}
	
	public Proposition() {
		JFrame jf;
		jf=new JFrame("Proposition"); 
		jf.setSize(600, 600);  
		jf.setVisible(true);
		jf.setLayout(null);  
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		JButton bouton1 = new JButton("Je ne sais pas");
		bouton1.setBackground(Color.RED);
		bouton1.setForeground(Color.WHITE);
		bouton1.setBounds(50,50,500,50);
		jf.add(bouton1);
		JButton bouton2 = new JButton("Je connais une partie de la réponse");
		bouton2.setBackground(Color.ORANGE);
		bouton2.setForeground(Color.WHITE);
		bouton2.setBounds(50,175,500,50);
		jf.add(bouton2);
		JButton bouton3 = new JButton("Je connais toute la réponse, mais je ne suis pas sûr(e)");
		bouton3.setBackground(Color.YELLOW);
		bouton3.setForeground(Color.BLACK);
		bouton3.setBounds(50,300,500,50);
		jf.add(bouton3);
		JButton bouton4 = new JButton("Je connais toute la réponse et je suis certain de ma réponse à 100%");
		bouton4.setBackground(Color.GREEN);
		bouton4.setForeground(Color.WHITE);
		bouton4.setBounds(50,425,500,50);
		jf.add(bouton4);
}
}
