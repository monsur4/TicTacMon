package com.example.android.tictac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Single_O_five extends AppCompatActivity {

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

    /*instantiates an arrayList*/
    private ArrayList<TextView> List;

    /*declares integer variables to hold the scores of both players*/
    private int playerXScore = 0;
    private int playerOScore = 0;

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

        /*replaces players with the appropriate text*/
        ((TextView) findViewById(R.id.player_one)).setText(R.string.computer);
        ((TextView) findViewById(R.id.player_two)).setText(R.string.player);

        /*initializes the arrayList*/
        List = new ArrayList<>();

        /*adds all textViews to the arrayList*/
        List.add(TextView11);
        List.add(TextView12);
        List.add(TextView13);
        List.add(TextView14);
        List.add(TextView15);
        List.add(TextView21);
        List.add(TextView22);
        List.add(TextView23);
        List.add(TextView24);
        List.add(TextView25);
        List.add(TextView31);
        List.add(TextView32);
        List.add(TextView33);
        List.add(TextView34);
        List.add(TextView35);
        List.add(TextView41);
        List.add(TextView42);
        List.add(TextView43);
        List.add(TextView44);
        List.add(TextView45);
        List.add(TextView51);
        List.add(TextView52);
        List.add(TextView53);
        List.add(TextView54);
        List.add(TextView55);

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

        TextView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView14.getText().toString().equals("")) {
                    TextView14.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView14);
                        computerPlay();
                    }
                }
            }
        });

        TextView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView15.getText().toString().equals("")) {
                    TextView15.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView15);
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

        TextView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView24.getText().toString().equals("")) {
                    TextView24.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView24);
                        computerPlay();
                    }
                }
            }
        });

        TextView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView25.getText().toString().equals("")) {
                    TextView25.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView25);
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

        TextView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView34.getText().toString().equals("")) {
                    TextView34.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView34);
                        computerPlay();
                    }
                }
            }
        });

        TextView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView35.getText().toString().equals("")) {
                    TextView35.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView35);
                        computerPlay();
                    }
                }
            }
        });

        TextView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView41.getText().toString().equals("")) {
                    TextView41.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView41);
                        computerPlay();
                    }
                }
            }
        });

        TextView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView42.getText().toString().equals("")) {
                    TextView42.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView42);
                        computerPlay();
                    }
                }
            }
        });

        TextView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView43.getText().toString().equals("")) {
                    TextView43.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView43);
                        computerPlay();
                    }
                }
            }
        });

        TextView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView44.getText().toString().equals("")) {
                    TextView44.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView44);
                        computerPlay();
                    }

                }
            }
        });

        TextView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView45.getText().toString().equals("")) {
                    TextView45.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView45);
                        computerPlay();
                    }
                }
            }
        });

        TextView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView51.getText().toString().equals("")) {
                    TextView51.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView51);
                        computerPlay();
                    }
                }
            }
        });

        TextView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView52.getText().toString().equals("")) {
                    TextView52.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView52);
                        computerPlay();
                    }
                }
            }
        });

        TextView53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView53.getText().toString().equals("")) {
                    TextView53.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView53);
                        computerPlay();
                    }
                }
            }
        });

        TextView54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView54.getText().toString().equals("")) {
                    TextView54.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView54);
                        computerPlay();
                    }

                }
            }
        });

        TextView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView55.getText().toString().equals("")) {
                    TextView55.setText("O");
                    if (!checkWinner()) {
                        List.remove(TextView55);
                        computerPlay();
                    }
                }
            }
        });
    }

    /*makes the computer play its move*/
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
                TextView11.getText() == TextView13.getText() &&
                TextView11.getText() == TextView14.getText() &&
                TextView11.getText() == TextView15.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView21.getText() == "X" && TextView21.getText() == TextView22.getText() &&
                TextView21.getText() == TextView23.getText() &&
                TextView21.getText() == TextView24.getText() &&
                TextView21.getText() == TextView25.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView31.getText() == "X" && TextView31.getText() == TextView32.getText() &&
                TextView31.getText() == TextView33.getText() &&
                TextView31.getText() == TextView34.getText() &&
                TextView31.getText() == TextView35.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView41.getText() == "X" && TextView41.getText() == TextView42.getText() &&
                TextView41.getText() == TextView43.getText() &&
                TextView41.getText() == TextView44.getText() &&
                TextView41.getText() == TextView45.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView51.getText() == "X" && TextView51.getText() == TextView52.getText() &&
                TextView51.getText() == TextView53.getText() &&
                TextView51.getText() == TextView54.getText() &&
                TextView51.getText() == TextView55.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "X" && TextView11.getText() == TextView21.getText() &&
                TextView11.getText() == TextView31.getText() &&
                TextView11.getText() == TextView41.getText() &&
                TextView11.getText() == TextView51.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView12.getText() == "X" && TextView12.getText() == TextView22.getText() &&
                TextView12.getText() == TextView32.getText() &&
                TextView12.getText() == TextView42.getText() &&
                TextView12.getText() == TextView52.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "X" && TextView13.getText() == TextView23.getText() &&
                TextView13.getText() == TextView33.getText() &&
                TextView13.getText() == TextView43.getText() &&
                TextView13.getText() == TextView53.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView14.getText() == "X" && TextView14.getText() == TextView24.getText() &&
                TextView14.getText() == TextView34.getText() &&
                TextView14.getText() == TextView44.getText() &&
                TextView14.getText() == TextView54.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView15.getText() == "X" && TextView15.getText() == TextView25.getText() &&
                TextView15.getText() == TextView35.getText() &&
                TextView15.getText() == TextView45.getText() &&
                TextView15.getText() == TextView55.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView11.getText() == "X" && TextView11.getText() == TextView22.getText() &&
                TextView11.getText() == TextView33.getText() &&
                TextView11.getText() == TextView44.getText() &&
                TextView11.getText() == TextView55.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView15.getText() == "X" && TextView15.getText() == TextView24.getText() &&
                TextView15.getText() == TextView33.getText() &&
                TextView15.getText() == TextView42.getText() &&
                TextView15.getText() == TextView51.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Computer wins.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView12.getText() &&
                TextView11.getText() == TextView13.getText() &&
                TextView11.getText() == TextView14.getText() &&
                TextView11.getText() == TextView15.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView21.getText() == "O" && TextView21.getText() == TextView22.getText() &&
                TextView21.getText() == TextView23.getText() &&
                TextView21.getText() == TextView24.getText() &&
                TextView21.getText() == TextView25.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView31.getText() == "O" && TextView31.getText() == TextView32.getText() &&
                TextView31.getText() == TextView33.getText() &&
                TextView31.getText() == TextView34.getText() &&
                TextView31.getText() == TextView35.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView41.getText() == "O" && TextView41.getText() == TextView42.getText() &&
                TextView41.getText() == TextView43.getText() &&
                TextView41.getText() == TextView44.getText() &&
                TextView41.getText() == TextView45.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView51.getText() == "O" && TextView51.getText() == TextView52.getText() &&
                TextView51.getText() == TextView53.getText() &&
                TextView51.getText() == TextView54.getText() &&
                TextView51.getText() == TextView55.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView21.getText() &&
                TextView11.getText() == TextView31.getText() &&
                TextView11.getText() == TextView41.getText() &&
                TextView11.getText() == TextView51.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView12.getText() == "O" && TextView12.getText() == TextView22.getText() &&
                TextView12.getText() == TextView32.getText() &&
                TextView12.getText() == TextView42.getText() &&
                TextView12.getText() == TextView52.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "O" && TextView13.getText() == TextView23.getText() &&
                TextView13.getText() == TextView33.getText() &&
                TextView13.getText() == TextView43.getText() &&
                TextView13.getText() == TextView53.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView14.getText() == "O" && TextView14.getText() == TextView24.getText() &&
                TextView14.getText() == TextView34.getText() &&
                TextView14.getText() == TextView44.getText() &&
                TextView14.getText() == TextView54.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView15.getText() == "O" && TextView15.getText() == TextView25.getText() &&
                TextView15.getText() == TextView35.getText() &&
                TextView15.getText() == TextView45.getText() &&
                TextView15.getText() == TextView55.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView11.getText() == "O" && TextView11.getText() == TextView22.getText() &&
                TextView11.getText() == TextView33.getText() &&
                TextView11.getText() == TextView44.getText() &&
                TextView11.getText() == TextView55.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView15.getText() == "O" && TextView15.getText() == TextView24.getText() &&
                TextView15.getText() == TextView33.getText() &&
                TextView15.getText() == TextView42.getText() &&
                TextView15.getText() == TextView51.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "You win.", Toast.LENGTH_LONG).show();
            return true;
        }
        /*if the texts in all the textViews have been changed
         *and there is no winner, then the game is a draw*/
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

        /*clears the arrayList*/
        List.clear();

        /*adds textViews to the arrayList*/
        List.add(TextView11);
        List.add(TextView12);
        List.add(TextView13);
        List.add(TextView14);
        List.add(TextView15);
        List.add(TextView21);
        List.add(TextView22);
        List.add(TextView23);
        List.add(TextView24);
        List.add(TextView25);
        List.add(TextView31);
        List.add(TextView32);
        List.add(TextView33);
        List.add(TextView34);
        List.add(TextView35);
        List.add(TextView41);
        List.add(TextView42);
        List.add(TextView43);
        List.add(TextView44);
        List.add(TextView45);
        List.add(TextView51);
        List.add(TextView52);
        List.add(TextView53);
        List.add(TextView54);
        List.add(TextView55);

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
