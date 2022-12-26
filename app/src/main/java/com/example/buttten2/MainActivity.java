package com.example.buttten2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    public void go(View view) {
        num++;
        if (num == 7)
        {
            num = 0;
            btn.setText("Enough to click. Go to new start");
        }
        else
        {
            String stra = num+" ";
            btn.setText("this is a click number: "+stra);
        }
    }
}