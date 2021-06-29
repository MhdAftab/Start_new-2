import java.io.*;
import java.util.*;

public class ringRotate {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        int res[][] = shellRotate(arr, s, r);
        System.out.println("\nResultant matrix:- ");
        display(res);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] shellRotate(int arr[][], int s, int r){
        int oned[] = fillonedFromArr(arr, s);
        rotate(oned, r);
        fillArrFromoned(arr, s, oned);
        return arr;
    }
    
    public static void rotate(int oned[], int r){
        
        r = r%oned.length;
        if(r < 0){
            r += oned.length;
        }
        
        reverse(oned, 0, oned.length-r-1);
        reverse(oned, oned.length-r, oned.length-1);
        reverse(oned, 0, oned.length-1);
        
    }
    
    public static void reverse(int oned[], int lo, int hi){
        while(lo < hi){
            int temp = oned[lo];
            oned[lo] = oned[hi];
            oned[hi] = temp;
            
            lo++;
            hi--;
        }
    }
    
    public static int[] fillonedFromArr(int arr[][], int s){
        
        int rmin = s-1;
        int cmin = s-1;
        int rmax = arr.length-s;
        int cmax = arr[0].length-s;
        int sz = 2*(rmax-rmin + cmax-cmin);
        
        int oned[] = new int[sz];
        
        int idx = 0;
        //left wall
        for(int i=rmin, j=cmin; i<=rmax; i++){
            oned[idx] = arr[i][j];
            idx++;
        }
        
        //bottom wall
        for(int i=rmax, j=cmin+1; j<=cmax; j++){
            oned[idx] = arr[i][j];
            idx++;
        }
        
        //right wall
        for(int i=rmax-1, j=cmax; i>=rmin; i--){
            oned[idx] = arr[i][j];
            idx++;
        }
        
        //top wall
        for(int i=rmin, j=cmax-1; j>=cmin+1; j--){
            oned[idx] = arr[i][j];
            idx++;
        }
        
        return oned;
        
    }
    
    public static void fillArrFromoned(int arr[][], int s, int oned[]){
        
        int rmin = s-1;
        int cmin = s-1;
        int rmax = arr.length-s;
        int cmax = arr[0].length-s;
        
        int idx = 0;
        //left wall
        for(int i=rmin, j=cmin; i<=rmax; i++){
            arr[i][j] = oned[idx];
            idx++;
        }
        
        //bottom wall
        for(int i=rmax, j=cmin+1; j<=cmax; j++){
            arr[i][j] = oned[idx];
            idx++;
        }
        
        //right wall
        for(int i=rmax-1, j=cmax; i>=rmin; i--){
            arr[i][j] = oned[idx];
            idx++;
        }
        
        //top wall
        for(int i=rmin, j=cmax-1; j>=cmin+1; j--){
            arr[i][j] = oned[idx];
            idx++;
        }
    }
    
}