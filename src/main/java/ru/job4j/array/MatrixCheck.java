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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if ((monoHorizontal(board, i) || monoVertical(board, i))) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {'X', 'X', 'X'}, {' ', ' ', ' '}};
        char[][] board1 = {{' ', ' ', ' '}, {'X', 'X', ' '}, {' ', ' ', ' '}};
        char[][] board2 = {{' ', ' ', 'X'}, {' ', ' ', 'X'}, {' ', ' ', 'X'}};
        char[][] board3 = {{' ', ' ', 'X'}, {' ', ' ', ' '}, {' ', ' ', 'X'}};
        char[][] board4 = {{'X', ' ', ' '}, {' ', 'X', ' '}, {' ', ' ', 'X'}};
        char[][] board5 = {{'1', ' ', ' '}, {' ', '1', ' '}, {' ', ' ', '1'}};
        char[][] board6 = {{'X', ' ', ' '}, {' ', 'Y', ' '}, {' ', ' ', 'Z'}};
        char[][] board7 = {{' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}};
        char[][] board8 = {{' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}, {' ', 'X', ' ', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}};
        char[][] board9 = {{' ', ' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' ', ' '}, {'X', 'X', 'X', 'X', 'X'}, {' ', ' ', 'X', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}};
        char[][] board10 = {{'X', ' ', ' ', ' ', ' '}, {' ', 'X', ' ', ' ', ' '}, {' ', ' ', 'X', ' ', ' '}, {' ', ' ', ' ', 'X', ' '}, {' ', ' ', ' ', ' ', 'X'}};
        System.out.println(MatrixCheck.monoHorizontal(board, 0));
        System.out.println(MatrixCheck.monoHorizontal(board, 1));
        System.out.println(MatrixCheck.monoHorizontal(board, 2));
        System.out.println(MatrixCheck.monoHorizontal(board1, 0));
        System.out.println(MatrixCheck.monoHorizontal(board1, 1));
        System.out.println(MatrixCheck.monoHorizontal(board1, 2));
        System.out.println(MatrixCheck.monoVertical(board2, 0));
        System.out.println(MatrixCheck.monoVertical(board2, 1));
        System.out.println(MatrixCheck.monoVertical(board2, 2));
        System.out.println(MatrixCheck.monoVertical(board3, 0));
        System.out.println(MatrixCheck.monoVertical(board3, 1));
        System.out.println(MatrixCheck.monoVertical(board3, 2));
        System.out.println(MatrixCheck.extractDiagonal(board4));
        System.out.println(MatrixCheck.extractDiagonal(board5));
        System.out.println(MatrixCheck.extractDiagonal(board6));
        System.out.println(MatrixCheck.isWin(board7));
        System.out.println(MatrixCheck.isWin(board8));
        System.out.println(MatrixCheck.isWin(board9));
        System.out.println(MatrixCheck.isWin(board10));
    }
}
