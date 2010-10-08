/**
 *
 * @author Dustin Chilson
 * @creation_date 03-14-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab21 {
  public static void main(String[] args) {
    System.out.println("\n----A----");
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 4; i >= 0; i--) {
      System.out.println(vowels[i]);
		}

		System.out.println("\n----B----");
		int[] values = new int[10];
		for (int j = 0; j < values.length; j++) {
			values[j] = j + 1;
	    System.out.println("Element " + j + " = " + values[j]);
		}

		System.out.println("\n----C----");
  	char[] table = {'a', 'b', 'c', 'd'};

		char temp = table[0]; 
		table[0] = table[table.length-1];
		table[table.length-1] = temp;

    for (int i = 0; i < table.length; i++) {
      System.out.println(table[i]);
    }
  }
}


