import java.util.*;
public class array6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //2d  dynamic array
    List<List<Integer>> mat = new ArrayList<>();
    for(int i=0;i<4;i++){
      List<Integer> row = new ArrayList<>();
      for(int j=0;j<3;j++){
        int x=sc.nextInt();
        row.add(x);
      }
      mat.add(row);
    }
    System.out.println(mat);

    sc.close();
  }
  
}
