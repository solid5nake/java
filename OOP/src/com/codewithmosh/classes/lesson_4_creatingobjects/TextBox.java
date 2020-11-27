package com.codewithmosh.classes.lesson_4_creatingobjects;

//4- Creating Objects

public class TextBox {
  public String text = ""; // Field

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}
