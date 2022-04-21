package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
  public Scanner sc = new Scanner(System.in);


  public String userInputName() {
    System.out.print("Input name of costumer: ");
    return sc.nextLine();
  }

  public void displayMenu() {

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

  public void displayPizzaMenu(Menucard menuCard) {
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

  public String pizzaName() {
    System.out.println("Input name of new pizza.");
    return sc.next();
  }

  public int pizzaNum() {
    System.out.println("Input designated number for menu.");
    return sc.nextInt();
  }

  public int pizzaPrice() {
    System.out.println("Input price of new pizza");
    return sc.nextInt();
  }

  public void printMenu(Menucard menuKort) {
    String dot = ".";
    String space = " ";


    for (Pizza pizza : menuKort.getMenuCard()) {
      int repeat;
      if (pizza.getMenuNumber() == 1) {
        repeat = 2;
      } else if (pizza.getMenuNumber()  < 10 || pizza.getMenuNumber() > 1) {
        repeat = 1;
      } else {
        repeat = 0;
      }
      System.out.printf("""
          %d. %s %s %d kr
          """, pizza.getMenuNumber(), pizza.getName(), dot.repeat(60 - (pizza.getName().length())), pizza.getPrice());
      System.out.println(pizza.getTopping() + "\n");
    }
  }

/*  public Topping toppingPizza() {
    System.out.println("Enter the topping you wish to add to the pizza.");
    String topping = sc.next();

    return ;
  }*/

  public void displayOrderList(ArrayList<Bestilling> aListOfOrders) {

  }

}
