package com.codewithmosh.classes.lesson_13_methodoverloading;

public class Employee {
  private int baseSalary;
  private int hourlyRate;

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
    if (hourlyRate <= 0) {
      throw new IllegalArgumentException("Hourly rate cannot be 0 or negative."); // validation
    }
    this.hourlyRate = hourlyRate;
  }
}

/*

  calculateWage() is duplicated with each implementation having their own set of parameters
  by doing so in this example you can set a default for the argument extraHours (0),

  in the Main class you could either call;

  leaving arg empty,
  employee.calculateWage() - default value = 0

  or
  employee.calculateWage(15) - value = 15




*/
