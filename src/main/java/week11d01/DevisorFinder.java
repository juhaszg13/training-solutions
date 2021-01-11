package week11d01;

public class DevisorFinder {
    public int findDivisors(int n) {
        String number = Integer.toString(n);
        int items = 0;
        int devisor = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            devisor = Integer.parseInt(number.substring(i, i + 1));
            if (isDevisor(n, devisor)) {
                items++;
            }
        }
        if (isDevisor(n, Integer.parseInt(number.substring(number.length() - 1)))) {
            items++;
        }
        return items;
    }

    public boolean isDevisor(int number, int m) {
        if (number % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int findDivisors2(int n) {
        String number = Integer.toString(n);
        int items = 0;
        int devisor = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            devisor = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (isDevisor(n, devisor)) {
                items++;
            }
        }
        return items;
    }

    public int findDivisors3(int n) {
        String number = Integer.toString(n);
        int items = 0;
        int devisor = 0;
        for (char c : number.toCharArray()) {
            devisor = Integer.parseInt(Character.toString(c));
            if (isDevisor(n, devisor)) {
                items++;
            }
        }
        return items;
    }
}
