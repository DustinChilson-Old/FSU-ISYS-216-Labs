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

public class Lab28 {
  public static void main(String[] args) {
System.out.println("\n----A----");
		Fish myFish = new Tuna();
    System.out.println("My fish lives in: " + myFish.habitat());
    
System.out.println("\n----B----");
		Beverage myDrink = new Cola();
    System.out.println("Is my drink carbonated? " + myDrink.isCarbonated());

System.out.println("\n----C----");
		ArrayList games = new ArrayList();
		games.add(new Hockey());
		games.add(new Soccer());
		for (int i = 0; i < games.size(); i++) {
		Game current = (Game)games.get(i);
		System.out.println(current.toString());
		}
	}
}
abstract class Fish {
  public abstract String habitat();
  public abstract boolean isEdible();
}
class Tuna extends Fish {
  public String habitat() {
    return "Oceans";
  }
	public boolean isEdible() {
		return true;
	}
}

abstract class Beverage {
  public abstract boolean isCarbonated();
}
class Cola extends Beverage {
  public boolean isCarbonated() {
    return true;
  }
}

abstract class Game {
  public String name;
  public abstract String getName();
  public abstract String toString();
}
class Hockey extends Game {
  public Hockey() {
    name = "Hockey";
  }
	public String getName() {
		return name;
	}
  public String toString() {
    return getName() + " is played on ice";
  }
}
class Soccer extends Game {
  public Soccer() {
    name = "Soccer";
  }
	public String getName() {
		return name;
	}
  public String toString() {
    return getName() + " is played on grass";
  }
}
