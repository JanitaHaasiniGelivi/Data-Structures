package Leetcode.Array;

import java.util.Arrays;

public class RunningSumof1dArray {
  public static void main(String[] args) {
    int[] nums={1,23,46,90};
    int n=nums.length;
    int[] ans= new int[n];
    
       
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        System.out.println(Arrays.toString(ans));
    
  }
  
}
