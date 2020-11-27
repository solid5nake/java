package com.codewithbram.lesson_2_inheritance;

public class UIControl { // Super class
  private boolean isEnabled = true;

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
 Inheritance principal

  UIControl (class), also called Base/Super/Parent class
  >enable()
  >disable()

  TextBox Sub/Child class
  >enable() inherit from UIControl
  >disable() inherit from UIControl
*/
