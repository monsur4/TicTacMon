package com.example.android.tictac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Single_O_three extends AppCompatActivity {

    /*instantiates all textViews*/
    private TextView TextView11;
    private TextView TextView12;
    private TextView TextView13;
    private TextView TextView21;
    private TextView TextView22;
    private TextView TextView23;
    private TextView TextView31;
    private TextView TextView32;
    private TextView TextView33;

    /*instantiates an arrayList*/
    private ArrayList<TextView> List;

    /*declares integer variables to hold the scores of both players*/
    private int playerXScore = 0;
    private int playerOScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_by_three_board_game);

        /*initializes all textViews*/
        TextView11 = findViewById(R.id.text_view_11);
        TextView12 = findViewById(R.id.text_view_12);
        TextView13 = findViewById(R.id.text_view_13);
        TextView21 = findViewById(R.id.text_view_21);
        TextView22 = findViewById(R.id.text_view_22);
        TextView23 = findViewById(R.id.text_view_23);
        TextView31 = findViewById(R.id.text_view_31);
        TextView32 = findViewById(R.id.text_view_32);
        TextView33 = findViewById(R.id.text_view_33);

        /*replaces players with the appropriate text*/
        ((TextView) findViewById(R.id.player_one)).setText(R.string.computer);
        ((TextView) findViewById(R.id.player_two)).setText(R.string.player);

        /*initializes the arrayList*/
        List = new ArrayList<>();

        /*adds all textViews to the arrayList*/
        List.add(TextView11);
        List.add(TextView12);
        List.add(TextView13);
        List.add(TextView21);
        List.add(TextView22);
        List.add(TextView23);
        List.add(TextView31);
        List.add(TextView32);
        List.add(TextView33);

        /*computer starts the game by selecting a random textView from the arrayList to play*/
        computerPlay();

        /*sets the textView's text to O(if it is being selected for the first time)
         *check if there is a winner
         *remove the textView from the arrayList
         *computer then selects a random textView from those remaining in the arrayList to play*/
        TextView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView11.getText().toString().equals("")) {
                    TextView11.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView11);
                        computerPlay();
                    }
                }
            }
        });

        TextView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView12.getText().toString().equals("")) {
                    TextView12.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView12);
                        computerPlay();
                    }
                }
            }
        });

        TextView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView13.getText().toString().equals("")) {
                    TextView13.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView13);
                        computerPlay();
                    }
                }
            }
        });

        TextView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView21.getText().toString().equals("")) {
                    TextView21.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView21);
                        computerPlay();
                    }
                }
            }
        });

        TextView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView22.getText().toString().equals("")) {
                    TextView22.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView22);
                        computerPlay();
                    }
                }
            }
        });

        TextView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView23.getText().toString().equals("")) {
                    TextView23.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView23);
                        computerPlay();
                    }
                }
            }
        });

        TextView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView31.getText().toString().equals("")) {
                    TextView31.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView31);
                        computerPlay();
                    }
                }
            }
        });

        TextView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView32.getText().toString().equals("")) {
                    TextView32.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView32);
                        computerPlay();
                    }
                }
            }
        });

        TextView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView33.getText().toString().equals("")) {
                    TextView33.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView33);
                        computerPlay();
                    }
                }
            }
        });
    }

    /*makes computer play its move*/
    private void computerPlay(){
        Random rand = new Random();
        final int randomNumber = rand.nextInt(List.size());
        TextView computerPlay = List.get(randomNumber);
        computerPlay.setText("X");
        checkWinner();
        List.remove(randomNumber);
    }

    /*returns true if there is a winner*/
    private boolean checkWinner() {
        if (TextView11.getText() == "X" && TextView11.getText() == TextView12.getText() &&
                TextView11.getText() == TextView13.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView21.getText() == "X" && TextView21.getText() == TextView22.getText() &&
                TextView21.getText() == TextView23.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView31.getText() == "X" && TextView31.getText() == TextView32.getText() &&
                TextView31.getText() == TextView33.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "X" && TextView11.getText() == TextView21.getText() &&
                TextView11.getText() == TextView31.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView12.getText() == "X" && TextView12.getText() == TextView22.getText() &&
                TextView12.getText() == TextView32.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "X" && TextView13.getText() == TextView23.getText() &&
                TextView13.getText() == TextView33.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "X" && TextView11.getText() == TextView22.getText() &&
                TextView11.getText() == TextView33.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "X" && TextView13.getText() == TextView22.getText() &&
                TextView13.getText() == TextView31.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView12.getText() &&
                TextView11.getText() == TextView13.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView21.getText() == "O" && TextView21.getText() == TextView22.getText() &&
                TextView21.getText() == TextView23.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView31.getText() == "O" && TextView31.getText() == TextView32.getText() &&
                TextView31.getText() == TextView33.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView21.getText() &&
                TextView11.getText() == TextView31.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView12.getText() == "O" && TextView12.getText() == TextView22.getText() &&
                TextView12.getText() == TextView32.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "O" && TextView13.getText() == TextView23.getText() &&
                TextView13.getText() == TextView33.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView22.getText() &&
                TextView11.getText() == TextView33.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "O" && TextView13.getText() == TextView22.getText() &&
                TextView13.getText() == TextView31.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        /*if the texts in all the textViews have been changed
         *and there is no winner, then the game is a draw*/
        if (TextView11.getText() != "" && TextView12.getText() != "" && TextView13.getText() != ""
                && TextView21.getText() != "" && TextView22.getText() != ""
                && TextView23.getText() != "" && TextView31.getText() != ""
                && TextView32.getText() != "" && TextView33.getText() != "") {
            disableTextViews();
            Toast.makeText(this, "Game is a draw.", Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }

    /*disables all the text views*/
    private void disableTextViews() {
        TextView11.setClickable(false);
        TextView12.setClickable(false);
        TextView13.setClickable(false);
        TextView21.setClickable(false);
        TextView22.setClickable(false);
        TextView23.setClickable(false);
        TextView31.setClickable(false);
        TextView32.setClickable(false);
        TextView33.setClickable(false);
    }

    /*resets the board*/
    public void resetBoard(View view) {
        /*clears all the texts within the textViews*/
        TextView11.setText("");
        TextView12.setText("");
        TextView13.setText("");
        TextView21.setText("");
        TextView22.setText("");
        TextView23.setText("");
        TextView31.setText("");
        TextView32.setText("");
        TextView33.setText("");

        /*makes all textViews clickable*/
        TextView11.setClickable(true);
        TextView12.setClickable(true);
        TextView13.setClickable(true);
        TextView21.setClickable(true);
        TextView22.setClickable(true);
        TextView23.setClickable(true);
        TextView31.setClickable(true);
        TextView32.setClickable(true);
        TextView33.setClickable(true);

        /*clears the arrayList*/
        List.clear();

        /*adds textViews to the arrayList*/
        List.add(TextView11);
        List.add(TextView12);
        List.add(TextView13);
        List.add(TextView21);
        List.add(TextView22);
        List.add(TextView23);
        List.add(TextView31);
        List.add(TextView32);
        List.add(TextView33);

        /*computer restarts the game by selecting a random textView from the arrayList to play*/
        Random rand = new Random();
        final int randomNumber = rand.nextInt(List.size());
        TextView computerPlay = List.get(randomNumber);
        computerPlay.setText("X");
        checkWinner();
        List.remove(randomNumber);
    }

    /*displays computer score*/
    private void displayXScore() {
        ((TextView) findViewById(R.id.player_x_score)).setText(String.valueOf(playerXScore));
    }

    /*displays player score*/
    private void displayOScore() {
        ((TextView) findViewById(R.id.player_o_score)).setText(String.valueOf(playerOScore));
    }
}
