package com.javarush.task.task31.task3110;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {
    //храним полный путь к архиву с которым будем работать
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    //Path source - это путь к чему то, что мы будем архивировать
    public void createZip(Path source) throws Exception {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
             InputStream inputStream = Files.newInputStream(source)) {
            String[] stringPath = source.toString().split("/");
            ZipEntry zipEntry = new ZipEntry(stringPath[stringPath.length - 1]);

            zipOutputStream.putNextEntry(zipEntry);
            while (inputStream.available() > 0) {
                int b = inputStream.read();
                zipOutputStream.write(b);
            }
            zipOutputStream.closeEntry();
        } catch (IOException e) {

        }
    }
}

