package com.company;

import java.util.ArrayList;

public class Pizza {

  public String name;
  public int ordreNmb;
  public int price;
  public ArrayList<String> topping;

  public Pizza(String name, int ordreNmb, int price) {
    this.name = name;
    this.ordreNmb = ordreNmb;
    this.price = price;
    this.topping = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public int getOrdreNmb() {
    return ordreNmb;
  }

  public int getPrice() {
    return price;
  }

  public ArrayList<String> getTopping() {
    return topping;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOrdreNmb(int ordreNmb) {
    this.ordreNmb = ordreNmb;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
