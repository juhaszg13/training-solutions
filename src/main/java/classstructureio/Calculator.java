package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first whole number?");
        int firstWholeNumber = scanner.nextInt();
        System.out.println("What is the second whole number?");
        int secondWholeNumber = scanner.nextInt();
        System.out.println("Operation: " + firstWholeNumber + " + " + secondWholeNumber);
        System.out.println("Result: " + (firstWholeNumber + secondWholeNumber));
    }
}
