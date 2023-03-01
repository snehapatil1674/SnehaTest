package com.ModifiersSub;

import com.ModifiersMain.ClassA;

public class ClassC extends ClassA {

	public static void main(String[] args) {
		ClassC a=new ClassC();
		a.meth1();
	//	a.meth2();private
		a.meth3();
	//	a.meth4();default
		

	}

}
