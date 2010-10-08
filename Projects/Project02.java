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
		Person[] person = new Person[10];
		person[0] = new Employee(24000.00, "Barb Webb", "123 Maple");
		person[1] = new Customer(150.00, "Todd Kent", "4321 Oak");
		person[2] = new SalesRep(6.00, 9000.00, 18000.00, "Ted Na", "654 Elm");
		
		for (int i = 0; i < person.length; i++) {
			if (person[i] != null) {
				System.out.println(person[i].toString());
				if (person[i] instanceof Payable) {
					System.out.println((Payable)person[i].pay());
				}
			}
		}
  }
}

// This abstract class encapsulates the data and processing of a person.
// ----- Written by: Jon Huhtala
abstract class Person {
  private String name;
  private String address;
  // This constructor receives the person's name and address as parameters.
  public void Person(String pName, String pAddress) {
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
class Customer extends Person {
	private double balance;
	public Customer (Double inBalance, String inName, String inAddress) {
		super.setName(inName);
		super.setAddress(inAddress);
		setBalance(inBalance);
	}
	public void setBalance(Double inBalance) {
		balance = inBalance;
	}
	public Double getBalance(){
		return balance;
	}
	public String toString(){
		return super.toString() + ", " + Utility.moneyFormat(balance);
	}
}

class Employee extends Person implements Payable {
	private double salary;
	public Employee (Double inSalary, String inName, String inAddress) {
		super.setName(inName);
		super.setAddress(inAddress);
		setSalary(inSalary);
	}
	public void setSalary(Double inSalary) {
		salary = inSalary;
	}
	public Double getSalary(){
		return salary;
	}
	public String toString(){
		return super.toString() + ", " + Utility.moneyFormat(salary);
	}
	public double pay() {
		return salary/24;
	}
}

class SalesRep extends Employee implements Payable {
	private Double commRate;
	private Double sales;
	public SalesRep (Double inCommRate, Double inSales, Double inSalary, String inName, String inAddress) {
		super.setName(inName);
		super.setAddress(inAddress);
		super.setSalary(inSalary);
		setCommRate(inCommRate);
		setSales(inSales);
	}
	public void setCommRate(Double inCommRate) {
		commRate = inCommRate;
	}
	public Double getCommRate(){
		return commRate;
	}
	public void setSales(Double inSales) {
		sales = inSales;
	}
	public Double getSales(){
		return sales;
	}
	public String toString(){
		return super.toString() + ", " + Utility.percentFormat(commRate, 2);
	}
	public double pay() {
		return super.pay() + (sales*commRate);
	}
}

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