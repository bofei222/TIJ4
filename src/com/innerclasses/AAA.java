package com.innerclasses;

import com.innerclasses.AAA.B;

public class AAA {
	static class B{
		static int a=1;
	}
	public static void main(String[] args) {
		System.out.println("A");
	}

}

class Q{
	B b= new AAA.B();
	public static void main(String[] args) {
		System.out.println(AAA.B.a);
	}
}
//class Q{
//	public static void main(String[] args) {
//		System.out.println(2);
//	}
//}
//public class AAA{
//	public static void main(String[] args) {
//		System.out.println(1);
//	}
//}

