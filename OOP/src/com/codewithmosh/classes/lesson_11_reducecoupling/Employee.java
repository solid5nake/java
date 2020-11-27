package com.codewithmosh.classes.lesson_11_reducecoupling;

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

  private int getBaseSalary() {
    return baseSalary;
  }

  private int getHourlyRate() {
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
  10- Coupling

  the level of dependency between classes

  you need to reduce the level of dependency between classes
  there isn't something like 'no coupling or zero coupling', there is always coupling
  because classes need to work together

  if 5 classes depend on each other, you need to modify all 5 when 1 is modified
  if you have 200, you have to modify 200.

  in Java you can use abstraction to reduce coupling by changing the access modifier to 'private'

*/
