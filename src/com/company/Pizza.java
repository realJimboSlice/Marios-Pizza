package com.company;

import java.util.ArrayList;

public class Pizza {

  private String name;
  private int menuNumber;
  private int price;
  private ArrayList<Topping> Topping;

  public Pizza(String name, int menuNumber, int price) {
    this.name = name;
    this.menuNumber = menuNumber;
    this.price = price;
    this.Topping = new ArrayList<>();
  }

  public String toString() {

    return name;
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return price;
  }

  public ArrayList<Topping> getTopping() {
    return Topping;
  }

  public void addToppings(Topping[] toppings) {
    for (Topping topping : toppings) {
      Topping.add(topping);
    }
  }

  public int getMenuNumber() {
    return menuNumber;
  }
}
