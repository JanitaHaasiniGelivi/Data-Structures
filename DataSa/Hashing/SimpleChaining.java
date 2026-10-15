import java.util.ArrayList;
import java.util.List;
public class SimpleChaining{
    // we are using private here because the internal daata belongs to has object only..
    //other classes should normally interact with it through methods such as insert() and remove()
      private int bucketCount;
      private List<List<Integer>> table;
      //constructor
      public SimpleChaining(int buckets){
        bucketCount=buckets;
        //outer list
        table = new ArrayList<>();
        // inner list;
        for(int i=0;i<bucketCount;i++){
        table.add(new ArrayList<>());
        }
        //here what happens is every time it iterates at every index a new empty list gets added.
      }
      // creating the hash function (dividion method)
      private int getHashIndex(int key){
        return key%bucketCount;
      }
      public void insert(int key){
            // gets the index of the inner list.
            int index= getHashIndex(key);
            // inserts tht key into that inner list.
            table.get(index).add(key);
      }
      public void remove(int key){
        //gets the index of the inner list 
        int index = getHashIndex(key);
        //
        table.get(index).remove(Integer.valueOf(key));
      }
      public void display(){
        for(int i=0;i<bucketCount;i++){
            //index
            System.out.print(i);
            //corresponding key values
            for(int key : table.get(i)){
                System.out.println(" --> "+key);
            }
            System.out.println();
        }
      }
      public static void main(String[] args){
        int [] keys ={7,18,12,25};
        SimpleChaining hashTable = new SimpleChaining(7);
        for(int key : keys){
            hashTable.insert(key);
        }
        hashTable.remove(12);
        hashTable.display();

      }

}