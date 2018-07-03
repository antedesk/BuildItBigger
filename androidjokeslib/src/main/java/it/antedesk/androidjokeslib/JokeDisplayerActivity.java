package it.antedesk.androidjokeslib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    TextView mJokeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);

        mJokeTV = findViewById(R.id.joke_tv);
        String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        mJokeTV.setText(joke);

    }
}
