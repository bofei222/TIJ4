package com.arrays;

import net.mindview.util.*;
import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.Collections;

public class Reverse{
	public static void main(String[] args) {
		CompType[] a=Generated.array(
			new CompType[12], CompType.generator());
		print("before sorting:");
		print(Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		print("after sorting:");
		print(Arrays.toString(a));
	}
}