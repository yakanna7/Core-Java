package packages.java.util.listinterface;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class CommonFilesRemover {

       public static void main(String args[])throws FileNotFoundException
		{
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter source and destination dir names");
			String source=s.next();
			String dest=s.next();
			deleteCommonFiles(source,dest);
			s.close();
		}
		
		public static void deleteCommonFiles(String sourceDir,String destinationDir)throws FileNotFoundException
		{
		  if(!sourceDir.equals(destinationDir))
		  {		  
		      boolean noFileFound=true;
			  File source=new File(sourceDir);
			  File destination=new File(destinationDir);
		      String  sourceFiles[]=source.list();
		      String  destinationFiles[]=destination.list();
		      List<String> sourceList=Arrays.asList(sourceFiles);
		      List<String> destinationList=Arrays.asList(destinationFiles);
		      for(String file : sourceList)
				{
					if(destinationList.contains(file))
					{
						File removedFile=new File(destinationDir,file);
						String fileName=removedFile.getName();
						if(removedFile.delete())
							System.out.println("Common File "+fileName+" deleted successfully");
					    noFileFound=false;
					}	
				
				}
		      if(noFileFound)
		        System.out.println("No Common Files Found In Destination Directory");
		}
	    else
	    {
	    	System.out.println("Source and Destination must be different");
	    }
	}	  
  }		
				
		
			
			
		


