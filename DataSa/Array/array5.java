import java.util.*;

public class array5{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the size of the array");
    int n = sc.nextInt();
    int [] numbers = new int[n];
    System.out.println("Enter the numbers of the array");
    for(int i=0;i<n;i++){
      numbers[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      System.out.println(numbers[i]);
    }
    int max=numbers[0];
    int min=numbers[0];
    for(int i=0;i<n;i++){
      if(numbers[i]>max){
        max=numbers[i];
      }
      if(numbers[i]<min){
        min=numbers[i];
      }
    }
    System.out.println("Maximum number is: "+max);
    System.out.println("minimum number is: "+min);
    sc.close();

  }
}