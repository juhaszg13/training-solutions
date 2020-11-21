package references.parameters;

public class ReferencesMain {
    public static void main(String[] args){
        Person person1;
        Person person2;
        person1=new Person("Pista",52);
        person2=person1;
        person2.setName("Géza");
        System.out.println(person1.getName()+", "+person1.getAge());
        System.out.println(person2.getName()+", "+person2.getAge());

        int a=24;
        int b=a;
        b=b+1;
        System.out.println(a+","+b);

        person1=new Person("Laci",59);
        System.out.println(person1.toString()+", "+person2.toString());

    }
}
