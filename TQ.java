package ThinkingQ;

/**
 * 
 * @author jenniferzhang
 *
 */

// import Scanner
import java.util.Scanner;

public class TQ {

	public static void main(String[] args) {
		
		// Scanner class
		Scanner s = new Scanner(System.in);
		
		// ask the user to enter a word
		System.out.println("please enter a word: ");
		String w = s.next();
		
		do {
			
			// method
			String newW = swap(w);
			
			// check if the word is a palindrome
			if (w.equals(newW)) 
				System.out.println("is a palindrome");
			else
				System.out.println("is not a palindrome");
			
			// ask the user to enter a word
			System.out.println("please enter a word: ");
			w = s.next();
			
		}while(!w.equals("quit"));

	}
	
	// method to reverse the order of the inputed word
	public static String swap(String word) {
		String n="";
		for (int i=1; i<=word.length(); i++) {
			n = n + word.charAt(word.length()-i);
		}
		return n;
	}

}
