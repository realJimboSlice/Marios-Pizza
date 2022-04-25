package com.company;

public class Controller {
  UserInterface ui = new UserInterface();
  public OrderList orderList = new OrderList();
  Menucard menuCard = new Menucard();
  Timer timer = new Timer();


  public void mainMenu() {

    Creator creator = new Creator();
    creator.createPizzas(menuCard);

    boolean loop = true;
    while (loop) {

      ui.displayMenu();
      int choice = ui.userIndputNumber();

      switch (choice) {
        case 1 -> ui.printMenu(menuCard);
        case 2 -> orderList.newOrder(menuCard, timer);
        case 3 -> ui.displayOrderList(orderList);
        case 4 -> orderList.removeOrder(ui.removeOrder());
        case 10 -> loop = false;
        default -> System.out.println("Invalid choice");
      }

    }

  }
}
