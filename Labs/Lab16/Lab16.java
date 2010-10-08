public class Lab16 {
  public static void main(String[] args) {
    
	System.out.println("----A-----");
	for (int i = 0; i < 100; i++) {
      new String("This is garbage...");
    }
    System.gc();
    System.out.println("Garbage collection requested");
    System.out.println("Processing complete");

	System.out.println("\n----B----");
	long now = System.currentTimeMillis();
	System.out.println("Current time: " + now);
	System.out.println("10 seconds from now: " + (now + 10000));
	
	
	System.out.println("\n----C-----");
	while (true) {
		double n = Math.random();
	    System.out.println(n);
	    if (n < .25)
	    	System.exit(0);;
		}
	}
}
