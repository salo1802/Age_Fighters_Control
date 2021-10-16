package com.example.agefighters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TCPSingleton tcp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tcp = TCPSingleton.getInstance();
         tcp.start();
            esperandoConexion();

    }

    public void esperandoConexion(){
        new Thread(()->{
            while (true){
            if(tcp.getLine()!=null){
                Intent i = new Intent(this,GameScreen.class);
                startActivity(i);
            } }
        }).start();
    }
}