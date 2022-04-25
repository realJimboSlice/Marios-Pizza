package com.company;

import java.util.ArrayList;

public class Menucard {

  private ArrayList<Pizza> menuCard;

  public Menucard() {
    this.menuCard = new ArrayList<>();
  }

  @Override
  public String toString() {
    String space = " ";
    return space.repeat(30) + "PIZZAER:\n" + menuCard;
  }

  public void addToMenu(Pizza pizza) {
    menuCard.add(pizza);
  }

  public ArrayList<Pizza> getMenuCard() {
    return this.menuCard;
  }

  public Pizza findPizzaByMenuNumber(int pizzaChoice) {
    for (Pizza pizza : menuCard) {
      if (pizza.getMenuNumber() == pizzaChoice) {
        return pizza;
      }
    }
    return null;
  }
}
