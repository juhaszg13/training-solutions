package week02;

import java.util.Scanner;

public class Controller {

    private Office office;

    public void readOffice() {
        office = new Office();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány tárgyaló lesz?");
        int numberOfMeetingRooms = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberOfMeetingRooms; i++) {
            System.out.println("Kérem a nevét:");
            String name = sc.nextLine();
            System.out.println("Kérem a hosszt:");
            int length = sc.nextInt();
            sc.nextLine();
            System.out.println("Kérem a szélességet:");
            int width = sc.nextInt();
            sc.nextLine();
            office.addMeetingRoom(new MeetingRoom(name, length, width));

        }
    }


    public void printMenu() {
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menüpont száma:");
        int menuPoint = scanner.nextInt();
        scanner.nextLine();

        if (menuPoint == 1) {
            office.printNames();
        }
        if (menuPoint == 2) {
            office.printNameReverse();
        }
        if (menuPoint == 3) {
            office.printEventNames();
        }
        if (menuPoint == 4) {
            office.printAreas();
        }
        if (menuPoint == 5) {
            office.printMeetingRoomsWithName();

        }
        if (menuPoint == 6) {
            office.printMeetingRoomsContains();
        }

        if (menuPoint == 7) {

            office.printAreasLargerThan();
        }

    }


    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }

}
