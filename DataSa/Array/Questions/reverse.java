import java.util.*;
public class reverse{
  public static void main(String[]args){
    int []arr={1,3,4,5,6};
    int [] arr1=new int[5];
    for(int i=(arr.length-1);i>=0;i--){
      arr1[arr.length-1-i]=arr[i];
    }
    System.out.println(Arrays.toString(arr1));
  }
}