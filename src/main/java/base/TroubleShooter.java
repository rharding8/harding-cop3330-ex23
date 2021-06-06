/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

package base;

import java.util.Scanner;

public class TroubleShooter {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    TroubleShooter car = new TroubleShooter();
    System.out.println(car.question1());
  }

  public String question1() {
    System.out.print("Is the car silent when you turn the key (y/n for all questions)? ");
    String answer = input.next();
    if (answer.equalsIgnoreCase("y")) {
      return question2();
    }
    else if (answer.equalsIgnoreCase("n")) {
      return question3();
    }
    else {
      System.out.println("ERROR: Invalid Answer!");
      return question1();
    }
  }

  public String question2() {
    System.out.print("Are the battery terminals corroded? ");
    String answer = input.next();
    if (answer.equalsIgnoreCase("y")) {
      return "Clean terminals and try starting again.";
    }
    else if (answer.equalsIgnoreCase("n")) {
      return "Replace cables and try again.";
    }
    else {
      System.out.println("ERROR: Invalid Answer!");
      return question2();
    }
  }

  public String question3() {
    System.out.print("Does the car make a slicking noise? ");
    String answer = input.next();
    if (answer.equalsIgnoreCase("y")) {
      return "Replace the battery.";
    }
    else if (answer.equalsIgnoreCase("n")) {
      return question4();
    }
    else {
      System.out.println("ERROR: Invalid Answer!");
      return question3();
    }
  }

  public String question4() {
    System.out.print("Does the car crank up but fail to start? ");
    String answer = input.next();
    if (answer.equalsIgnoreCase("y")) {
      return "Check spark plug connections.";
    }
    else if (answer.equalsIgnoreCase("n")) {
      return question5();
    }
    else {
      System.out.println("ERROR: Invalid Answer!");
      return question4();
    }
  }

  public String question5() {
    System.out.print("Does the engine start and then die? ");
    String answer = input.next();
    if (answer.equalsIgnoreCase("y")) {
      return question6();
    }
    else if (answer.equalsIgnoreCase("n")) {
      return "This should not be possible.";
    }
    else {
      System.out.println("ERROR: Invalid Answer!");
      return question5();
    }
  }

  public String question6() {
    System.out.print("Does your car have fuel injection? ");
    String answer = input.next();
    if (answer.equalsIgnoreCase("y")) {
      return "Get it in for service.";
    }
    else if (answer.equalsIgnoreCase("n")) {
      return "Check to ensure the choke is opening and closing.";
    }
    else {
      System.out.println("ERROR: Invalid Answer!");
      return question6();
    }
  }
}
