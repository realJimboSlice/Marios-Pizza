package com.company;

import java.util.ArrayList;

public class Menukort {

  public ArrayList<Pizza> menuCard;

  public Menukort(){
    this.menuCard = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "Menukort{" +
        "menuCard=" + menuCard +
        '}';
  }

  public void addToMenu(Pizza pizza){
    menuCard.add(pizza);
  }

  public void removeFromMenu(Pizza pizza){
    menuCard.remove(pizza);
  }

  public ArrayList<Pizza> getMenuCard() {
    return menuCard;
  }
}
