package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
  public Scanner sc = new Scanner(System.in);

  public String userInputName(){
    System.out.print("Input name of costumer: ");
    String name = sc.next();
    return name;
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

  public String userIndputPickupTime() {
    sc.next();
    System.out.print("Indput pickup time: ");
    String time = sc.next();
    return time;
  }

  public void displayPizzaMenu(Menucard menuCard) {
    System.out.println(menuCard.toString());
  }

  public int userIndputNumber() {
    System.out.print("Input choice: ");
    return sc.nextInt();
  }

  public int userIndputPizzaMenuNumber() {
    System.out.println();
    System.out.println("Input 0 to end the Order.");
    System.out.print("Else input menu number of the pizza: ");
    return sc.nextInt();
  }

  public void displayOrderList(ArrayList<Order> liste){

    for (int i = 0; i < liste.size(); i++) {

      Order temp = liste.get(i);
      ArrayList<Pizza> pizzaInOrder = temp.getOrderItems();
      System.out.printf("""
          Ordrenummer:      %d      
          Pickuptime:       %s
          Name:             %s
          Price total:      %d kr
          
          """, temp.getOrderNumber(), temp.getPickUpTime(), temp.getCostumerName(), temp.getTotalPrice());

      for (Pizza pizza : pizzaInOrder) {
      System.out.printf("""
          Pizza name:       %s
          Pizza toppings:   %s
          
          """, pizza.getName(),pizza.getTopping());
    }

    }

  }

  public void printMenu(Menucard menuCard) {
    String dot = ".";
    String space = " ";

    for (Pizza pizza : menuCard.getMenuCard()) {
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

  public int removeOrder(){
    System.out.println("Input number of order you want to remove");
    int removeOrder = sc.nextInt();
    return removeOrder;
  }

  public void orderNotFound(){
    System.out.println("Order not found");
  }

}
