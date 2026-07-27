import java.util.*;

class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 45, 56, 66};

        swap(arr, 3, 5);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int in1, int in2) {
        int temp = arr[in1];
        arr[in1] = arr[in2];
        arr[in2] = temp;
    }
}