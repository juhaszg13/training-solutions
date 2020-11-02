package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Befektetés összege: ");
        int fund = scanner.nextInt();

        System.out.println("Kamatláb: ");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);
        System.out.println("Tőke: "+investment.getFund());
        System.out.println("Hozam 50 napra: "+investment.getYield(50));
        System.out.println("Kivett összeg 100 nap után: " + investment.close(100));
        System.out.println("Kivett összeg 200 nap után: " + investment.close(200));




    }
}
