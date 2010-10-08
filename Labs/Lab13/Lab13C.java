/**
 *
 * @author dustinchilson
 * @creation_date Feb 16, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab13C {
	public static void main(String[] args) {
    	System.out.println("Larger number: " + larger(7, 3.5));
	}
	
	public static int larger(double one, double two) {
		int output;
		
		if (one > two) {
			output = 1;
		}else if (one < two) {
			output = 2;
		}else {
			output = 0;
		}
		
		return output;
	}

	
}
