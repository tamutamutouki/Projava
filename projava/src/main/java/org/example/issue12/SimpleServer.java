package org.example.issue12;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException{
        var server = new ServerSocket(1700);
        System.out.println("Waiting...");
        // クライアントからの接続を確認
        try (Socket soc = server.accept();
             InputStream input = soc.getInputStream()) {
            System.out.println("connect from" + soc.getInetAddress());
            System.out.println(input.read());
        }
    }

}
