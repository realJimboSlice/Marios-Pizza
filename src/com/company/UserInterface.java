package com.company;

import java.util.Scanner;

public class UserInterface {
  public Scanner sc = new Scanner(System.in);


  public String userInputName(){
    System.out.print("Input name of costumer: ");
    return sc.nextLine();
  }

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

  public int userIndputPickupTime() {
    sc.next();
    System.out.print("Indput pickup time: ");
    return sc.nextInt();
  }

  public void displayPizzaMenu (Menucard menuCard){
    System.out.println(menuCard.toString());
  }

  public int userIndputNumber() {
    System.out.print("Indput choice: ");
    return sc.nextInt();
  }

  public int userIndputPizzaMenuNumber() {
    System.out.println();
    System.out.println("Input 0 to end the Order.");
    System.out.print("Else indput menu number of the pizza: ");
    return sc.nextInt();
  }

}
