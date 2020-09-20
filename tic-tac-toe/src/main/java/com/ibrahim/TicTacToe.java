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

    public char selectSign() {
        return 'O';
    }

    public void move(SignEnum sign, int row, int column) {
        // validateIndex();
         validateTurn(sign);
        // validatePiece(row, column);
        board[row][column] = sign.sign;
        turn = sign;
         display();
    }

    private void display() {

    }

    public void validateTurn(SignEnum sign) {
        if (sign.equals(this.turn)){
            throw  new IllegalArgumentException("It is not your turn");
        }
    }

    public SignEnum getTurn() {
        return turn;
    }

    public void setTurn(SignEnum turn) {
        this.turn = turn;
    }
}
