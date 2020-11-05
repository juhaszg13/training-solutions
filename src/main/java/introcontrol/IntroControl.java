package introcontrol;

public class IntroControl {
    public int substractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number -= 10;
        }
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe!";
        } else {
            return "";
        }
    }

    public int calculateBonus(int sale) {
        if (sale >= 1000000) {

            return sale/10;
        } else {
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (next > prev) {
            return next - prev;
        } else {
            return 9999 - prev + next;
        }
    }

    public void printNumbers(int max) {

        for (int i = 0; i<=max; i++){
            System.out.println(i);
        }
    }
    public void printNumbers(int min,int max)
    {
        for(int i=min;min<=max;i++){
            System.out.println(i);
        }
    }
    public void printNumberBetweenAnyDirection(int a,int b) {
        if (b > a) {
            for (int i = a; b >= i; i++) {
                System.out.println(i);
            }
        }
            else {
                for(int i=a;b<=i;i--){
                    System.out.println(i);
                }
        }
    }
    public void printOddNumbers(int max){
        for(int i=1;max>=i;i+=2){

                System.out.println(i);
            }
        }
    }


