package ApplicationQ;

/**
 * 
 * @author jenniferzhang
 *
 */

import java.util.Scanner;

public class ApplicationQ2 {

	public static void main(String[] args) {
		
		// Scanner class
		Scanner s = new Scanner(System.in);
		
		// ask the user for a word
		System.out.println("please enter a word: ");
		String word = s.next();
		
		// while loop to generate answers
		while ( !word.equals("quit")) {
			if (word.length() >= 4 && word.substring(word.length()-2).equals("or")) {
				if (!word.substring(word.length()-3, word.length()-2).equals("a") && !word.substring(word.length()-3, word.length()-2).equals("e") && !word.substring(word.length()-3, word.length()-2).equals("i") && !word.substring(word.length()-3, word.length()-2).equals("o") && !word.substring(word.length()-3, word.length()-2).equals("u") && !word.substring(word.length()-3, word.length()-2).equals("y"))
					System.out.println(word.substring(0,word.length()-2) + "our");
				else 
					System.out.println(word);
			}
			else {
				System.out.println(word);
			}
			System.out.println("please enter a word: ");
			word = s.next();
		}
		

	}

}
