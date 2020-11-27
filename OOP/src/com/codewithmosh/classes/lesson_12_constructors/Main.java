package com.codewithmosh.classes.lesson_12_constructors;

public class Main {

  public static void main(String[] args) {
    var employee = new Employee(
        50_000, 20); // Employee exists, java compiler has automatically created an Employee constructor
    int wage = employee.calculateWage(10); // coupling point
    System.out.println(wage);
  }
}


/*
 a constructor method is a special method called when we create a new object
 java creates a (Employee) constructor to create or construct a new Employee object,
 the job of this construct is to initialise our default values
 by default:
 Numbers are '0'
 Booleans are 'false'
 Reference types are gona be 'Null'

 If we don't create our own constructor, java will create a default constructor.
*/
