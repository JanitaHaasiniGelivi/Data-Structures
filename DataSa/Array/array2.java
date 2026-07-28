import java.util.*;
public class array2 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] marks= new int[5];
    double sum=0;
    double avg=0;
    System.out.println("Enter the numbers:");
    for(int i=0;i<marks.length;i++){
      marks[i]=sc.nextInt();
    }
    System.out.println("The numbers are:");
    for(int i=0;i<marks.length;i++){
      System.out.println(marks[i]+" ");
    }
    for(int i=0;i<marks.length;i++){
      sum=sum+marks[i];
    }
    System.out.println("the sum of the number is:"+sum);
    avg=sum/marks.length;
    System.out.println("the average of the number is:"+avg);
    sc.close();
  }
  
}
