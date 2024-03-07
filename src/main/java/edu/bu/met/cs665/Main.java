/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name: Main.java 
 * Description: Demonstrates creating and emailing a customer using the CustomerFactory
 * and EmailSender classes. Attempts to create a 'Frequent' customer type and send them an email.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.Customer;

public class Main {
  /**
   * Demonstrates creating and emailing a customer using the CustomerFactory and EmailSender //
   * classes. Attempts to create a 'Frequent' customer type and send them an email.
   */
  public static void main(String[] args) {
    try {
      Customer newCustomer =
          CustomerFactory.createCustomer("Frequent", "John Doe", "john.doe@example.com");
      EmailSender.sendEmail(newCustomer);
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }
}
