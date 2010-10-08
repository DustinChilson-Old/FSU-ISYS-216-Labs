/**
 *
 * @author Dustin Chilson
 * @creation_date 04-12-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab30 {
  private static double radius = 5.0;
  public static void main(String[] args) {
System.out.println("\n----A----");
    System.out.println("Area: " + Circle.area());  // GET AREA

System.out.println("\n----B----");
		System.out.println("Perimeter: " + Circle.perimeter());  // GET PERIMETER

System.out.println("\n----C----");
		OuterInner.InnerInner x = new Lab30C().new OuterInner().new InnerInner().new;
		System.out.println(x.toString());
}
  
	public static class Circle {
    public static double area() {
      return Math.pow(radius, 2) * Math.PI;
    }
    public static double perimeter() {
      return Math.PI * (radius * 2);
    }
  }
  public class OuterInner {
    public class InnerInner {
    }
  }

}


