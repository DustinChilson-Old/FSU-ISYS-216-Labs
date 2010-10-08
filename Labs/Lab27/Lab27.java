/**
 *
 * @author Dustin Chilson
 * @creation_date 04-04-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
import java.util.*;

public class Lab27 {
  public static void main(String[] args) {
System.out.println("\n----A----");
    Object[] array = new Object[5];
    array[0] = new String("I'm a String object");
    array[1] = new StringBuffer("I'm a StringBuffer object");
    array[2] = new Double(123.45);
    array[3] = new Boolean(true);
    for (int i = 0; i < array.length; i++) {
      if (array[i] != null)
        System.out.println(array[i].toString());
    }

System.out.println("\n----B----");
		Fruit[] fruits = new Fruit[5];
		fruits[0] = new Fruit();
		fruits[1] = new Apple();
		fruits[2] = new Banana();
		for (int i = 0; i < fruits.length; i++) {
  		if (fruits[i] != null) {
    		System.out.println(fruits[i].info());
			}
		}

System.out.println("\n----C----");
		Person[] persons = new Person[5];
    persons[0] = new Person("Washington", "George");
    persons[1] = new Friend("Jefferson", "Thomas");
    persons[2] = new Friend("Franklin", "Benjamin");
    persons[3] = new Person("Adams", "John");
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null)
        System.out.println(persons[i].getName());
    }
  }
}

class Fruit {
  public String info() {
    return "I'm a fruit.";
  }
}
class Banana extends Fruit {
  public String info() {
    return "I'm a banana. Remove peel before eating.";
  }
}
class Apple extends Fruit {
  public String info() {
    return "I'm an apple. Don't swallow the seeds.";
  }
}
class Person {
  private String lastName;
  private String firstName;
  public Person(String parmLastName, String parmFirstName) {
    lastName = parmLastName;
    firstName = parmFirstName;
  }
  public String getLastName() {
    return lastName;
  }
  public String getFirstName() {
    return firstName;
  }
  public String getName() {
    return getFirstName() + " " + getLastName();
  }
}
class Friend extends Person {
  public Friend(String parmLastName, String parmFirstName) {
    super(parmLastName, parmFirstName);
  }
  public String getName() {
    return getFirstName();
  } 
}
