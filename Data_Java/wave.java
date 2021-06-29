import java.util.*;

public class wave {
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

        System.out.println("Wave display1:- ");
        wave1(arr, n, m);
        System.out.println();
        System.out.println("Wave display2:- ");
        wave2(arr, n, m);
    }

    public static void wave1(int arr[][], int n, int m){
        int rmin=0, rmax=n-1, cmin=0, cmax=m-1, count=0;
        int lim = m*n;

        while(count < lim){
            //top wall
            for(int j=cmin; j<=cmax; j++){
                System.out.print(arr[rmin][j]+" ");
            }
            rmin++;
            //right wall
            for(int i=rmin; i<=rmax; i++){
                System.out.print(arr[i][cmax]+" ");
            }
            cmax--;
            //bottom wall
            for(int j=cmax; j>=cmin; j--){
                System.out.print(arr[rmax][j]+" ");
            }          
            rmax--;  
            //left wall
            for(int i=rmax; i>=rmin; i--){
                System.out.print(arr[i][cmin]+" ");
            }
            cmin++;
            count++;
        }
    }

    public static void wave2(int arr[][], int n, int m){
        int rmin=0, rmax=n-1, cmin=0, cmax=m-1, count=0;
        int lim = m*n;

        while(count < lim){
            //left wall
            for(int i=rmin; i<=rmax; i++){
                System.out.print(arr[i][cmin]+" ");
            }
            cmin++;
            //bottom wall
            for(int j=cmin; j<=cmax; j++){
                System.out.print(arr[rmax][j]+" ");
            }
            rmax--;
            //right wall
            for(int i=rmax; i>=rmin; i--){
                System.out.print(arr[i][cmax]+" ");
            }          
            cmax--;  
            //top wall
            for(int j=cmax; j>=cmin; j--){
                System.out.print(arr[rmin][j]+" ");
            }
            rmin++;
            count++;
        }
    }
}
