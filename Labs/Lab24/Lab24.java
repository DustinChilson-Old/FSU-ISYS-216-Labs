/**
 *
 * @author Dustin Chilson
 * @creation_date 03-31-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab24 {
public static void main(String[] args) {
	
System.out.println("\n----A----");
    Counter c1 = new Counter();
    Counter c2 = new Counter(5); 
    System.out.println(c1.getCount());
    System.out.println(c2.getCount());

System.out.println("\n----B----");
		new Duck().sayHello();
		
System.out.println("\n----C----");
		Lamp myLamp = new Lamp();
    System.out.println(myLamp.toString());
    myLamp.setIsOn(true);
    System.out.println(myLamp.toString());
	}
}

class Counter {
  private int count;
	public Counter() {
			setCount(1);
	} 
	public Counter(int n) {
		setCount(n);
	}
  public void setCount(int n) {
    count = n;
  }
  public int getCount() {
    return count;
  }
  public void increment() {
    count++;
  }
}

class Duck {
	public void sayHello() {
		System.out.println("QUACK!");
	}
}

class Lamp {
  private boolean hasBulb;
  private boolean isOn;
	public Lamp(){
		setHasBulb(true);
		setIsOn(false);
	}
	public Lamp(boolean on) {
		setHasBulb(true);
		
		if (on == true) {
			setIsOn(true);
		}else {
			setIsOn(false);
		}
	} 
  public void setHasBulb(boolean parm) {
    hasBulb = parm;
  }
  public void setIsOn(boolean parm) {
    isOn = parm;
  }
  public String toString() {
    if (hasBulb && isOn) {
      return "There is light...";
    }
    else {
      return "There is darkness...";
    }
  }
}
