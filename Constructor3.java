package com.ishwari;

public class Constructor3 {
	
public void add(int x,int y) {
	System.out.println(x+y);
	}
public void multiply(int x,int y) {
	System.out.println(x*y);
}
public static void main(String[] args)
{
	Constructor3 obj=new Constructor3();
	obj.add(12, 44);
	obj.multiply(12, 44);
}
}

