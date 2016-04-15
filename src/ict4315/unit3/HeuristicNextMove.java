package ict4315.unit3;


import java.lang.reflect.Array;
import java.util.Arrays;

public class HeuristicNextMove extends AbstractNextMove implements nextMove{
    private int ROWS = 8;
    private int COLUMNS = 8;
    private int[][] board = new int[8][8];
    private int currentRow;
    private int currentCol;
    private int[][] accessibility;
    private final int[][] INITIAL_ACCESSIBILITY = {
            { 2, 3, 4, 4, 4, 4, 3, 2 },
            { 3, 4, 6, 6, 6, 6, 4, 3 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 3, 4, 6, 6, 6, 6, 4, 3 },
            { 2, 3, 4, 4, 4, 4, 3, 2 } };

    public void initialize() {
        accessibility = new int[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; ++i) {
            System.arraycopy(INITIAL_ACCESSIBILITY[i], 0, accessibility[i], 0, COLUMNS);
        }
        for (int i = 0; i < ROWS; ++i) {
            for (int j = 0; j < COLUMNS; ++j) {
                board[i][j] = 0;
            }
        }
    }

    public boolean nextMove() {
        int move = -1;
        int access = 9;
        for (int i = 0; i < myKnight.getMoves(); ++i) {
            int r = currentRow + myKnight.getHorizontal(i);
            int c = currentCol + myKnight.getVertical(i);
            System.out.println("Here are r and c " + r + " " + c);
            if (legalMove(r, c)) {
                if (accessibility[r][c] < access) {
                    access = accessibility[r][c];
                System.out.println("Here is access" + access);
//                    System.out.println("Here is access " + access);
                    move = i;
                }
            }
        }
        if (move != -1) {
            reduceAccess();
            currentRow += myKnight.getHorizontal(move);
            currentCol += myKnight.getVertical(move);
            return true;
        } else {
            System.out.println("move wasn't = -1");
            return false;
        }
    }
    public int play() {
        int move = 0;
        do {
            ++move;
            board[currentRow][currentCol] = move;
        } while (nextMove());
        System.out.println("INside play returning move");
        return move;
    }
    public boolean hasMove(int row, int col){
        if (row >= 0 && col >= 0 && row < ROWS && col < COLUMNS ) {
            return true;
        } else {
            return false;
        }
    }
    public boolean legalMove(int r, int c){
        if (hasMove( r, c) && board[r][c] == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean onBoard(int row, int col) {
        return (row >= 0 && col >= 0 && row < ROWS && col < COLUMNS);
    }
    public void reduceAccess() {
       // System.out.println("Inside reduce");
        for (int i = 0; i < myKnight.getMoves(); ++i) {
            int r = currentRow + myKnight.getHorizontal(i);
            int c = currentCol + myKnight.getVertical(i);
            if (onBoard(r, c) && accessibility[r][c] > 0) {
                --accessibility[r][c];
           //   System.out.println("Here is accessability[r][c] " + Arrays.toString(accessibility[r]) + Arrays.toString(accessibility[c]));
              //  System.out.println("Here is access " + access);
            }
        }

    }
    public void printBoard() {
        for (int i = 0; i < ROWS; ++i) {
            for (int j = 0; j < COLUMNS; ++j) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }

}
