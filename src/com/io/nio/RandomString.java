package com.io.nio;


import org.junit.Test;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author bofei
 * @Date 2019/1/24 13:11
 * @Description
 */
public class RandomString {


    @Test
    public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() throws IOException {
        byte[] array = new byte[32]; // length is bounded by 7
        new Random().nextBytes(array);
//        0123 12131 12351 1231 1233 12341
        String s = "一";
        String s2 = "a";
        String s3 = "!";
        String s4 = "1";
        byte b5 = 41;
        char c = (char) b5; // c = ')' ASCII
        byte b6 = 49;
        char c2 = (char) b6; // c2 = '1' ASCII
        byte[] b = s.getBytes();
        byte[] b2 = s2.getBytes();
        byte[] b3 = s3.getBytes();
        byte[] b4 = s4.getBytes();
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(b4));
        System.out.println(new String(b4));
        System.out.println();
//        String generatedString = new String(bytes);
//        System.out.println(generatedString);
//        System.out.println(new String(array));
//

//        OutputStream os = new FileOutputStream("C:\\test\\0777\\zxcvbnm");
//        os.write(array);
//        os.close();

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
