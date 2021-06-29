import java.util.*;

public class targetSumDP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        System.out.println(SumTargetDp(arr, n, target));

    }    
    public static boolean SumTargetDp(int arr[], int n, int target){
        boolean dp[][] = new boolean[n+1][target+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=target; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                }else if(i == 0){
                    dp[i][j] = false;
                }else if(j == 0){
                    dp[i][j] = true;
                }else{
                    if(dp[i-1][j] == true){
                        dp[i][j] = true;
                    }else{
                        int val = arr[i-1];
                        if(val <= j){
                            if(dp[i-1][j-val] == true){
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        return dp[n][target];
    }
}
