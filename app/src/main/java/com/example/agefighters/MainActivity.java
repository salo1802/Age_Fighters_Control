package com.example.agefighters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView blueBtn, pinkBtn;
    private ImageView upBtn, downBtn, leftBtn, rightBtn;
    private ImageView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueBtn = findViewById(R.id.blueBtn);
        pinkBtn = findViewById(R.id.pinkBtn);
        upBtn = findViewById(R.id.upBtn);
        downBtn = findViewById(R.id.downBtn);
        leftBtn = findViewById(R.id.leftBtn);
        rightBtn = findViewById(R.id.rightBtn);


        blueBtn.setOnClickListener(
                (view) -> {
                    Toast.makeText(this, "blue", Toast.LENGTH_SHORT).show();
                }
        );
        pinkBtn.setOnClickListener(
                (view) -> {
                    Toast.makeText(this, "pink", Toast.LENGTH_SHORT).show();
                }
        );
        upBtn.setOnClickListener(
                (view) -> {
                    Toast.makeText(this, "up", Toast.LENGTH_SHORT).show();
                }
        );
        downBtn.setOnClickListener(
                (view) -> {
                    Toast.makeText(this, "down", Toast.LENGTH_SHORT).show();
                }
        );
        leftBtn.setOnClickListener(
                (view) -> {
                    Toast.makeText(this, "left", Toast.LENGTH_SHORT).show();
                }
        );
        rightBtn.setOnClickListener(
                (view) -> {
                    Toast.makeText(this, "right", Toast.LENGTH_SHORT).show();
                }
        );
    }
}