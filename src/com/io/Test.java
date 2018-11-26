package com.io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class Test {
	/*public static void main(String[] args)throws Exception {  
        File f = new File("./src/com/io");  
        MyFilter filter = new MyFilter(".java");  
        String[] files = f.list(filter);  
        for(String a:files){  
            System.out.println(a);  
        }  
    }  
    static class MyFilter implements FilenameFilter{  
        private String type;  
        public MyFilter(String type){  
            this.type = type;  
        }  
        public boolean accept(File dir,String name){ 
        	////dir表示文件的当前目录，name表示文件名；
            return name.endsWith(type);  
        }  
    }*/  
	
/*	public static void main(String[] args) {	
		File f=new File("./");// "./"   "."   "/"
		File[] listFiles = f.listFiles();
		for(File f1:listFiles){
			System.out.println(f1);
		}
		System.out.println("-------------------------");
		String[] list = f.list();
		for(String s:list)
			System.out.println(s);
	}*/
	
	/*public static void main(String[] args) throws IOException {
		File f=new File("src/com/io");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
	}*/
	
/*	static {System.out.println("1");}
	static {System.out.println("2");}
	public Test(){
		System.err.println("3");
	}
	public static void main(String[] args) {
		new Test();
	}*/
}
