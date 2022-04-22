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

  public void mainMenu(){

    Creator creator = new Creator();
    creator.createPizzas(menuCard);

    //Laver bestillinger til sortering
    creator.addSomePizzas(orderList, timer, menuCard);

    boolean loop = true;
    while (loop) {

      ui.displayMenu();
      int choice = ui.userIndputNumber();

      switch (choice) {
        case 1 -> ui.printMenu(menuCard);//ui.displayPizzaMenu(menuCard);
        case 2 -> orderList.newOrder(menuCard, timer);
        case 3 -> showWaitingOrders();
        case 4 -> System.out.println("Remove Order");
        case 5 -> System.out.println("Display Stats");
        case 10 -> loop = false;
        default -> System.out.println("Invalid choice");
      }

    }

  }
}
