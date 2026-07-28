public class SearchInRange {
  public static void main(String[] args) {
    int [] arr={1,2,3,4,5,6,7};
    int target=4;
    int st= 2;
    int en=5;
    int res=Search(arr,st,en,target);
    System.out.println(res);
  }
  static int Search(int[] arr, int st,int en,int target){
    if(arr.length==0){
      return -1;
    }
    for(int i=st;i<en;i++){
      if(arr[i]==target){
        return i;
      }
    }
    return -1;
  }
}
