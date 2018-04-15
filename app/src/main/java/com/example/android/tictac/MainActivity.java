package com.example.android.tictac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //instantiates all radio buttons
    private RadioButton singlePlayer;
    private RadioButton twoPlayer;
    private RadioButton playAs_X;
    private RadioButton playAs_O;
    private RadioButton threeByThreeBoard;
    private RadioButton fourByFourBoard;
    private RadioButton fiveByFiveBoard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializes all radio buttons
        singlePlayer = findViewById(R.id.single_player);
        twoPlayer = findViewById(R.id.two_players);
        playAs_X = findViewById(R.id.play_as_X);
        playAs_O = findViewById(R.id.play_as_O);
        threeByThreeBoard = findViewById(R.id.three_by_three_board);
        fourByFourBoard = findViewById(R.id.four_by_four_board);
        fiveByFiveBoard = findViewById(R.id.five_by_five_board);

        //if singlePlayer is selected, enable the options to select a letter
        singlePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.letter_selection_textview).setEnabled(true);
                playAs_X.setEnabled(true);
                playAs_O.setEnabled(true);
            }
        });

        //if twoPlayer is selected, disable the options to select a letter
        twoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.letter_selection_textview).setEnabled(false);
                playAs_X.setEnabled(false);
                playAs_O.setEnabled(false);
            }
        });

    }

    //launch activity based on the options selected
    public void playGame(View view) {
        if (singlePlayer.isChecked() && playAs_O.isChecked() && threeByThreeBoard.isChecked()) {
            Intent play = new Intent(this, Single_O_three.class);
            startActivity(play);
            return;
        }
        if (twoPlayer.isChecked() && threeByThreeBoard.isChecked()) {
            Intent play = new Intent(this, TwoPlayer_three_by_three.class);
            startActivity(play);
            return;
        }
        if (singlePlayer.isChecked() && playAs_X.isChecked() && fourByFourBoard.isChecked()) {
            Intent play = new Intent(this, single_x_four.class);//correct the naming Single_X_four
            startActivity(play);
            return;
        }
        if (singlePlayer.isChecked() && playAs_O.isChecked() && fourByFourBoard.isChecked()) {
            Intent play = new Intent(this, Single_O_four.class);
            startActivity(play);
            return;
        }
        if (twoPlayer.isChecked() && fourByFourBoard.isChecked()) {
            Intent play = new Intent(this, TwoPlayer_four_by_four.class);
            startActivity(play);
            return;
        }
        if (singlePlayer.isChecked() && playAs_X.isChecked() && fiveByFiveBoard.isChecked()) {
            Intent play = new Intent(this, Single_X_five.class);
            startActivity(play);
            return;
        }
        if (singlePlayer.isChecked() && playAs_O.isChecked() && fiveByFiveBoard.isChecked()) {
            Intent play = new Intent(this, Single_O_five.class);
            startActivity(play);
            return;
        }
        if (twoPlayer.isChecked() && fiveByFiveBoard.isChecked()) {
            Intent play = new Intent(this, TwoPlayer_five_by_five.class);
            startActivity(play);
            return;
        }
        //if no option is selected then open the default game activity (single player 3 by 3 game as player X)
        Intent play = new Intent(this, DefaultGameActivity.class);
        startActivity(play);
    }

}
