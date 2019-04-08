package com.containers;
import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

import net.mindview.util.CountingMapData;

public class Maps {
    public static void printKeys(Map<Integer, String> map) {
        printnb("Size = " + map.size() + ", ");
        printnb("Keys: " );
        print(map.keySet());
    }

    public static void test(Map<Integer, String> map) {
        print(map.getClass().getSuperclass());
        map.putAll(new CountingMapData(25));
        //
        map.putAll(new CountingMapData(25));
        printKeys(map);
        //
        printnb("Values: ");
        print(map.values());
        print(map);
        print("map.containsKey(11): " + map.containsKey(11));
        print("map.get(11): " + map.get(11));
        print("map.containsValue(\"F0\")" + map.containsValue("F0"));


    }

    public static void main(String[] args) {
        test(new HashMap<Integer,String>());
        test(new TreeMap<Integer,String>());
        test(new LinkedHashMap<Integer,String>());
        test(new IdentityHashMap<Integer,String>());
        test(new ConcurrentHashMap<Integer,String>());
        test(new WeakHashMap<Integer,String>());
    }
}
