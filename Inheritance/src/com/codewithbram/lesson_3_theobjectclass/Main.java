package com.codewithbram.lesson_3_theobjectclass;

import org.w3c.dom.Text;

public class Main {

  public static void main(String[] args) {
    var box1 = new TextBox();
    var box2 = box1; // both (box1 & box2) of these variables are referencing the same object in memory, so they should have the same hashcode
    var box3 = new TextBox();
    System.out.println(box1.toString());
    System.out.println(box2.hashCode());
    System.out.println(box1.equals(box2)); // returns 'true' because both these variables are referencing the same object in memory & the have the same 'hashcode'
    System.out.println(box1.equals(box3)); // returns 'false' because box3 references a different address in memory, and have different 'hashcode'
  }
}

/*
java.lang
 Object (class)

 > hashCode()
 =  returns an integer that has been calculated based on the address of the object in memory, the address of this object goes to a special hash function
    the job of this function is to get a value and map this value to a numeric value which we call a hash.

    box1.hashCode() > returns '1067040082' which is the hash code of the object 'box1'

    This hashcode is used in many situations for instance comparing objects for equality

 > equals()
 =  this method checks objects for equality
    you are able to use this method to check for equality on their value instead of their hashcode

 > toString()
 =  this method will return the String representation of an object

    com.codewithbram.lesson_3_theobjectclass.TextBox@3f99bd52

    which has 2 parts:
    first part > the fully qualified name of the class with the package it originates from followed by an @ sign
    second part > hashcode represented in hexadecimal (hexadecimal is a numeric system that goes beyond the decimal system (digits from 0 - 9), hexadecimal also has A - F )

    there could be situations where the default implementation of the toString() method isn't desirable
    we can always change it.
    For example if you have a Point class instead of returning a String we can change the toString() method to return the X and Y coordinates
*/