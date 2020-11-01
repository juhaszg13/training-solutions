package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a számlaszámot:");
        String accountNumber = scanner.nextLine();

        System.out.println("Kérem a tulajdonos nevét:");
        String owner = scanner.nextLine();

        System.out.println("Kéren az egyenleget:");
        int balance = scanner.nextInt();
        scanner.nextLine();


        BankAccount account1 = new BankAccount(accountNumber, owner, balance);


        System.out.println("Kérem a másik számlaszámot:");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Kérem a tulajdonos nevét:");
        String owner2 = scanner.nextLine();

        System.out.println("Kéren az egyenlegét:");
        int balance2 = scanner.nextInt();
        BankAccount account2 = new BankAccount(accountNumber2, owner2, balance2);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("Mennyit szeretne utalni az első számlára?");
        int amount1 = scanner.nextInt();
        account1.deposit(amount1);
        System.out.println(account1.getInfo());

        System.out.println("Mennyit szeretne felvenni a második  számláról?");
        int amount2 = scanner.nextInt();
        account2.withdraw(amount2);
        System.out.println(account2.getInfo());

        System.out.println("Mennyit szeretne az első számláról átutalni a másodikra?");
        int transferAmount = scanner.nextInt();
        account1.Transfer(account2, transferAmount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

    }
}
