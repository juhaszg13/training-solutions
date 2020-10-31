package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("What's your name?");
        client.name = scanner.nextLine();
        System.out.println("What's your year of birth?");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What's your address?");
        client.address = scanner.nextLine();
        System.out.println("Name: " + client.name);
        System.out.println("Year of Birth: " + client.year);
        System.out.println("Address: " + client.address);

    }
}
