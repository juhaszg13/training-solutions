package week09d01;

public class LKKT {
    public int lKKT(int x, int y) {
        int a=x;
        int b=y;
        while (a != b) {
            if (a < b) {
                a += x;
            } else {
                b += y;
            }
        }
        return a;
    }
}
