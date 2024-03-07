/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name: ReturningCustomer.java 
 * Description: Extends Customer to represent a returning customer, sending
 * an email to offer a personalized welcome back message.
 */

package edu.bu.met.cs665.customer;

public class ReturningCustomer extends Customer {
  public ReturningCustomer(String name, String email) {
    super(name, email);
  }

  @Override
  public String generateEmail() {
    return String.format("Dear %s, \n%s", name, Constants.RETURNING_EMAIL_BODY);
  }
}
