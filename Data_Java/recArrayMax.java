import java.util.*;

public class recArrayMax {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int maxInArr = arrayMax(arr, 0);
        System.out.println("Array_Max: "+maxInArr);
    }
    public static int arrayMax(int[] arr, int idx){
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }
        int max = arrayMax(arr, idx+1);
        if(max < arr[idx]){
            return arr[idx];
        }
        return max;
    }
}
