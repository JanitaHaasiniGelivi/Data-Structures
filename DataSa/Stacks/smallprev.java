package Stacks;
import java.util.*;
public class smallprev {
    public static void Smallprev(int[] arr, int n) {
        for (int i=0; i<n;i++) {
            int j;
            for (j=i-1; j>=0;j--) {
                if (arr[j] < arr[i]) {
                    System.out.println(arr[j]);
                    break;
                }
            }

            if (j==-1) {
                System.out.println("-");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr =new int[n];

        for (int i=0; i<n;i++) {
            arr[i] =sc.nextInt();
        }

        Smallprev(arr,n);
        
        sc.close();
    }
}