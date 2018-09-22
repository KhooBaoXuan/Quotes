package com.buildwithlove.quotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button quoteButton;
    private TextView quoteTextView;

    QuoteServer qs = new QuoteServer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteCardText);

        quoteButton = findViewById(R.id.getQuotesButton);

        quoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                quoteTextView.setText(qs.getRandomQuote());
            }
        });
    }
}
