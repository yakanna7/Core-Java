package packages.java.io;
import java.io.*;

public class DirCopy {
	
	public void copyDirectory(File sourceLocation , File targetLocation)
		    throws IOException {

		        if (sourceLocation.isDirectory()) {
		            
		        	if (!targetLocation.exists()) 
		            {
		                targetLocation.mkdir();
		            }

		            String[] children = sourceLocation.list();
		            for (int i=0; i<children.length; i++) 
		            {
		                copyDirectory(new File(sourceLocation, children[i]),
		                        new File(targetLocation, children[i]));
		            }
		        } 
		        else {

		            InputStream in = new FileInputStream(sourceLocation);
		            OutputStream out = new FileOutputStream(targetLocation);

		            // Copy the bits from instream to outstream
		            byte[] buf = new byte[1024*1024];
		            int len;
		            while ((len = in.read(buf)) > 0) {
		                out.write(buf, 0, len);
		            }
		            in.close();
		            out.close();
		        }
		    }

      public static void main(String args[]) throws IOException
      {
    	  DirCopy dc=new DirCopy();
    	  File f1=new File("D://notes/c++");
    	  File f2=new File("d://imp");
    	  dc.copyDirectory(f1,f2);
    	  System.out.println("Directoty Copied");
      }
}
