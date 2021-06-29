import java.util.*;

public class arrayRotate {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int res [][] = rotate90(arr);
        display(res);
    }

    public static void display(int[][] arr){
        System.out.println("Transpose:-");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotate90(int arr[][]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            int lo=0, hi=n-1;
            while(lo < hi){
                int temp = arr[i][lo];
                arr[i][lo] = arr[i][hi];
                arr[i][hi] = temp;
                lo++;
                hi--;
            }
        }
        return arr;
    }
}
