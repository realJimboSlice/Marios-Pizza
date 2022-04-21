package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Timer {

  static void Klokkeslæt() {

    // Klokkeslæt i millisekunds format
    long millis = System.currentTimeMillis();

    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(millis);

    long hourofday = (calendar.get(Calendar.HOUR_OF_DAY));
    long minute = calendar.get(Calendar.MINUTE);

    if (hourofday >= 10) {
      System.out.println(hourofday + ":" + minute);
    } else {
      System.out.println("\nButikken er ikke åben endnu");
    }
  }

    public String afhentningstidspunkt() {
      // Timeren viser en time senere (altså hvornår pizzaen skal afhentes (3600000 er en time i millisekunder))
      Date date = new Date(System.currentTimeMillis() + 3600000);
      String yourDesiredDateValue = new SimpleDateFormat("hh:mm").format(date);
      return yourDesiredDateValue;
    }

  static void Nedtælling() throws InterruptedException {

    Scanner scan = new Scanner(System.in);
    System.out.println("\nHvor lang tid skal der gå før ordren er klar til afhentning (i minutter) ?");
    // Konverterer input til sekunder
    int timet = scan.nextInt() * 60;
    // konverterer sekunder til millisekunder
    long delay = timet * 1000;

    do {
      // Variabler - ikke røre
      int minutes = timet / 60;
      int seconds = timet % 60;
      System.out.println(minutes + " minut(ter), " + seconds + " sekund(er)");
      // Hvor lang tid der går i mellem hvert tick (i millisekunder)
      // (1000 millisekunder = 1 sekund) (60000 millisekunder = 1 minut) (3600000 millisekunder = 1 time)
      Thread.sleep(300000);
      // Hvor mange sekunder der bliver hugget hver gang den ticker
      timet = timet - 300;
      // Ikke røre
      delay = delay - 1000;

    }
    while (delay != 0);
    System.out.println("Ordre (nummer) klar til afhentning");
  }

}
