package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {'X', 'X', 'X'}, {' ', ' ', ' '}};
        char[][] board1 = {{' ', ' ', ' '}, {'X', 'X', ' '}, {' ', ' ', ' '}};
        System.out.println(MatrixCheck.monoHorizontal(board, 0));
        System.out.println(MatrixCheck.monoHorizontal(board, 1));
        System.out.println(MatrixCheck.monoHorizontal(board, 2));
        System.out.println(MatrixCheck.monoHorizontal(board1, 0));
        System.out.println(MatrixCheck.monoHorizontal(board1, 1));
        System.out.println(MatrixCheck.monoHorizontal(board1, 2));
    }
}
