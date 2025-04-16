package basic_codes;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // year to be checked
	    int year = 1900;
	    boolean leap = false;

	    // if the year is divided by 4
	    if (year % 4 == 0) {

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // if the year is not century
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	  }
	
	}

/*
 *   // Method to check leap year
  public static void checkLeapYear(int year) {
    if (year % 400 == 0) {
      System.out.println(year + " is a leap year.");
    } else if (year % 100 == 0) {
      System.out.println(year + " is not a leap year.");
    } else if (year % 4 == 0) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter a year to check:");

    int year = s.nextInt(); // Read user input from command line

    checkLeapYear(year);
  }*/

/* ###run on the terminal
 * public static void checkLeapYear(int year) {
    if (year % 400 == 0) {
      System.out.println(year + " is a leap year.");
    } else if (year % 100 == 0) {
      System.out.println(year + " is not a leap year.");
    } else if (year % 4 == 0) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }

  public static void main(String[] args) {
    if (args.length > 0) {
      // convert string into integer
      int year = Integer.parseInt(args[0]);
      checkLeapYear(year);
    } else {
      System.out.println("No arguments provided.");
    }
  }*/

/*import java.time.*;
import java.util.*;


public class CheckLeapYear {

public boolean isLeap();


  public static void main(String[] args) {
    // Create the Year object: year
    Year year = Year.of(2020);

    // Print the result of isLeap method
    System.out.println(year.isLeap());
  }
}*/

