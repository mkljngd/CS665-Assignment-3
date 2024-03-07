/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name:VipCustomer.java 
 * Description: Extends Customer to represent a VIP customer, sending an email to
 * highlight their esteemed status and exclusive benefits.
 */

package edu.bu.met.cs665.customer;

public class VipCustomer extends Customer {
  public VipCustomer(String name, String email) {
    super(name, email);
  }

  @Override
  public String generateEmail() {
    return String.format("Dear %s, \n%s", name, Constants.VIP_EMAIL_BODY);
  }
}
