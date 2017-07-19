package com.grademojo.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textEleVator10, textEleVator20, textElevator30, textEleVator0;
    private CardView mainCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEleVator10 = (TextView) findViewById(R.id.first);
        textEleVator20 = (TextView) findViewById(R.id.second);
        textElevator30 = (TextView) findViewById(R.id.third);
        textEleVator0 = (TextView) findViewById(R.id.fourth);

        mainCardView = (CardView) findViewById(R.id.card);




        textEleVator10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     mainCardView.setCardElevation(10);
            }
        });


        textEleVator20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainCardView.setCardElevation(20);
            }
        });


        textElevator30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainCardView.setCardElevation(30);
            }
        });


        textEleVator0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainCardView.setCardElevation(0);
            }
        });
    }
}
