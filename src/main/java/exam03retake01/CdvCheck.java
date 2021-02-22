package exam03retake01;

public class CdvCheck {
    public boolean check(String number) {
        String[] numbers;
        numbers = number.split("");
        if (numbers.length != 10) {
            throw new IllegalArgumentException("Invalid tax number");
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (i + 1) * Integer.parseInt(numbers[i]);
        }
        if (Integer.parseInt(numbers[9]) == (sum % 11)) {
            return true;
        } else {
            return false;
        }
    }
}
