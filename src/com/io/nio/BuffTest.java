package com.io.nio;

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
            byte[] data = new byte[3];
            long position = 10L;
            //指定 position 写入 4kb 的数据
            fileChannel.write(ByteBuffer.wrap(data), position);
            //从当前文件指针的位置写入 4kb 的数据
            fileChannel.write(ByteBuffer.wrap(data));
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
