package Leetcode.Array;

public class q2 {
  
    public static void main(String[] args) {
      int [][] accounts= {{1,3,6},{2,4},{10,4}};
        int n=accounts.length;
        int [] ans=new int[n];
        for(int i =0;i<n;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
                ans[i]=sum;
            }

        }
        int max=ans[0];
        for(int i =0;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }

        }
        System.out.println(max);
    
      
    }
}
