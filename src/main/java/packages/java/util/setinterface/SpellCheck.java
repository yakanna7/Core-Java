package packages.java.util.setinterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpellCheck  {
	public static void main(String args[])throws FileNotFoundException
	{
		// read dictionary and document words
		Set<String> dictionaryWords=readWords("D://Notes/Java/dictionary.txt");
		Set<String> documentWords=readWords("D://Notes/Java/document.txt");
		System.out.println("Spelling mistake words are");
		for(String word:documentWords)
		{
			if(!dictionaryWords.contains(word))
		        System.out.println(word);
		}
	}	
	
	public static Set<String> readWords(String fileName)throws  FileNotFoundException
	{
		Set<String> words=new HashSet<String>();
		File file=new File(fileName);
		Scanner in=new Scanner(file);
		in.useDelimiter("[^a-zA-Z]+");
		while(in.hasNext())
		{
			words.add(in.next().toLowerCase());
		}
		in.close();
		return words;
	}
 }
