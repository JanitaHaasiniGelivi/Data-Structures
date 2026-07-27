import java.util.*;
public class ArrayListExample{
  public static void main(String[]args){
    ArrayList<Integer> list= new ArrayList<>(5);
    list.add(67);
    list.add(4545);
    list.add(78788990);
    System.out.println(list);
    list.remove(2);
    System.out.println(list.contains(99));
    System.out.println(list);


  }
}