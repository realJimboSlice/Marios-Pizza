package com.company;

public class Controller {
  UserInterface ui = new UserInterface();
  public OrderList orderList = new OrderList();
  Menucard menuCard = new Menucard();
  Timer timer = new Timer();

  private void showWaitingOrders (){
    orderList.setListOfOrders(orderList.sortOrderlist2());
    ui.displayOrderList(orderList.getListOfOrders());
  }

  private void removeOrder () {
    boolean removed = orderList.removeOrder(ui.removeOrder());

    if (removed){
      ui.displayOrderRemoved();
    } else {
      ui.displayOrderNotFound();
    }

  }

  public void mainMenu(){

    Creator creator = new Creator();
    creator.createPizzas(menuCard);

    boolean loop = true;
    while (loop) {

      ui.displayMenu();
      int choice = ui.userIndputNumber();

      switch (choice) {
        case 1 -> ui.printMenu(menuCard);
        case 2 -> orderList.newOrder(menuCard, timer);
        case 3 -> showWaitingOrders();
        case 4 -> removeOrder();
        case 10 -> loop = false;
        default -> System.out.println("Invalid choice");
      }

    }

  }
}
