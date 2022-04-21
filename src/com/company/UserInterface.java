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
    System.out.print("Indput choice: ");
    return sc.nextInt();
  }

  public int userIndputPizzaMenuNumber() {
    System.out.println();
    System.out.println("Input 0 to end the Order.");
    System.out.print("Else indput menu number of the pizza: ");
    return sc.nextInt();
  }

  public void displayOrderList(OrderList aListOfOrders, Timer timer) throws InterruptedException {

    ArrayList<Bestilling> currentOrders = aListOfOrders.getListOfOrders();


    for (int i = 0; i < currentOrders.size(); i++) {

      Bestilling temp = currentOrders.get(i);
      ArrayList<Pizza> pizzaInOrder = temp.getOrderItems();
      System.out.printf("""
                
          Pickuptime:       %s
          Name:             %s
          Price total:      %d kr
          
          """, temp.getPickUpTime(), temp.getCostumerName(), temp.getTotalPrice());
      //timer.Nedtælling();
      for (Pizza pizza : pizzaInOrder) {
      System.out.printf("""
          Pizza name:       %s
          Pizza toppings:   %s
          
          """, pizza.getName(),pizza.getTopping());
    }

    }

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

}
