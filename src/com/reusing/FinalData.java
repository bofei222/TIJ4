package com.reusing;

import java.util.Arrays;
import java.util.Random;
import static net.mindview.util.Print.*;

/**
 * @author bofei
 * @date 2017年8月16日 上午10:02:56 
 */
public class FinalData {
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id) { this.id = id; }
    // Can be compile-time constants:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // public 
    public static final int VALUE_THREE = 39;
    // cannot be compile-time constants
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    //
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    // arrays:
    private final int[] a ={1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }
    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        // fd1.valueOne++; error
        fd1.v2.i++; // 然而对象自身可以被修改
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++)
            fd1.a[i]++; // 然而对象自身可以被修改
        print(Arrays.toString(fd1.a)); // [2, 3, 4, 5, 6, 7]
        // fd1.v2 = new Value(222);  
        // fd1.VAL_3 = new Value(1);
        // fd1.a = new int[3];
        //error 对于对象引用，一旦值被初始化，指向一个对象，
        // 就不能在改变指向另一个对象
        print(fd1);
        print("creating new finalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);
    }
}

class Value {
    int i; // Package access
    public Value(int i ) { this.i = i; }
}

