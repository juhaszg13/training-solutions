package week07d02;

public class DigitSum {
    public int sumOfDigits(int x) {
        if(x< 100) {
            throw new IllegalArgumentException("Invalid number");
        }
        String number = Integer.toString(x);
        int sum = 0;
        String[] temp = number.split("");

        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }

    public int sumOfDigitsWith(int x){
        int sum=0;
        while(x!=0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }
}
