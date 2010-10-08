/**
 *
 * @author dustinchilson
 * @creation_date Jan 21, 2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
public class Lab04A {
    public static void main(String[] args) {
        int base = 5;
        double height = 4;
        double areaOfTriangle = (base*height)/2;   // One-half base times height
        System.out.println("Area of triangle: " + areaOfTriangle);
        byte students = 23;
        short marbles = 2703;
        int marblesPerStudent = marbles/students;   // Quotient of marbles divided by students
        int marblesRemaining = marbles%students;   // Remainer of marbles divided by students
        System.out.println("Marbles per student: " + marblesPerStudent);
        System.out.println("Marbles remaining: " + marblesRemaining);
    }
}
