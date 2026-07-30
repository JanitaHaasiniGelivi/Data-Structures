package Leetcode.Array;
import java.util.*;

public class CreateTargetArrayintheGivenOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int [] nums= new int[n];
    int[] index=new int[n];
    
        int[] target=new int[n];
        for(int i=0;i<n;i++){
            for (int j = i; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]]=nums[i];
        }
        System.out.println(Arrays.toString(target));
        sc.close();
  }
  
  
}
