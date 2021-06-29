import java.util.*;

public class lastIndex {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("enter number to find:-");
        int x = scn.nextInt();

        int lastid = lastIndexof(arr, 0, x);
        System.out.println("Last index: "+lastid);
    }

    public static int lastIndexof(int arr[], int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int bc = lastIndexof(arr, idx+1, x);
        if(bc == -1){
            // abhi tk nhi mila
            if(arr[idx] == x){
                // mil gya last index
                return idx;
            }
        }
        return bc;
    }
}
