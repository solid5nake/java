package com.codewithmosh.classes.lesson_13_methodoverloading;

public class Main {

  public static void main(String[] args) {
    var employee = new Employee(
        50_000, 20); // Employee exists, java compiler has automatically created an Employee constructor
    int wage = employee.calculateWage(); // coupling point
    System.out.println(wage);
  }
}


/*
13- Method Overloading

  Method overloading means creating different implementations of it but with different parameters

  in his example in the Main class you could either call the Employee method calculateWage() ;

  leaving arg empty,
  employee.calculateWage() - default value = 0

  or
  employee.calculateWage(15) - value = 15


  It's often better to use 'method overloading' if you are dealing with completely different types of parameters, for instance
  one implementation would take two 'integer' types and another would take an 'object' these are radically different
  Don't overuse method overloading to much as it will
*/
