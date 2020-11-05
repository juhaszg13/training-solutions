package introcontrol;


import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int szam= scanner.nextInt();
        if(szam>100) {
            System.out.println("A szám nagyobb, mint száz.");
        }
            else{
            System.out.println("A szám száz, vagy kisebb");
            }
        }
    }
