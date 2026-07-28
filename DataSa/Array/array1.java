import java.util.*;
public class array1 {
  //implementing of array
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int [] numbers = new int[5];
    System.out.println("Enter the numbers:");
    for(int i=0;i<numbers.length;i++){
      numbers[i]=sc.nextInt();
    }
    System.out.println("the numbers are");
    for(int i=0;i<numbers.length;i++){
      System.out.println(numbers[i]+" ");
    }

    sc.close();
  
  }
}
