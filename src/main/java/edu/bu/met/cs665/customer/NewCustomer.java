/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name: NewCustomer.java 
 * Description: Extends Customer to represent a new customer, sending a welcoming
 * email that encourages the start of a new relationship.
 */

package edu.bu.met.cs665.customer;

public class NewCustomer extends Customer {
  public NewCustomer(String name, String email) {
    super(name, email);
  }

  @Override
  public String generateEmail() {
    return String.format("Dear %s, \n%s", name, Constants.NEW_EMAIL_BODY);
  }
}
