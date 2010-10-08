/**
 *
 * @author Dustin Chilson
 * @creation_date 03-01-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab19 {
  public static void main(String[] args) {
	System.out.println("\n----A----");
		StringBuffer message = new StringBuffer("Hello World!");
		System.out.println(message.reverse());
	
	System.out.println("\n----B----");
		String s = "Java is fun!";
	    StringBuffer sb = new StringBuffer("Java is fun!");
	    if (s.toString().equals(sb.toString())) {
	      System.out.println("The strings are identical");
	    } else {
	      System.out.println("The strings are different");
		}

	System.out.println("\n----C----");
		StringBuffer messageC = new StringBuffer("Michigan is cold in the winter");
		messageC.replace(12,16,"cold and snowy");
		System.out.println(messageC);
  }
}

