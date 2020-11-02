package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        System.out.println("Kérek egy egész számot:");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        System.out.println("A szám osztható 3-mal: "+ (a%3==0?"true":"false"));
    }
}
