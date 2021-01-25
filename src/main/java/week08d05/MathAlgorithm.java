package week08d05;

public class MathAlgorithm {
    public int greatestCommonDivisor(int x, int y) {
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }

        }

        return x;
    }
}


