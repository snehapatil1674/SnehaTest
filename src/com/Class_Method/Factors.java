package com.Class_Method;
import java.util.Scanner;
public class Factors {
	
	public int factors(int a)
	{
		 int fact=1;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{  fact=i*j;
				if(fact==a)
				{
					System.out.println(i);
				}
			}
			
		}
		return fact;
	}
	

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	Factors fact=new Factors();
	fact.factors(num);
	
	}

}
