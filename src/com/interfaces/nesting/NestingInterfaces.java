package com.interfaces.nesting;

class A{
	interface B{
		void f();
	}
	public class BImp implements B{
		public void f(){}
	}
	private class BImp2 implements B{
		public void f(){}
	}
	public interface C{
		void f();
	}
	class CImp implements C{
		public void f(){}
	}
	private class CImp2 implements C{
		public void f(){}
	}
	private interface D{
		void f();
	}
	private class DImp implements D{
		public void f(){}
	}
	public class DImp2 implements D{
		public void f(){}
	}
	public D getD(){return new DImp2();}
	private D dRef;
	public void receviedD(D d){
		dRef=d;
		dRef.f();
	}	
}

interface E{
	interface G{
		void f();
	}
	//Redundant "public":
	public interface H{
		void f();
	}
	void g();
	//
	//private interface{}
}

public class NestingInterfaces{
}
