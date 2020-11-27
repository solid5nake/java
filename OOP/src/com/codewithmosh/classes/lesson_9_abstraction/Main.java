package com.codewithmosh.classes.lesson_9_abstraction;

public class Main {

  public static void main(String[] args) {
    var employee = new Employee();
    employee.setBaseSalary(50_000);
    employee.setHourlyRate(20);
    int wage = employee.calculateWage(10);
    System.out.println(wage);
  }
}

/*
How we store data in an object is considered an implementation detail.
We may change how we store the data internally.
Plus, we don’t want our objects to go into a bad state (hold bad data).
That’s why we should declare fields as private and provide getters and or setters only if required.
These setters can ensure our objects don’t go into a bad state by validating the values that are passed to them.
 */
