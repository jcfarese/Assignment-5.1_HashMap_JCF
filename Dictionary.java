/**
 * @author Jim Farese
 * @version 11/17/2022
 * @about Dictionary class that imports a text file and puts the words and definitions into a hashmap and then prints the words and also searches for specific words in the hashmap and prints that specific word, its definition, and its hash code.
 * 
 */

/*
 * imports for the class
 */
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {
	
	//creates a dictionary of type hashmap
	HashMap<String, String> dictionary = new HashMap<String, String>();
	Scanner scan;
	String key;
	String value;
	
	/**
	 * Method is used to create a new scan and use it to import a text file
	 */
	public void scanFile() {
		try {
			File dictionaryDefinitions = new File("C:\\Users\\jcfar\\eclipse-workspace\\Assignment 5.1_HashMap_JCF\\Dictionary Text.txt"); 
			scan = new Scanner(dictionaryDefinitions);
		}
		catch(FileNotFoundException e) {
			System.out.println("***File not found***");
		}
	}//end scanFile method
	
	/**
	 * Method used to take the new text file and while using the delimiter "tab" creates a key from the word and a value from the definition and puts them into the hashmap then print out the dictionary as well as telling you how many words that are in the dictionary
	 */
	public void hashFile() {
		int count = 0;
		while(scan.hasNext()) {
			count++;
			String word = scan.nextLine();
			int delimiter = word.indexOf("\t");
			
			if(delimiter!=-1) {
				key = word.substring(0, delimiter);
				value = word.substring(delimiter+1, word.length());
				dictionary.put(key, value);
			}
		}
		
		System.out.println(dictionary);
		System.out.println("\nThere are " + count + " words in the dictionary.");
	}//end hashFile method
	
	/**
	 * Method used to find 5 different words in the dictionary hashmap and gets the value "definition" of the key "word" and also prints the hashcode for each key
	 */
	public void getWord() { 
		System.out.println("Egad: " + dictionary.get("egad") + ". \nThe Hashkey is: " + "egad".hashCode());
		System.out.println("\nFeminal: " + dictionary.get("feminal") + ". \nThe Hashkey is: " + "feminal".hashCode());
		System.out.println("\nSea coal: " + dictionary.get("sea coal") + ". \nThe Hashkey is: " + "sea coal".hashCode());
		System.out.println("\nSalamander: " + dictionary.get("salamander") + ". \nThe Hashkey is: " + "salamander".hashCode());
		System.out.println("\nOtiose: " + dictionary.get("otiose") + ". \nThe Hashkey is: " + "otiose".hashCode());
	}//end getWord method
	
}//end Dictionary class




