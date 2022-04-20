package com.company;

import java.util.ArrayList;

public class Pizza {

  public String name;
  public int menuNumber;
  public int price;
  public ArrayList<Topping> Topping;

  public Pizza(String name, int menuNmb, int price) {
    this.name = name;
    this.menuNumber = menuNmb;
    this.price = price;
    this.Topping = new ArrayList<>();
  }

  public String toString() {
    String dot = ".";
    String space = " ";
    int repeat;
    if (menuNumber == 1) {
      repeat = 2;
    } else if (menuNumber < 10 || menuNumber > 1) {
      repeat = 1;
    } else {
      repeat = 0;
    }
    return space.repeat(repeat) + menuNumber + ". " + name + dot.repeat(60 - (name.length())) + price + " kr\n   " + Topping + "\n\n";
  }

  public String getName() {
    return name;
  }

  public int getOrdreNmb() {
    return menuNumber;
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


  public void removeTopping(String topping) {
    this.Topping.remove(topping);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOrdreNmb(int ordreNmb) {
    this.menuNumber = ordreNmb;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getMenuNumber() {
    return menuNumber;
  }
}
