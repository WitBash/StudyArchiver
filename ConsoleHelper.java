package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        writeMessage("Введите команду...");
        String stringMes = bufferedReader.readLine();
        return stringMes;
    }

    public static int readInt()throws IOException{
        writeMessage("Введите число...");
        Integer intMes = Integer.parseInt(readString());
        return intMes;
    }
}
