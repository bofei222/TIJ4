package com.io.nio;

import org.junit.*;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author bofei
 * @date 2019/1/25 9:21
 */
public class ByteTest {
    @org.junit.Test
    public void test1() throws IOException {
        byte b1 = 0b00000011, b2 = 0b00000001, b3 = 0b00000000, b4 = 0b00000010;
        byte b5 = 0x15;
        byte b6 = 015;
        byte b7 = 15;
        byte b9 = 127;
        byte b8 = 0b10;
//        Double d = 2d;
//        Float f = 2.0f;


        OutputStream os = new FileOutputStream("C:\\test\\0777\\zxcvbnm");
        os.write(b9);
        os.close();
        System.out.println("---" + 0x03);
        System.out.println(b1 +" " + b2 + " " + b3 + b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
    }

    // Java语言的整型常数默认为int型，声明long型常量可以后加‘ l ’或‘ L ’ 。
    @Test
    public void test2() {
        long a = 55555555;  //编译成功，在int表示的范围内(21亿内)。
        long b = 55555555555l;//不加L编译错误，已经超过int表示的范围。
        System.out.println(a);
        System.out.println(b);

    }
}
