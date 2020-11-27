package com.codewithbram.lesson_4_constructorsandinheritance;

public class TextBox extends UIControl { // inherits all the features from UIControl class
  private String text = "";

  public TextBox() { // because the Base class constructor 'UIControl' has a parameter a compilation error will occur because TextBox constructor doesn't have any parameters
    super(true); // 'super()' calls the constructor of the Base class
    System.out.println("TextBox"); // what matters is that the super() statement comes first within the constructor otherwise a compilation error will occur
  }

  public void setText(String text) { this.text = text;}

  public void clear() { text = ""; }
}


/*
4- Constructors and Inheritance

General convention that java developers follow

- first add a 'field'
- second add a 'Constructor'
- than we add all the public (private) methods

super() keyword

because the Base class constructor 'UIControl' has a parameter a compilation error will occur due to TextBox constructor not having any parameters by it self
to solve this we use the super() keyword to call the constructor of the Base class
we use the 'super()' keyword followed by parentheses with a boolean value 'true or false' doesn't really matter
what matters is that the super statement comes first within the constructor

*/