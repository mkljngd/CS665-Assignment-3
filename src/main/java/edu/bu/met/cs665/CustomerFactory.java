/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name: CustomerFactory.java 
 * Description: Implements the Factory Method pattern to create instances of
 * different customer types based on a given type identifier.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.BusinessCustomer;
import edu.bu.met.cs665.customer.Customer;
import edu.bu.met.cs665.customer.FrequentCustomer;
import edu.bu.met.cs665.customer.NewCustomer;
import edu.bu.met.cs665.customer.ReturningCustomer;
import edu.bu.met.cs665.customer.VipCustomer;

public class CustomerFactory {
  /**
   * Utilizes a switch statement to create and return an instance of a Customer subclass based on
   * the String type. This method demonstrates the Factory Method design pattern by providing a
   * centralized creation logic.
   */
  public static Customer createCustomer(String type, String name, String email) {
    switch (type) {
      case "Business":
        return new BusinessCustomer(name, email);
      case "Returning":
        return new ReturningCustomer(name, email);
      case "Frequent":
        return new FrequentCustomer(name, email);
      case "New":
        return new NewCustomer(name, email);
      case "VIP":
        return new VipCustomer(name, email);
      default:
        throw new IllegalArgumentException("Unknown customer type");
    }
  }
}
