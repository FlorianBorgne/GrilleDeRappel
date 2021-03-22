import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Proposition extends JFrame{
	

	public Proposition(String question) {
		JFrame jf;
		jf=new JFrame("Proposition"); 
		jf.setSize(600, 600);  
		jf.setVisible(true);
		jf.setLayout(null);  
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		
		
		JLabel jl = new JLabel();
	   	 jl.setText(question);
	    	String f= jl.getText();
	    	jl.setBounds(10, 10, 500, 30);
		jf.add(jl);
		
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
