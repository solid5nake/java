package com.codewithbram.lesson_6_overridingmethods;

public class TextBox extends UIControl {
  private String text = "";

  public TextBox() {
    super(true);
    System.out.println("TextBox");
  }

  @Override
  public String toString() {
    return text;
  }

  public void setText(String text) { this.text = text;}

  public void clear() { text = ""; }
}

/*
6- Overriding Methods
  There are situations we inherit methods from a Base class, but we are not happy with the implementation.
  And you wanna change it, this is what is called 'Method overriding'
  So we override a method in the Base class.
  We can override any of the methods that we inherit, whether they are inherited from the Parent class or the GrandParent and so on


  @Override is an annotation* , an annotation is basically a label that we attach to a class member and
  with this we give extra information to the java compiler.
  So with this we are telling the java compiler that we are overriding the toString() method in the object class
  and with this the java compiler will check the signature of this method and it will make sure that this method have the exact same signature

  Another benefit of using annotation is that it helps the java compiler double check our code for correctness



  * annotation is a form of syntactic metadata that can be added to Java source code
*/