import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class tictactoe {
    public static void main(String[] args) {
        System.out.println("start");

        //Random random = new Random();
        //random.setSeed(1);

        //System.out.println(random.nextInt(2)+1);

        int[][] board = Create_board();
        System.out.println(Arrays.deepToString(board));

        Place(board,1, 2, 1);
        Place(board,2, 0, 2);
        System.out.println(Arrays.deepToString(board));

        ArrayList<int[]> possibilities = Possibilities(board);
        System.out.println(Arrays.deepToString(possibilities.toArray()));

        System.out.println("end");
    }

    public static int[][] Create_board(){
        int[][] arr = new int[3][3];
        return arr;
    }

    // номер кнопки ->(преобразуется) в координаты row=2,col=1 и т.д.
    public static void Place(int[][] board, int player, int row, int col){
        board[row][col] = player;
    }

    // можно проверять по кнопкам / можно проверять по массиву
    public static ArrayList<int[]> Possibilities(int[][] board){
        ArrayList<int[]> possibilities = new ArrayList<>();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 0){
                    possibilities.add(new int[]{i,j});
                }
            }
        }
        return possibilities;
    }

//    public static void Check_win(){
//
//    }

}
