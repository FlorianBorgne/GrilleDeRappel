import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Question {
	
	public static ArrayList<String> collection = new ArrayList<String>(); 
	String s = new String();
	protected String date = new String();
	public ArrayList<String> read(String arg) throws IOException, ParseException
	 {
		 
		 BufferedReader buffer = new BufferedReader(new FileReader(arg));
	     String s = new String();
	     int flag=0;
	     while ((s = buffer.readLine()) != null)
	     {
	    	 if(flag==0)
	    	 {
	 	        
	 	        Question.collection.add(s);
	 	        flag=1;
	 	        continue;
	    	 }
	    	 Question.collection.add(s);
	 
	       
	     }
	

	     ArrayList<String> list = new ArrayList<String>();
	     for (int i=0; i<12;i++) {
	    	 	int r = random(collection.size());
	        	list.add(collection.get(r));
	        	collection.remove(r);
	            
	     }
	     this.date=(collection.get(0));
	     buffer.close();
		return list;
	 }
	
	


	public int random(int higher)
	{
		return (int)(Math.random() * (higher-1)) + 1;
	}
	 
}       
	        
	    
	  