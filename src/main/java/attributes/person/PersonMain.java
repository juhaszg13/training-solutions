package attributes.person;

import org.w3c.dom.ls.LSOutput;

public class PersonMain {
    public static void main(String[] args) {
        Person person=new Person("Kis Pista","56124567");
        System.out.println(person.personToString());

        person.correctData("Nagy Géza","52387812");
        System.out.println(person.personToString());

        Address address=new Address("Hungary","Budapest","Kossuth 12.","1033");
        System.out.println(address.addressToString());

        address.correctData("Hungary","Győr","Szechenyi 33","3434");
        System.out.println(address.addressToString());

        Address address2=new Address("Hungary","Pécs","Petőfi 20","2222");
        person.moveTo(address2);
        System.out.println(person.getAddress().addressToString());
    }
}
