package org.example;

public class RecLoop {
    public static void main(String[] arg){
        loop(0);
    }

    static void loop(int i){
        if( i >= 5){
            return;
        }
        System.out.println(i);
        loop(i+1);
    }
}
