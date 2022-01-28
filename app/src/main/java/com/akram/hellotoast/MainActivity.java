package com.akram.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textAkram);
    }

    public void toast(View view) {
        tv.setText("0");
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }

    public void count(View view) {

        String st = "";
        st = tv.getText().toString();
        int c = Integer.parseInt(st);
        int count = c+1;
        tv.setText(Integer.toString(count));

    }
}