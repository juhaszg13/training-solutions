package week04d01;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if ((fullName == null) || (fullName.isEmpty())) {
            throw new IllegalArgumentException("Invalid name: " + fullName);
        }
        this.fullName = fullName;
    }
    public String changeFirstName(String firstName){
        int position=fullName.indexOf(" ");
        return firstName+fullName.substring(position);
    }

    public static void main(String[] args) {
        NameChanger nameChanger=new NameChanger("Juhász Gábor");
        System.out.println(nameChanger.changeFirstName("Kiss"));
    }
}
