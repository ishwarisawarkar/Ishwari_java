package com.ishwari;
//multilevel inheritance
class grandfather{
	public void plot()
	{
		System.out.println("3cr");
	}
}
class father extends grandfather{
	public void car()
	{
		System.out.println("skoda");
	}
}
public class Son extends father{
	public static void main(String[] args)
	{
		Son aditya=new Son();
		aditya.plot();
		aditya.car();
}
}
