//Level : Medium
//https://www.geeksforgeeks.org/problems/merge-sort/1

class Solution {
    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int[] merged = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            merged[k++] = arr[i++];
        }

        while (j <= r) {
            merged[k++] = arr[j++];
        }

        // Copy back to original array
        for (int x = 0; x < merged.length; x++) {
            arr[l + x] = merged[x];
        }
    }
}
