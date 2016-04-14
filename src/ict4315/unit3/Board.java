package ict4315.unit3;

public class Board {
    int[][] board = new int[8][8];
    private final int ROWS = 8;
    private final int COLUMNS = 8;
    private int currentRow;
    private int currentCol;
    private final int[][] INITIAL_ACCESSIBILITY = {
            { 2, 3, 4, 4, 4, 4, 3, 2 },
            { 3, 4, 6, 6, 6, 6, 4, 3 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 3, 4, 6, 6, 6, 6, 4, 3 },
            { 2, 3, 4, 4, 4, 4, 3, 2 } };
    public Board(){

    }
    public void setBoard(int row, int col, int val) {
        board[row][col] = val;
    }


//    public void printBoard() { // Having this method here does nothing because the board is filled in the play() in BruteNextMove.java .
//        for (int i = 0; i < ROWS; ++i) {
//            for (int j = 0; j < COLUMNS; ++j) {
//                System.out.printf("%2d ", board[i][j]);
//            }
//            System.out.println();
//        }
//    }
    public void initialize() {
        board = new int[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; ++i) {
            System.arraycopy(INITIAL_ACCESSIBILITY[i], 0, board[i], 0, COLUMNS);
        }
        for (int i = 0; i < ROWS; ++i) {
            for (int j = 0; j < COLUMNS; ++j) {
                board[i][j] = 0;
            }
        }
    }

}
