package com.company;

import java.util.ArrayList;

public class OrderList {
  private ArrayList<Order> listOfOrders;
  public UserInterface ui = new UserInterface();


  public OrderList() {
    this.listOfOrders = new ArrayList<>();
  }

  public void addOrder(Order newOrder) {
    listOfOrders.add(newOrder);
  }

  public ArrayList<Order> getListOfOrders() {
    return listOfOrders;
  }

  @Override
  public String toString() {
    return "Orders in the system: " + listOfOrders;
  }

  public void newOrder(Menucard menuCard, Timer timer) {
    String costumerName = ui.userInputName();
    String pickUpTime = timer.pickupTime();

    Order newPizzaOrder = new Order(pickUpTime, costumerName);

    newPizzaOrder.setOrderNumber(listOfOrders.size());

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

  public void removeOrder(int orderNumber) {
    for (int i = this.listOfOrders.size() - 1; i >= 0; i--) {
      Order order = listOfOrders.get(i);
      if (orderNumber == order.getOrderNumber()) {
        listOfOrders.remove(order);
      }
    }
  }
}
