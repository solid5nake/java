package com.codewithmosh.classes.lesson_4_creatingobjects;

public class Main {

    public static void main(String[] args) { // String is a reference type
      var textBox1 = new TextBox(); // instantiating from TextBox class, create an instance of the class (instead of TextBox textBox1)
      textBox1.setText("Box 1");
      System.out.println(textBox1.text.toUpperCase()); // a NullPointerException is caused by calling a method on a function that doesn't exist

      var textBox2 = new TextBox(); // Both have different data/state
      textBox2.text = "Box 2";
      System.out.println(textBox2.text);
    }
}
