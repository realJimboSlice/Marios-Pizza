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
    String pickupTime = timer.pickupTime();
    
    Order newPizzaOrder = new Order(pickupTime, costumerName);

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

  public void setListOfOrders(ArrayList<Order> listOfOrders) {
    this.listOfOrders = listOfOrders;
  }

  public ArrayList<Order> sortOrderlist2() {

    ArrayList<Order> finalOrders = new ArrayList<>();


    while (!this.listOfOrders.isEmpty()) {
      Order temp = this.listOfOrders.get(0);

      for (int i = 0; i < this.listOfOrders.size(); i++) {


        int firstHour = Integer.parseInt(temp.getPickUpTime().substring(0, 2));
        int firstMin = Integer.parseInt(temp.getPickUpTime().substring(3));
        int lowestPickUpTime = firstHour * 100 + firstMin;

        int secundHour = Integer.parseInt(this.listOfOrders.get(i).getPickUpTime().substring(0, 2));
        int secundMin = Integer.parseInt(this.listOfOrders.get(i).getPickUpTime().substring(3));
        int posibleLowerPickuptime = secundHour * 100 + secundMin;

        if (posibleLowerPickuptime <= lowestPickUpTime) {
          temp = this.listOfOrders.get(i);
        }

        if (i == this.listOfOrders.size() - 1) {
          finalOrders.add(temp);
          this.listOfOrders.remove(temp);
        }
      }
    }

    return finalOrders;
  }

  public boolean removeOrder(int orderNumber) {
    for (int i = this.listOfOrders.size() - 1; i >= 0; i--) {
      Order order = listOfOrders.get(i);
      if (orderNumber == order.getOrderNumber()) {
        listOfOrders.remove(order);
        return true;
      }
    }
    return false;
  }
}
