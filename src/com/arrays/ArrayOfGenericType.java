package com.arrays;

public class ArrayOfGenericType<T>{
	T[] array;
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size){
		array=(T[]) new Object[size];
	}
	public static void main(String[] args) {
        
    }
}