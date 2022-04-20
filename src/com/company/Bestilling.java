package com.company;

import java.util.ArrayList;

public class Bestilling {
  private int pickUpTime;
  private boolean isDelivered;
  private boolean isPaid;
  private int totalPrice;
  private int orderNumber;
  private String costumerName;
  private ArrayList <Pizza> orderItems;

  public Bestilling (int pickUpTime, String costumerName){
    this.pickUpTime = pickUpTime;
    this.costumerName = costumerName;
    this.isPaid = false;
    this.isDelivered = false;
    this.totalPrice = 0;
    this.orderNumber = 0;
    this.orderItems = new ArrayList<>();
  }


  public void addPizzaToOrder (Pizza chosenPizza){
    orderItems.add(chosenPizza);
  }

  public int getPickUpTime(){
    return pickUpTime;
  }

  @Override
  public String toString() {
    return "costumer name: " + costumerName + ", pickUpTime: " + pickUpTime +
        ", totalPrice = " + totalPrice +
        ", orderItems = " + orderItems;
  }
}
