import java.util.Arrays;

public class SearchIn2dArray {

    public static void main(String[] args) {

        int[][] arr = {
                {0, 8, 0, 8, 2, 0, 0, 8},
                {1, 6, 1, 1, 2, 0, 0, 7}
        };

        int target = 8;

        int[] res = Search(arr, target);

        System.out.println(Arrays.toString(res));
    }

    static int[] Search(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}