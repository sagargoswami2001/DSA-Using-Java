// Print the fibonacci sequence till nth term.
public class Fibonacci_Sequence {
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        printFibonacci(b, c, n-1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFibonacci(a, b, n-2);
    }
}
