import java.util.*;
public class array4 {
  //Wap to see if noman is in the array or not
  public static void main(String[] args) {
    String[] names= new String[6];
    System.out.println("enter the names");
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<names.length;i++){
      names[i]=sc.nextLine();

    }
    System.out.println("enter the name u wantto search");
    String nam=sc.nextLine();
    for(int i=0;i<names.length;i++){
      if(names[i].equals(nam)){
        System.out.println("the name is found"+" "+i+" "+names[i]);

      }else{
        System.out.println("the name is not found");
      }
    }
  }
  
  
}
