package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix="Hello ";
        String name="John Doe";
        String message=prefix+name;
        message=message+444;
        boolean b=(message.equals("Hello John Doe"));
        boolean c=(message.equals("Hello John Doe444"));
        String konkatenal=""+"";
        System.out.println(konkatenal.length());
        String hossz="Abcde";
        System.out.println(hossz.length());
        System.out.println(hossz.substring(0,1)+", "+hossz.substring(2,3));
        System.out.println(hossz.substring(0,3));

    }
}
