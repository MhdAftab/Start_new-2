import java.io.*;
import java.util.*;

public class QuickSort{
    
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int low, int hi){
        int pivot = arr[hi];
        int i = low-1;

        for(int j=low; j<hi; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, hi);
        return i+1;
    }

    public static void quickSort(int arr[], int low, int hi){
        if(low < hi){
            int pi = partition(arr, low, hi);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, hi);
        }
    }

    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        quickSort(arr, 0, n-1);
        printArray(arr, n);
    }

}