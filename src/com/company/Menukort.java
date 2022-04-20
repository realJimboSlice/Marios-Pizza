package com.company;

import java.util.ArrayList;

public class Menukort {

  public ArrayList<Pizza> menuCard;

  public Menukort(){
    this.menuCard = new ArrayList<>();
  }

  @Override
  public String toString() {
    String space = " ";
    return space.repeat(30) + "PIZZAER:\n" + menuCard;
  }

  public void addToMenu(Pizza pizza){
    menuCard.add(pizza);
  }

  public void removeFromMenu(Pizza pizza){
    menuCard.remove(pizza);
  }

  public ArrayList<Pizza> getMenuCard() {
    return this.menuCard;
  }
}
