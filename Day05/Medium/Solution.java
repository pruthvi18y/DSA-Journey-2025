//Level : Medium
//https://www.geeksforgeeks.org/problems/quick-sort/1

class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Last element as pivot
        int i = low - 1;        // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element <= pivot, swap
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place pivot at the correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
