// Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;

public class Ascending_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < numbers.length-1; i++) {    //NOTE: numbers.length -1 as termination condition
            
            if(numbers[i] > numbers[i+1]) {             // This is the condition for descending order
                isAscending = false;
            }
        } 
        
        if (isAscending) {
            System.out.println("The Array is Sorted in Ascending Order");
        } 
        else {
            System.out.println("The Array is not Sorted in Ascending Order");
        }
        sc.close();
    }
}
