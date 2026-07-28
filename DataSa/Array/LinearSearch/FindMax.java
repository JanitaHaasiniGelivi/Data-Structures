public class FindMax {
  public static void main(String[] args) {
    int [] arr={3,4,5,-6,1};
    int res= minimum(arr);
    System.out.println(res);
  }
  static int minimum(int[]arr){
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
  }
 
}
