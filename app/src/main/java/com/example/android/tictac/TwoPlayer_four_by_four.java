package com.example.android.tictac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TwoPlayer_four_by_four extends AppCompatActivity {

    TextView TextView11;
    TextView TextView12;
    TextView TextView13;
    TextView TextView14;
    TextView TextView21;
    TextView TextView22;
    TextView TextView23;
    TextView TextView24;
    TextView TextView31;
    TextView TextView32;
    TextView TextView33;
    TextView TextView34;
    TextView TextView41;
    TextView TextView42;
    TextView TextView43;
    TextView TextView44;

    int playerOneScore = 0;
    int playerTwoScore = 0;

    int playerToStart;

    int playerToPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_by_four_board_game);
        TextView11 = (TextView) findViewById(R.id.text_view_11);
        TextView12 = (TextView) findViewById(R.id.text_view_12);
        TextView13 = (TextView) findViewById(R.id.text_view_13);
        TextView14 = (TextView) findViewById(R.id.text_view_14);
        TextView21 = (TextView) findViewById(R.id.text_view_21);
        TextView22 = (TextView) findViewById(R.id.text_view_22);
        TextView23 = (TextView) findViewById(R.id.text_view_23);
        TextView24 = (TextView) findViewById(R.id.text_view_24);
        TextView31 = (TextView) findViewById(R.id.text_view_31);
        TextView32 = (TextView) findViewById(R.id.text_view_32);
        TextView33 = (TextView) findViewById(R.id.text_view_33);
        TextView34 = (TextView) findViewById(R.id.text_view_34);
        TextView41 = (TextView) findViewById(R.id.text_view_41);
        TextView42 = (TextView) findViewById(R.id.text_view_42);
        TextView43 = (TextView) findViewById(R.id.text_view_43);
        TextView44 = (TextView) findViewById(R.id.text_view_44);

        playerToStart = 1;

        playerToPlay = 1;

        TextView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView11.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView11.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView11.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView12.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView12.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView12.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView13.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView13.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView13.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView14.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView14.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView14.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView21.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView21.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView21.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView22.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView22.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView22.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView23.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView23.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView23.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView24.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView24.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView24.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView31.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView31.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView31.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView32.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView32.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView32.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView33.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView33.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView33.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView34.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView34.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView34.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView41.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView41.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView41.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView42.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView42.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView42.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView43.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView43.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView43.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });

        TextView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView44.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView44.setText("X");
                        playerToPlay = 2;
                        if (checkWinner()) {
                            return;
                        }
                    } else if (playerToPlay == 2) {
                        TextView44.setText("O");
                        playerToPlay = 1;
                        if (checkWinner()) {
                            return;
                        }
                    }
                }
            }
        });
    }

    public boolean checkWinner() {
        if (TextView11.getText() != "" && TextView11.getText() == TextView12.getText() && TextView11.getText() == TextView13.getText() && TextView11.getText() == TextView14.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView11.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView21.getText() != "" && TextView21.getText() == TextView22.getText() && TextView21.getText() == TextView23.getText() && TextView21.getText() == TextView24.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView21.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView31.getText() != "" && TextView31.getText() == TextView32.getText() && TextView31.getText() == TextView33.getText() && TextView31.getText() == TextView34.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView31.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView41.getText() != "" && TextView41.getText() == TextView42.getText() && TextView41.getText() == TextView43.getText() && TextView41.getText() == TextView44.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView41.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() != "" && TextView11.getText() == TextView21.getText() && TextView11.getText() == TextView31.getText() && TextView11.getText() == TextView41.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView11.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView12.getText() != "" && TextView12.getText() == TextView22.getText() && TextView12.getText() == TextView32.getText() && TextView12.getText() == TextView42.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView12.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() != "" && TextView13.getText() == TextView23.getText() && TextView13.getText() == TextView33.getText() && TextView13.getText() == TextView43.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView13.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView14.getText() != "" && TextView14.getText() == TextView24.getText() && TextView14.getText() == TextView34.getText() && TextView14.getText() == TextView44.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView14.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView11.getText() != "" && TextView11.getText() == TextView22.getText() && TextView11.getText() == TextView33.getText() && TextView11.getText() == TextView44.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView11.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView14.getText() != "" && TextView14.getText() == TextView23.getText() && TextView14.getText() == TextView32.getText() && TextView14.getText() == TextView41.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView14.getText() + " wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() != "" && TextView12.getText() != "" && TextView13.getText() != "" && TextView14.getText() != "" && TextView21.getText() != "" && TextView22.getText() != "" && TextView23.getText() != "" && TextView24.getText() != "" && TextView31.getText() != "" && TextView32.getText() != "" && TextView33.getText() != "" && TextView34.getText() != "" && TextView41.getText() != "" && TextView42.getText() != "" && TextView43.getText() != "" && TextView44.getText() != "") {
            if (playerToStart == 1){
                playerToStart = 2;
            }
            else if (playerToStart == 2){
                playerToStart = 1;
            }
            Toast.makeText(this, "Game is a draw.", Toast.LENGTH_LONG).show();
        }
        return false;
    }

    public void assignPlayerScore(){
        if (playerToPlay == 2 && playerToStart == 1){
            playerOneScore++;
            displayPlayerOneScore();
            playerToStart = 2;
        }
        else if (playerToPlay == 1 && playerToStart == 1){
            playerTwoScore++;
            displayPlayerTwoScore();
            playerToStart = 1;
        }
        else if (playerToPlay == 2 && playerToStart == 2){
            playerTwoScore++;
            displayPlayerTwoScore();
            playerToStart = 1;
        }
        else if (playerToPlay == 1 && playerToStart == 2){
            playerOneScore++;
            displayPlayerOneScore();
            playerToStart = 2;
        }
    }

    public void disableTextViews() {
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

    public void resetBoard(View view) {
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

        playerToPlay = 1;

        Toast.makeText(this, "Player " + playerToStart + " starts this game.", Toast.LENGTH_LONG).show();
    }

    public void displayPlayerOneScore() {
        ((TextView) findViewById(R.id.player_x_score)).setText(String.valueOf(playerOneScore));
    }

    public void displayPlayerTwoScore() {
        ((TextView) findViewById(R.id.player_o_score)).setText(String.valueOf(playerTwoScore));
    }
}
