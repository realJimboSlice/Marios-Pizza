package com.company;

import java.util.ArrayList;

public class Pizza {

  public String name;
  public int menuNmb;
  public int price;
  public ArrayList<Topping> Topping;

  public Pizza(String name, int menuNmb, int price) {
    this.name = name;
    this.menuNmb = menuNmb;
    this.price = price;
    this.Topping = new ArrayList<>();
  }

  public String toString() {
    String dot = ".";
    String space = " ";
    int repeat;
    if (menuNmb == 1) {
      repeat = 2;
    } else if (menuNmb < 10 || menuNmb > 1) {
      repeat = 1;
    } else {
      repeat = 0;
    }
    return space.repeat(repeat) + menuNmb + ". " + name + dot.repeat(60 - (name.length())) + price + " kr\n   " + Topping + "\n\n";
  }

  public String getName() {
    return name;
  }

  public int getOrdreNmb() {
    return menuNmb;
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
    this.menuNmb = ordreNmb;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
