package Leetcode.Array;

public class CellswithOddValuesinaMatrix {
  public static void main(String[] args) {
   
      int[][] indices={{0,1},{1,1}};
      int m=2;
      int n=3;
  
        int[][] matrix = new int[m][n];
        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];
            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][col]++;
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
  

