// Java Program to check if a number is power or not.

public class Power_or_not {
    public static void main(String args[]) {
        System.out.printf("is %d power of Two? %b%n", 2, isPowerofTwo(2));
        System.out.printf("is %d power of Two? %b%n", 2, isPowerofTwo(4));
        System.out.printf("is %d power of Two? %b%n", 2, isPowerofTwo(5));
        System.out.printf("is %d power of Two? %b%n", 2, isPowerofTwo(1));
        System.out.printf("is %d power of Two? %b%n", 2, isPowerofTwo(-1));
    }

    // Return true, if number is power of two, otherwise false.
    
    public static boolean isPowerofTwo(int number) {
        return (number & (number - 1)) == 0;
    }
}
