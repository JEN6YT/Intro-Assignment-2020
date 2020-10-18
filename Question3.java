package ApplicationQ;

/**
 * 
 * @author jenniferzhang
 *
 */

public class Question3 {

	public static void main(String[] args) {
		
		
		// declaration of an array
		int[] matrix = new int[5];
		
		// declaration of 2 numbers
		int n = 9;
		int m = 9;
		
		// nested for loop to print out the result
		for (int i=1; i<=9; i+=2) {
			for (int j=9; j>=i; j-=2) {
				while(n>=1) {
					System.out.print(n+" ");
					n-=2;
				}
			}
			System.out.println();
			// assign a new value to the beginning of a new line
			m-=2;
			n=m;
		}

	}

}
