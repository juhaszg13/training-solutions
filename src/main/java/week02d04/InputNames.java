package week02d04;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] names=new String[5];
        for(int i=0;i<5;i++){
            System.out.println(i+1+". név: ");
            String name=scanner.nextLine();
            names[i]=name;
        }
        for(int i=0;i<names.length;i++){
            System.out.println(i+1+". név: "+names[i]);
        }
    }
}
