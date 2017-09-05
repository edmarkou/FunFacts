package com.edmarkou.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private TextView mFactTextView;
    private Button getFactButton;
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView = (TextView) findViewById(R.id.funFactView);
        getFactButton = (Button) findViewById(R.id.getFunFact);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {

                mFactTextView.setText(factBook.getFact());
                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                getFactButton.setTextColor(color);
            }
        };
        getFactButton.setOnClickListener(listener);
        Toast.makeText(this, "Fun fact app is running!", Toast.LENGTH_SHORT).show();
    }
}
