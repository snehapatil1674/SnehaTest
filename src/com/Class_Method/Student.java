package com.Class_Method;

public class Student {
	int id;
	String name;
	int mark1;
	int mark2;
	int mark3;
	
	public void acceptdetails(int sid,String sName)
	{
		id=sid;
		name=sName;
	}
	public int calculatePer(int m1,int m2,int m3)
	{
		mark1=m1;
		mark2=m2;
		mark3=m3;
		int total=m1+m2+m3;
		int per=((total*100)/300);
		return per;
	}
	public void displayDetails()
	{
		calculatePer(90,95,96);
		//System.out.println(per);
		//System.out.println(id+" "+name);
		System.out.println(calculatePer(90,95,96)+" "+id+" "+name);
	}
	
	

	public static void main(String[] args) 
	{
		Student s=new Student(); 
		s.acceptdetails(1008,"Sneha");
		s.displayDetails();
		
	}

}
