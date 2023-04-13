// Check if an Array is Sorted (Strictly Increasing)
public class Strictly_Increasing {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length-1) {
            return true;
        }

        if (arr[idx] >= arr[idx+1]) {
            // Array is Unsorted
            return false;
        }
        return isSorted(arr, idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 3};
        System.out.println(isSorted(arr, 0));
    }
}
