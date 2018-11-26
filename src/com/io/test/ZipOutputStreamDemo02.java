package com.io.test;

import java.io.File ;  
import java.io.FileInputStream ;  
import java.io.InputStream ;  
import java.util.zip.ZipEntry ;  
import java.util.zip.ZipOutputStream ;  
import java.io.FileOutputStream ;  

public class ZipOutputStreamDemo02{  
    public static void main(String args[]) throws Exception{    // 所有异常抛出  
        File file = new File("d:" + File.separator + "work") ;  // 定义要压缩的文件夹  
        File zipFile = new File("d:" + File.separator + "work.zip") ;    // 定义压缩文件名称  
        InputStream input = null ;  // 定义文件输入流  
        ZipOutputStream zipOut = null ; // 声明压缩流对象  
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile)) ;  
        zipOut.setComment("www.mldnjava.cn") ;  // 设置注释  
        int temp = 0 ;  
        if(file.isDirectory()){ // 判断是否是文件夹  
            File lists[] = file.listFiles() ;   // 列出全部文件  
            for(int i=0;i<lists.length;i++){  
                input = new FileInputStream(lists[i]) ; // 定义文件的输入流  
                zipOut.putNextEntry(new ZipEntry(file.getName()  
                    +File.separator+lists[i].getName())) ;  // 设置ZipEntry对象 
                System.out.println("file.getName() " + file.getName());
                System.out.println("lists[i].getName() " + lists[i].getName());
                while((temp=input.read())!=-1){ // 读取内容  
                    zipOut.write(temp) ;    // 压缩输出  
                }  
                input.close() ; // 关闭输入流  
            }  
        }  
        zipOut.close() ;    // 关闭输出流  
    }  
};  