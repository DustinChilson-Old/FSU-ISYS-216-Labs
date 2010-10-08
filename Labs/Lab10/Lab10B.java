/**
 *
 * @author dustinchilson
 * @creation_date Jan 24, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab10B {
    public static void main(String[] args) {
        int x = 1;
        for (; x <= 10; x++) {
            System.out.print(x);
            if (x%2 == 0) {
                System.out.println(" is EVEN");
            } else {
                System.out.println(" is ODD");
            }
        }
        System.out.println("Processing complete");
    }
}


