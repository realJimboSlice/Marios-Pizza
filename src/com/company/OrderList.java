package com.company;

import java.util.ArrayList;

public class OrderList {
  private ArrayList<Bestilling> listOfOrders;
  public UserInterface ui = new UserInterface();


  public OrderList() {
    this.listOfOrders = new ArrayList<>();
  }

  public void addOrder(Bestilling newOrder) {
    listOfOrders.add(newOrder);
  }

  public ArrayList<Bestilling> getListOfOrders() {
    return listOfOrders;
  }

  @Override
  public String toString() {
    return "Orders in the system: " + listOfOrders;
  }

  public void newOrder(Menucard menuCard, Timer timer) {
    String costumerName = ui.userInputName();
    String pickUpTime = timer.afhentningstidspunkt();

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

  public void setListOfOrders(ArrayList<Bestilling> listOfOrders) {
    this.listOfOrders = listOfOrders;
  }

  public ArrayList<Bestilling> sortOrderlist2() {

    ArrayList<Bestilling> finalOrders = new ArrayList<>();


    while (!this.listOfOrders.isEmpty()) {
      Bestilling temp = this.listOfOrders.get(0);

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
}
