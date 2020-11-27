package com.codewithmosh.classes.lesson_5_memoryallocation;

public class Main {

  public static void main(String[] args) {
    var textBox1 = new TextBox(); // Java has a feature called garbage collector which will remove unused object from the the HEAP after a significant amount of time
    var textBox2 = textBox1; // both are referencing the same object
    textBox2.setText("Hello World");
    System.out.println(textBox1.text);
  } // on exit Java runtime will remove every variable on the stack
}

/*
 5- Memory Allocation

 Memory allocation, in java refers to the process where the computer programs and services are allocated dedicated to virtual memory spaces
 HEAP space, Mainly used by java runtime, Java Heap Space comes into play every time an object is created and allocated in it.
*/

