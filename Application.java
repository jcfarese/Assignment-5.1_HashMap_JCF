/**
 * @author Jim Farese
 * @version 11/17/2022
 * @about Application class that creates a dictionary object to implement the Dictionary class
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Application {
	
	public static void main(String[] args) {
		
		//instance of dictionary object
		Dictionary myDictionary = new Dictionary();
		
		//runs scanFile method from Dictionary class
		myDictionary.scanFile();
		//runs hashFile method from Dictionary class
		myDictionary.hashFile();
		
		//runs getWord method from Dictionary class
		System.out.println("\n***5 words with their definition and Hashkey are:***");
		myDictionary.getWord();
		
	}//end Main method
	
	

}//end Application class
