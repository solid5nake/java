package com.codewithbram.lesson_4_constructorsandinheritance;

public class Main {
  public static void main(String[] args) {
    var textBox = new TextBox();
  }
}

/*
4- Constructors and Inheritance

order of execution of constructors
 'UIControl' prints before 'TextBox'

UIControl   < Base class
TextBox     < Sub class

example with constructors without parameters
  public UIControl() {
    System.out.println("UIControl");
  }

  public TextBox() {
    System.out.println("TextBox");
  }

  ======









 */
