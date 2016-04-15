package ict4315.unit3;

public class Board {
    int[][] board = new int[8][8];
    private final int ROWS = 8;
    private final int COLUMNS = 8;
    private int currentRow;
    private int currentCol;

    public Board(){

    }
    public void setBoard(int row, int col, int val) {
        board[row][col] = val;
    }



}
