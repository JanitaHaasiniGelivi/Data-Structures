package Sorting;
import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //  Bubblesortalgorithm
        boolean swapped;
        int temp;
        
        for (int i = 0; i <n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; 
            }
        }
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
//o(n^2)-->time complexity