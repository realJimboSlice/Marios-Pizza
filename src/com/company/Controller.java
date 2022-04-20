package com.company;

public class Controller {
  UserInterface ui = new UserInterface();

  public void mainMenu () {

    Creator creator = new Creator();
    creator.createPizzas();

    boolean loop = true;
    while (loop) {

      ui.displayMenu();
      int choice = ui.indputNumber();

      switch (choice){
        case 1 -> System.out.println("Display the Menu");
        case 2 -> System.out.println("Add Orders");
        case 3 -> System.out.println("View Orders");
        case 4 -> System.out.println("Remove Order");
        case 5 -> System.out.println("Display Stats");
        case 10 -> loop = false;
        default -> System.out.println("Invalid choice");
      }

    }

  }
}
