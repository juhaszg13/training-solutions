package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What's your name?");
        String name=scanner.nextLine();
        System.out.println("What's your e-mail address?");
        String email=scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("E-mail: " + email);
    }
}
