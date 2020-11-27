package com.codewithmosh.classes.lesson_10_coupling;

import com.codewithmosh.classes.lesson_11_reducecoupling.Browser;

public class Main {

  public static void main(String[] args) {
    var browser = new Browser();
  }
}


/*
 intelij shortcut to create an object

 in this example we will use the Browser class and a create browser object
 > type 'new Browser()'
 > activate light bulb , ALT + Enter
 > intelij will suggest 'Introduce local variable', press 'Enter
 > Browser browser = new Browser(); browser object is created

 > Browser browser is ugly so replace it with var by;
 > activate light bulb again, Alt + Enter
 > intelij will suggest 'Replace explicit type with 'var' '
 > press Enter

 Because the interface of the object is much simpler we gonna have less coupling in the future,
 because this Main class will not accidentally call one of the methods (sendHttpRequest and findIpAddress) in the browser class.


*/
