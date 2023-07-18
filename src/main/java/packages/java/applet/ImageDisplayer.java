package packages.java.applet;

import java.awt.*; 
 
import java.applet.*;  

public class ImageDisplayer extends Applet {

	Image picture;  
	  
	  public void init() {  
	    picture = getImage(getDocumentBase(),"flowers.jpg");  
	  }  
	    
	  public void paint(Graphics g) {  
	    g.drawImage(picture, 0,0, this);  
	  }  

}
