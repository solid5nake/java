package com.codewithbram.lesson_3_theobjectclass;

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
  3- The Object Class

  TextBox 'extends' or inherit from UIControl
  While UIControl 'extends' inherit from the Object class

  we don't have to declare this as java automatically already extends Object class,
  that is why every class that we declare has additional methods


 Inheritance principal

  UIControl (class), also called Base/Super/Parent class
  >enable()
  >disable()

  TextBox Sub/Child class
  >enable() inherit from UIControl
  >disable() inherit from UIControl
*/
