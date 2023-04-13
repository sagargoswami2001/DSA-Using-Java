public class ParseInt_ToString_Method {
    public static void main(String[] args) {

        // ParseInt Method of Integer Class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        // ToString Method of String Class
        int num = 123;
        String string = Integer.toString(num);
        System.out.println(string.length());
    }
}   // NOTE: Java Strings are Immutable.
