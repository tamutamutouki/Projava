package org.example.issue12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Writefile {
    public static void main(String[] args) {

            try{
                var message = """
                    test message
                    """;
                var p = Path.of(""); //パスを認識させず例外を発生させる
                Files.writeString(p,message);
            } catch (IOException e) {
                e.printStackTrace(); //スタックトレースを出力する　https://itsakura.com/java_printstacktrace
            }
        }
    }
