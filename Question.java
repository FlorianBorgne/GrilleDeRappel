import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;


public class Question {
	
	public static ArrayList<String> collection = new ArrayList<String>(); 
	String s = new String();
	protected String date = new String();
	public ArrayList<String> read(String arg) throws IOException, ParseException
	 {
		 
		 BufferedReader buffer = new BufferedReader(new FileReader(arg));	//Lit les lignes du fichier texte
	     String s = new String();
	     int flag=0;
	     while ((s = buffer.readLine()) != null)
	     {
	    	 //Ici on s'occupe d'enregistrer la date
	    	 if(flag==0)
	    	 {
	 	        
	 	        Question.collection.add(s);	//On ajoute la date dans la liste
	 	        flag=1;
	 	        continue;
	    	 }
	    	 Question.collection.add(s);	//on ajoute les autres questions dans la liste
	 
	       
	     }


	     ArrayList<String> list = new ArrayList<String>();	//deuxième liste pour mettre les questions dans un ordre aléatoire
	     for (int i=0; i<12;i++) {
	    	 	int r = random(collection.size());	//On sélectionne une position aléatoire dans la liste
	        	list.add(collection.get(r));//On ajoute dans la nouvelle liste
	        	collection.remove(r);//On supprime l'ancienne question
	            
	     }
	     this.date=(collection.get(0));//On met la date dans une variable
	     buffer.close();
		return list;
	 }
	
	

	//fonction random
	public int random(int higher)
	{
		return (int)(Math.random() * (higher-1)) + 1;
	}
	 
}       
	        
	    
	  