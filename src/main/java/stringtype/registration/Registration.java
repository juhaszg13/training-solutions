package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);

        System.out.println("Fehasználó neve:");
        String username=scanner.nextLine();

        System.out.println("Jelszó:");
        String password1=scanner.nextLine();

        System.out.println("Jelszó még egyszer:");
        String password2=scanner.nextLine();

        System.out.println("Email cím:");
        String email=scanner.nextLine();

        UserValidator uservalidator=new UserValidator();
        System.out.println(uservalidator.isValidUserName(username)?"felhasználónév rendben":"felhasználónév helytelen");
        System.out.println(uservalidator.isValidPassword(password1, password2)?"jelsz rendben":"jelszó helytelen");
        System.out.println(uservalidator.isValidEmail(email)?"jelszó rendben":"jelszó helytelen");

    }
}
