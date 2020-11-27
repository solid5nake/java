package com.codewithmosh.classes.lesson_11_reducecoupling;

public class Main {

  public static void main(String[] args) {
    var employee = new Employee(); // coupling point
    employee.setBaseSalary(50_000); // coupling point
    employee.setHourlyRate(20); // coupling point
    int wage = employee.calculateWage(10); // coupling point
    System.out.println(wage);
  }
}
