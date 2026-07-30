package Leetcode.Array;
public class NumberofGoodPairs {
  public static void main(String[] args) {
    int [] nums={1,2,3,1,1,3};
    int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    ans+=1;
                }

            }
        }
        System.out.println(ans);
  }
}
