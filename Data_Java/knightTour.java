import java.io.*;
import java.util.*;

public class knightTour {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int nknights = scn.nextInt();
        
        printKnightsTour(new int[row][col], row, col, nknights);
    }

    public static boolean isSafe(int chess[][], int row, int col){
        int n = chess.length ;
        int m = chess[0].length ;
        boolean check = true;
        //Vertically up
        if(row-2 >= 0 && col+1 < m){
            if(chess[row-2][col+1] == 1){
                return false;
            }
        }
        if(row-1 >= 0 && col+2 < m){
        if(chess[row-1][col+2] == 1){
            return false;
        }}
        if(row+1 < n && col+2 < m){
        if(chess[row+1][col+2] == 1){
            return false;
        }}
        if(row+2 < n && col+1 < m){
        if(chess[row+2][col+1] == 1){
            return false;
        }}
        if(row+2 < n && col-1 >= 0){
        if(chess[row+2][col-1] == 1){
            return false;
        }}
        if(row+1 < n && col-2 >= 0){
        if(chess[row+1][col-2] == 1){
            return false;
        }}
        if(row-1 >= 0 && col-2 >= 0){
        if(chess[row-1][col-2] == 1){
            return false;
        }}
        if(row-2 >= 0 && col-1 >= 0){
        if(chess[row-2][col-1] == 1){
            return false;
        }}
        return true;
    }

    public static void printKnightsTour(int[][] chess, int row, int col, int nknights) {
        if(row < 0 || col < 0 || row >= chess.length || col >= chess[0].length || chess[row][col] != 0){
            return;
        }
        if(nknights <= 0){
            chess[row][col] = 1; // Mark
            displayBoard(chess);
            chess[row][col] = 0; // Unmark
        }
        
        chess[row][col] = 1; // Mark
        if(isSafe( chess,  row,  col)){

            printKnightsTour(chess, row-2, col+1, nknights-1);//dir1
        }
        if(isSafe( chess,  row,  col)){

            printKnightsTour(chess, row-1, col+2, nknights-1);//dir2
        }
        if(isSafe( chess,  row,  col)){

            printKnightsTour(chess, row+1, col+2, nknights-1);//dir3
        }
        if(isSafe( chess,  row,  col)){

            printKnightsTour(chess, row+2, col+1, nknights-1);//dir4
        }
        if(isSafe( chess,  row,  col)){

            printKnightsTour(chess, row+2, col-1, nknights-1);//dir5
        }
        if(isSafe( chess,  row,  col)){

            printKnightsTour(chess, row+1, col-2, nknights-1);//dir6
        }
        if(isSafe( chess,  row,  col)){

            printKnightsTour(chess, row-1, col-2, nknights-1);//dir7
        }
        if(isSafe( chess,  row,  col)){

            printKnightsTour(chess, row-2, col-1, nknights-1);//dir8
        }
        chess[row][col] = 0; // Mark
    }

    public static void displayBoard(int[][] chess) {
        for (int arr[] : chess) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}