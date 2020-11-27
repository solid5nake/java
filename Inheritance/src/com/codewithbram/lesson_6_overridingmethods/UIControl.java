package com.codewithbram.lesson_6_overridingmethods;

public class UIControl {
  boolean isEnabled = true;

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
6- Overriding Methods
  There are situations we inherit methods from a Base class, but we are not happy with the implementation.
  And you wanna change it, this is what is called 'Method overriding'
  So we override a method in the Base class.
  We can override any of the methods that we inherit, whether they are inherited from the Parent class or the GrandParent and so on


  @Override is an annotation* (



  * annotation is a form of syntactic metadata that can be added to Java source code
*/
