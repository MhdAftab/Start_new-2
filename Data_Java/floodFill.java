import java.util.*;

public class floodFill {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int board[][] = new int[nr][nc];
        for(int i=0; i<nr; i++){
            for(int j=0; j<nc; j++){
                board[i][j] = scn.nextInt();
            }
        }

        floodFillBack(board, 0, 0, "", new boolean[nr][nc]);
    }

    public static void floodFillBack(int board[][], int i, int j,String psf, boolean visited[][]){
        if(i<0 || j<0 || i >= board.length || j >= board[0].length || board[i][j] == 1 || visited[i][j]){
            // invalid pos/obstacle/already visited
            return;
        }
        if(i == board.length-1 && j == board[0].length-1){
            System.out.println(psf); // print path so far
            return;
        }
        visited[i][j] = true; // visited mark
        floodFillBack(board, i-1, j, psf+"t", visited); // top
        floodFillBack(board, i, j-1, psf+"l", visited); // left
        floodFillBack(board, i+1, j, psf+"d", visited); // down
        floodFillBack(board, i, j+1, psf+"r", visited); // right
        visited[i][j] = false;
    }

}
