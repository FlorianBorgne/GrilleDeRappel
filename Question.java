package fr.koor.swing.samples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Question {
	
	public static ArrayList<String> collection = new ArrayList<String>(); 
	
	public ArrayList read(String arg) throws IOException, ParseException
	 {
		 
		 BufferedReader buffer = new BufferedReader(new FileReader(arg));
	     String s = new String();
	     int flag=0;
	     while ((s = buffer.readLine()) != null)
	     {
	    	 if(flag==0)
	    	 {
	 	        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	 	        Date date = formatter.parse(s);
	 	        s = formatter.format(date);
	 	        Question.collection.add(s);
	 	        flag=1;
	 	        continue;
	    	 }
	    	 Question.collection.add(s);
	 
	       
	     }
	     ArrayList<String> list = new ArrayList<String>();
	     for (int i=1; i<=12;i++) {
	    	 	int r = random(collection.size());
	        	list.add(collection.get(r));
	        	collection.remove(r);
	            
	     }
	
	     buffer.close();
		return list;
	 }
	
	public int random(int higher)
	{
		return (int)(Math.random() * (higher-1)) + 1;
	}
	 
}       
	        
	
	        
	     
	        