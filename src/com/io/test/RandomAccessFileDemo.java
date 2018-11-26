package com.io.test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("random");
        if(!file.exists()) {
            file.mkdir();
        }
        File fileName=new File(file,"javaio.txt");
        if(!fileName.exists()) {
            fileName.createNewFile();//创建文件
        }
        //创建一个RandomAccessFile的对象,并指定模式rw，能读能写，
        //注意：必须是文件，不能是路径
        RandomAccessFile raf=new RandomAccessFile(fileName,"rw");
        //获取此时的文件指针的位置，起始位置为0
        System.out.println(raf.getFilePointer());
        //向文件中写入字符A，字符类型有两个字节，但她写入的是后八位的字节
        //字符A正好可以用后八位的字节表示出来
        raf.write('A');
        //字符的位置会自动向后移动,文件指针会向后自动移动
        System.out.println("输入一个字符之后，文件指针的位置"+raf.getFilePointer());
        raf.write('B');
        System.out.println("输入二个字符之后，文件指针的位置"+raf.getFilePointer());
        
        
        //每次write只能写入一个字节，如果要把i写进去，就需要写四次
        int i=0x7fffffff;
        raf.write(i>>>24 & 0xff);//写入高八位的
        raf.write(i>>>16 & 0xff);
        raf.write(i>>>8   & 0xff);
        raf.write(i);//写入低八位
        System.out.println("写入整数的时候文件指针的位置是"+raf.getFilePointer());
        
        
        /**
         * writeInt()的内置方法
         *  public final void writeInt(int v) throws IOException {
        write((v >>> 24) & 0xFF);
        write((v >>> 16) & 0xFF);
        write((v >>>  8) & 0xFF);
        write((v >>>  0) & 0xFF);
        //written += 4;
    }
         */
        
        //也可以直接写入int整数
        raf.writeInt(i);
        
        //写入一个汉字,汉字为两个字节
        String str="欢迎学习java";
        byte[] b=str.getBytes("gbk");
        raf.write(b);
        System.out.println("此时的长度为"+raf.length());
        
        
        //读文件必须将文件指针放在开头位置
        raf.seek(0);
        byte[] buf=new byte[(int)raf.length()];
        raf.read(buf);//将内容写入buf字节数组中
        
        String  str1=new String(buf,"gbk");
        System.out.println("文件中的内容为"+str1);
        raf.close();
    }
}
