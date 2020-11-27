package com.codewithmosh.classes.lesson_7_encapsulation;

public class Employee {
  public int baseSalary;
  public int hourlyRate;

  public int calculateWage(int extraHours) { // extraHours is passed as an arg because it can change each month, while hourlyRate and baseSalary is fixed
    return baseSalary + (hourlyRate * extraHours);
  }
}
/*
 In this example we have encapsulated the data in comparison to the procedural program from lesson 6
 So if tomorrow you want to build another application which involves calculating the wages of our employees,
 we could simply copy this class to that project or put it in a reusable library so  we don't have to copy code around
*/


/*
 7-Encapsulation
 Bundle the data and methods that operate on the data as a single unit or object.

 In this example, after every month when calculateWage will be called you have to pass the field 'extraHours'

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.
To achieve encapsulation in Java:
 Declare the variables of a class as private.
 Provide public setter and getter methods to modify and view the variables values.
*/
