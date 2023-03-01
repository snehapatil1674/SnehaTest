package com.Encapsulation;

public class CarTest {

	public static void main(String[] args) {
		Car cr=new Car();
		cr.setId(108);
		cr.setPrize(105000);
		cr.setName("Swift");
		cr.setColour("Black");
		
		System.out.println(cr.getId());
		System.out.println(cr.getPrize());
		System.out.println(cr.getName());
		System.out.println(cr.getColour());
	}

}
