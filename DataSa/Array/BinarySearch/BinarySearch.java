package BinarySearch;
import java.util.*;
public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] arr= {1, 2, 3, 4, 5, 6, 7};
    int n=arr.length;
    int l=0;
    int r=n-1;
    System.out.println("Target: ");
    int target= sc.nextInt();
    while(l<=r){
      int mid= l+(r-l)/2;
      if(target>arr[mid]){
        l=mid+1;
      }
      else if(target<arr[mid]){
        r=mid-1;
      }
      else{
        System.out.println("Element found at index: " + mid);
        break;
      }
    }
   
  }
  
  
}
