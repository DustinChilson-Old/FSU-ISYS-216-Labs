/**
 *
 * @author Dustin Chilson
 * @creation_date 04-26-2010
 * @description ~~~~~~~~~
 *
 *
 * ~~~~~~~~~~~~~~~~~~~~~~
 */
// Make it possible to reference required packaged code.

import java.io.*;
import java.text.*;
import java.util.*;

// This class defines an application that uses polymorphism to process an
// array of Employee, SalesRep, and Customer objects.
// ----- Written by: [YOUR NAME GOES HERE]

public class Project02 {
  public static void main(String[] args) {

    //-----------------------------------------------------------------------
    // YOUR CODE TO TEST THE CLASS HIERARCHY GOES HERE
    //-----------------------------------------------------------------------

  }
}

// This abstract class encapsulates the data and processing of a person.
// ----- Written by: Jon Huhtala

abstract class Person {
  private String name;
  private String address;

  // This constructor receives the person's name and address as parameters.

  public Person(String pName, String pAddress) {
    setName(pName);
    setAddress(pAddress);
  }

  // This method can be called to set the person's name.

  public void setName(String pName) {
    name = pName;
  }

  // This method can be called to set the person's address.

  public void setAddress(String pAddress) {
    address = pAddress;
  }

  // This method can be called to get the person's name.

  public String getName() {
    return name;
  }

  // This method can be called to get the person's address.

  public String getAddress() {
    return address;
  }

  // This method can be called to get the object's runtime class and the
  // person's name and address as a String.

  public String toString() {
    return getClass().getName() + ": " + name + ", " + address;
  }
}

// This interface forces implementing classes to define a pay method.
// ----- Written by: Jon Huhtala

interface Payable {
  public double pay();
}

//---------------------------------------------------------------------------
// YOUR CODE TO COMPLETE THE CLASS HIERARCHY CODE GOES HERE
//---------------------------------------------------------------------------

// This class contains custom methods that support application processing.
// ----- Written by: Jon Huhtala

class Utility {

  // This method can be called to prompt the user to press the ENTER key to
  // continue.

  public static void pressEnter() {
    System.out.println("Press ENTER to continue...");
    try {
      System.in.read();
      System.in.skip(System.in.available());
    }
    catch (Exception err) {}
  }

  // This method can be called to convert a double value to a properly
  // formatted currency string. For example: (1234.56) returns "$1,234.56"

  public static String moneyFormat(double pAmount) {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return nf.format(pAmount);
  }

  // This method can be called to convert a double value to a formatted
  // percentage string having the number of decimal places indicated by the
  // second parameter. For example: (.01234, 2) returns "1.23%"

  public static String percentFormat(double pValue, int pDecimalPlaces) {
    NumberFormat nf = NumberFormat.getPercentInstance();
    nf.setMaximumFractionDigits(pDecimalPlaces);
    return nf.format(pValue);
  }
}


