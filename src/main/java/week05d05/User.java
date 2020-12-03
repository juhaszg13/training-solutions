package week05d05;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        int occurrance = email.indexOf("@");
        if (!email.contains("@") || !email.substring(occurrance).contains(".")) {
            throw new IllegalArgumentException("Hibás email cím! \'@\' vagy \'.\' hiányzik!");
        }
    }

    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
