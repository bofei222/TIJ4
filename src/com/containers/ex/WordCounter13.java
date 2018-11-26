package com.containers.ex;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import static net.mindview.util.Print.*;
import com.containers.AssociativeArray;
import net.mindview.util.TextFile;

/**
 * @author bofei
 * @date 2017年8月23日 下午3:24:32 
 */
public class WordCounter13 {
    public static void main(String[] args) {
        // File whose words are to be counted:
        String fileName = "src/com/containers/ex/WordCounter13.java";
        // Set of unique words in file:
        Set<String> words = new TreeSet<String>(new TextFile(fileName, "\\W+"));
        // Create initialize array of correct length:
        AssociativeArray<String,Integer> wordCount =
            new AssociativeArray<String,Integer>(words.size());
        // Word list of all words in file:
        ArrayList<String> fileList = new TextFile(fileName, "\\W+");
        // Count appearances of each unique word and add to array:
        for(String s : words) {
            int count = 0;
            for(String t : fileList) {
                if(t.equals(s)) count++;
            }
            wordCount.put(s, count);
        }
        print(wordCount);
    }
}
