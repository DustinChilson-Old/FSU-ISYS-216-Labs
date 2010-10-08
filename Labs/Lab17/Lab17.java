public class Lab17 {
  public static void main(String[] args) {
    
	System.out.println("----A----");
	Dice d1 = new Dice();
    Dice d2 = new Dice();
    System.out.println("Start: " + d1.getValue() + ", " + d2.getValue());
    do {
      d1.roll();
      d2.roll();

	  d1.setValue(d2.getValue());
	
      System.out.println("Rolled: " + d1.getValue() + ", " + d2.getValue());
    } while(d1.getValue() != d2.getValue());
    System.out.println("Game over");

	System.out.println("\n----B----");
	Dice d3 = new Dice();  // CREATE THE DICE
	d3.setSides(12);  // GIVE IT 12 SIDES 
	d3.roll();  // ROLL IT 
	System.out.println("Value: " + d3.getValue());  // SHOW ITS VALUE
	
	System.out.println("\n----C----");
	Dice d = new Dice();
	d.setSides(12);
	//System.out.println("Sides: " + d.getSides());
	d.roll();
	//System.out.println("Value: " + d.getValue() + " : after roll.");
	d.setValue(d.getSides()); 
	System.out.println("Value: " + d.getValue());
		
  }
}
class Dice {
  private int sides;
  private int value;
  public Dice() {
    setSides(6);
    roll();
  }
  public void setSides(int n) {
    if (n >= 2)
      sides = n;
    else
      sides = 6;
  }
  public void setValue(int n) {
    if (n > 0 && n <= sides)
      value = n;
  }
  public int getSides() {
    return sides;
  }
  public int getValue() {
    return value;
  }
  public void roll() {
    value = (((int)(Math.random() * 1000)) % sides) + 1;
  }
}
