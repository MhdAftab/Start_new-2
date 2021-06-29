import java.util.*;

public class SpiralDisplay {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Spiral display1:- ");
        spiral1(arr, n, m);
        System.out.println();
        System.out.println("Spiral display2:- ");
        spiral2(arr, n, m);
    }
    
    public static void spiral1(int arr[][], int n, int m){
        int row = 0;
        while(row < n){
            if(row % 2 == 0){
                for(int j=0; j<m; j++){
                    System.out.print(arr[row][j]+" ");
                }
            }
            else{
                for(int j=m-1; j>=0; j--){
                    System.out.print(arr[row][j]+" ");
                }
            }
            row++;
        }
    }

    public static void spiral2(int arr[][], int n, int m){
        int col = 0;
        while(col < m){
            if(col % 2 == 0){
                for(int i=0; i<n; i++){
                    System.out.print(arr[i][col]+" ");
                }
            }
            else{
                for(int i=n-1; i>=0; i--){
                    System.out.print(arr[i][col]+" ");
                }
            }
            col++;
        }
    }
}
