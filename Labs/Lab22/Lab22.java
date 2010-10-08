/**
 *
 * @author Dustin Chilson
 * @creation_date 03-14-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab22 {
  public static void main(String[] args) {
    System.out.println("\n----A----");
		StringBuffer[] messages = new StringBuffer[3];
    messages[0] = new StringBuffer("Today is Tuesday");
    messages[1] = new StringBuffer("Yesterday was Monday");
    messages[2] = new StringBuffer("Tomorrow will be Wednesday");
    for (int i = 0; i < messages.length; i++) {
      System.out.println(messages[i]);
    }

		System.out.println("\n----B----");
    String[] names = {"Bob", "Bob"};
    if (names[0].equals(names[1])) {
      System.out.println("YEP - they're identical");
		}

		System.out.println("\n----C----");
		String[] bigArray = new String[1000];
    int index = (int)(Math.random()*1000);
    bigArray[index] = "Target";
    for (int i = 0; i < bigArray.length; i++) {
      if (bigArray[i] != null) {
        System.out.println("\"Target\" found at index: " + i);
      }
    }
    
	
  }
}