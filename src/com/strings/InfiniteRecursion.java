package com.strings;

import java.util.*;

public class InfiniteRecursion {
    public String toString() {
        // 相当于 " InfiniteRecursion address: " + this.toString() + "\n";
        return " InfiniteRecursion address: " + this + "\n";
    }
    public static void main(String[] args) {
        List<InfiniteRecursion> v =
            new ArrayList<InfiniteRecursion>();
        for (int i = 0; i <10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}
