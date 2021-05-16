package com.javarush.task.task31.task3110;

import java.nio.file.Path;

public class ZipFileManager {
    //храним полный путь к архиву с которым будем работать
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }
    //Path source - это путь к чему то, что мы будем архивировать
    public void createZip(Path source) throws Exception{

    }
}
