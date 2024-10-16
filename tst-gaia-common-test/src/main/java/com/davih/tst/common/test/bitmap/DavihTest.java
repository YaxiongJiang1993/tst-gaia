package com.davih.tst.common.test.bitmap;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteSource;
import org.openjdk.jol.info.ClassLayout;
import org.roaringbitmap.longlong.Roaring64NavigableMap;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class DavihTest {

    public static void main(String[] args) {
        printObj();
    }

    public static void printObj(){
        String directory = "/home/david/test/";
        String simpleFileName = "15f272115c264b898e5aa2bdc859a794_1723538767446.txt";
        String fileName = directory.concat(simpleFileName);
        // 从文件中读取 Base64 字符串
        String readBase64String = readBase64StringFromFile(fileName);

        // 将 Base64 字符串反序列化为 Roaring64NavigableMap
        Roaring64NavigableMap deserializedMap = deserializeFromBase64(readBase64String);
        System.out.println("size: "+deserializedMap.getLongCardinality());
        System.out.println(ClassLayout.parseInstance(deserializedMap).toPrintable());
    }

    // 将 Base64 字符串写入文件
    public static void writeBase64StringToFile(String base64String, String filename) {
        Path path = Paths.get(filename);
        try {
            Files.write(path, base64String.getBytes(StandardCharsets.UTF_8));
            String md5 = getMD5(filename);
            System.out.println("Base64 String written to file successfully, md5" + md5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 从文件中读取 Base64 字符串
    private static String readBase64StringFromFile(String filename) {
        Path path = Paths.get(filename);
        try {
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 将 Base64 字符串反序列化为 Roaring64NavigableMap
    private static Roaring64NavigableMap deserializeFromBase64(String base64String) {
        byte[] byteArray = Base64.getDecoder().decode(base64String);
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArray))) {
            return (Roaring64NavigableMap) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 序列化 Roaring64NavigableMap 到文件
    private static void serializeToFile(Roaring64NavigableMap map, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(map);
            System.out.println("Serialization successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 从文件反序列化 Roaring64NavigableMap
    private static Roaring64NavigableMap deserializeFromFile(String filename) {
        Roaring64NavigableMap map = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            map = (Roaring64NavigableMap) ois.readObject();
            System.out.println("Deserialization successful.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return map;
    }


    private static String serialize(Roaring64NavigableMap bitmap) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            bitmap.serialize(new DataOutputStream(bos));
        } catch (IOException e) {
            throw new RuntimeException("bitMap序列化失败");
        }
        byte[] bout = bos.toByteArray();
        return Base64.getEncoder().encodeToString(bout);
    }

    private static Roaring64NavigableMap deserialize(String encrypt) {
        Roaring64NavigableMap bitmap = new Roaring64NavigableMap();
        byte[] bout = Base64.getDecoder().decode(encrypt);
        try {
            bitmap.deserialize(new DataInputStream(new ByteArrayInputStream(bout)));
        } catch (IOException e) {
            throw new RuntimeException("bitMap反序列化失败");
        }
        return bitmap;
    }

    private static String getMD5(String filePath) {
        File file = new File(filePath);
        ByteSource byteSource = com.google.common.io.Files.asByteSource(file);
        HashCode hc = null;
        try {
            hc = byteSource.hash(Hashing.md5());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String checksum = hc.toString();
        return checksum;
    }

    private static String getSHA256(String originalString) {
        String sha256hex = Hashing.sha256()
                .hashString(originalString, StandardCharsets.UTF_8)
                .toString();
        return sha256hex;
    }
}
