package com.davih.tst.common.test.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

public class FileSplitTest {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/david/Downloads/hadoop-3.2.1.tar.gz");
        long start = System.currentTimeMillis();
        String parentDir = "/tmp/test";
        String uuid = "3a6d0693e57340b6b5acacf6b25af8d0";
//        String uuid = UUID.randomUUID().toString().replace("-", "");
        String dir = parentDir.concat("/").concat(uuid);
//        splitFile(file, 10, dir); // 每块 10MB
        mergeFiles(dir, "hadoop-3.2.1.tar.gz", "hadoop-3.2.1.tar.gz");
        System.out.println("waste: " + (System.currentTimeMillis() - start));
    }

    public static void splitFile(File sourceFile, int chunkSizeMB, String outputDir) throws IOException {
        File dir = new File(outputDir);
        if (!dir.exists()) {
            boolean createdRes = dir.mkdirs();
            if (!createdRes) {
                throw new RuntimeException("create outputDir exception");
            }
        }
        int chunkSize = chunkSizeMB * 1024 * 1024; // 每片大小（字节）
        byte[] buffer = new byte[8192]; // 缓冲区 8KB
        int partCounter = 1;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile))) {
            boolean endOfFile = false;

            while (!endOfFile) {
                File partFile = new File(outputDir, sourceFile.getName() + ".part" + partCounter++);
                try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(partFile))) {
                    int currentPartSize = 0;

                    while (currentPartSize < chunkSize) {
                        int maxToRead = Math.min(buffer.length, chunkSize - currentPartSize);
                        int bytesRead = bis.read(buffer, 0, maxToRead);

                        if (bytesRead == -1) {
                            endOfFile = true; // 设置终止标志
                            break;
                        }

                        out.write(buffer, 0, bytesRead);
                        currentPartSize += bytesRead;
                    }
                }
            }
        }
    }


    public static void mergeFiles(String dirPath, String partPrefix, String mergedFileName) throws IOException {
        File dir = new File(dirPath);
        File[] partFiles = dir.listFiles((dir1, name) -> name.startsWith(partPrefix));

        if (partFiles == null || partFiles.length == 0) {
            throw new FileNotFoundException("No part files found with prefix: " + partPrefix + " in " + dirPath);
        }

        // 排序 part1、part2...
        Arrays.sort(partFiles, Comparator.comparingInt(f -> {
            String name = f.getName();
            try {
                return Integer.parseInt(name.substring(name.lastIndexOf("part") + 4));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid part file name: " + name, e);
            }
        }));

        File outputFile = new File(dirPath, mergedFileName);
        try (BufferedOutputStream mergingStream = new BufferedOutputStream(new FileOutputStream(outputFile))) {
            byte[] buffer = new byte[8192];
            for (File partFile : partFiles) {
                System.out.println("Merging: " + partFile.getName());
                try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(partFile))) {
                    int bytes;
                    while ((bytes = in.read(buffer)) != -1) {
                        mergingStream.write(buffer, 0, bytes);
                    }
                }
            }
        }
        System.out.println("Merge completed: " + outputFile.getAbsolutePath());
    }

}
