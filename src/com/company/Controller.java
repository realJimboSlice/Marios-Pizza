package com.company;

public class Controller {
  UserInterface ui = new UserInterface();
  OrderList orderList = new OrderList();
  Menucard menuCard = new Menucard();


  private void newOrder() {
    String costumerName = ui.userInputName();
    int pickUpTime = ui.userIndputPickupTime();

    Bestilling newPizzaOrder = new Bestilling(pickUpTime, costumerName);

    int pizzaOfChoiceMenuNumber = 1;
    while (pizzaOfChoiceMenuNumber != 0) {
      pizzaOfChoiceMenuNumber = ui.userIndputPizzaMenuNumber();
      Pizza chosenPizza = menuCard.findPizzaByMenuNumber(pizzaOfChoiceMenuNumber);
      if (pizzaOfChoiceMenuNumber != 0 && pizzaOfChoiceMenuNumber < 15) {
        newPizzaOrder.addPizzaToOrder(chosenPizza);
      }
    }

    orderList.addOrder(newPizzaOrder);
  }

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
        case 1 -> ui.displayPizzaMenu(menuCard);
        case 2 -> newOrder();
        case 3 -> ui.displayOrderList(orderList);
        case 4 -> System.out.println("Remove Order");
        case 5 -> System.out.println("Display Stats");
        case 10 -> loop = false;
        default -> System.out.println("Invalid choice");
      }

    }

  }
}
