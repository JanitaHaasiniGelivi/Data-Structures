package Leetcode.Array;
import java.util.*;
public class MovingZeros {
  public static void main(String[] args) {
    int [] nums = new int[]{0, 1, 0, 3, 12};
     for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
  }
 
  
}
