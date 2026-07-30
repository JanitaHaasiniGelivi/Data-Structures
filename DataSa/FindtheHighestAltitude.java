public class FindtheHighestAltitude {
  public static void main(String[] args) {
    int[]gain={-5,1,5,0,-7};
    int n=gain.length;
        int[] ans= new int[n+1];
        ans[0]=0;
        for(int i=1;i<(n+1);i++){
            ans[i]=(ans[i-1]+gain[i-1]);
        }
        int max= ans[0];
        for(int i=0;i<n+1;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        System.out.println(max);
  }
}
