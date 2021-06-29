import java.io.*;
import java.util.*;

public class SaddlePoint {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        saddlePoint(arr, n);
    }
    
    public static void saddlePoint(int arr[][], int n){
        boolean check = false;
        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE, k=0;
            for(int j=0; j<n; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                    k = j;
                }
            }
            int max = min;
            for(int j=0; j<n; j++){
                if(arr[j][k] > max){
                    max = arr[j][k];
                }
            }
            if(max == min)
            {   
                check = true;
                System.out.println("saddle points: "+max);
            }
        }
        if(check == false) System.out.println("No Such Point Exist");
    }
}