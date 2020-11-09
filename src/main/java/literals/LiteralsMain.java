package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("1"+"2");
        System.out.println(Integer.toOctalString(1)+Integer.toString(2));
        System.out.println(1+""+2);

        double quotient=3/4;
        System.out.println(quotient);
        quotient=3D/4D;
        System.out.println(quotient);

        long big=3_244_444_444L;
        System.out.println(big);

        String s="árvíztűrőtükörfúrógép";
        System.out.println(s);

        System.out.println("title".toUpperCase());

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));

    }
}
