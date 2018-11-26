package com.io.test;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("random");
        if(!file.exists()) {
            file.mkdir();
        }
        File fileName=new File(file,"javaio.txt");
        if(!fileName.exists()) {
            fileName.createNewFile();//创建文件
        }
/*        int a = 65;
        System.out.write(a);
        System.out.println();
        System.out.println(a);*/
        
/*        char c = 'A' + 1;
        char c2 = (char) (c +1);
        System.out.println(c);
        System.out.println(c2);*/
        
    /*    long l = 123456789L;
        float f = l;
        System.out.println(f);*/
        
        /*File file = new File("D:\\Test.txt");
        System.out.println(file.getCanonicalFile());*/
/*        System.out.println(System.getProperty("property.name"));
        System.setProperty("property.name", "feibo");
    }*/
        /*        char  c = 'a';
        System.out.write(c);
        System.out.write('\n');
        
        System.out.println(c);*/
        
 /*       int a =97;
        System.out.write(a);
//        System.out.write('\n');
        System.out.println();
        System.out.println(a);*/
        
        char b = 'a' + 18;
        int i =b;
        System.out.println(b);
        System.out.println(i);
        char a = 'a';
        System.out.println(a);
        //char b2 = a + 18;
    }
    
}
