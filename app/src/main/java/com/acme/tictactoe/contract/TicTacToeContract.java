package com.acme.tictactoe.contract;

/**
 * Created by irconde on 2019-07-20.
 */
public interface TicTacToeContract {
    interface Presenter {
        void onButtonSelected(int row, int col);
        void onResetSelected();
    }
    interface View {
        void showWinner(String winningPlayerDisplayLabel);
        void clearWinnerDisplay();
        void clearButtons();
        void setButtonText(int row, int col, String text);
    }
}
