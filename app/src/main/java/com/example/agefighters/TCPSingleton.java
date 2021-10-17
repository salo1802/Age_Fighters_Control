package com.example.agefighters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCPSingleton extends Thread{

    private static TCPSingleton puertoUnico;

    private TCPSingleton(){

    }

    private BufferedWriter writer;
    private Socket socket;
    private   String line;
    private MsgListener observer;
    public void setObserver(MsgListener observer){
        this.observer = observer;
    }
    @Override
    public void run() {
        try {
            //cambiar direccion ip
            socket = new Socket("10.0.2.2",5000);
            InputStream is = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            BufferedReader lector = new BufferedReader(new InputStreamReader(is));
            writer = new BufferedWriter(new OutputStreamWriter(out));

            while (true){
                line = lector.readLine();

                observer.msgReceived(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static TCPSingleton getInstance() {
        if(puertoUnico==null){
            puertoUnico = new TCPSingleton();
        }
        return puertoUnico;
    }

    public void sendMsg(String msg){
        new Thread(
                ()->{
                    try {
                        writer.write(msg+"\n");
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
        ).start();
    }


}
