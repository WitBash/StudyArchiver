package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String pathTo = bufferedReader.readLine();
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(pathTo));
        String pathFrom  = bufferedReader.readLine();
        zipFileManager.createZip(Paths.get(pathFrom));

        ExitCommand exitCommand = new ExitCommand();
        exitCommand.execute();
    }
}
