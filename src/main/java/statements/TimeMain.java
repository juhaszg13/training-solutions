package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        System.out.println("Első isőpont:");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Óra:");
        int hours1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Perc:");
        int minutes1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Másodperc:");
        int seconds1=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Második isőpont:");
        System.out.println("Óra:");
        int hours2=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Perc:");
        int minutes2=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Másodperc:");
        int seconds2=scanner.nextInt();
        scanner.nextLine();
        Time time1=new Time(hours1,minutes1,seconds1);
        Time time2=new Time(hours2,minutes2,seconds2);
        System.out.println("Az első idöpont: "+time1.toString()+" = "+ time1.getInMinutes()  +" perc");
        System.out.println("A második idöpont: "+time2.toString()+" = "+  time2.getInSeconds() +" másodoperc");
        System.out.println("Az első korábbi, mint a második: "+time1.earlierThan(time2)   );

    }
}
/*
Az első időpont 12:3:43 = 723 perc
        A második időpont 4:21:38 = 15698 másodperc
        Az első korábbi, mint a második: false
 */