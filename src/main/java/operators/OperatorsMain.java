package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators=new Operators();
        System.out.println(operators.isEven(2));
        System.out.println(operators.isEven(3));

        System.out.println(Integer.toBinaryString(16>>1));
        System.out.println(Integer.toBinaryString(16<<1));
        System.out.println(Integer.toBinaryString(13>>1));
        System.out.println(Integer.toBinaryString(13<<1));

        System.out.println(operators.multiplyByPowerOfTwo(4,2));
        System.out.println(operators.multiplyByPowerOfTwo(3,2));
    }
}
