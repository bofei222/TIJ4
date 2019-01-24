package com.io.nio;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.*;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author bofei
 * @date 2019/1/24 18:45
 */
public class BuffTest {


    @Test
    public void test() {
        try {
            FileChannel fileChannel = new RandomAccessFile(new File("C:\\test\\0777\\zxcvbnm"), "rw").getChannel();
            // 写
            int p2 = 4;

            byte[] data = RandomStringUtils.randomAlphabetic(p2).getBytes();
            long position = 2L;
            ByteBuffer wrap = ByteBuffer.wrap(data);

            System.out.println(wrap.position());
            //指定 position 写入 4kb 的数据
            fileChannel.write(wrap, position);
//            从当前文件指针的位置写入 4kb 的数据
//            int write = fileChannel.write(wrap);
            System.out.println(wrap.position());
//            wrap.compact();
            wrap.clear();
            int write1 = fileChannel.write(wrap, 6);
            System.out.println(write1);

            System.out.println(new String(wrap.array()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void test2() throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("C:\\test\\0777\\zxcvbnm", "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf); //read into buffer.
        while (bytesRead != -1) {

            buf.flip();  //make buffer ready for read

            while (buf.hasRemaining()) {
                System.out.print((char) buf.get()); // read 1 byte at a time
            }

            buf.clear(); //make buffer ready for writing
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
