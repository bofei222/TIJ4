package com.arrays;

import java.util.Arrays;

public class ThreeDWithNew {
	public static void main(String[] args) {
		//3-D array with fixed length:
		int[] b=new int[1];
		System.out.println(Arrays.toString(b));
		int[][][] a = new int[1][1][4];
		System.out.println(Arrays.deepToString(a));
	}
}
