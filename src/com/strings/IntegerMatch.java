package com.strings;

public class IntegerMatch {
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d+"));
		
//		/*String str="ab.c";
//        System.out.println(str);
//        String str1=str.replaceAll("\\.", "/");
//        String str2=str.replace(".", "/");
//        System.out.println(str1);    //输出为：ab/c
//        System.out.println(str2);*/
        
//       String s ="sdf\\a\\aa"; 
//      //把s中的反斜杠\ 替换为\\ 
//      System.out.println(s); 
//      System.out.println(s.replaceAll("\\\\", "\\\\\\\\")); 
//      System.out.println(s.replace("\\", "\\\\")); 
//      System.out.println("\\\\\\\\");
	}
}
