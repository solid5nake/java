package com.codewithbram.lesson_5_accessmodifiers;

public class UIControl { // Super class
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
5- Access Modifiers
  public
  > are accessible outside of the class

  private
  > aren't accessible outside of it's class
  > private members from a Base class aren't inherited to Sub class(es)
  > private access modifier is used to hide implementation details of a class, so we can change the implementation in the future without impacting other classes

  protected
  ! it's considered a bad practise and should be avoided at all times
  > protected is public in package accessible, the package is treated like a public field
  > protected members are public in their package, but accessible by Child classes in different packages
    for example if we put the TextBox() inside a different package and have it extend the UIControl,
    this class will still be able to access the protected members from this class.
    This makes it confusing and complicated.

  Stick to public and private, use public to expose outside of the class and private for hiding the implementation details

  package private (default)
  > when the place for the access modifier is empty
  > package private is the default setting when an access modifier hasn't been specified
  > that means this field is 'public' anywhere inside of this 'package', but private outside of this package

  Again stay away from the default access modifier and stick to public and private,
  use public to expose outside of the class and private for hiding the implementation details
*/
