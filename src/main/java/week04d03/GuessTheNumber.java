package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int number;

    public void guess(int number) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            if (i == 6) {
                System.out.println("Nem sikerült!");
                return;
            }
            System.out.println("Kérek egy számot!");
            this.number = scanner.nextInt();

            if (this.number == number) {
                System.out.println("Eltaláltad!");
            }
            if (this.number < number) {
                System.out.println("Kisebb számot adtál meg!");
            }
            if (this.number > number) {
                System.out.println("Nagyobb számot adtál meg!");
            }
            i++;
        } while (this.number != number);
    }

    public static void main(String[] args) {
        GuessTheNumber gtn = new GuessTheNumber();
        Random rnd = new Random();
        int number = rnd.nextInt(100) + 1;
        gtn.guess(number);

    }
}
