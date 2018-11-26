package com.strings;

import java.util.Arrays;

public class Splitting {
	public static String knights=
	    "Then, when you have found the shrubbery, you must " +
	    "cut down the mightiest tree in the forest... " +
	    "with... a herring!";
	
	public static void split(String regex) {
	    System.out.println(
            Arrays.toString(knights.split(regex)));
	}
	
	public static void main(String[] args) {
        split(" ");
        split("\\W+");
        //  逗号是非单词字符  空格是非单词字符 
        // 两者连在一起 识别的单位是 char吗
        
        split("n\\W+");
    }
}
