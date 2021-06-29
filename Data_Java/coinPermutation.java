import java.util.*;

public class coinPermutation {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        System.out.println(coinChangePermuation(arr, n, target));
    }    
    public static int coinChangePermuation(int arr[], int n, int target){
        int dp[] = new int[target+1];
        dp[0] = 1;
        
        for(int i=1; i<=target; i++){
            for(int coin : arr){
                if(i - coin >= 0){
                    dp[i] += dp[i-coin];
                }
            }
        }
        return dp[target];
    }
}
