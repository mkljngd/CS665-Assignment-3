/**
 * Name: Mukul Jangid 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 03/07/2024 
 * File Name: Customer.java 
 * Description: Defines an abstract Customer with common attributes and validation,
 * serving as a base for specific customer types.
 */

package edu.bu.met.cs665.customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Customer {
  protected String name;
  protected String email;
  private static final String EMAIL_REGEX =
      "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

  /**
   * Constructs a Customer with validated email. Throws IllegalArgumentException for invalid email
   * formats, maintaining customer data integrity.
   */
  public Customer(String name, String email) {
    if (!validateEmail(email)) {
      throw new IllegalArgumentException("Invalid email format");
    }
    this.name = name;
    this.email = email;
  }

  /**
   * Validates email format against a regex pattern, returning true for valid and false for invalid
   * emails. Ensures email integrity within the system.
   */
  public boolean validateEmail(String email) {
    Pattern pattern = Pattern.compile(EMAIL_REGEX);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }

  public abstract String generateEmail();

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }
}
