package com.example.agefighters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MsgListener{

    TCPSingleton tcp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tcp = TCPSingleton.getInstance();
         tcp.start();
         tcp.setObserver(this);


    }



    @Override
    public void msgReceived(String msg) {
        if(msg.equals("conectado")){
            Intent i = new Intent(this,GameScreen.class);
            startActivity(i);}
    }
}