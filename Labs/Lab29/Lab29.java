/**
 *
 * @author Dustin Chilson
 * @creation_date 04-05-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */

public class Lab29 {
  public static void main(String[] args) {
System.out.println("\n----A----");
    Animal[] animals = new Animal[3];
    animals[0] = new Dog();
    animals[1] = new Bear();
    animals[2] = new Cat();
    for (int i = 0; i < animals.length; i++) {
      animals[i].sayHello();
      if (animals[i] instanceof Hunts) {
        System.out.println(" - Hunts");
      }
      if (animals[i] instanceof Petable) {
        System.out.println(" - Likes to " + ((Petable)animals[i]).likesTo());
      }
    }

System.out.println("\n----B----");
		Object[] stuff = new Object[5];
    stuff[0] = new Rock();
    stuff[1] = new Orange();
    stuff[2] = new RubberDucky();
    stuff[3] = new Rock();
    stuff[4] = new Orange();
    for (int i = 0; i < stuff.length; i++) {
      if (stuff[i] instanceof Squeezable) {
        System.out.println("stuff[" + i + "] - " + ((Squeezable)stuff[i]).squeeze());
      }
    }

System.out.println("\n----C----");
		Edible e = new Banana();
    Object o = e;
    Peelable p = (Peelable) o;
    Fruit f = (Fruit) p;
    if (f instanceof Peelable) {
      ((Peelable)f).peel();
    }
    if (f instanceof Edible) {
      ((Edible)f).eat();
    }

  }
}

// A
abstract class Animal {
  public abstract void sayHello();
}
interface Hunts {}
interface Petable {
  public abstract String likesTo();
}
class Dog extends Animal implements Petable {
  public void sayHello() {
    System.out.println("RUFF!");
  }
  public String likesTo() {
    return "fetch a ball";
  }
}
class Bear extends Animal  implements Hunts {
  public void sayHello() {
    System.out.println("GRRR!");
  }
}
class Cat extends Animal  implements Petable {
  public void sayHello() {
    System.out.println("MEOW!");
  }
  public String likesTo() {
    return "sleep in the sun";
  }
}

// B
interface Squeezable {
  public String squeeze();
}
class Rock {}
class Orange implements Squeezable {
  public String squeeze() {
    return "JUICE!";
  }
}
class RubberDucky implements Squeezable {
  public String squeeze() {
    return "SQUEEK!";
  }
}

// C
class Fruit {}
interface Peelable {
  public abstract void peel();
}
interface Edible {
  public abstract void eat();
}
class Banana extends Fruit implements Peelable, Edible {
  public void peel() {
    System.out.println("Remove the peel...");
  }
  public void eat() {
    System.out.println("YUM!");
  }
}
