/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name: CustomerTest.java 
 * Description: Tests cover various customer types, including Business, Frequent,
 * New, Returning, and VIP customers, along with invalid email input handling.
 */

package edu.bu.met.cs665.customer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {
  @Test
  void testBusinessCustomerEmailGeneration() {
    Customer customer = new BusinessCustomer("Test Business", "test@business.com");
    assertTrue(customer.validateEmail(customer.getEmail()));
    String expectedEmail =
        String.format("Dear %s, \n%s", customer.getName(), Constants.BUSINESS_EMAIL_BODY);
    assertEquals(expectedEmail, customer.generateEmail());
  }

  @Test
  void testFrequentCustomerEmailGeneration() {
    Customer customer = new FrequentCustomer("Frequent Customer", "frequent@customer.com");
    assertTrue(customer.validateEmail(customer.getEmail()));
    String expectedEmail =
        String.format("Dear %s, \n%s", customer.getName(), Constants.FREQUENT_EMAIL_BODY);
    assertEquals(expectedEmail, customer.generateEmail());
  }

  @Test
  void testNewCustomerEmailGeneration() {
    Customer customer = new NewCustomer("New Customer", "new@customer.com");
    assertTrue(customer.validateEmail(customer.getEmail()));
    String expectedEmail =
        String.format("Dear %s, \n%s", customer.getName(), Constants.NEW_EMAIL_BODY);
    assertEquals(expectedEmail, customer.generateEmail());
  }

  @Test
  void testReturningCustomerEmailGeneration() {
    Customer customer = new ReturningCustomer("Returning Customer", "returning@customer.com");
    assertTrue(customer.validateEmail(customer.getEmail()));
    String expectedEmail =
        String.format("Dear %s, \n%s", customer.getName(), Constants.RETURNING_EMAIL_BODY);
    assertEquals(expectedEmail, customer.generateEmail());
  }

  @Test
  void testVIPCustomerEmailGeneration() {
    Customer customer = new VipCustomer("VIP Customer", "vip@customer.com");
    assertTrue(customer.validateEmail(customer.getEmail()));
    String expectedEmail =
        String.format("Dear %s, \n%s", customer.getName(), Constants.VIP_EMAIL_BODY);
    assertEquals(expectedEmail, customer.generateEmail());
  }

  @Test
  void testInvalidEmail() {
    Exception exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              new BusinessCustomer("Invalid Email Test", "invalid_email");
            });
    String expectedMessage = "Invalid email format";
    String actualMessage = exception.getMessage();
    assertTrue(actualMessage.contains(expectedMessage));
  }
}
