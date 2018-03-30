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

    ArrayList<TextView> List;

    int playerXScore = 0;
    int playerOScore = 0;

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

        ((TextView)findViewById(R.id.player_one)).setText("Player");
        ((TextView)findViewById(R.id.player_two)).setText("Computer");

        List = new ArrayList<TextView>();
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

        TextView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView11.getText().toString().equals("")) {
                    TextView11.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView11);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView12.getText().toString().equals("")) {
                    TextView12.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView12);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView13.getText().toString().equals("")) {
                    TextView13.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView13);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView14.getText().toString().equals("")) {
                    TextView14.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView14);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView21.getText().toString().equals("")) {
                    TextView21.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView21);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView22.getText().toString().equals("")) {
                    TextView22.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView22);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView23.getText().toString().equals("")) {
                    TextView23.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView23);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView24.getText().toString().equals("")) {
                    TextView24.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView24);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView31.getText().toString().equals("")) {
                    TextView31.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView31);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView32.getText().toString().equals("")) {
                    TextView32.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView32);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView33.getText().toString().equals("")) {
                    TextView33.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView33);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView34.getText().toString().equals("")) {
                    TextView34.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView34);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView41.getText().toString().equals("")) {
                    TextView41.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView41);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView42.getText().toString().equals("")) {
                    TextView42.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView42);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView43.getText().toString().equals("")) {
                    TextView43.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView43);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });

        TextView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextView44.getText().toString().equals("")) {
                    TextView44.setText("X");
                    if (checkWinner()) {
                        return;
                    }
                    List.remove(TextView44);
                    if (List.size() == 0) {
                        return;
                    }
                    Random rand = new Random();
                    final int randomNumber = rand.nextInt(List.size() + 0);
                    TextView computerPlay = List.get(randomNumber);
                    computerPlay.setText("O");
                    checkWinner();
                    List.remove(randomNumber);
                }
            }
        });
    }

    public boolean checkWinner() {
        if (TextView11.getText() == "X" && TextView11.getText() == TextView12.getText() && TextView11.getText() == TextView13.getText() && TextView11.getText() == TextView14.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView21.getText() == "X" && TextView21.getText() == TextView22.getText() && TextView21.getText() == TextView23.getText() && TextView21.getText() == TextView24.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView31.getText() == "X" && TextView31.getText() == TextView32.getText() && TextView31.getText() == TextView33.getText() && TextView31.getText() == TextView34.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView41.getText() == "X" && TextView41.getText() == TextView42.getText() && TextView41.getText() == TextView43.getText() && TextView41.getText() == TextView44.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "X" && TextView11.getText() == TextView21.getText() && TextView11.getText() == TextView31.getText() && TextView11.getText() == TextView41.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView12.getText() == "X" && TextView12.getText() == TextView22.getText() && TextView12.getText() == TextView32.getText() && TextView12.getText() == TextView42.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "X" && TextView13.getText() == TextView23.getText() && TextView13.getText() == TextView33.getText() && TextView13.getText() == TextView43.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView14.getText() == "X" && TextView14.getText() == TextView24.getText() && TextView14.getText() == TextView34.getText() && TextView14.getText() == TextView44.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }

        if (TextView11.getText() == "X" && TextView11.getText() == TextView22.getText() && TextView11.getText() == TextView33.getText() && TextView11.getText() == TextView44.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView14.getText() == "X" && TextView14.getText() == TextView23.getText() && TextView14.getText() == TextView32.getText() && TextView14.getText() == TextView41.getText()) {
            disableTextViews();
            playerXScore++;
            displayXScore();
            Toast.makeText(this, "Player X has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView12.getText() && TextView11.getText() == TextView13.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Player O has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView21.getText() == "O" && TextView21.getText() == TextView22.getText() && TextView21.getText() == TextView23.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Player O has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView31.getText() == "O" && TextView31.getText() == TextView32.getText() && TextView31.getText() == TextView33.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Player O has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView21.getText() && TextView11.getText() == TextView31.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Player O has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView12.getText() == "O" && TextView12.getText() == TextView22.getText() && TextView12.getText() == TextView32.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Player O has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "O" && TextView13.getText() == TextView23.getText() && TextView13.getText() == TextView33.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Player O has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() == "O" && TextView11.getText() == TextView22.getText() && TextView11.getText() == TextView33.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Player O has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView13.getText() == "O" && TextView13.getText() == TextView22.getText() && TextView13.getText() == TextView31.getText()) {
            disableTextViews();
            playerOScore++;
            displayOScore();
            Toast.makeText(this, "Player O has won", Toast.LENGTH_LONG).show();
            return true;
        }
        if (TextView11.getText() != "" && TextView12.getText() != "" && TextView13.getText() != "" && TextView14.getText() != "" && TextView21.getText() != "" && TextView22.getText() != "" && TextView23.getText() != "" && TextView24.getText() != "" && TextView31.getText() != "" && TextView32.getText() != "" && TextView33.getText() != "" && TextView34.getText() != "" && TextView41.getText() != "" && TextView42.getText() != "" && TextView43.getText() != "" && TextView44.getText() != "") {
            disableTextViews();
            Toast.makeText(this, "Game is a draw.", Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
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

        List.clear();
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

    public void displayXScore() {
        ((TextView) findViewById(R.id.player_x_score)).setText(String.valueOf(playerXScore));
    }

    public void displayOScore() {
        ((TextView) findViewById(R.id.player_o_score)).setText(String.valueOf(playerOScore));
    }
}
