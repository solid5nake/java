package com.codewithmosh.classes.lesson_14_constructoroverloading;

public class Employee {
  private int baseSalary;
  private int hourlyRate;

  public Employee(int baseSalary) {
    this(baseSalary, 0);
  }

  public Employee(int baseSalary, int hourlyRate) {
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
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

  public void setHourlyRate(int hourlyRate) {
    if (hourlyRate < 0) {
      throw new IllegalArgumentException("Hourly rate cannot be 0 or negative."); // validation
    }
    this.hourlyRate = hourlyRate;
  }
}

/*
14- Constructor Overloading

two ways are possible to overload the Employee constructor:


way 1:

  public Employee(int baseSalary) {  // remove int hourlyRate
    setBaseSalary(baseSalary);
    setHourlyRate(0); // set default to '0'
  }

  public Employee(int baseSalary, int hourlyRate) {
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
  }

way 2:

  public Employee(int baseSalary) {  // reusing the logic of the Employee method
    this(baseSalary, 0);
  }

  public Employee(int baseSalary, int hourlyRate) {
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
  }




*/
