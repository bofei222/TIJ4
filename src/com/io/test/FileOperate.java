package com.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 文件读取
 * 1、按字节读取文件
 * 2、按字符读取文件
 * 3、按行读取文件
 * @author bofei
 *
 */
public class FileOperate {
    private static final String FILE_PATH = "D:/work/3.gz";
    
    //字节
   /* public static void readFileByByte(String filePath) {
        File file = new File(FILE_PATH);
        InputStream ins = null;
        try {
            ins = new FileInputStream(file);
            int temp;
            while ((temp = ins.read()) !=-1) {
                System.out.write(temp);
//                System.out.print(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ins !=null ) {
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    //字符
    public static void readFileByCharacter(String filePath) {
        File file = new File(FILE_PATH);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            int temp;
            while ((temp = reader.read()) != -1) {
                //if (((char)temp) != '\r') {
                    System.out.print((char)temp);
               // }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    //行
    public static void readFileByLine(String filePath) {
        File file = new File(filePath);
        BufferedReader buf =null;
        try {
            buf = new BufferedReader(new FileReader(file));
            String temp =null;
            while ((temp = buf.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buf != null) {
                try {
                    buf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
    
    
    //以字节为单位读写文件内容
    public static void readFileByByte(String filePath) {
        File file = new File(filePath);
        InputStream ins = null;
        OutputStream outs = null;
        try {
            ins = new FileInputStream(file);
            outs = new FileOutputStream("d:/work/readFileByByte.txt");
            int temp;
            while ((temp = ins.read()) != -1) {
                outs.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ins != null && outs !=null) {
                try {
                    ins.close();
                    outs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    //以字符为单位读写内容
    public static void readFileByCharactor(String filePath) {
        File file = new File(filePath);
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader(file);
            writer = new FileWriter("d:/work/readFileByCharactor.txt");
            int temp;
            while ((temp = reader.read()) != -1) {
//                System.out.print(((char)temp);
                writer.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null && writer !=null) {
                try {
                    reader.close();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //以行为单位读写文件内容
    public static void readFileByLine(String filePath) {
        File file = new File(filePath);
        BufferedReader bufReader = null;
        BufferedWriter bufWriter = null;
        InputStreamReader isr =null;
        try {
            bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"));
            bufWriter = new BufferedWriter(new FileWriter("d:/work/readFileByLine.gz"));
            String temp = null;
            while ((temp = bufReader.readLine()) != null) {
//                System.out.println(temp);
                bufWriter.write(temp);
                bufWriter.newLine();
//                bufWriter.newLine();
//                bufWriter.write(new String(temp.getBytes("GBK"),"utf-8") + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufReader != null && bufWriter !=null) {
                try {
                    bufReader.close();
                    bufWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //使用 nio ByteBuffer 字节将文件输出到另一个文件
    public static void readFileByByteBuffer(String filePath) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            //获取源文件和目标输出文件的输入输出流
            in = new FileInputStream(filePath);
            out = new FileOutputStream("f:\\1.");
            //获取 输入 和输出通道
            FileChannel fcIn = in.getChannel();
            FileChannel fcOut = out.getChannel();
            //1024 * 10 : 2401  1024 : 3748  1024 * 100 : 2400
            ByteBuffer buffer = ByteBuffer.allocate(1024 * 10);
            while (true) {
                // clear方法重设缓冲区，使他可以接受读入的数据
                buffer.clear();
                //从输入通道中将数据读取缓冲区
                int r = fcIn.read(buffer);
                if (r == -1) break;
                // flip 方法让缓冲区可以将新读入的数据写入另一份通道
                buffer.flip();
                fcOut.write(buffer);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in !=null && out !=null) {
                try {
                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //nio transferTo
    public static void transferTo(String filePath) throws IOException {
           
            FileChannel
                in = new FileInputStream(filePath).getChannel(),
                out = new FileOutputStream("F:\\1.vmem")
                    .getChannel();
            in.transferTo(0, in.size(), out);
        }
    
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
//        readFileByByte(FILE_PATH); // 9078
//        readFileByCharactor(FILE_PATH); // 528
//        readFileByLine(FILE_PATH);         // 94 187 697(80M) 4097(228M) 23953(660M)
//        readFileByByteBuffer(FILE_PATH); // 180 125 391(80M) 3031(228m) 3621(660M)
          transferTo("F:\\CentOS7\\564d453b-db3f-6921-7c96-741fb4de8e47.vmem"); // 1625(660M)
        long end =System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }
    
    
    
}
