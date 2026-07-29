package Leetcode.Array;

public class q1 {
 
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int digits = digits(num);
        return digits % 2 == 0;
    }

    static int digits(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        System.out.println(count);
        return count;
    }
}
