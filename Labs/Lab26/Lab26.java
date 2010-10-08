/**
 *
 * @author Dustin Chilson
 * @creation_date 04-04-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab26 {
  public static void main(String[] args) {
System.out.println("\n----A----");
		Duck myDuck = new Duck();
		System.out.println(myDuck.toString());

System.out.println("\n----B----");
		Duck_B myDuck_B = new Duck_B();
		System.out.println(myDuck_B.toString());

System.out.println("\n----C----");
		Customer c = new Customer("Mark Twain", 392105);
    System.out.println(c.toString());


  }
}
class Duck {
	public String says() {
    return "QUACK!";
  }
}
class Duck_B {
	public String says() {
    return "QUACK!";
  }
  public String toString() {
		return super.toString() + " - " +says();
	}
}
class Person {
  private String name;
  public Person(String iName) {
    name = iName;
  }
  public String getName() {
    return name;
  }
}
class Customer extends Person {
  private int number;
  public Customer(String iName, int iNumber) {
    super(iName);
    number = iNumber;
  }
  public int getNumber() {
    return number;
  }
  public String toString() {
    return getNumber() + " - " + getName();
  }	
}
