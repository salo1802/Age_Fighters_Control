package com.example.agefighters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class GameScreen extends AppCompatActivity {

    private ImageView blueBtn, pinkBtn;
    private ImageView upBtn, downBtn, leftBtn, rightBtn;
    private ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        blueBtn = findViewById(R.id.blueBtn);
        pinkBtn = findViewById(R.id.pinkBtn);
        upBtn = findViewById(R.id.upBtn);
        downBtn = findViewById(R.id.downBtn);
        leftBtn = findViewById(R.id.leftBtn);
        rightBtn = findViewById(R.id.rightBtn);

        TCPSingleton tcp = TCPSingleton.getInstance();

        blueBtn.setOnClickListener(
                (view) -> {
                    tcp.sendMsg("blue");
                }
        );
        pinkBtn.setOnClickListener(
                (view) -> {
                    tcp.sendMsg("pink");
                }
        );
        upBtn.setOnClickListener(
                (view) -> {
                    tcp.sendMsg("up");
                }
        );
        downBtn.setOnClickListener(
                (view) -> {
                    tcp.sendMsg("down");
                }
        );
        leftBtn.setOnClickListener(
                (view) -> {
                    tcp.sendMsg("left");
                }
        );
        rightBtn.setOnClickListener(
                (view) -> {
                    tcp.sendMsg("right");
                }
        );
    }
}