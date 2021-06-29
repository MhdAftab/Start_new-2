import java.util.*;

public class queens {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        NQueens(new int[n][n], 0, "");
    }

    public static boolean isSafe(int chess[][], int row, int col){
        //Vertically up
        for(int i=row-1, j=col; i >= 0; i--){
            if(chess[i][j] == 1){
                // position compromised
                return false;
            }
        }
        //Diagonally left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        //Diagonally right
        for(int i=row-1, j=col+1; i>=0 && j<chess[0].length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        
        // position confirmed & is safe
        return true;
    }

    public static void NQueens(int board[][], int row, String psf){
        if(row == board.length){
            System.out.println(psf+".");
            return;
        }
        
        for(int col=0; col<board[0].length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 1;
                NQueens(board, row+1,psf+row+"-"+col+", ");
                board[row][col] = 0;
            }
        }
    }
}
