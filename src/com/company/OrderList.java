package com.company;

import java.util.ArrayList;

public class OrderList {
  private ArrayList <Bestilling> listOfOrders;

  public OrderList (){
    this.listOfOrders = new ArrayList<>();
  }

  public void addOrder (Bestilling newOrder) {
    listOfOrders.add(newOrder);
  }
}
