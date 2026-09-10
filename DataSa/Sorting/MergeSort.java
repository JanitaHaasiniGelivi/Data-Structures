package Sorting;

import java.util.*;

public class MergeSort {

    public static void conquer(int[] arr, int si, int mid, int ei) {

        int[] merged = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Compare elements from both halves
        while (idx1 <= mid && idx2 <= ei) {

            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from left half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from right half
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged array back into original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Divide left half
        divide(arr, si, mid);

        // Divide right half
        divide(arr, mid + 1, ei);

        // Merge both sorted halves
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 5, 2, 8};

        int n = arr.length;

        divide(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}