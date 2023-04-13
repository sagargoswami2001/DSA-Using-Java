import java.util.Scanner;
public class Input_Output_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // Input Array

        // Control Rows
        for (int i = 0; i < rows; i++) {
            // Control Columns
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }


        // Output Array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
