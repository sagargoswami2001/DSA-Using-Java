// Typecasting: Converting value of one data type to value of another data type.
/* Types of Casting:
    1. Implicit
    2. Explicit
*/

public class Typecasting {
    public static void main(String[] args) {
        // Implicit Casting
        int a = 27;
        long b = a;

        float f = 3.14f;
        double s = f;

        System.out.println(b);
        System.out.println(s);

        // Explicit Casting
        int c = 20;
        byte d = (byte)c;

        double g = 27.2001;
        int h = (int)g;

        System.out.println(d);
        System.out.println(h);

        // ASCII Value
        char m = 83;
        System.out.println(m);
    }
}
