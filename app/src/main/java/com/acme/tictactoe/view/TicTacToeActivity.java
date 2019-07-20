package com.acme.tictactoe.view;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.acme.tictactoe.R;
import com.acme.tictactoe.databinding.TictactoeBinding;
import com.acme.tictactoe.viewmodel.TicTacToeViewModel;

public class TicTacToeActivity extends AppCompatActivity {

    TicTacToeViewModel viewModel = new TicTacToeViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TictactoeBinding binding = DataBindingUtil.setContentView(this, R.layout.tictactoe);
        binding.setViewModel(viewModel);
        viewModel.onCreate();
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.onDestroy();
    }

}
