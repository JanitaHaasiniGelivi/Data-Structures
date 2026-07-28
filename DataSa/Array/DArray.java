import java.util.*;
public class DArray{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    //gnereal
   // int[][] arr={
    ///  {1,2,3},
    //  {4,5,6},
    //  {7,8,9}};
    //  System.out.println(Arrays.toString(arr));
      int[][] numbers={
        {1,2,3},
        {1},
        {3,4,5}
      };
      System.out.println(Arrays.toString(numbers));
      //taking input from the user
     // int[][] ar=new int[3][2];
      //for taking the input
 //     for(int row=0;row<ar.length;row++){
  //      for(int col=0;col<ar[row].length;col++){
  //        arr[row][col]=sc.nextInt();        }
   //   }
      //for printing the output
    //  for(int row=0;row<ar.length;row++){
     //   for(int col=0;col<ar[row].length;col++){
      //    System.out.println(Arrays.toString(ar[row]));
     //   }
      //}
       for(int[] arr1:numbers){
        System.out.println(Arrays.toString(arr1));
       }
       sc.close();
  }
}