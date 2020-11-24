package week04;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if ((fullName == null) || fullName.equals("") || fullName.isBlank()) {
            throw new IllegalArgumentException("Invalid name:<" + fullName + ">");
        }
        this.fullName = fullName;
    }

    public String changeFirstName(String firstName) {
        int szokoz = fullName.indexOf(" ");
        String vezetekNev = fullName.substring(0, szokoz + 1);
        fullName=vezetekNev + firstName;
        return fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
