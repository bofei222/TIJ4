package net.mindview.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list =new ArrayList();
		String[] s=new String[10];
		for(int i=0;i<5;i++)
			list.add("2");
		System.out.println(list);
		for(int i=0;i<4;i++)
			s[i]="1";
		System.out.println(Arrays.toString(s));
		
		s= (String[]) list.toArray(s);
		System.out.println(Arrays.toString(s));
	}
}
