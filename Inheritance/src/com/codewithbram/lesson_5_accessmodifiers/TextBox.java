package com.codewithbram.lesson_5_accessmodifiers;

public class TextBox extends UIControl { // inherits all the features from UIControl class
  private String text = "";

  public TextBox() { // because the Base class constructor 'UIControl' has a parameter a compilation error will occur because TextBox constructor doesn't have any parameters
    super(true); // 'super()' calls the constructor of the Base class
    System.out.println("TextBox"); // what matters is that the super() statement comes first within the constructor otherwise a compilation error will occur
  }

  public void setText(String text) { this.text = text;}

  public void clear() { text = ""; }
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