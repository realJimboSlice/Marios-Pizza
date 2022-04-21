package com.company;

public class Controller {
  UserInterface ui = new UserInterface();
  public OrderList orderList = new OrderList();
  Menucard menuCard = new Menucard();




  public void mainMenu() {

    Creator creator = new Creator();
    creator.createPizzas(menuCard);

    //made some orderes to test the orderList.toString
    creator.createSomePizzas(orderList);



    boolean loop = true;
    while (loop) {

      ui.displayMenu();
      int choice = ui.userIndputNumber();

      switch (choice) {
        case 1 -> ui.printMenu(menuCard);//ui.displayPizzaMenu(menuCard);
        case 2 -> orderList.newOrder(menuCard);
        case 3 -> ui.displayOrderList(orderList);
        case 4 -> System.out.println("Remove Order");
        case 5 -> System.out.println("Display Stats");
        case 10 -> loop = false;
        default -> System.out.println("Invalid choice");
      }

    }

  }
}
