package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X' ) {
                return true;
            } else if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X' ) {
                return true;
            }
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ) {
                return true;
            } else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X' ) {
                return true;

            }
        }return false;

        }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O' ) {
                return true;
            } else if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O' ) {
                return true;
            }
            if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ) {
                return true;
            } else if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O' ) {
                return true;

            }
        }return false;

    }


    public Boolean isTie() {
        if(!isInFavorOfO() && !isInFavorOfX()){
            return true;
        } return false;

    }


    public String getWinner() {
        if(isInFavorOfX()){
            return "X";
        } else if (isInFavorOfO()){
            return "O";
        }else
            return null;
    }

}
