import java.io.*;
import java.util.*;

public class search2D {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] =  new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int x = scn.nextInt();
        
        searchIn2D(arr, n, x);
    }
    
    public static int binarySearch(int arr[][], int i, int x){
        int lo = 1, hi = arr.length-2;
        while(lo <= hi){
            int m = lo + (hi-1) / 2;
            
            if(arr[i][m] == x){
                return m;
            }
            if(arr[i][m] < x){
                lo = m+1;
            }
            else if(arr[i][m] > x){
                hi = m-1;
            }
        }
        return -1;
    }
    
    public static void searchIn2D(int arr[][], int n, int x){
        boolean check = false; int j = -1;
        
        for(int i=0; i<n; i++){
            if(x == arr[i][0]){
                j = 0;
                //System.out.println(i + "\n" + 0);
                check = true;
            }
            else if(x == arr[i][n-1]){
                j = (n-1);
                //System.out.println(i + "\n" + (n-1));
                check = true;
            }
            else if(x > arr[i][0] && x < arr[i][n-1]){
                j = binarySearch(arr, i, x);
                if(j == -1){
                    check = false;
                    break;
                }
                else{
                    //System.out.println(i + "\n" + j);
                    check = true;
                }
            }

            if(check == true){
                System.out.println(i + "\n" + j);
                return;
            }
        }
        if(check == false){
            System.out.println("Not found");
        }
    }

}