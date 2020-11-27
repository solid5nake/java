package com.codewithbram.lesson_2_inheritance;

public class TextBox extends UIControl{ // inherits all the features from UIControl class
  private String text = "";

  public void setText(String text) { this.text = text;}

  public void clear() { text = ""; }
}


/*
 2- Inheritance

By using the keyword 'extends' followed up by 'UIControl' TextBox class will inherit all the features from UIControl class

 Inheritance principal

  UIControl (class), also called Base/Super/Parent class
  >enable()
  >disable()
  >isEnabled()

  TextBox (class), Sub/Child class
  >setText()
  >clear()
  >enable() inherit from UIControl
  >disable() inherit from UIControl
  >isEnabled() inherit from UIControl
*/