package com.ibrahim;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicTacToe {


    private char[][] gameBoard;
    //    private boolean gameIsContinues;
    Players lastPlayer = new Players();


    public TicTacToe() {
        gameBoard = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
    }

    public void play(Players player, int row, int column) {
        if (player.getSign() != lastPlayer.getSign()) {

            validateIsEmpty(row, column);
            gameBoard[row][column] = player.getSign();
            lastPlayer.setSign(player.getSign());
            validateTurn(lastPlayer);
            checkWinner(player);

        } else throw new IllegalArgumentException("Not your turn!");

    }

    public void validateTurn(Players player) {
        char turn = 'X';
        if (player.getSign() == 'X') {
            turn = 'O';
        } else
            turn = 'X';
    }

    public void display() {
        for (char[] chars : gameBoard) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public void validateIsEmpty(int row, int column) {
        if (!(gameBoard[row][column] == ' ')) {
            throw new IllegalArgumentException("This position is not empty");
        }

    }

    public char checkRows(Players player) {
        char sign = player.getSign();
        char winner = ' ';
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] == sign && gameBoard[i][1] == sign && gameBoard[i][2] == sign) {
                winner = sign;
                break;
            }
        }
        return winner;
    }

    public char checkColumns(Players player) {
        char sign = player.getSign();
        char winner = ' ';
        for (int i = 0; i < 3; i++) {
            if (gameBoard[0][i] == sign && gameBoard[1][i] == sign && gameBoard[2][i] == sign) {
                winner = sign;
                break;
            }
        }
        return winner;
    }

    private char checkCross(Players player) {
        char sign = player.getSign();
        char winner = ' ';
        if (gameBoard[0][0] == sign && gameBoard[1][1] == sign && gameBoard[2][2] == sign) {
            winner = sign;
        }
        if (gameBoard[0][2] == sign && gameBoard[1][1] == sign && gameBoard[2][0] == sign) {
            winner = sign;
        }
        return winner;
    }

    public void checkWinner(Players player) {
        if (checkColumns(player) == player.getSign()) {
            throw new IllegalArgumentException("Game is over. Winner is " + player.getSign());
        }
        if (checkRows(player) == player.getSign()) {
            throw new IllegalArgumentException("Game is over. Winner is " + player.getSign());
        }
        if (checkCross(player) == player.getSign()) {
            throw new IllegalArgumentException("Game is over. Winner is " + player.getSign());
        }

    }


}
