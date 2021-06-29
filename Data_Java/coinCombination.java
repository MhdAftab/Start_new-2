import java.util.*;

public class coinCombination {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
    
        System.out.println(coinChangeCombination(arr, n, target));
    }    
    public static int coinChangeCombination(int arr[], int n, int target){
        int dp[] = new int[target+1];
        dp[0] = 1;

        for(int coin : arr){
            for(int i=coin; i<=target; i++){
                dp[i] += dp[i-coin];
            }
        }
        return dp[target];
    }
}
