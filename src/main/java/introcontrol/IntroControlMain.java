package introcontrol;



public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl=new IntroControl();
        System.out.println(introControl.substractTenIfGreaterThanTen(0));
        System.out.println(introControl.substractTenIfGreaterThanTen(10));
        System.out.println(introControl.substractTenIfGreaterThanTen(15));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(2));

        System.out.println(introControl.greetingToJoe("Jack"));
        System.out.println(introControl.greetingToJoe("Joe"));

        System.out.println(introControl.calculateBonus(100000));
        System.out.println(introControl.calculateBonus(1000000));

        System.out.println(introControl.calculateConsumption(10,3000));
        System.out.println(introControl.calculateConsumption(3000,1));

        introControl.printNumbers(4);

        introControl.printNumberBetweenAnyDirection(2,4);
        introControl.printNumberBetweenAnyDirection(5,2);

        introControl.printOddNumbers(9);






    }
}
