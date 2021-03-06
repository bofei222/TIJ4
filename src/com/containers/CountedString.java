package com.containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static net.mindview.util.Print.*;

/**
 * @author bofei
 * @date 2017年8月23日 下午2:39:35 
 */
public class CountedString {
    private static List<String> created = 
        new ArrayList<String>();
    private String s;
    private int id = 0;
    public CountedString(String str) {
        s = str;
        created.add(s);
        // id is the total
        //
        for (String s2 : created)
            if (s2.equals(s))
                id++;
    }
    public String toString() {
        return "String: " + s + " id" + id +
            " hashCode(): " + hashCode();
    }
    public int hashCode() {
        // The very simple approach:
//        return s.hashCode() * id;
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }
    public boolean equals(Object o) {
        return o instanceof CountedString &&
            s.equals(((CountedString)o).s) &&
            id == ((CountedString)o).id;
    }
    public static void main(String[] args) {
        Map<CountedString,Integer> map = new HashMap();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i], i);
        }
        print(map);
        for (CountedString cstring : cs) {
            print("Looking up " + cstring);
            print(map.get(cstring));
        }
    }
}
