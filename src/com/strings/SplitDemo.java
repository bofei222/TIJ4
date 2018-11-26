package com.strings;

import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.regex.Pattern;
/**
 * @author bofei
 * @date 2017年10月13日 下午4:37:19 
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input =
            "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // Only do the first three:
        print(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
    }
}

class SplitDemo14 {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(input.split("!!")));
        // Only do the first three:
        print(Arrays.toString(input.split("!!", 3)));
    }
}