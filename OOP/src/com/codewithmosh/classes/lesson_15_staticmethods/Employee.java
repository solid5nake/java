package com.codewithmosh.classes.lesson_15_staticmethods;

public class Employee {
  private int baseSalary;
  private int hourlyRate;

  public static int numberOfEmployees; // static field

  public Employee(int baseSalary) {
    this(baseSalary, 0);
  }

  public Employee(int baseSalary, int hourlyRate) {
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numberOfEmployees++;
  }

  public static void printNumberOfEmployees() {
    System.out.println(numberOfEmployees); // prints value of static field
  }

  public int calculateWage(int extraHours) {
    return baseSalary + (getHourlyRate() * extraHours);
  }

  public int calculateWage() {
    return calculateWage(0);
  }

  private void setBaseSalary(int baseSalary) {
    if (baseSalary <= 0)
      throw new IllegalArgumentException("Salary cannot be 0 or less."); // validation
    this.baseSalary = baseSalary;
  }

  private int getBaseSalary() {
    return baseSalary;
  }

  private int getHourlyRate() {
    return hourlyRate;
  }

  private void setHourlyRate(int hourlyRate) {
    if (hourlyRate < 0) {
      throw new IllegalArgumentException("Hourly rate cannot be 0 or negative."); // validation
    }
    this.hourlyRate = hourlyRate;
  }
}

/*
15- Static Members

In Object Oriented Programming a class could have two kinds of members,
instance members and static members;

1. Instance members
Instance members belong to 'instances' or 'objects', just like the members (variables and methods) in our Employee class
they belong to each instance of the Employee class.

2. Static members (fields or methods)
When we use the dot operator on the Employee class we don't see anything, because we don't have any static fields or methods.
We use them in situations where we wanna represent a concept that should be in a single place.

Static fields
we use static fields in situations where values are independent of objects and we want to share it among all objects

Static methods
Can only see other static methods in the class.
For example, even though the static method is placed in the Employee class, you can't call
'calculateWage()' because it  belongs to the employee object (an instance of the Employee class) it's an instance method

Main method should always be static, because this to enable java runtime to call this method without having to create a new object.
That's why a main method is always declared as static.

*/
