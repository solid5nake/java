package com.codewithbram.lesson_2_theproblem;

import java.util.Scanner;

public class ConsoleReader {
  public double readNumber(String prompt, double min, double max) {
    Scanner scanner = new Scanner(System.in);
    double value;
    while (true) {
      System.out.print(prompt);
      value = scanner.nextFloat();
      if (value >= min && value <= max)
        break;
      System.out.println("Enter a value between " + min + " and " + max);
    }
    return value;
  }
}
