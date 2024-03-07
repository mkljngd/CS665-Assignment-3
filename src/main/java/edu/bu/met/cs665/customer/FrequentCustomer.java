/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name: FrequentCustomer.java 
 * Description: Extends Customer to represent a frequent customer, sending an
 * email to acknowledge and appreciate their continuous engagement.
 */

package edu.bu.met.cs665.customer;

public class FrequentCustomer extends Customer {
  public FrequentCustomer(String name, String email) {
    super(name, email);
  }

  @Override
  public String generateEmail() {
    return String.format("Dear %s, \n%s", name, Constants.FREQUENT_EMAIL_BODY);
  }
}
