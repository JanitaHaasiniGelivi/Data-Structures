public class SearchInStrings{
  public static void main(String[] args) {
    String str="Haasini";
    char target='a';
    boolean result = Search(str,target);
    System.out.println(result);
  }
  //for each looop
  static boolean Search(String str,char target){
    for(char a: str.toCharArray()){
      if(a==target){
        return true;
      }

    }
  return false;
  

  //for loop
  //static boolean Search(String str,char target){
    //if(str.length()==0){
     // return false;
    // }
    // for(int i=0;i<str.length();i++){
     //  if(str.charAt(i)==target){
      //   return true;
     //  }
    // }
    //return false;


  }
}