// Java Program to Count Set bits in an Integer.
public class Binary_Representation {

    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int s = 9;
        System.out.println(countSetBits(s));
    }
}
