package com.io.nio;

import java.io.*;
import java.util.Random;

/**
 * @Author bofei
 * @Date 2019/1/24 12:37
 * @Description
 */
public class Test {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\bofei\\test\\nio-data.txt");
        if (!file.exists())
            file.createNewFile();
        Random random = new Random();

        OutputStream os = new FileOutputStream(file);
        byte[] b = new byte[1024];
        BufferedOutputStream bos = new BufferedOutputStream(os);
        for (int i = 0; i < 1024; i++) {
//            int i1 = random.nextInt(10);
//            System.out.println(i1);
            bos.write(b);
        }
    }
}
