package com.codewithbram.lesson_4_constructorsandinheritance;

public class UIControl { // Super class
  private boolean isEnabled = true;

  public UIControl(boolean isEnabled) {
    this.isEnabled = isEnabled;
    System.out.println("UIControl");
  }

  public void enable() {
    isEnabled = true;
  }

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() { // getter
    return isEnabled; // return the value of our field
  }
}

/*
4- Constructors and Inheritance


*/
