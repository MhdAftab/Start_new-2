import java.util.*;

public class climbStairsMinMoves {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(stairsMinMoves(arr, n));

    }
    public static int stairsMinMoves(int arr[], int n){
        Integer[] dp = new Integer[n+1];
        dp[n] = 0; // n -> n pe jaane ka way 1 ki moves chlo hi mat

        for(int i = n-1; i >= 0; i--){
            if(arr[i] > 0){
                int minimum = Integer.MAX_VALUE;
                for(int j=1; j<=arr[i] && i+j < dp.length; j++){
                    if(dp[i+j] != null){
                        minimum = Math.min(minimum, dp[i+j]);
                    }
                }
                if(minimum != Integer.MAX_VALUE){
                    // mtlb kch mila 
                    dp[i] = minimum+1;
                }
            } 
        }
        return dp[0];
    }
}
