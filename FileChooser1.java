

import java.io.File;


import java.io.IOException;
import java.text.ParseException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class FileChooser1 {
	public String sf = new String();
	
	
	public String getSf() {
		return this.sf;
	}
	
	
    public void init() {
    	
    

    	

    	
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);
     

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            sf = selectedFile.getPath();
            //this.sf="12.txt";
            System.out.println(this.getSf());
        }
        else {
        	System.exit(1);
        }
       
    }
	
    

}