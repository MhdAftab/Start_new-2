import java.util.*;

public class exitPoint {
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

        exitPoint(arr, n, m);
    }

    public static void exitPoint(int arr[][], int n, int m){
        int dir = 0; // 0->e... 1->s...2->w...3->n
        int i=0, j=0;
        while(true){

            dir = (dir + arr[i][j]) % 4;
            if(dir == 0){
                j++;
            }
            else if(dir == 1){
                i++;
            }
            else if(dir == 2){
                j--;
            }
            else if(dir == 3){
                i--;
            }

            if(i < 0){
                i++;
                break;
            }
            else if(j < 0){
                j++;
                break;
            }
            else if(i == arr.length){
                i--;
                break;
            }
            else if(j == arr[0].length){
                j--;
                break;
            }
        }
        System.out.println("Exit Point :");
        System.out.println("\t  "+i);
        System.out.println("\t  "+j);
    }
}
