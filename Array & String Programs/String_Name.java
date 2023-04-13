import java.util.Scanner;

public class String_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");

        String name = sc.nextLine();
        System.out.println("Your Name is: " + name);

        sc.close();
    }
}
