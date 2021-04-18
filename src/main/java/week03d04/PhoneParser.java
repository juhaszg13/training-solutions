package week03d04;

public class PhoneParser {
    public Phone parse(String phoneNumber){
        int a=phoneNumber.indexOf("-");
        String prefix=phoneNumber.substring(0,a);
        String number=phoneNumber.substring(a+1);
        return new Phone(prefix,number);
    }

    public static void main(String[] args) {
        PhoneParser pp=new PhoneParser();
        Phone phone=pp.parse("10-1234567");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
    }
}
