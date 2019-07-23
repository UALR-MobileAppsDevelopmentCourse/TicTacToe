package com.acme.tictactoe.presenter;

import com.acme.tictactoe.contract.TicTacToeContract;
import com.acme.tictactoe.model.Board;
import com.acme.tictactoe.model.Player;

public class TicTacToePresenter implements TicTacToeContract.Presenter {

    private TicTacToeContract.View view;
    private Board model;

    public TicTacToePresenter(TicTacToeContract.View view) {
        this.view = view;
        this.model = new Board();
    }

    @Override
    public void onButtonSelected(int row, int col) {
        Player playerThatMoved = model.mark(row, col);

        if(playerThatMoved != null) {
            view.setButtonText(row, col, playerThatMoved.toString());

            if (model.getWinner() != null) {
                view.showWinner(playerThatMoved.toString());
            }
        }
    }

    @Override
    public void onResetSelected() {
        view.clearWinnerDisplay();
        view.clearButtons();
        model.restart();
    }

}
