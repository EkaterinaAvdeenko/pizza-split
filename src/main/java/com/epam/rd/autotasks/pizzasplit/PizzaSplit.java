package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int people = scanner.nextInt();
    int pieces = scanner.nextInt();
    int pizza = 1;
    int countPieces = pieces;

    while (people > 0) {
      pieces = countPieces;
      pieces *= pizza;
      if (pieces % people == 0) {
        break;
      }
      pizza++;
    }
    System.out.println(pizza);


  }
}
