package com.ModifiersMain;

public class ClassA 
{
	public int std=56;
	private String name="Sneha";
	protected float per=99.9f;
	char gread='A';
	
	public void meth1()
	{
		System.out.println("I am public method............");
	}
	private void meth2()
	{
		System.out.println("I am private method............ ");
	}
	protected void meth3()
	{
		System.out.println("I am protected method.............");
	}
	void meth4()
	{
		System.out.println("I am default method..........");
	}

	public static void main(String[] args) 
	{
		ClassA a=new ClassA();
		 System.out.println(a.std);
		 System.out.println(a.name);
		 System.out.println(a.per);
		 System.out.println(a.gread);
		 a.meth1();
		 a.meth2();
		 a.meth1();
		 a.meth4();
	}

}
