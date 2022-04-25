package com.company;

public class Creator {

  public void createPizzas(Menucard menukort) {

    Pizza vesuvio = new Pizza("Vesuvio", 1, 57);
    vesuvio.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.SKINKE, Topping.OREGANO});
    menukort.addToMenu(vesuvio);

    Pizza amerikaner = new Pizza("Amerikaner", 2, 53);
    amerikaner.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.OKSEFARS, Topping.OREGANO});
    menukort.addToMenu(amerikaner);

    Pizza cacciatore = new Pizza("cacciatore", 3, 57);
    cacciatore.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.PEPPERONI, Topping.OREGANO});
    menukort.addToMenu(cacciatore);

    Pizza carbona = new Pizza("Carbona", 4, 63);
    carbona.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.KØDSAUCE, Topping.SPAGHETTI, Topping.COCKTAILPØLSER, Topping.OREGANO});
    menukort.addToMenu(carbona);

    Pizza dennis = new Pizza("Dennis", 5, 65);
    dennis.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.SKINKE, Topping.PEPPERONI, Topping.COCKTAILPØLSER, Topping.OREGANO});
    menukort.addToMenu(dennis);

    Pizza bertil = new Pizza("Bertil", 6, 57);
    bertil.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.BACON, Topping.OREGANO});
    menukort.addToMenu(bertil);

    Pizza silvia = new Pizza("Silvia", 7, 61);
    silvia.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.PEPPERONI, Topping.RØD_PEBER, Topping.LØG, Topping.OLIVEN, Topping.OREGANO});
    menukort.addToMenu(silvia);

    Pizza victoria = new Pizza("Victoria", 8, 61);
    victoria.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.SKINKE, Topping.ANANAS, Topping.CHAMPIGNON, Topping.LØG, Topping.OREGANO});
    menukort.addToMenu(victoria);

    Pizza toronfo = new Pizza("Toronfo", 9, 61);
    toronfo.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.SKINKE, Topping.BACON, Topping.KEBAB, Topping.CHILI, Topping.OREGANO});
    menukort.addToMenu(toronfo);

    Pizza capricciosa = new Pizza("Capricciosa", 10, 61);
    capricciosa.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.SKINKE, Topping.CHAMPIGNON, Topping.OREGANO});
    menukort.addToMenu(capricciosa);

    Pizza hawai = new Pizza("Hawai", 11, 61);
    hawai.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.SKINKE, Topping.ANANAS, Topping.OREGANO});
    menukort.addToMenu(hawai);

    Pizza leBlissola = new Pizza("Le Blissola", 12, 61);
    leBlissola.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.SKINKE, Topping.REJER, Topping.OREGANO});
    menukort.addToMenu(leBlissola);

    Pizza venezia = new Pizza("Venezia", 13, 61);
    venezia.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.SKINKE, Topping.BACON, Topping.OREGANO});
    menukort.addToMenu(venezia);

    Pizza mafia = new Pizza("Mafia", 14, 61);
    mafia.addToppings(new Topping[]{Topping.TOMATSAUCE, Topping.OST, Topping.PEPPERONI, Topping.BACON, Topping.LØG, Topping.OREGANO});
    menukort.addToMenu(mafia);
  }
}
