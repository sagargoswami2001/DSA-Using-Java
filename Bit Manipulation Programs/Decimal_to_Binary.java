// Write a Java Program to Convert a Decimal to Binary Number.
import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num, index = 0;
        int arr[] = new int[10];

        System.out.print("Enter a Decimal Number: ");
        num = sc.nextInt();

        while (num>0) {
            arr[index] = num % 2;
            index++;
            num = num/2;
        }

        System.out.print("Binary Number is: ");
        for (int i = index-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}
