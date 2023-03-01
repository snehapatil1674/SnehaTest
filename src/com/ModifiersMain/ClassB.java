package com.ModifiersMain;

public class ClassB {

	public static void main(String[] args) {
		ClassA a=new ClassA();
		a.std=8;
		a.gread='B';
		System.out.println(a.per);
		//System.out.println(a.name);Private var. hence not allowed outside class.
		System.out.println(a.std);
		System.out.println(a.gread);
		a.meth1();
		//a.meth2();This is private method
		a.meth3();
		a.meth4();
		
	}

}
