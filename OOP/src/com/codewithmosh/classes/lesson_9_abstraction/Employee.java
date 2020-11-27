package com.codewithmosh.classes.lesson_9_abstraction;

public class Employee {
  private int baseSalary;
  private int hourlyRate;

  public int calculateWage(int extraHours) {
    return baseSalary + (getHourlyRate() * extraHours);
  }

  public void setBaseSalary(int baseSalary) {
    if (baseSalary <= 0)
      throw new IllegalArgumentException("Salary cannot be 0 or less."); // validation
    this.baseSalary = baseSalary;
  }

  public int getBaseSalary() {
    return baseSalary;
  }

  public int getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(int hourlyRate) {
    if (hourlyRate <= 0) {
      throw new IllegalArgumentException("Hourly rate cannot be 0 or negative."); // validation
    }
    this.hourlyRate = hourlyRate;
  }
}

/*
  9- Abstraction

  Reduce complexity by hiding unnecessary details

  baseSalary and hourlyRate are 'implementation details',
  in abstraction you don't need to show the implementation details.

  How we store data in an object is considered an implementation detail.
  We may change how we store the data internally.
  Plus, we don’t want our objects to go into a bad state (hold bad data).
  That’s why we should declare fields as private and provide getters and or setters only if required.
  These setters can ensure our objects don’t go into a bad state by validating the values that are passed to them.

*/
