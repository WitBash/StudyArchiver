package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ZipCommand implements Command{

    public ZipFileManager getZipFileManager() throws Exception{
        ConsoleHelper.writeMessage("Введите полный путь файла архива");
        String stringPath = ConsoleHelper.readString();
        Path filePath = Paths.get(stringPath);
        ZipFileManager zipFileManager = new ZipFileManager(filePath);
        return zipFileManager;
    }
}
