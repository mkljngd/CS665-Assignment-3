/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name: BusinessCustomer.java 
 * Description: Extends Customer to represent a business customer, sending an
 * email with a business-specific message.
 */

package edu.bu.met.cs665.customer;

public class BusinessCustomer extends Customer {
  public BusinessCustomer(String name, String email) {
    super(name, email);
  }

  @Override
  public String generateEmail() {
    return String.format("Dear %s, \n%s", name, Constants.BUSINESS_EMAIL_BODY);
  }
}
