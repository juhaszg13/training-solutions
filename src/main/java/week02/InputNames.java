package week02;

import java.util.Arrays;
import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int item=5;
        String[] names= new String[item];

        for(int i=0;i<item;i++){
            System.out.println("Kérem a(z) " + (i+1) + ". nevet: ");
            names[i] = scanner.nextLine();
        }

        for(int i=0;i<item;i++){
            System.out.println("A(z) "+(i+1)+". elem: "+names[i]);
        }
    }
}

