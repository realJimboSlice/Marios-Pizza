package com.company;

public class Controller {
  UserInterface ui = new UserInterface();
  OrderList orderList = new OrderList();
  Menucard menuCard = new Menucard();

  private void newOrder() {
    String costumerName = ui.inputName();
    int pickUpTime = ui.indputPickupTime();

    Bestilling newPizzaOrder = new Bestilling(pickUpTime, costumerName);



    orderList.addOrder(newPizzaOrder);
  }

  public void mainMenu() {

    Creator creator = new Creator();
    creator.createPizzas(menuCard);


    boolean loop = true;
    while (loop) {

      ui.displayMenu();
      int choice = ui.indputNumber();

      switch (choice) {
        case 1 -> ui.displayPizzaMenu(menuCard);
        case 2 -> System.out.println("Add Orders");
        case 3 -> System.out.println("View Orders");
        case 4 -> System.out.println("Remove Order");
        case 5 -> System.out.println("Display Stats");
        case 10 -> loop = false;
        default -> System.out.println("Invalid choice");
      }

    }

  }
}
