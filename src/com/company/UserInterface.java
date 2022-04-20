package com.company;

import java.util.Scanner;

public class UserInterface {
  public Scanner sc = new Scanner(System.in);


  public void displayMenu () {

    System.out.printf("""
        Display the Menu  : 1
        Add Order         : 2
        View Orders       : 3
        Remove Order      : 4
        Display stats     : 5
        Exit program      : 10
        """);
  }

  public int indputNumber () {
    System.out.print("Indput choice: ");
    return sc.nextInt();
  }

}
