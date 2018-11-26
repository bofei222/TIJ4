package com.strings;
import static net.mindview.util.Print.*;

public class Replacing {
	static String s=Splitting.knights;
	public static void main(String[] args) {
	  print(s.replaceFirst("f\\w+", "located"));
	  print(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
}

class Test7 {
    public static void main(String[] args) {
        String str = "Once upon a time.";
        System.out.println(str.matches("[A-Z].*\\."));
        
    }
}