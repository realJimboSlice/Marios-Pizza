package com.company;

import java.util.ArrayList;

public class Order {
  private String pickUpTime;
  private int totalPrice;
  private int orderNumber;
  private String costumerName;
  private ArrayList<Pizza> orderItems;

  public Order(String pickUpTime, String costumerName) {
    this.pickUpTime = pickUpTime;
    this.costumerName = costumerName;
    this.totalPrice = 0;
    this.orderNumber = 0;
    this.orderItems = new ArrayList<>();
  }

  public void addPizzaToOrder(Pizza chosenPizza) {
    orderItems.add(chosenPizza);
  }

  public String getCostumerName() {
    return costumerName;
  }

  public int getTotalPrice() {
    for (Pizza pizza: orderItems) {
      totalPrice += pizza.getPrice();
    }
    return totalPrice;
  }

  public ArrayList<Pizza> getOrderItems() {
    return orderItems;
  }

  public int getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(int orderNumber) {
    this.orderNumber = orderNumber + 1;
  }

  public String getPickUpTime() {
    return pickUpTime;
  }

  @Override
  public String toString() {
    return "costumer name: " + costumerName + ", pickUpTime: " + pickUpTime +
        ", totalPrice = " + totalPrice +
        ", orderItems = " + orderItems;
  }
}
