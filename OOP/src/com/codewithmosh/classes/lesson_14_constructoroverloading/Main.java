package com.codewithmosh.classes.lesson_14_constructoroverloading;

public class Main {

  public static void main(String[] args) {
    new Employee(10_000);
    var employee = new Employee(
        50_000, 20);
    int wage = employee.calculateWage();
    System.out.println(wage);
  }
}


/*
14- Constructor Overloading

You can also overload constructors because technically constructors are also methods

You van view the overloading method;

intelij shortcut
> place cursor on the method
> press CMD + P
*/
