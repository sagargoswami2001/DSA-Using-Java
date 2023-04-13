// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.  
import java.util.Scanner;

public class Search_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows Number: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns Number: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // For Input
        // Control for Rows
        for (int i = 0; i < rows; i++) {
            // Control for Column
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Search Number: ");

        int x = sc.nextInt();

        // Search Number
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Compare with x
                if (numbers[i][j] == x) {
                    System.out.println("X found at locations (" + i + "," + j + ")");
                }
            }
        }
        sc.close();
    }
}
