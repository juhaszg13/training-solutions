package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        System.out.println("What's your favourite composer?");
        song.band = scanner.nextLine();
        System.out.println("What's your favourite song?");
        song.title = scanner.nextLine();
        System.out.println("What's the length(minute)?");
        scanner.nextLine();
        System.out.println(song.band + "-" + song.title + "(" + song.length + " minutes" + ")");
    }
}
