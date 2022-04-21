package com.company;

import java.util.ArrayList;

public class OrderList {
  private ArrayList <Bestilling> listOfOrders;
  public UserInterface ui = new UserInterface();


  public OrderList (){
    this.listOfOrders = new ArrayList<>();
  }

  public void addOrder (Bestilling newOrder) {
    listOfOrders.add(newOrder);
  }

  public ArrayList<Bestilling> getListOfOrders() {
    return listOfOrders;
  }

  @Override
  public String toString() {
    return "Orders in the system: "+ listOfOrders;
  }

  public void newOrder(Menucard menuCard) {
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

    addOrder(newPizzaOrder);
  }
}
