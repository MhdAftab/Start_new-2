import java.util.*;

public class countPath {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(countPathTab(n));
    }
    
    public static int countPathTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1; // 0 -> 0 pohchne ke 1 rasta >> dont move

        for(int i=1; i<=n; i++){
            if(i - 1 >= 0){
                dp[i] += dp[i-1];
            }
            if(i - 2 >= 0){
                dp[i] += dp[i-2];
            }
            if(i - 3 >= 0){
                dp[i] += dp[i-3];
            }
        }

        return dp[n];
    }
}
