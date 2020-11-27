package com.codewithmosh.classes.lesson_8_gettersandsetters;

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
 8- Getters and Setters - Title

 To create getters and setters automatically in Intelij, press Alt + CMD then select 'Encapsulate field', check necessary options, click 'refactor' button
*/
