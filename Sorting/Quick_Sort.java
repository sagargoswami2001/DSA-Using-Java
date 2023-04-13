public class Quick_Sort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;   // Pivot Index
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);

            quickSort(arr, low, pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
    }

    // Time Complexity:-
    // Worst: 0(n^2)
    // Average: 0(nlogn)

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        quickSort(arr, 0, n-1);

        //Print
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
