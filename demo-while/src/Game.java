import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    // range 1-100
    // bomb: 74 (random number)
    // User guess a number between 1 - 100
    // update range -> another guess -> update range -> another guess.... until hit the bomb

    // which type of loop
    // Bomb (random number generator)
    // how to ask user question?
    // compare user input vs bomb

    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100) + 1;
    System.out.println(bomb);
    int guess = 0;
    int round = 1;
    int lowEnd = -1;
    int highEnd = -1;
    do {
      if (round == 1) {
        lowEnd = min;
        highEnd = max;
        System.out.println("The new range is: " + lowEnd + " - " + highEnd);
        round++;
      } else {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number: ");
        guess = input.nextInt();
        // validation
        if (guess < lowEnd || guess > highEnd) {
          System.out.println("The input number is out of range, please try again.");
          System.out.println("The new range is: " + lowEnd + " - " + highEnd);
          continue;
        } else {
          if (guess < bomb) {
            lowEnd = guess;
          } else {
            highEnd = guess;
          }
          System.out.println("The new range is: " + lowEnd + " - " + highEnd);
        }

        round++;
      }

    } while (bomb != guess);

    System.out.println("BOOMMMMMMM!");



  }

}
