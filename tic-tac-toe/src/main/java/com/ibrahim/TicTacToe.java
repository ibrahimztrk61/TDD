package com.ibrahim;

public class TicTacToe {

    private char[][] board;
    private SignEnum turn;

    public TicTacToe() {
        board = new char[][]{
                {'#', '#', '#'},
                {'#', '#', '#'},
                {'#', '#', '#'}};
    }


    public char[][] getBoard() {
        return board;
    }


    public void move(SignEnum sign, int row, int column) {
        validateIndex(row, column);
        validateTurn(sign);
        validateUnitSquare(row, column);
        board[row][column] = sign.sign;
        turn = sign;
        display();
    }

    private void validateUnitSquare(int row, int column) {
        int size = board.length;
        if (row >= size || column >= size)
            throw new IllegalArgumentException("Row or column are out of bounds.");

    }

    private void validateIndex(int row, int column) {
        if (!(board[row][column] == '#')) {
            throw new IllegalArgumentException("This position is not empty");
        }
    }

    private void display() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void validateTurn(SignEnum sign) {
        if (sign.equals(this.turn)) {
            throw new IllegalArgumentException("It is not your turn");
        }
    }

    public SignEnum getTurn() {
        return turn;
    }

    public void setTurn(SignEnum turn) {
        this.turn = turn;
    }
}
