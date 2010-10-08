/**
 *
 * @author dustinchilson
 * @creation_date Jan 24, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab12B {
  public static void main(String[] args) {
    for (int num = 50; num >= 0; num--) {
      num -= 5;
      System.out.println(num);
      num += 1;
      if (num <= 1){
          break;
      }
    }
    System.out.println("DONE");
  }
}


