

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class New_Session {
	Menu menu;
	JFrame frame;
	JTextField field;
	JButton button, button2;
	JTextArea area;
	JScrollPane scroll;
	JPanel panel1;
	JLabel label, label2;
	JComponent textLabel;
	ArrayList<String> lines = new ArrayList<String>();
	private int cpt = 0;
	private boolean valid=false;
	public JTextArea getArea() {
		return area;
	}
	public JFrame getFrame() {
		return frame;
	}
	public JTextField getField() {
		return field;
	}
	public JButton getButton() {
		return button;
	}

	public void init() {

		frame = new JFrame("Grille de rappel");
		frame.setPreferredSize(new Dimension(1300,800));
		frame.getContentPane().setBackground(new Color(224,224,240));
		frame.setTitle("Grille de rappel");
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		label = new JLabel("Nom du fichier texte");
		label.setBounds(30,10,250,50);
		label.setFont(new java.awt.Font(Font.SANS_SERIF,Font.BOLD,25));
		field = new JTextField(".txt");
		field.setBounds(30,80,596,66);
		field.setFont(new java.awt.Font(Font.SANS_SERIF,Font.ITALIC,30));
		button = new JButton("OK");
		button.setBounds(625,80,212,65);
		button.setFont(new java.awt.Font(Font.SANS_SERIF,Font.BOLD,25));
		DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		String dateStr = dateformat.format(date); //Regler la date penser a l amettre  alacreation du fichier
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String fileName = field.getText();
				String encoding = "UTF-8";
				try{
					PrintWriter writer = new PrintWriter(fileName, encoding);
					writer.close();
					lines.add(dateStr);
					JOptionPane.showMessageDialog(null,
							"Fichier créer !");
					valid = true;
				}
				catch (IOException e){
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
		});
		label2 = new JLabel("Rentrer une question puis valider (12 questions)");
		label2.setBounds(30,350,600,50);
		label2.setFont(new java.awt.Font(Font.SANS_SERIF,Font.BOLD,20));
		area = new JTextArea();
		area.setLineWrap(true);
		area.setBounds(30,400,400,260);
		area.setWrapStyleWord (false);
		area.setFont(new java.awt.Font(Font.SANS_SERIF,Font.ITALIC,20));
		button2 = new JButton("Valider");

		button2.setToolTipText( "Valider" );
		button2.setFont(new java.awt.Font(Font.SANS_SERIF,Font.BOLD,25));
		button2.setBounds(440,590,212,65);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String texte = area.getText();
				if(valid==false)
				{

					JOptionPane.showMessageDialog(null,
							"Nom de fichier vide", "Attention",
							JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					lines.add(texte);
					area.setSelectionStart(0);
					area.setSelectionEnd(500);
					area.cut();

					String fileName = field.getText();

					try {

						Path file = Paths.get(fileName);
						Files.write(file, lines, StandardCharsets.UTF_8);
					}
					catch (IOException e){
						System.out.println("An error occurred.");
						e.printStackTrace();
					}

					cpt++;
					if(cpt>=12)
					{
						
						JOptionPane.showMessageDialog(null,
								"Vous avez rentré vos 12 questions !", "Attention",
								JOptionPane.WARNING_MESSAGE);
						frame.dispose();
						menu = new Menu();
				        menu.init();
					}
				}
			}

		});
		
		
		frame.getContentPane().add(label);
		frame.getContentPane().add(field);
		frame.getContentPane().add(button);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(area);
		frame.getContentPane().add(button2);

		frame.setVisible(true);
		frame.pack();
	}

}