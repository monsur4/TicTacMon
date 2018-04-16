package com.example.android.tictac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TwoPlayer_five_by_five extends AppCompatActivity {

    /*instantiates all textViews*/
    private TextView TextView11;
    private TextView TextView12;
    private TextView TextView13;
    private TextView TextView14;
    private TextView TextView15;
    private TextView TextView21;
    private TextView TextView22;
    private TextView TextView23;
    private TextView TextView24;
    private TextView TextView25;
    private TextView TextView31;
    private TextView TextView32;
    private TextView TextView33;
    private TextView TextView34;
    private TextView TextView35;
    private TextView TextView41;
    private TextView TextView42;
    private TextView TextView43;
    private TextView TextView44;
    private TextView TextView45;
    private TextView TextView51;
    private TextView TextView52;
    private TextView TextView53;
    private TextView TextView54;
    private TextView TextView55;

    /*declares integer variables to hold the scores of both players*/
    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    /*declares an integer variable for player who is to start the game*/
    private int playerToStart;

    /*declares an integer variable for whose turn is to play*/
    private int playerToPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_by_five_board_game);

        /*initializes all textViews*/
        TextView11 = findViewById(R.id.text_view_11);
        TextView12 = findViewById(R.id.text_view_12);
        TextView13 = findViewById(R.id.text_view_13);
        TextView14 = findViewById(R.id.text_view_14);
        TextView15 = findViewById(R.id.text_view_15);
        TextView21 = findViewById(R.id.text_view_21);
        TextView22 = findViewById(R.id.text_view_22);
        TextView23 = findViewById(R.id.text_view_23);
        TextView24 = findViewById(R.id.text_view_24);
        TextView25 = findViewById(R.id.text_view_25);
        TextView31 = findViewById(R.id.text_view_31);
        TextView32 = findViewById(R.id.text_view_32);
        TextView33 = findViewById(R.id.text_view_33);
        TextView34 = findViewById(R.id.text_view_34);
        TextView35 = findViewById(R.id.text_view_35);
        TextView41 = findViewById(R.id.text_view_41);
        TextView42 = findViewById(R.id.text_view_42);
        TextView43 = findViewById(R.id.text_view_43);
        TextView44 = findViewById(R.id.text_view_44);
        TextView45 = findViewById(R.id.text_view_45);
        TextView51 = findViewById(R.id.text_view_51);
        TextView52 = findViewById(R.id.text_view_52);
        TextView53 = findViewById(R.id.text_view_53);
        TextView54 = findViewById(R.id.text_view_54);
        TextView55 = findViewById(R.id.text_view_55);

        /*initializes the player who is to start the game*/
        playerToStart = 1;

        /*initializes whose turn is to play (so X always starts the game)*/
        playerToPlay = 1;

        /*sets the textView's text to either X or O (if it is being selected for the first time)
         *check whose turn is to play
         *check if there is a winner
         */
        TextView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView11.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView11.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView11.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView12.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView13.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView14.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });

        TextView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView15.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView15.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView15.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView21.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView22.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView23.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView24.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });

        TextView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView25.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView25.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView25.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView31.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView32.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView33.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView34.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });

        TextView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView35.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView35.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView35.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView41.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView42.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView43.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
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
                    } else if (playerToPlay == 2) {
                        TextView44.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });

        TextView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView45.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView45.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView45.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });

        TextView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView51.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView51.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView51.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });

        TextView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView52.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView52.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView52.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });

        TextView53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView53.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView53.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView53.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });

        TextView54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView54.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView54.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView54.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });

        TextView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView55.getText().toString().equals("")) {
                    if (playerToPlay == 1) {
                        TextView55.setText("X");
                        playerToPlay = 2;
                    } else if (playerToPlay == 2) {
                        TextView55.setText("O");
                        playerToPlay = 1;
                    }
                    checkWinner();
                }
            }
        });
    }

    /*returns true if there is a winner*/
    private void checkWinner() {
        if (TextView11.getText() != "" && TextView11.getText() == TextView12.getText() &&
                TextView11.getText() == TextView13.getText() &&
                TextView11.getText() == TextView14.getText() &&
                TextView11.getText() == TextView15.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView11.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView21.getText() != "" && TextView21.getText() == TextView22.getText() &&
                TextView21.getText() == TextView23.getText() &&
                TextView21.getText() == TextView24.getText() &&
                TextView21.getText() == TextView25.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView21.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView31.getText() != "" && TextView31.getText() == TextView32.getText() &&
                TextView31.getText() == TextView33.getText() &&
                TextView31.getText() == TextView34.getText() &&
                TextView31.getText() == TextView35.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView31.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView41.getText() != "" && TextView41.getText() == TextView42.getText() &&
                TextView41.getText() == TextView43.getText() &&
                TextView41.getText() == TextView44.getText() &&
                TextView41.getText() == TextView45.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView41.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView51.getText() != "" && TextView51.getText() == TextView52.getText() &&
                TextView51.getText() == TextView53.getText() &&
                TextView51.getText() == TextView54.getText() &&
                TextView51.getText() == TextView55.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView51.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView11.getText() != "" && TextView11.getText() == TextView21.getText() &&
                TextView11.getText() == TextView31.getText() &&
                TextView11.getText() == TextView41.getText() &&
                TextView11.getText() == TextView51.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView11.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView12.getText() != "" && TextView12.getText() == TextView22.getText() &&
                TextView12.getText() == TextView32.getText() &&
                TextView12.getText() == TextView42.getText() &&
                TextView12.getText() == TextView52.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView12.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView13.getText() != "" && TextView13.getText() == TextView23.getText() &&
                TextView13.getText() == TextView33.getText() &&
                TextView13.getText() == TextView43.getText() &&
                TextView13.getText() == TextView53.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView13.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView14.getText() != "" && TextView14.getText() == TextView24.getText() &&
                TextView14.getText() == TextView34.getText() &&
                TextView14.getText() == TextView44.getText() &&
                TextView14.getText() == TextView54.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView14.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView15.getText() != "" && TextView15.getText() == TextView25.getText() &&
                TextView15.getText() == TextView35.getText() &&
                TextView15.getText() == TextView45.getText() &&
                TextView15.getText() == TextView55.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView15.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView11.getText() != "" && TextView11.getText() == TextView22.getText() &&
                TextView11.getText() == TextView33.getText() &&
                TextView11.getText() == TextView44.getText() &&
                TextView11.getText() == TextView55.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView11.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        if (TextView15.getText() != "" && TextView15.getText() == TextView24.getText() &&
                TextView15.getText() == TextView33.getText() &&
                TextView15.getText() == TextView42.getText() &&
                TextView15.getText() == TextView51.getText()) {
            disableTextViews();
            assignPlayerScore();
            Toast.makeText(this, TextView15.getText() + " wins.",
                    Toast.LENGTH_LONG).show();
            return;
        }
        /*if the texts in all the textViews have been changed
         *and there is no winner, then the game is a draw
         *change the player who starts the next game*/
        if (TextView11.getText() != "" && TextView12.getText() != "" && TextView13.getText() != ""
                && TextView14.getText() != "" && TextView15.getText() != "" &&
                TextView21.getText() != "" && TextView22.getText() != "" &&
                TextView23.getText() != "" && TextView24.getText() != "" &&
                TextView25.getText() != "" && TextView31.getText() != "" &&
                TextView32.getText() != "" && TextView33.getText() != "" &&
                TextView34.getText() != "" && TextView35.getText() != "" &&
                TextView41.getText() != "" && TextView42.getText() != "" &&
                TextView43.getText() != "" && TextView44.getText() != "" &&
                TextView45.getText() != "" && TextView51.getText() != "" &&
                TextView52.getText() != "" && TextView53.getText() != "" &&
                TextView54.getText() != "" && TextView55.getText() != "") {
            if (playerToStart == 1) {
                playerToStart = 2;
            } else if (playerToStart == 2) {
                playerToStart = 1;
            }
            Toast.makeText(this, "Game is a draw.", Toast.LENGTH_LONG).show();
        }
    }

    /*increments the score of the player who wins
     *sets the player who starts the next game*/
    private void assignPlayerScore() {
        if (playerToPlay == 2 && playerToStart == 1) {
            playerOneScore++;
            displayPlayerOneScore();
            playerToStart = 2;
        } else if (playerToPlay == 1 && playerToStart == 1) {
            playerTwoScore++;
            displayPlayerTwoScore();
            playerToStart = 1;
        } else if (playerToPlay == 2 && playerToStart == 2) {
            playerTwoScore++;
            displayPlayerTwoScore();
            playerToStart = 1;
        } else if (playerToPlay == 1 && playerToStart == 2) {
            playerOneScore++;
            displayPlayerOneScore();
            playerToStart = 2;
        }
    }

    /*disables all the text views*/
    private void disableTextViews() {
        TextView11.setClickable(false);
        TextView12.setClickable(false);
        TextView13.setClickable(false);
        TextView14.setClickable(false);
        TextView15.setClickable(false);
        TextView21.setClickable(false);
        TextView22.setClickable(false);
        TextView23.setClickable(false);
        TextView24.setClickable(false);
        TextView25.setClickable(false);
        TextView31.setClickable(false);
        TextView32.setClickable(false);
        TextView33.setClickable(false);
        TextView34.setClickable(false);
        TextView35.setClickable(false);
        TextView41.setClickable(false);
        TextView42.setClickable(false);
        TextView43.setClickable(false);
        TextView44.setClickable(false);
        TextView45.setClickable(false);
        TextView51.setClickable(false);
        TextView52.setClickable(false);
        TextView53.setClickable(false);
        TextView54.setClickable(false);
        TextView55.setClickable(false);
    }

    /*resets the board*/
    public void resetBoard(View view) {
        /*clears all the texts within the textViews*/
        TextView11.setText("");
        TextView12.setText("");
        TextView13.setText("");
        TextView14.setText("");
        TextView15.setText("");
        TextView21.setText("");
        TextView22.setText("");
        TextView23.setText("");
        TextView24.setText("");
        TextView25.setText("");
        TextView31.setText("");
        TextView32.setText("");
        TextView33.setText("");
        TextView34.setText("");
        TextView35.setText("");
        TextView41.setText("");
        TextView42.setText("");
        TextView43.setText("");
        TextView44.setText("");
        TextView45.setText("");
        TextView51.setText("");
        TextView52.setText("");
        TextView53.setText("");
        TextView54.setText("");
        TextView55.setText("");

        /*makes all textViews clickable*/
        TextView11.setClickable(true);
        TextView12.setClickable(true);
        TextView13.setClickable(true);
        TextView14.setClickable(true);
        TextView15.setClickable(true);
        TextView21.setClickable(true);
        TextView22.setClickable(true);
        TextView23.setClickable(true);
        TextView24.setClickable(true);
        TextView25.setClickable(true);
        TextView31.setClickable(true);
        TextView32.setClickable(true);
        TextView33.setClickable(true);
        TextView34.setClickable(true);
        TextView35.setClickable(true);
        TextView41.setClickable(true);
        TextView42.setClickable(true);
        TextView43.setClickable(true);
        TextView44.setClickable(true);
        TextView45.setClickable(true);
        TextView51.setClickable(true);
        TextView52.setClickable(true);
        TextView53.setClickable(true);
        TextView54.setClickable(true);
        TextView55.setClickable(true);

        /*resets turn so that X starts the new game */
        playerToPlay = 1;

        Toast.makeText(this, "Player " + playerToStart + " starts this game.", Toast.LENGTH_LONG).show();
    }

    /*displays first player score*/
    private void displayPlayerOneScore() {
        ((TextView) findViewById(R.id.player_x_score)).setText(String.valueOf(playerOneScore));
    }

    /*displays second player score*/
    private void displayPlayerTwoScore() {
        ((TextView) findViewById(R.id.player_o_score)).setText(String.valueOf(playerTwoScore));
    }
}
