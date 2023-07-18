package packages.java.applet;

import java.awt.*;  
import java.applet.*;  

public class AppletAnimation extends Applet{

	  Image picture;  
	  
	  public void init() {  
	    picture =getImage(getDocumentBase(),"bike.jpg");  
	    setSize(1000,1000);
	  }  
	    
	  public void paint(Graphics g) {  
	    for(int i=500;i>0;i--){  
	      g.drawImage(picture,i,30, this);  
	      
	      if(i==1)
	        i=500;
	      try{Thread.sleep(5);}catch(Exception e){}  
	    }  
	  }  
}
