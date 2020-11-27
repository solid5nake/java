package com.codewithmosh.classes.lesson_11_reducecoupling;

public class Browser {
  public void navigate(String address) {
    String ip = findIpAddress(address);
    String html = sendHttpRequest(ip);
    System.out.println(html);
  }

  private String sendHttpRequest(String ip) {
    return "<html></html>";
  }

  private String findIpAddress(String address) {
    return "127.0.0.1";
  }
}

/*
intelij shortcut to create method
> declare variable with value assigned to function ,example:  String ip = findIpAddress(address) (line 5)
> activate light bold, Alt + Enter
> intelij suggests to create method 'Create method 'findIpAdress' in 'Browser' ', intelij will suggests return type, intelij suggests param type
> press 'Enter' to continue


 by introducing abstraction the browser methods sendHttpRequest and findIpAddress by changing the access modifier to private
 the interface of the object (browser) is much simpler we gonna have less coupling in the future,
 because this Main class will not accidentally call one of the methods (sendHttpRequest and findIpAddress) in the browser class.

 Meaning if tomorrow you change any of the methods in the browser class it won't effect it on the Main class.
 for instance if you add the argument 'boolean cache' to the method findIpAddress internally on Browser class, the Main class remains unaffected
 */
