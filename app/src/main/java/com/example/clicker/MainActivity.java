package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;
    int bank=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new Click());
        text = (TextView)findViewById(R.id.text);

    class Click implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            bank++;
            text.setText(String.valueOf(bank));
        }
    }
}