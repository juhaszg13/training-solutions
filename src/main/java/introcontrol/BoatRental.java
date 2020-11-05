package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Turistak szama: ");
        int turistak = scanner.nextInt();

        if (turistak <= 2) {
            System.out.println("A 2 személyes csónakot viszik el és még 8 fő mehet utánuk ");
        }
        if (turistak == 3) {
            System.out.println("A 3 személyes csónakot viszik el és még 7 fő mehet utánuk ");
        }
        if ((turistak == 4) || (turistak == 5)) {
            System.out.println("Az 5 személyes csónakot viszik el és még 5 fő mehet utánuk ");
        }
        if ((turistak == 6) || (turistak == 7)) {
            System.out.println("Az 5 és a 2 személyes csónakot viszik el és még 3 fő mehet utánuk ");
        }
        if (turistak == 8) {
            System.out.println("Az 5 és a 3 személyes csónakot viszik el és még 5 fő mehet utánuk ");
        }
        if ((turistak == 9) || (turistak == 10)) {
            System.out.println("Az 5,3 és 2 személyes csónakot viszik el és még 5 fő mehet utánuk ");
        }
        else{
            System.out.println(turistak-10+ " személy vár csónakra ");

        }
    }
}
