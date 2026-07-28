import java.util.*;
public class array7{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    //array of objects
    String [] arr= new String[4];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.next(); 
    }
    System.out.println(Arrays.toString(arr));
    arr[1]="haasini";
    System.out.println(Arrays.toString(arr));
    sc.close();
  }
}