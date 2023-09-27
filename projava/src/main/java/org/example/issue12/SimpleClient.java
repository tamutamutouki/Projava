package org.example.issue12;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.ConnectException;
import java.net.SocketTimeoutException;

public class SimpleClient {
    public static void main(String[] args) throws IOException{
        try(var soc = new Socket("localhost",1700);
        OutputStream is = soc.getOutputStream())
        {
            is.write(234);
        }catch (ConnectException e){
            System.out.println("サーバーが起動していません");
        }
    }
}
