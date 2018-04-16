package com.example.android.tictac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class single_x_four extends AppCompatActivity {

    /*instantiates all textViews*/
    private TextView TextView11;
    private TextView TextView12;
    private TextView TextView13;
    private TextView TextView14;
    private TextView TextView21;
    private TextView TextView22;
    private TextView TextView23;
    private TextView TextView24;
    private TextView TextView31;
    private TextView TextView32;
    private TextView TextView33;
    private TextView TextView34;
    private TextView TextView41;
    private TextView TextView42;
    private TextView TextView43;
    private TextView TextView44;

    /*instantiates an arrayList*/
    private ArrayList<TextView> List;

    /*declares integer variables to hold the scores of both players*/
    private int playerXScore = 0;
    private int playerOScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_by_four_board_game);

        /*initializes all textViews*/
        TextView11 = findViewById(R.id.text_view_11);
        TextView12 = findViewById(R.id.text_view_12);
        TextView13 = findViewById(R.id.text_view_13);
        TextView14 = findViewById(R.id.text_view_14);
        TextView21 = findViewById(R.id.text_view_21);
        TextView22 = findViewById(R.id.text_view_22);
        TextView23 = findViewById(R.id.text_view_23);
        TextView24 = findViewById(R.id.text_view_24);
        TextView31 = findViewById(R.id.text_view_31);
        TextView32 = findViewById(R.id.text_view_32);
        TextView33 = findViewById(R.id.text_view_33);
        TextView34 = findViewById(R.id.text_view_34);
        TextView41 = findViewById(R.id.text_view_41);
        TextView42 = findViewById(R.id.text_view_42);
        TextView43 = findViewById(R.id.text_view_43);
        TextView44 = findViewById(R.id.text_view_44);

        /*replaces players with the appropriate text*/
        ((TextView) findViewById(R.id.player_one)).setText(R.string.player);
        ((TextView) findViewById(R.id.player_two)).setText(R.string.computer);

        /*initializes the arrayList*/
        List = new ArrayList<>();

        /*adds all textViews to the arrayList*/
        List.add(TextView11);
        List.add(TextView12);
        List.add(TextView13);
        List.add(TextView14);
        List.add(TextView21);
        List.add(TextView22);
        List.add(TextView23);
        List.add(TextView24);
        List.add(TextView31);
        List.add(TextView32);
        List.add(TextView33);
        List.add(TextView34);
        List.add(TextView41);
        List.add(TextView42);
        List.add(TextView43);
        List.add(TextView44);

        /*sets the textView's text to X(if it is being selected for the first time)
         *check if there is a winner
         *remove the textView from the arrayList
         *computer then selects a random textView from those remaining in the arrayList to play
         */
        TextView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView11.getText().toString().equals("")) {
                    TextView11.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView11);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView12.getText().toString().equals("")) {
                    TextView12.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView12);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView13.getText().toString().equals("")) {
                    TextView13.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView13);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView14.getText().toString().equals("")) {
                    TextView14.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView14);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView21.getText().toString().equals("")) {
                    TextView21.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView21);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView22.getText().toString().equals("")) {
                    TextView22.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView22);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView23.getText().toString().equals("")) {
                    TextView23.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView23);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView24.getText().toString().equals("")) {
                    TextView24.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView24);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView31.getText().toString().equals("")) {
                    TextView31.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView31);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView32.getText().toString().equals("")) {
                    TextView32.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView32);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView33.getText().toString().equals("")) {
                    TextView33.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView33);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView34.getText().toString().equals("")) {
                    TextView34.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView34);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }

                }
            }
        });

        TextView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView41.getText().toString().equals("")) {
                    TextView41.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView41);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView42.getText().toString().equals("")) {
                    TextView42.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView42);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView43.getText().toString().equals("")) {
                    TextView43.setText("X");
                    if (!checkWinner()) {
                        List.remove(TextView43);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });

        TextView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView44.getText().toString().equals("")) {
                    TextView44.setText("X");
                    if (checkWinner()) {
                        List.remove(TextView44);
                        Random rand = new Random();
                        final int randomNumber = rand.nextInt(List.size());
                        TextView computerPlay = List.get(randomNumber);
                        computerPlay.setText("O");
                        checkWinner();
                        List.remove(randomNumber);
                    }
                }
            }
        });
    }

    /*returns true if there is a winner*/
    private boolean checkWinner() {
        if (TextView11.getText() == "X" && TextView11.getText() == TextView12.getText() &&
                TextView11.getText() == TextView13.getText() &&
                TextView11.getText() == TextView14.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView21.getText() == "X" && TextView21.getText() == TextView22.getText() &&
                TextView21.getText() == TextView23.getText() &&
                TextView21.getText() == TextView24.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView31.getText() == "X" && TextView31.getText() == TextView32.getText() &&
                TextView31.getText() == TextView33.getText() &&
                TextView31.getText() == TextView34.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView41.getText() == "X" && TextView41.getText() == TextView42.getText() &&
                TextView41.getText() == TextView43.getText() &&
                TextView41.getText() == TextView44.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "X" && TextView11.getText() == TextView21.getText() &&
                TextView11.getText() == TextView31.getText() &&
                TextView11.getText() == TextView41.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView12.getText() == "X" && TextView12.getText() == TextView22.getText() &&
                TextView12.getText() == TextView32.getText() &&
                TextView12.getText() == TextView42.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "X" && TextView13.getText() == TextView23.getText() &&
                TextView13.getText() == TextView33.getText() &&
                TextView13.getText() == TextView43.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView14.getText() == "X" && TextView14.getText() == TextView24.getText() &&
                TextView14.getText() == TextView34.getText() &&
                TextView14.getText() == TextView44.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView11.getText() == "X" && TextView11.getText() == TextView22.getText() &&
                TextView11.getText() == TextView33.getText() &&
                TextView11.getText() == TextView44.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView14.getText() == "X" && TextView14.getText() == TextView23.getText() &&
                TextView14.getText() == TextView32.getText() &&
                TextView14.getText() == TextView41.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView12.getText() &&
                TextView11.getText() == TextView13.getText() &&
                TextView11.getText() == TextView14.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView21.getText() == "O" && TextView21.getText() == TextView22.getText() &&
                TextView21.getText() == TextView23.getText() &&
                TextView21.getText() == TextView24.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView31.getText() == "O" && TextView31.getText() == TextView32.getText() &&
                TextView31.getText() == TextView33.getText() &&
                TextView31.getText() == TextView34.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView41.getText() == "O" && TextView41.getText() == TextView42.getText() &&
                TextView41.getText() == TextView43.getText() &&
                TextView41.getText() == TextView44.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView21.getText() &&
                TextView11.getText() == TextView31.getText() &&
                TextView11.getText() == TextView41.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView12.getText() == "O" && TextView12.getText() == TextView22.getText() &&
                TextView12.getText() == TextView32.getText() &&
                TextView12.getText() == TextView42.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "O" && TextView13.getText() == TextView23.getText() &&
                TextView13.getText() == TextView33.getText() &&
                TextView13.getText() == TextView43.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView14.getText() == "O" && TextView14.getText() == TextView24.getText() &&
                TextView14.getText() == TextView34.getText() &&
                TextView14.getText() == TextView44.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView22.getText() &&
                TextView11.getText() == TextView33.getText() &&
                TextView11.getText() == TextView44.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView14.getText() == "O" && TextView14.getText() == TextView23.getText() &&
                TextView14.getText() == TextView32.getText() &&
                TextView14.getText() == TextView41.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        /*if the texts in all the textViews have been changed
         *and there is no winner, then the game is a draw*/
        if (TextView11.getText() != "" && TextView12.getText() != "" &&
                TextView13.getText() != "" && TextView14.getText() != "" &&
                TextView21.getText() != "" && TextView22.getText() != "" &&
                TextView23.getText() != "" && TextView24.getText() != "" &&
                TextView31.getText() != "" && TextView32.getText() != "" &&
                TextView33.getText() != "" && TextView34.getText() != "" &&
                TextView41.getText() != "" && TextView42.getText() != "" &&
                TextView43.getText() != "" && TextView44.getText() != "") {
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
        TextView14.setClickable(false);
        TextView21.setClickable(false);
        TextView22.setClickable(false);
        TextView23.setClickable(false);
        TextView24.setClickable(false);
        TextView31.setClickable(false);
        TextView32.setClickable(false);
        TextView33.setClickable(false);
        TextView34.setClickable(false);
        TextView41.setClickable(false);
        TextView42.setClickable(false);
        TextView43.setClickable(false);
        TextView44.setClickable(false);
    }

    /*resets the board*/
    public void resetBoard(View view) {
        /*clears all the texts within the textViews*/
        TextView11.setText("");
        TextView12.setText("");
        TextView13.setText("");
        TextView14.setText("");
        TextView21.setText("");
        TextView22.setText("");
        TextView23.setText("");
        TextView24.setText("");
        TextView31.setText("");
        TextView32.setText("");
        TextView33.setText("");
        TextView34.setText("");
        TextView41.setText("");
        TextView42.setText("");
        TextView43.setText("");
        TextView44.setText("");

        /*makes all textViews clickable*/
        TextView11.setClickable(true);
        TextView12.setClickable(true);
        TextView13.setClickable(true);
        TextView14.setClickable(true);
        TextView21.setClickable(true);
        TextView22.setClickable(true);
        TextView23.setClickable(true);
        TextView24.setClickable(true);
        TextView31.setClickable(true);
        TextView32.setClickable(true);
        TextView33.setClickable(true);
        TextView34.setClickable(true);
        TextView41.setClickable(true);
        TextView42.setClickable(true);
        TextView43.setClickable(true);
        TextView44.setClickable(true);

        /*clears the arrayList*/
        List.clear();

        /*adds textViews to the arrayList*/
        List.add(TextView11);
        List.add(TextView12);
        List.add(TextView13);
        List.add(TextView14);
        List.add(TextView21);
        List.add(TextView22);
        List.add(TextView23);
        List.add(TextView24);
        List.add(TextView31);
        List.add(TextView32);
        List.add(TextView33);
        List.add(TextView34);
        List.add(TextView41);
        List.add(TextView42);
        List.add(TextView43);
        List.add(TextView44);
    }

    /*displays player score*/
    private void displayXScore() {
        ((TextView) findViewById(R.id.player_x_score)).setText(String.valueOf(playerXScore));
    }

    /*displays computer score*/
    private void displayOScore() {
        ((TextView) findViewById(R.id.player_o_score)).setText(String.valueOf(playerOScore));
    }
}
