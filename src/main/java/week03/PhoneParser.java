package week03;

public class PhoneParser {
    public Phone parsePhone(String s){
        String prefix=s.substring(0,2);
        String number=s.substring(3);
        Phone phone=new Phone(prefix,number);
        return phone;
    }

    public static void main(String[] args) {
        PhoneParser parser=new PhoneParser();
        Phone phone=parser.parsePhone("234567391");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
    }
}
