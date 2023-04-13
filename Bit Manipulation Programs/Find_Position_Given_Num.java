// Java Program to Find Position of Only Set Bit in a Given Number.
public class Find_Position_Given_Num
{
    static boolean isPowerofTwo(int n) 
    {
        return (n > 0 && ((n & (n - 1)) == 0)) ? true : false;
    }

    // Returns position of the only set bit in 'n'
    static int findPosition(int n)
    {
        if (!isPowerofTwo(n))
            return -1;

        int i = 1, pos = 1;

        while ((i & n) == 0) {
            i = i << 1;

            // increment position
            ++pos;
        }
        return pos;
    }

    public static void main(String[] args) {
        int n = 16;
        int pos = findPosition(n);
        if (pos == -1)
            System.out.println("N = " + n + ", Invalid Number");
        else
            System.out.println("N = " + n + ", Position " + pos);

        n = 12;
        pos = findPosition(n);
        if (pos == -1)
            System.out.println("N = " + n + ", Invalid Number");
        else
            System.out.println("N = " + n + ", Position " + pos);

        n = 128;
        pos = findPosition(n);
        if (pos == -1)
            System.out.println("N = " + n + ", Invalid Number");
        else
            System.out.println("N = " + n + ", Position " + pos);

    }
}
