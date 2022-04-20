package com.company;

public class Creator {


  public void createPizzas() {
    Menukort menu = new Menukort();

    Pizza vesuvio = new Pizza("vesuvio", 1, 57);
    vesuvio.addTopping(Topping.TOMATSAUCE);
    vesuvio.addTopping(Topping.OST);
    vesuvio.addTopping(Topping.SKINKE);
    vesuvio.addTopping(Topping.OREGANO);
    menu.addToMenu(vesuvio);

    Pizza amerikaner = new Pizza("Amerikaner", 2, 53);
    amerikaner.addTopping(Topping.TOMATSAUCE);
    amerikaner.addTopping(Topping.OST);
    amerikaner.addTopping(Topping.OKSEFARS);
    amerikaner.addTopping(Topping.OREGANO);
    menu.addToMenu(amerikaner);

    Pizza cacciatore = new Pizza("cacciatore", 3, 57);
    cacciatore.addTopping(Topping.TOMATSAUCE);
    cacciatore.addTopping(Topping.OST);
    cacciatore.addTopping(Topping.PEPPERONI);
    cacciatore.addTopping(Topping.OREGANO);
    menu.addToMenu(cacciatore);

    Pizza carbona = new Pizza("Carbona", 4, 63);
    carbona.addTopping(Topping.TOMATSAUCE);
    carbona.addTopping(Topping.OST);
    carbona.addTopping(Topping.KØDSAUCE);
    carbona.addTopping(Topping.SPAGHETTI);
    carbona.addTopping(Topping.COCKTAILPØLSER);
    carbona.addTopping(Topping.OREGANO);
    menu.addToMenu(carbona);

    Pizza dennis = new Pizza("Dennis", 5, 65);
    dennis.addTopping(Topping.TOMATSAUCE);
    dennis.addTopping(Topping.OST);
    dennis.addTopping(Topping.SKINKE);
    dennis.addTopping(Topping.PEPPERONI);
    dennis.addTopping(Topping.COCKTAILPØLSER);
    dennis.addTopping(Topping.OREGANO);
    menu.addToMenu(dennis);

    Pizza bertil = new Pizza("Bertil", 6, 57);
    bertil.addTopping(Topping.TOMATSAUCE);
    bertil.addTopping(Topping.OST);
    bertil.addTopping(Topping.BACON);
    bertil.addTopping(Topping.OREGANO);
    menu.addToMenu(bertil);

    Pizza silvia = new Pizza("Silvia", 7, 61);
    silvia.addTopping(Topping.TOMATSAUCE);
    silvia.addTopping(Topping.OST);
    silvia.addTopping(Topping.PEPPERONI);
  }
}
