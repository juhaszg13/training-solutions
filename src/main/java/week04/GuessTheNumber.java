package week04;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess = 0;
        int numberOfGuesses = 0;
        while (guess != number && numberOfGuesses < 6) {
            System.out.println("Írj be egy számot!");
            guess = Integer.parseInt(scanner.nextLine());
            numberOfGuesses++;
            System.out.println(numberOfGuesses + ". kérdés");
            if (guess < number) {
                System.out.println("Nagyobb számra gondoltam!");
            }
            if (guess > number) {
                System.out.println("Kisebb számra gondoltam!");
            }
            if (guess == number) {
                System.out.println("Eltaláltad!");
            }

        }
        if (guess != number) {
            System.out.println("Nem találtad el!");
        }
    }
}
