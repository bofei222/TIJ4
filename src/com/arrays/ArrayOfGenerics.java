package com.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author bofei
 * @date 2017年9月20日 上午8:53:08
 */
public class ArrayOfGenerics{
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
	    List<String>[] ls;
	    List[] la = new List[10];
		ls=la;
		ls[0]=new ArrayList<String>();
		//!ls[1]=new ArrayList<Integer>();
		
		//
		Object[] objects=ls;
		objects[1]=new ArrayList<Integer>();
		
		//
		List<BerylliumSphere>[] spheres=
			(List<BerylliumSphere>[])new List[10];
		for(int i=0;i<spheres.length;i++)
			spheres[i]=new ArrayList<BerylliumSphere>();
		
	}
}
