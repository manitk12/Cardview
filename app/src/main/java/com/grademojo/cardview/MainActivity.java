package com.grademojo.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView eleVator10 ,eleVator20 ,eleVator30 ,eleVator0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eleVator10 = (TextView) findViewById(R.id.first);
        eleVator20 = (TextView) findViewById(R.id.second);
        eleVator30 = (TextView) findViewById(R.id.third);
        eleVator0 = (TextView) findViewById(R.id.fourth);




        eleVator10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
