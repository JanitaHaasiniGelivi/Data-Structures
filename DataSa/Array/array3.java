import java.util.*;
public class array3 {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    // 2d array
    System.out.println("Enter elements for the 2D array1");
  int[][] arr1= new int[3][3];
  int [][] arr2= new int[3][3];
  int[][] sum=new int[3][3];

  for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr1.length;j++){
      arr1[i][j]=sc.nextInt();
    }
  }
  System.out.println("Enter elements for the 2D array2");
  for(int i=0;i<arr2.length;i++){
    for(int j=0;j<arr2.length;j++){
      arr2[i][j]=sc.nextInt();
    }
  }
  System.out.println("the sum is:");
  for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr1.length;j++){
      sum[i][j]=arr1[i][j]+arr2[i][j];
      System.out.print(sum[i][j]+" ");
    }
    System.out.println();
  }

  }
  
  
}
