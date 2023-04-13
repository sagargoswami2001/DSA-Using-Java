// Tower of Hanoi - Transfer n Disks From Source to Destination Over 3 Towers.
public class Tower_of_Hanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " From " + src + " To " + dest);
            return;
        }

        // Transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);

        // Transfer nth from src to dest
        System.out.println("Transfer Disk " + n + " From " + src + " To " + helper);

        // Transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}
