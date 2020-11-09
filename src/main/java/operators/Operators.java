package operators;

public class Operators {
    boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int multiplyByPowerOfTwo(int number,int multiplyer){
        int result=number<<multiplyer;
        return result;
    }
}

