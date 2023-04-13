// Print the sum of first n natural numbers.
public class Natural_Numbers {
    public static void printSum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }

        sum += n;
        printSum(n-1, sum);
    }

    public static void main(String[] args) {
        printSum(5, 0);
    }
}
