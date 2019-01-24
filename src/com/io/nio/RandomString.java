package com.io.nio;


import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Random;

/**
 * @Author bofei
 * @Date 2019/1/24 13:11
 * @Description
 */
public class RandomString {


    @Test
    public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() throws IOException {
//        byte[] array = new byte[1024*1024]; // length is bounded by 7
//        new Random().nextBytes(array);
        int a = new Random().nextInt();
        System.out.println(a);
//        long l = new Random().nextLong();
//        System.out.println(l);
//        String generatedString = new String(array, Charset.forName("UTF-8"));

        File file = new File("D:\\bofei\\test\\nio-data3.txt");
        OutputStream os = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        for (int i = 0; i < 10 * 1024 * 1024; i++) {
            bos.write(a);
        }

//        System.out.println(generatedString);
    }
    @Test
    public void givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 1024*1024;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        System.out.println(generatedString);
    }
}
