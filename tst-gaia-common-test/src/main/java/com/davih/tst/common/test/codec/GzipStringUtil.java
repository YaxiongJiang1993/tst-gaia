package com.davih.tst.common.test.codec;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipStringUtil {

    /**
     * 压缩字符串
     * @param input 需要压缩的字符串
     * @return 压缩后的字节数组
     */
    public static byte[] compressString(String input, String encoding) {
        try (
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream)
        ) {
            // 将字符串写入 GZIP 输出流进行压缩
            gzipOutputStream.write(input.getBytes(encoding));
            gzipOutputStream.finish(); // 强制完成写入
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解压字符串
     * @param compressedData 压缩后的字节数组
     * @return 解压后的字符串
     */
    public static String decompressString(byte[] compressedData, String encoding) {
        try (
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedData);
                GZIPInputStream gzipInputStream = new GZIPInputStream(byteArrayInputStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = gzipInputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }
            return byteArrayOutputStream.toString(); // 将解压后的字节数据转为字符串
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 测试代码
    public static void main(String[] args) {
        String inputString = "[\n" +
                "  {\n" +
                "    \"anonymous_id\": \"C57174DA-4D5B-4BA7-A7B5-E740B3070C4F\",\n" +
                "    \"distinct_id\": \"C57174DA-4D5B-4BA7-A7B5-E740B3070C4F\",\n" +
                "    \"event\": \"$AppStart\",\n" +
                "    \"time\": 1710407424971,\n" +
                "    \"type\": \"track\",\n" +
                "    \"identities\": {\n" +
                "        \"$identity_anonymous_id\": \"C57174DA-4D5B-4BA7-A7B5-E740B3070C4F\",\n" +
                "        \"$identity_idfv\": \"C57174DA-4D5B-4BA7-A7B5-E740B3070C4F\"\n" +
                "    },\n" +
                "    \"lib\": {\n" +
                "        \"$lib_version\": \"4.6.2\",\n" +
                "        \"$lib\": \"iOS\",\n" +
                "        \"$app_version\": \"1.4.1\",\n" +
                "        \"$lib_method\": \"autoTrack\"\n" +
                "    },\n" +
                "    \"properties\": {\n" +
                "        \"$os\": \"iOS\",\n" +
                "        \"$app_version\": \"1.4.1\",\n" +
                "        \"$lib_method\": \"code\",\n" +
                "        \"$lib_version\": \"4.6.2\",\n" +
                "        \"$os_version\": \"17.2\",\n" +
                "        \"$lib\": \"iOS\",\n" +
                "        \"$manufacturer\": \"Apple\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"anonymous_id\": \"C57174DA-4D5B-4BA7-A7B5-E740B3070C4F\",\n" +
                "    \"distinct_id\": \"your_customer_id\",\n" +
                "    \"login_id\": \"your_customer_id\", \n" +
                "    \"event\": \"$SignUp\",\n" +
                "    \"time\": 1710407424971,\n" +
                "    \"type\": \"track\",\n" +
                "    \"identities\": {\n" +
                "        \"$identity_anonymous_id\": \"C57174DA-4D5B-4BA7-A7B5-E740B3070C4F\",\n" +
                "        \"$identity_idfv\": \"C57174DA-4D5B-4BA7-A7B5-E740B3070C4F\",\n" +
                "        \"$identity_login_id\": \"your_customer_id\" \n" +
                "    },\n" +
                "    \"lib\": {\n" +
                "        \"$lib_version\": \"4.6.2\",\n" +
                "        \"$lib\": \"iOS\",\n" +
                "        \"$app_version\": \"1.4.1\",\n" +
                "        \"$lib_method\": \"code\"\n" +
                "    },\n" +
                "    \"properties\": {\n" +
                "        \"$os\": \"iOS\",\n" +
                "        \"$app_version\": \"1.4.1\",\n" +
                "        \"$lib_method\": \"code\",\n" +
                "        \"$lib_version\": \"4.6.2\",\n" +
                "        \"$os_version\": \"17.2\",\n" +
                "        \"$lib\": \"iOS\",\n" +
                "        \"$manufacturer\": \"Apple\",\n" +
                "        \"age\": 18\n" +
                "    }\n" +
                "  }\n" +
                "]";
        System.out.println("Original String: " + inputString);
        System.out.println("UnCompressed Data (in bytes): " + inputString.getBytes(StandardCharsets.UTF_8).length);

        // 压缩字符串
        byte[] compressedData = compressString(inputString, StandardCharsets.UTF_8.name());
        System.out.println("Compressed Data (in bytes): " + compressedData.length);

        // 解压字符串
        String decompressedString = decompressString(compressedData, StandardCharsets.UTF_8.name());
        System.out.println("Decompressed String: " + decompressedString);
    }
}

