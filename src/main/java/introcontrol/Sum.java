package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek 5 számot!");
        int osszeg=0;
        for(int i=1;i<=5;i++) {
            System.out.println("Az " + i + " .szám:");
            int szam=scanner.nextInt();
            osszeg=osszeg+szam;
        }
        System.out.println("A számok összege: "+osszeg);
    }
}
