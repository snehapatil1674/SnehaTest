package com.Class_Method;

public class Product {
	String prodName;
	int qty;
	int prize;
	
	public void assignProdDetail(String pName,int qnty,int prz)
	{
		 prodName=pName;
		 qty=qnty;
		 prize=prz;
		
		
		
	}
	public void displayDetails()
	{
		System.out.println(prodName+" "+qty+" "+prize);
	}

	public static void main(String[] args) 
	{
		Product p=new Product();
		p.assignProdDetail("Biscuit", 5, 10);
		p.displayDetails();
		
		

	}

}
