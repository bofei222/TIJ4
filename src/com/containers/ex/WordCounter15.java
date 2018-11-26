package com.containers.ex;
import static net.mindview.util.Print.print;

import java.util.ArrayList;
import java.util.Iterator;

import com.containers.AssociativeArray;
import com.containers.SlowMap;

/**
 * @author bofei
 * @date 2017年8月23日 下午3:40:53 
 */
import net.mindview.util.TextFile;

public class WordCounter15 {
    public static void main(String[] args) {
        // File whose words are to be counted:
        String fileName = "src/com/containers/ex/WordCounter15.java";
        // List of all words in file:
        ArrayList<String> wordList = new TextFile(fileName, "\\W+");
        SlowMap<String,Integer> wordCount = new SlowMap<String,Integer>();
//        AssociativeArray<String,Integer> wordCount =
//                new AssociativeArray<String,Integer>(1000);
        Iterator it = wordList.iterator();
        while(it.hasNext()) {
            String s = (String)it.next();
            if(!(wordCount.containsKey(s))) wordCount.put(s,1);
            else {
                int count = wordCount.get(s);
                wordCount.put(s, ++count);
            }
        }
        print(wordCount);       
    }
}