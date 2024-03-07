/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name: EmailSender.java 
 * Description: Facilitates email sending functionality within the application.
 * Uses polymorphism by accepting any subclass of Customer.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.Customer;

public class EmailSender {
  /**
   * Sends an email to a specified customer. Retrieves and formats the email content using the
   * customer's generateEmail method.
   */
  public static void sendEmail(Customer customer) {
    String body = customer.generateEmail();
    System.out.printf("Sending email to %s: \n%s%n", customer.getEmail(), body);
    // Placeholder for actual email sending logic, could log, handle errors, etc.
  }
}
