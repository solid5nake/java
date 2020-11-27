package com.codewithmosh.classes.lesson_15_staticmethods;

public class Main {

  public static void main(String[] args) {
    var employee = new Employee(
        50_000, 20);
    System.out.println(Employee.numberOfEmployees); // with static fields we don't have to create an object we access them directly trough the class
    Employee.printNumberOfEmployees(); // with static method we can access the static method directly from the class (Employee)
    int wage = employee.calculateWage();
    System.out.println(wage);
  }
}


/*
15- Static Members

In Object Oriented Programming a class could have two kinds of members,
instance members and static members;

Instance members
Instance members belong to 'instances' or 'objects', just like the members (variables and methods) in our Employee class
they belong to each instance of the Employee class.

Static members (fields or methods)
When we use the dot operator on the Employee class we don't see anything, because we don't have any static fields or methods.
We use them in situations where we wanna represent a concept that should be in a single place.

Static fields
we use static fields in situations where values are independent of objects and we want to share it among all objects

Static methods
Can only see other static methods in the class

Main method should always be static, because this to enable java runtime to call this method without having to create a new object.
That's why a main method is always declared as static.

java examples of static members:
1. System class, 'out' static field
Another example is the System class (keyword) which has a static field 'out'
2. Integer class, parseInt()
Another example is the Integer class (keyword) which has a static method 'parseInt()'
Every java class has static members (static fields and static methods).


Tutorialpoint:
The static keyword is used to create methods that will exist independently of any instances created for the class.
Static methods do not use any instance variables of any object of the class they are defined in. Static methods take all the data from parameters and compute something from those parameters, with no reference to variables.
Class variables and methods can be accessed using the class name followed by a dot and the name of the variable or method.


*/
