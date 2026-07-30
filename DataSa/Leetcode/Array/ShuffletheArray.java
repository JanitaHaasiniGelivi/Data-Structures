package Leetcode.Array;
import java.util.*;
public class ShuffletheArray {
  public static void main(String[] args) {
    int[] nums={2,5,1,3,4,7};
    int n=nums.length/2;
    int k=0;
    int[] ans =new int[nums.length];
    for(int i=0;i<n;i++){
          ans[k++]=nums[i];
            ans[k++]=nums[i+n];
        }
        System.out.println(Arrays.toString(ans));
    
  }
  
}
