import java.util.*;

public class targetSumSubsets {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        targetSum(arr, 0, "", 0, target);
    }
    public static void targetSum(int arr[], int idx, String asf, int ssf, int target){
        if(idx == arr.length){
            if(ssf == target){
                System.out.println(asf+".");
            }
            return;
        }
        if(ssf > target){
            return;
        }
        targetSum(arr, idx+1, asf+arr[idx] + ", ", ssf+arr[idx], target); // include
        targetSum(arr, idx+1, asf, ssf, target); // not include
    }
}
