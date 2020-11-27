package com.codewithbram.lesson_6_overridingmethods;

public class Main {
  public static void main(String[] args) {
    var textBox = new TextBox();
    textBox.setText("Hello World");
    System.out.println(textBox.toString());
  }
}

/*
 we don't need to explicitly call toSpring() method, textBox.toString(),
 because the println() method automatically calls the toString() method on anything we pass within the parentheses ()
*/

/*
6- Overriding Methods
  There are situations we inherit methods from a Base class, but we are not happy with the implementation.
  And you wanna change it, this is what is called 'Method overriding'
  So we override a method in the Base class
*/
