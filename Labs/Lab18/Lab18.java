public class Lab18 {
  public static void main(String[] args) {
    System.out.println("\n----A----");
	String x = new String("Java rules");
    String y = "Java rules";
    System.out.println("Comparing the following strings:");
    System.out.println(x);
    System.out.println(y);
    if (x.equals(y)) {
      System.out.println("The strings are equal");
    } else {
      System.out.println("The strings are different");
	}

	System.out.println("\n----B----");
    String address1 = "Obama,Barack,1600 Pennsylvania Avenue";
    System.out.println("Original: " + address1);
    String address2 = address1.replace(",","/");
    System.out.println("Modified: " + address2);
	
	System.out.println("\n----C----");
    String data1 = "       123.45   ";
    System.out.println("Original: " + data1);
    String data2 = data1.trim();
    System.out.println("Modified: " + data2);
    System.out.println("Length of modified string: " + data2.length());
  }
}
