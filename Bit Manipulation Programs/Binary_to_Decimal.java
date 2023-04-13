// Write a Java Program to Convert a Binary to Decimal Number.
import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Binary Number: ");
        int num = sc.nextInt();

        int d = 0, i = 0;
        int t = num;

        while (t > 0) {
            int r = t % 10;
            t = t / 10;
            d = d + r * (int) Math.pow(2, i++);
        }
        System.out.print("Decimal Equivalent of " + num + " is " + d);

        sc.close();
    }
}
