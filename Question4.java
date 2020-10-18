package ApplicationQ;

/**
 * 
 * @author jenniferzhang
 *
 */

public class Question4 {

	public static void main(String[] args) {
		
		// declaration of an array
		int[] array = {30,17,79,65,98};
		
		// call on the method
		insertElementAt(array, 3, 73);

	}
	
	// method of inserting an element
	public static void insertElementAt(int[] x, int y, int z) {
		
		//declaration of a new array
		int[] n = new int[x.length+1];
		
		// the first part that does not change
		for (int i=0; i<y; i++) {
			n[i] = x[i];
		}
		
		// add the inserted number
		n[y] = z;
		
		// the second half that changes
		for (int j=y+1; j<x.length+1; j++) {
			n[j] = x[j-1];
		}
		
		// print out the new array
		for (int k=0; k<x.length+1; k++) {
			System.out.print(n[k] + " ");
		}
	}

}
