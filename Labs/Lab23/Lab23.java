/**
 *
 * @author Dustin Chilson
 * @creation_date 03-14-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
import java.util.*;

public class Lab23 {
  public static void main(String[] args) {
		
		System.out.println("\n----A----");
  	ArrayList list = new ArrayList();
  	list.add("Happy");
  	list.add("Sleepy");
  	list.add("Sneezy");
  	list.add("Doc");
  	for (int i = 0; i < list.size(); i++) {
    	System.out.println(list.get(i).toString().charAt(0));
			//System.out.println((list.get(i).charAt(0))); //Does not work
  	}

		System.out.println("\n----B----");
		System.out.println("Not sure how this section should work."); 	
		ArrayList strings = new ArrayList();
    strings.add("PIECE");
    strings.add("OF");
    strings.add("CAKE");
    while (!strings.isEmpty()) { 
      System.out.println(strings.remove(0));
    }

		System.out.println("\n----C----");
		ArrayList names = new ArrayList();
    for (int i = 0, n = (int)(Math.random()*100); i < 100; i++) {
      if (i == n) {
        names.add("Waldo");
      }
      else {
        names.add("XXX");
      }
    }
    int index = names.indexOf("Waldo");    // Find the index of "Waldo"
    System.out.println("\"Waldo\" at index: " + index);
    names.set(index, "XXX");             // Replace the element with a reference to "XXX"
    if (!names.contains("Waldo")) {   // Prove that "Waldo" no longer exists
      System.out.println("Waldo is gone");
    }
	
  }
}

