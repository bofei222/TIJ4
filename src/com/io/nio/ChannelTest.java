package com.io.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Random;

public class ChannelTest {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\test\\0777\\zxcvbnm");
        RandomAccessFile aFile = new RandomAccessFile(file, "rw");
        FileChannel inChannel = aFile.getChannel();
         
        ByteBuffer buf = ByteBuffer.allocate(4 * 1024);
        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1) {
        System.out.println("Read " + bytesRead);
        buf.flip();
        while(buf.hasRemaining()){
        System.out.print((char) buf.get());
        }
        buf.clear();
        bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
