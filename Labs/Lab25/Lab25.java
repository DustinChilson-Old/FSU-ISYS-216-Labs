/**
 *
 * @author Dustin Chilson
 * @creation_date 03-31-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab25 {
  public static void main(String[] args) {
System.out.println("\n----A----");
		System.out.println(new Duck().says());       // Say "quack!"
    System.out.println(new Duck().sayHello());       // Say "QUACK!QUACK!"

System.out.println("\n----B----");
		Message x = new Message();
    x.setText("Hello World!");
    Message y = new Message();
    System.out.println(y.getText());

System.out.println("\n----C----");
		Number xc = new Number(17);                      // "wrap" the value 17
    if (Number.isEven(xc.getNumber())) {                  // Determine if the wrapped value is even 
      System.out.println(xc.getNumber() + " is EVEN");  // Get and show a wrapped EVEN value 
    } else {
      System.out.println(xc.getNumber() + " is ODD");   // Get and show a wrapped ODD value
    }
  }
}

class Duck {
  public String says() {
    return "quack!";
  }
  public static String sayHello() {
    return "QUACK!QUACK!";
  }
}

class Message {
  private static String text;
	public Message(){
		setText("Hello World!");
	}
  public void setText(String parm) {
    text = parm;
  }
  public String getText() {
    return text;
  }
}

class Number {
  private int number;
  public Number(int n) {
    number = n;
  }
  public int getNumber() {
    return number;
  }
  public static boolean isEven(int n) {
    if (n%2 == 0)
      return true;
    else
      return false;
  }
}
